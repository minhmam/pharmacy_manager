//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import view.FrmBaoCaoThongKe;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.ThongKeTinhTrangThuoc;
import model.Thuoc;

public class DSThongKeTTThuocDAO {
    ArrayList<ThongKeTinhTrangThuoc> ds = new ArrayList();
    ThongKeTinhTrangThuoc tkttt = new ThongKeTinhTrangThuoc();
    PreparedStatement pre;
    ResultSet rs;

    public DSThongKeTTThuocDAO() {
    }

    public List<Thuoc> danhSachThuocHetHan(Date ngayHetHan) {
        ArrayList dsThuoc = new ArrayList();

        try {
            ConectDatabase.getInstance().connect();
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[TenThuoc],[PhanLoai],[SoLuongNhap],[NgaySanXuat],[HanSuDung]\r\nfrom pharmacy_manager.[Thuoc]";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                Thuoc thuoc = new Thuoc();
                thuoc.setMaThuoc(rs.getInt(1));
                thuoc.setTenThuoc(rs.getString(2));
                thuoc.setPhanLoai(rs.getString(3));
                thuoc.setSoLuongNhap(rs.getInt(4));
                thuoc.setNgaySanXuat(rs.getDate(5));
                thuoc.setHanSuDung(rs.getDate(6));
                if (thuoc.getHanSuDung().before(ngayHetHan)) {
                    dsThuoc.add(thuoc);
                }
            }
        } catch (Exception var8) {
        }

        return dsThuoc;
    }

    public List<Thuoc> danhSachThuocConLai(Date ngay) {
        ArrayList dsThuoc = new ArrayList();

        try {
            ConectDatabase.getInstance().connect();
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[TenThuoc],[PhanLoai],[SoLuongNhap],[NgaySanXuat],[HanSuDung]\r\nfrom pharmacy_manager.[Thuoc]";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                Thuoc thuoc = new Thuoc();
                thuoc.setMaThuoc(rs.getInt(1));
                thuoc.setTenThuoc(rs.getString(2));
                thuoc.setPhanLoai(rs.getString(3));
                thuoc.setSoLuongNhap(rs.getInt(4));
                thuoc.setNgaySanXuat(rs.getDate(5));
                thuoc.setHanSuDung(rs.getDate(6));
                if (thuoc.getHanSuDung().after(ngay)) {
                    dsThuoc.add(thuoc);
                }
            }
        } catch (Exception var8) {
        }

        return dsThuoc;
    }

    public int tinhTongLoaiThuocDaBan(int ngay, int thang, int nam) throws Exception {
        int tongLoaiThuoc = 0;

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select COUNT(distinct ct.MaThuoc) as TongThuocDaBan\r\n\t\tfrom CT_HoaDon ct join HoaDon h on ct.MaHoaDon=h.MaHoaDon\r\n\t\twhere day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =?";
            this.pre = con.prepareStatement(sql);
            this.pre.setInt(1, ngay);
            this.pre.setInt(2, thang);
            this.pre.setInt(3, nam);

            for(this.rs = this.pre.executeQuery(); this.rs.next(); tongLoaiThuoc = this.rs.getInt(1)) {
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return tongLoaiThuoc;
    }

    public void danhsachThuocDaBan(int ngay, int thang, int nam) {
        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select t.MaThuoc,t.TenThuoc,t.PhanLoai,ct.[SoLuong],CONVERT (nvarchar(10), t.NgaySanXuat, 103) as NgaySanXuat,CONVERT (nvarchar(10) , t.HanSuDung, 103) as HanSuDung,CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap \r\n\t\tfrom CT_HoaDon ct left join Thuoc t on t.MaThuoc = ct.MaThuoc  join HoaDon h on h.MaHoaDon=ct.MaHoaDon\r\n\t\twhere ct.MaHoaDon is not null and day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =?\r\n\t\tgroup by t.MaThuoc,t.TenThuoc,t.PhanLoai,ct.[SoLuong], CONVERT (nvarchar(10), t.NgaySanXuat, 103),CONVERT (nvarchar(10) , t.HanSuDung, 103),h.[NgayLap]\r\n";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ngay);
            stmt.setInt(2, thang);
            stmt.setInt(3, nam);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String maHoaDonSoSanh = "";
            Object[] ds = null;
            int tongSLT = 0;

            int checkNull;
            for(checkNull = 0; rs.next(); ++checkNull) {
                ++i;
                String stt = String.valueOf(i);
                ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)};
                FrmBaoCaoThongKe.tablemodel1.addRow(ds);
                tongSLT = (int)((double)tongSLT + rs.getDouble(4));
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay + "/" + thang + "/" + nam);
            }

            FrmBaoCaoThongKe.txtTongSoLuongThuoc.setText(String.valueOf(tongSLT));
        } catch (Exception var14) {
        }

    }

    public void danhsachThuocConLaiTrongKho() {
        new DecimalFormat("#,##0.00");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select t.MaThuoc,t.TenThuoc,t.PhanLoai,t.SoLuongNhap,CONVERT (nvarchar(10), t.NgaySanXuat, 103) as NgaySanXuat,CONVERT (nvarchar(10), t.HanSuDung, 103) as HanSuDung\r\n\t\tfrom  Thuoc t\r\n\t\twhere t.SoLuongNhap>0 \r\n\t\tgroup by t.MaThuoc,t.TenThuoc,t.PhanLoai,t.SoLuongNhap,CONVERT (nvarchar(10), t.NgaySanXuat, 103),CONVERT (nvarchar(10), t.HanSuDung, 103)";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            Object[] ds = null;
            int checkNull = 0;

            int tongSoLuongThuocNhap;
            for(tongSoLuongThuocNhap = 0; rs.next(); ++checkNull) {
                ++i;
                String stt = String.valueOf(i);
                ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                FrmBaoCaoThongKe.tablemodel1.addRow(ds);
                tongSoLuongThuocNhap += rs.getInt(4);
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không còn thuốc trong kho ngày này");
            }

            FrmBaoCaoThongKe.txtTongSoLoaiThuoc.setText(String.valueOf(i));
            FrmBaoCaoThongKe.txtTongSoLuongThuoc.setText(String.valueOf(tongSoLuongThuocNhap));
        } catch (Exception var11) {
        }

    }

    public static void main(String[] args) {
        new DSThongKeTTThuocDAO();
        LocalDate localDate = LocalDate.of(2019, 12, 11);
        java.sql.Date date = java.sql.Date.valueOf("2019-12-11");
        System.out.println(localDate);
        System.out.println(date);
    }
}
