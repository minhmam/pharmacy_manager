//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.ChiTietHoaDon;
import model.HoaDon;

public class HoaDonDAO {
    public HoaDonDAO() {
        ConectDatabase.getInstance().connect();
    }

    public List<HoaDon> getHoaDons() {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaHoaDon],[NgayLap],[TongTien],[MaNhanVien],[MaKhachHang]\r\nfrom pharmacy_manager.[HoaDon] ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                String ma = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                double tongTien = rs.getDouble(3);
                int nhanVien = rs.getInt(4);
                int khachHang = rs.getInt(5);
                HoaDon hd = new HoaDon(ma, ngayLap, tongTien, nhanVien, khachHang);
                list.add(hd);
            }
        } catch (Exception var14) {
        }

        return list;
    }

    public List<ChiTietHoaDon> getChiTiets(String ma) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaHoaDon],[MaThuoc],[DonViTinh],[DonGia],[GiamGia],[SoLuong]\r\nfrom pharmacy_manager.[CT_HoaDon] \r\nwhere [MaHoaDon] like  '" + ma + "'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String maHD = rs.getString(1);
                int thuoc = rs.getInt(2);
                String dvt = rs.getString(3);
                float donGia = rs.getFloat(4);
                float giamGia = rs.getFloat(5);
                int soLuong = rs.getInt(6);
                ChiTietHoaDon ct = new ChiTietHoaDon(maHD, thuoc, donGia, giamGia, soLuong, dvt);
                list.add(ct);
            }
        } catch (Exception var14) {
        }

        return list;
    }

    public String getTenKH(int ma) {
        String ten = "";

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [Ten]\r\nfrom pharmacy_manager.[KhachHang]\r\nwhere [MaKhachHang]=" + ma;
            Statement statement = con.createStatement();

            String t;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); ten = t) {
                t = rs.getString(1);
            }
        } catch (Exception var8) {
        }

        return ten;
    }

    public HoaDon getHoaDonByMa(String ma) {
        HoaDon hd = new HoaDon();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [NgayLap],[TongTien],[MaNhanVien],[MaKhachHang]\r\nfrom pharmacy_manager.[HoaDon] \r\nwhere [MaHoaDon] like '" + ma + "' ";
            Statement statement = con.createStatement();

            java.sql.Date ngayLap;
            double tongTien;
            int nhanVien;
            int khachHang;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); hd = new HoaDon(ma, ngayLap, tongTien, nhanVien, khachHang)) {
                new SimpleDateFormat("dd/MM/yyyy");
                ngayLap = rs.getDate(1);
                tongTien = rs.getDouble(2);
                nhanVien = rs.getInt(3);
                khachHang = rs.getInt(4);
            }
        } catch (Exception var13) {
        }

        return hd;
    }

    public List<HoaDon> getHoaDonsByNhanVien(String ten) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaHoaDon],[NgayLap],[TongTien],nv.[MaNhanVien],[MaKhachHang]\r\nfrom pharmacy_manager.[HoaDon] hd  join pharmacy_manager.[NhanVien] nv on hd.MaNhanVien=nv.MaNhanVien\r\nwhere nv.Ten like N'" + ten + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String ma = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                double tongTien = rs.getDouble(3);
                int nhanVien = rs.getInt(4);
                int khachHang = rs.getInt(5);
                HoaDon hd = new HoaDon(ma, ngayLap, tongTien, nhanVien, khachHang);
                list.add(hd);
            }
        } catch (Exception var14) {
        }

        return list;
    }

    public List<HoaDon> getHoaDonsByNgayLap(int ngay, int thang, int nam) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaHoaDon],[NgayLap],[TongTien],[MaNhanVien],[MaKhachHang]\r\nfrom pharmacy_manager.[HoaDon]\r\nwhere DAY([NgayLap])= " + ngay + "  and MONTH([NgayLap]) = " + thang + " and YEAR([NgayLap])=" + nam;
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String ma = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                double tongTien = rs.getDouble(3);
                int nhanVien = rs.getInt(4);
                int khachHang = rs.getInt(5);
                HoaDon hd = new HoaDon(ma, ngayLap, tongTien, nhanVien, khachHang);
                list.add(hd);
            }
        } catch (Exception var16) {
        }

        return list;
    }

    public List<HoaDon> getHoaDonsByKhachHang(String ten) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaHoaDon],[NgayLap],[TongTien],[MaNhanVien],kh.[MaKhachHang]\r\nfrom pharmacy_manager.[HoaDon] hd  join pharmacy_manager.[KhachHang] kh on hd.MaKhachHang=kh.MaKhachHang\r\nwhere kh.Ten like N'" + ten + "' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                String ma = rs.getString(1);
                Date ngayLap = rs.getDate(2);
                double tongTien = rs.getDouble(3);
                int nhanVien = rs.getInt(4);
                int khachHang = rs.getInt(5);
                HoaDon hd = new HoaDon(ma, ngayLap, tongTien, nhanVien, khachHang);
                list.add(hd);
            }
        } catch (Exception var15) {
        }

        return list;
    }

    public String getTenNV(int ma) {
        String ten = "";

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [Ten]\r\nfrom pharmacy_manager.[NhanVien]\r\nwhere [MaNhanVien]=" + ma;
            Statement statement = con.createStatement();

            String t;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); ten = t) {
                t = rs.getString(1);
            }
        } catch (Exception var8) {
        }

        return ten;
    }

    public String gettenThuoc(int ma) {
        String ten = "";

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [TenThuoc]\r\nfrom pharmacy_manager.[Thuoc]\r\nwhere [MaThuoc]=" + ma;
            Statement statement = con.createStatement();

            String t;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); ten = t) {
                t = rs.getString(1);
            }
        } catch (Exception var8) {
        }

        return ten;
    }
}
