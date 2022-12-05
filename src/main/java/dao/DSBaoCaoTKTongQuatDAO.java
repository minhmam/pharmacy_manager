//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongKeBaoCaoTQ;

public class DSBaoCaoTKTongQuatDAO {
    Connection con;
    PreparedStatement pre;
    ResultSet rs;
    ArrayList<ThongKeBaoCaoTQ> ds = new ArrayList();
    ThongKeBaoCaoTQ tkbc;

    public DSBaoCaoTKTongQuatDAO() {
    }

    public List<String> getAllNgay() throws Exception {
        ArrayList result = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select NgayLap from HoaDon";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String ngay = rs.getString(1);
                result.add(ngay);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return result;
    }

    public double tinhTongThuocBanDuocTheoThang(int thang, int nam) throws Exception {
        double tongTien = 0.0D;

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select sum(c.SoLuong* c.DonGia) from HoaDon h join CT_HoaDon c on h.MaHoaDon=c.MaHoaDon\r\nwhere month(NgayLap)=? and  year(NgayLap)=?";
            this.pre = con.prepareStatement(sql);
            this.pre.setInt(1, thang);
            this.pre.setInt(2, nam);

            for(this.rs = this.pre.executeQuery(); this.rs.next(); tongTien = this.rs.getDouble(1)) {
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return tongTien;
    }

    public double tinhTongTienThuocDaNhapTheoThang(int thang, int nam) throws Exception {
        double tongTien = 0.0D;

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "\t\t\t\t\t\t\t\tselect t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103) as HanSuDung,t.[SoDangKi],SUM(t.SoLuongNhap) AS SoLuongNhap,sum(ct.SoLuong) as SoLuongBan,sum(ct.SoLuong*ct.DonGia) as TienBan,sum(ct.SoLuong*t.GiaNhap) as TienNhap\r\n\t\t\t\t\tfrom CT_HoaDon ct join Thuoc t on ct.maThuoc= t.maThuoc join HoaDon h on  ct.MaHoaDon=h.MaHoaDon\r\n\t\t\t\t\twhere month(NgayLap)=? and year(NgayLap)=?\r\n\t\t\t\t\tgroup by  t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103),t.[SoDangKi]\r\n\t\t\t\t\t";
            this.pre = con.prepareStatement(sql);
            this.pre.setInt(1, thang);
            this.pre.setInt(2, nam);

            for(this.rs = this.pre.executeQuery(); this.rs.next(); tongTien += (double)this.rs.getInt(8) * this.rs.getDouble(4)) {
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return tongTien;
    }

    public List<ThongKeBaoCaoTQ> thongKeThuocDaBan_DoanhThu_TheoThang(int thang, int nam) throws Exception {
        ArrayList dsThuoc = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "\t\t\t\t\t\t\t\tselect t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103) as HanSuDung,t.[SoDangKi],SUM(t.SoLuongNhap) AS SoLuongNhap,sum(ct.SoLuong) as SoLuongBan,sum(ct.SoLuong*ct.DonGia) as TienBan,sum(ct.SoLuong*t.GiaNhap) as TienNhap\r\n\t\t\t\t\tfrom CT_HoaDon ct join Thuoc t on ct.maThuoc= t.maThuoc join HoaDon h on  ct.MaHoaDon=h.MaHoaDon\r\n\t\t\t\t\twhere month(NgayLap)=? and year(NgayLap)=?\r\n\t\t\t\t\tgroup by  t.MaThuoc,t.TenThuoc,t.DonGia,t.GiaNhap,CONVERT (nvarchar(10), h.NgayLap, 103),t.[SoDangKi]\r\n\t\t\t\t\t";
            this.pre = con.prepareStatement(sql);
            this.pre.setInt(1, thang);
            this.pre.setInt(2, nam);
            this.rs = this.pre.executeQuery();

            while(this.rs.next()) {
                ThongKeBaoCaoTQ thuoc = new ThongKeBaoCaoTQ();
                thuoc.setMaThuoc(this.rs.getString(1));
                thuoc.setTenThuoc(this.rs.getString(2));
                thuoc.setDonGia(this.rs.getDouble(3));
                thuoc.setDonGiaNhap(this.rs.getDouble(4));
                thuoc.setNgay(this.rs.getString(5));
                thuoc.setSoDK(this.rs.getString(6));
                thuoc.setSoLuongNhap(this.rs.getInt(7));
                thuoc.setSoLuongBan(this.rs.getInt(8));
                thuoc.setLoiNhuan(this.rs.getDouble(9));
                thuoc.setTienThuocNhap(this.rs.getDouble(10));
                dsThuoc.add(thuoc);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return dsThuoc;
    }
}
