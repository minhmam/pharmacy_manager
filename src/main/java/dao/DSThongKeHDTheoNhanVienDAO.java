//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import view.FrmBaoCaoThongKe;
import view.FrmXuatHD;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongKeHDTheoNhanVien;

public class DSThongKeHDTheoNhanVienDAO {
    ArrayList<ThongKeHDTheoNhanVien> ds = new ArrayList();
    ThongKeHDTheoNhanVien tknv;

    public DSThongKeHDTheoNhanVienDAO() {
    }

    public ArrayList<ThongKeHDTheoNhanVien> docBang(String ngayBan) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            CallableStatement command = con.prepareCall("{call ThongKeNhanVien(?)}");
            command.setString(1, ngayBan);
            ResultSet rs = command.executeQuery();

            while(rs.next()) {
                String maThuoc = rs.getString(1);
                String tenThuoc = rs.getString(2);
                String soLuong = rs.getString(3);
                String dongGia = rs.getString(4);
                String maNhanVien = rs.getString(5);
                String tenNhanVien = rs.getString(6);
                String caLam = rs.getString(7);
                String ngay = rs.getString(8);
                String thanhTien = rs.getString(9);
                ThongKeHDTheoNhanVien tk = new ThongKeHDTheoNhanVien();
                new DecimalFormat("#,###.0(VND)");
                ThongKeHDTheoNhanVien s = new ThongKeHDTheoNhanVien(ngay, maNhanVien, tenNhanVien, caLam, tk.getDonthuoc(), maThuoc, tenThuoc, Integer.parseInt(soLuong), Double.parseDouble(dongGia), Double.parseDouble(thanhTien));
                this.ds.add(s);
            }
        } catch (Exception var17) {
            var17.printStackTrace();
        }

        return this.ds;
    }

    public ArrayList<ThongKeHDTheoNhanVien> chonTenNhanVien(String ngayBan) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            CallableStatement command = con.prepareCall("{call LocTenNhanVien(?)}");
            command.setString(1, ngayBan);
            ResultSet rs = command.executeQuery();

            while(rs.next()) {
                String maNhanvVien = rs.getString(1);
                String tenNhanVien = rs.getString(2);
                ThongKeHDTheoNhanVien tk = new ThongKeHDTheoNhanVien();
                ThongKeHDTheoNhanVien s = new ThongKeHDTheoNhanVien(tk.getNgay(), maNhanvVien, tenNhanVien, tk.getCaLam(), tk.getDonthuoc(), tk.getMaThuoc(), tk.getTenThuoc(), tk.getSoLuong(), tk.getDonGia(), tk.getLoiNhuan());
                this.ds.add(s);
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        return this.ds;
    }

    public ArrayList<ThongKeHDTheoNhanVien> chonMaNhanVien() {
        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select distinct MaNhanVien, concat(Ho, ' ', Ten) as TenNhanVien from NhanVien nv";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()) {
                String maNhanvVien = rs.getString(1);
                String tenNhanVien = rs.getString(2);
                ThongKeHDTheoNhanVien tk = new ThongKeHDTheoNhanVien();
                ThongKeHDTheoNhanVien s = new ThongKeHDTheoNhanVien(tk.getNgay(), maNhanvVien, tenNhanVien, tk.getCaLam(), tk.getDonthuoc(), tk.getMaThuoc(), tk.getTenThuoc(), tk.getSoLuong(), tk.getDonGia(), tk.getLoiNhuan());
                this.ds.add(s);
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }

        return this.ds;
    }

    public ArrayList<ThongKeHDTheoNhanVien> chonCaLam() {
        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select distinct CaLamViec\r\nfrom NhanVien";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()) {
                String caLam = rs.getString(1);
                ThongKeHDTheoNhanVien tk = new ThongKeHDTheoNhanVien();
                ThongKeHDTheoNhanVien s = new ThongKeHDTheoNhanVien(tk.getNgay(), tk.getMaNhanVien(), tk.getTenNhanVien(), caLam, tk.getDonthuoc(), tk.getMaThuoc(), tk.getTenThuoc(), tk.getSoLuong(), tk.getDonGia(), tk.getLoiNhuan());
                this.ds.add(s);
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }

        return this.ds;
    }

    public void thongKeNhanVienLapHoaDonTheoNgay(int ngay, int thang, int nam) {
        DecimalFormat tien = new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap ,h.[TongTien],t.[PhanLoai],sum(ct.[SoLuong])\r\n\t\tfrom [pharmacy_manager].[CT_HoaDon] ct left join [pharmacy_manager].[Thuoc] t on ct.[MaThuoc]= t.[MaThuoc] left join [pharmacy_manager].[HoaDon] h on h.[MaHoaDon]= ct.[MaHoaDon] left join pharmacy_manager.[NhanVien] nv on h.[MaNhanVien] = nv.[MaNhanVien]\r\n\t\twhere day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =?\r\n\t\tgroup by ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],h.[NgayLap] ,h.[TongTien],t.[PhanLoai]";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ngay);
            stmt.setInt(2, thang);
            stmt.setInt(3, nam);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String maHoaDonSoSanh = "";
            Object[] ds = null;
            int checkNull = 0;
            double tongTienDaBan = 0.0D;
            int tongSoLuongThuocDaBan = 0;

            while(rs.next()) {
                if (!rs.getString(1).equalsIgnoreCase(maHoaDonSoSanh)) {
                    ++i;
                    String stt = String.valueOf(i);
                    ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), tien.format(rs.getDouble(5)), rs.getString(6), rs.getString(7)};
                    maHoaDonSoSanh = rs.getString(1);
                    FrmBaoCaoThongKe.tablemodel.addRow(ds);
                    tongTienDaBan += rs.getDouble(5);
                    tongSoLuongThuocDaBan += rs.getInt(7);
                    ++checkNull;
                }
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay + "/" + thang + "/" + nam);
            }

            FrmBaoCaoThongKe.txtTongTienDaBan.setText(tien.format(tongTienDaBan));
            FrmBaoCaoThongKe.txtTongSoHD.setText(String.valueOf(i));
            FrmBaoCaoThongKe.txtTongSLTDB.setText(String.valueOf(tongSoLuongThuocDaBan));
        } catch (Exception var17) {
        }

    }

    public void thongKeNhanVienLapHoaDonKeDon_TheoNgay_TheoMa(int ngay, int thang, int nam, int maNhanVien) {
        DecimalFormat tien = new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "\tselect ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap ,h.[TongTien],t.[PhanLoai],sum(ct.[SoLuong])\r\n\t\t\t\t\t\t\t\t\tfrom pharmacy_manager.[CT_HoaDon] ct left join pharmacy_manager.[Thuoc] t on ct.[MaThuoc]= t.[MaThuoc] left join pharmacy_manager.[HoaDon] h on h.[MaHoaDon]= ct.[MaHoaDon] left join pharmacy_manager.[NhanVien] nv on h.[MaNhanVien] = nv.[MaNhanVien]\r\n\t\t\t\t\t\t\t\t\twhere day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =? and h.MaKhachHang is not null \r\n\t\t\t\t\t\t\t\t\tgroup by ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],h.[NgayLap] ,h.[TongTien],t.[PhanLoai]";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ngay);
            stmt.setInt(2, thang);
            stmt.setInt(3, nam);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String maHoaDonSoSanh = "";
            Object[] ds = null;
            double tongTienDaBan = 0.0D;
            int tongSoLuongThuocDaBan = 0;
            int checkNull = 0;

            while(rs.next()) {
                if (rs.getInt(2) == maNhanVien && !rs.getString(1).equalsIgnoreCase(maHoaDonSoSanh)) {
                    ++i;
                    String stt = String.valueOf(i);
                    ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), tien.format(rs.getDouble(5)), rs.getString(6), rs.getString(7)};
                    maHoaDonSoSanh = rs.getString(1);
                    FrmBaoCaoThongKe.tablemodel.addRow(ds);
                    tongTienDaBan += rs.getDouble(5);
                    tongSoLuongThuocDaBan += rs.getInt(7);
                    ++checkNull;
                }
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay + "/" + thang + "/" + nam);
            }

            FrmBaoCaoThongKe.txtTongTienDaBan.setText(tien.format(tongTienDaBan));
            FrmBaoCaoThongKe.txtTongSoHD.setText(String.valueOf(i));
            FrmBaoCaoThongKe.txtTongSLTDB.setText(String.valueOf(tongSoLuongThuocDaBan));
        } catch (Exception var18) {
        }

    }

    public void thongKeNhanVienLapHoaDonKeDon_TheoNgay_TheoMaKeDonKKeDon(int ngay, int thang, int nam, int maNhanVien) {
        DecimalFormat tien = new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "\tselect ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap ,h.[TongTien],t.[PhanLoai],sum(ct.[SoLuong])\r\n\t\t\t\t\t\t\t\t\tfrom pharmacy_manager.[CT_HoaDon] ct left join pharmacy_manager.[Thuoc] t on ct.[MaThuoc]= t.[MaThuoc] left join pharmacy_manager.[HoaDon] h on h.[MaHoaDon]= ct.[MaHoaDon] left join pharmacy_manager.[NhanVien] nv on h.[MaNhanVien] = nv.[MaNhanVien]\r\n\t\t\t\t\t\t\t\t\twhere day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =? and h.MaKhachHang is null \r\n\t\t\t\t\t\t\t\t\tgroup by ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],h.[NgayLap] ,h.[TongTien],t.[PhanLoai]";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ngay);
            stmt.setInt(2, thang);
            stmt.setInt(3, nam);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String maHoaDonSoSanh = "";
            Object[] ds = null;
            double tongTienDaBan = 0.0D;
            int tongSoLuongThuocDaBan = 0;
            int checkNull = 0;

            while(rs.next()) {
                if (rs.getInt(2) == maNhanVien && !rs.getString(1).equalsIgnoreCase(maHoaDonSoSanh)) {
                    ++i;
                    String stt = String.valueOf(i);
                    ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), tien.format(rs.getDouble(5)), rs.getString(6), rs.getString(7)};
                    maHoaDonSoSanh = rs.getString(1);
                    FrmBaoCaoThongKe.tablemodel.addRow(ds);
                    tongTienDaBan += rs.getDouble(5);
                    tongSoLuongThuocDaBan += rs.getInt(7);
                    ++checkNull;
                }
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay + "/" + thang + "/" + nam);
            }

            FrmBaoCaoThongKe.txtTongTienDaBan.setText(tien.format(tongTienDaBan));
            FrmBaoCaoThongKe.txtTongSoHD.setText(String.valueOf(i));
            FrmBaoCaoThongKe.txtTongSLTDB.setText(String.valueOf(tongSoLuongThuocDaBan));
        } catch (Exception var18) {
        }

    }

    public void thongKeNhanVienLapHoaDon_TheoNgay_TheoMaTatCa(int ngay, int thang, int nam, int maNhanVien) {
        DecimalFormat tien = new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "\tselect ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap ,h.[TongTien],t.[PhanLoai],sum(ct.[SoLuong])\r\n\t\t\t\t\t\t\t\t\tfrom pharmacy_manager.[CT_HoaDon] ct left join pharmacy_manager.[Thuoc] t on ct.[MaThuoc]= t.[MaThuoc] left join pharmacy_manager.[HoaDon] h on h.[MaHoaDon]= ct.[MaHoaDon] left join pharmacy_manager.[NhanVien] nv on h.[MaNhanVien] = nv.[MaNhanVien]\r\n\t\t\t\t\t\t\t\t\twhere day(h.[NgayLap]) =?  and month(h.[NgayLap]) = ? and year(h.[NgayLap]) =?  \r\n\t\t\t\t\t\t\t\t\tgroup by ct.[MaHoaDon],nv.[MaNhanVien],nv.[CaLamViec],h.[NgayLap] ,h.[TongTien],t.[PhanLoai]";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, ngay);
            stmt.setInt(2, thang);
            stmt.setInt(3, nam);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String maHoaDonSoSanh = "";
            Object[] ds = null;
            double tongTienDaBan = 0.0D;
            int tongSoLuongThuocDaBan = 0;
            int checkNull = 0;

            while(rs.next()) {
                if (rs.getInt(2) == maNhanVien && !rs.getString(1).equalsIgnoreCase(maHoaDonSoSanh)) {
                    ++i;
                    String stt = String.valueOf(i);
                    ds = new String[]{stt, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), tien.format(rs.getDouble(5)), rs.getString(6), rs.getString(7)};
                    maHoaDonSoSanh = rs.getString(1);
                    FrmBaoCaoThongKe.tablemodel.addRow(ds);
                    tongTienDaBan += rs.getDouble(5);
                    tongSoLuongThuocDaBan += rs.getInt(7);
                    ++checkNull;
                }
            }

            if (checkNull == 0) {
                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay + "/" + thang + "/" + nam);
            }

            FrmBaoCaoThongKe.txtTongTienDaBan.setText(tien.format(tongTienDaBan));
            FrmBaoCaoThongKe.txtTongSoHD.setText(String.valueOf(i));
            FrmBaoCaoThongKe.txtTongSLTDB.setText(String.valueOf(tongSoLuongThuocDaBan));
        } catch (Exception var18) {
        }

    }

    public void XemThongtinCTHoaDon(String maHD) {
        FrmXuatHD.tableModel.addRow(new Object[0]);
        FrmXuatHD.tableModel = (DefaultTableModel)FrmXuatHD.table.getModel();
        FrmXuatHD.tableModel.getDataVector().removeAllElements();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select t.[TenThuoc],t.[DonViTinh],ct.[DonGia],ct.[SoLuong],ct.[GiamGia],ct.[DonGia]*ct.[SoLuong]\r\nfrom pharmacy_manager.[CT_HoaDon] ct join pharmacy_manager.[HoaDon] h\r\non ct.[MaHoaDon]=h.MaHoaDon join Thuoc t \r\non t.MaThuoc=ct.MaThuoc\r\nwhere ct.MaHoaDon=?\r\n";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            String[] ds = null;

            while(rs.next()) {
                ++i;
                ds = new String[]{String.valueOf(i), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                FrmXuatHD.tableModel.addRow(ds);
            }

            FrmXuatHD.lblSL.setText(String.valueOf(i));
        } catch (Exception var8) {
        }

    }

    public void XemThongtinCTHoaDonn(String maHD) {
        DecimalFormat tien = new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select ct.[MaHoaDon],t.[PhanLoai],CONVERT (nvarchar(10), h.[NgayLap], 103) as NgayLap,h.TongTien\r\n\t\t\t\t\tfrom pharmacy_manager.[CT_HoaDon] ct join pharmacy_manager.[HoaDon] h\r\n\t\t\t\t\ton ct.[MaHoaDon]=h.MaHoaDon join Thuoc t \r\n\t\t\t\t\ton t.MaThuoc=ct.MaThuoc\r\n\t\t\t\t\twhere ct.MaHoaDon=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            Object[] ds = null;
            boolean checkKeDon = false;
            double tienThuoc = 0.0D;

            while(rs.next()) {
                FrmXuatHD.lblMaHD.setText(rs.getString(1));
                if (rs.getString(2).equalsIgnoreCase("Thuốc kê đơn")) {
                    checkKeDon = true;
                }

                tienThuoc = rs.getDouble(4);
                FrmXuatHD.lblNgayLap1.setText(rs.getString(3));
            }

            if (checkKeDon) {
                FrmXuatHD.lblLoaiHD1.setText("Thuốc kê đơn");
            } else {
                FrmXuatHD.lblLoaiHD1.setText("Không kê đơn");
            }

            FrmXuatHD.lblTongTThuoc.setText(tien.format(tienThuoc));
            FrmXuatHD.lblTongT.setText(tien.format(tienThuoc));
        } catch (Exception var12) {
        }

    }

    public void XemThongtinCTHoaDonnn(String maHD) {
        new DecimalFormat("###,###,### VND");

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "\r\nselect HoTen=kh.[Ho]+''+kh.[Ten],CONVERT (nvarchar(10), kh.[NgaySinh], 103) as NgaySinh,kh.[GioiTinh],kh.[SoDienThoai],kh.[MaDiaChi],HoTen=nv.[Ho]+''+nv.[Ten]\r\nfrom pharmacy_manager.[CT_HoaDon] ct join pharmacy_manager.[HoaDon] h\r\non ct.[MaHoaDon]=h.MaHoaDon join KhachHang kh on kh.MaKhachHang=h.MaKhachHang join Thuoc t \r\non t.MaThuoc=ct.MaThuoc join pharmacy_manager.[NhanVien] nv on nv.[MaNhanVien]=h.MaNhanVien\r\nwhere h.MaHoaDon=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, maHD);
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            Object[] ds = null;
            boolean checkKeDon = false;
            double var10 = 0.0D;

            while(rs.next()) {
                FrmXuatHD.lblTenKH1.setText(rs.getString(1));
                FrmXuatHD.lblNamSinh1.setText(rs.getString(2));
                FrmXuatHD.lblGTinh1.setText(rs.getString(3));
                FrmXuatHD.lblsdtkh1.setText(rs.getString(4));
                FrmXuatHD.lblDCKH1.setText(rs.getString(5));
                FrmXuatHD.lblNguoiBan.setText(rs.getString(6));
                FrmXuatHD.lblNguoiMuaHang1.setText(rs.getString(1));
                if (rs.getString(2).equalsIgnoreCase("Thuốc kê đơn")) {
                    checkKeDon = true;
                }
            }
        } catch (Exception var12) {
        }

    }
}
