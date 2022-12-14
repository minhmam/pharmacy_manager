//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DiaChi;
import model.NhanVien;
import model.TaiKhoan;

public class ThongTinCaNhanDAO {
    public ThongTinCaNhanDAO() {
        ConectDatabase.getInstance().connect();
    }

    public NhanVien loadNhanVien(String tenDangNhap) {
        NhanVien nhanVien = new NhanVien();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select MaNhanVien, Ten, Ho, NgaySinh, GioiTinh,CMND,SoDienThoai,SoNha,TenDuong,Phuong,Quan,ThanhPho,QuocGia,n.TenTaiKhoan,MatKhau\r\nfrom pharmacy_manager.NhanVien n join pharmacy_manager.DiaChi d on n.MaDiaChi = d.MaDiaChi join pharmacy_manager.TaiKhoan t on n.TenTaiKhoan = t.TenTaiKhoan\r\nwhere t.TenTaiKhoan = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tenDangNhap);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                nhanVien.setMaNhanVien(rs.getInt(1));
                nhanVien.setTen(rs.getString(2));
                nhanVien.setHo(rs.getString(3));
                nhanVien.setNgaySinh(rs.getDate(4));
                nhanVien.setGioiTinh(rs.getString(5));
                nhanVien.setCmnd(rs.getString(6));
                nhanVien.setSoDienThoai(rs.getString(7));
                DiaChi diaChi = new DiaChi();
                diaChi.setSoNha(rs.getString(8));
                diaChi.setTenDuong(rs.getString(9));
                diaChi.setPhuong(rs.getString(10));
                diaChi.setQuan(rs.getString(11));
                diaChi.setThanhPho(rs.getString(12));
                diaChi.setQuocGia(rs.getString(13));
                nhanVien.setDiaChi(diaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(rs.getString(14));
                taiKhoan.setMatKhau(rs.getString(15));
                nhanVien.setTaiKhoan(taiKhoan);
            }
        } catch (Exception var9) {
        }

        return nhanVien;
    }

    public void updateThongTinCaNhan(NhanVien nhanVien) {
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        String qrl = "update pharmacy_manager.NhanVien set NgaySinh=?,Ten=?,Ho=?,GioiTinh=?,CMND=?,SoDienThoai=? where MaNhanVien=?";

        try {
            PreparedStatement stm = con.prepareStatement(qrl);
            stm.setDate(1, nhanVien.getNgaySinh());
            stm.setString(2, nhanVien.getTen());
            stm.setString(3, nhanVien.getHo());
            stm.setString(4, nhanVien.getGioiTinh());
            stm.setString(5, nhanVien.getCmnd());
            stm.setString(6, nhanVien.getSoDienThoai());
            stm.setInt(7, nhanVien.getMaNhanVien());
            stm.executeUpdate();
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

    }

    public void updateTaiKhoan(NhanVien nhanVien) {
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        String qrl1 = "update pharmacy_manager.TaiKhoan set MatKhau =? where TenTaiKhoan =?";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(qrl1);
            stmt.setString(1, nhanVien.getTaiKhoan().getMatKhau());
            stmt.setString(2, nhanVien.getTaiKhoan().getTenTaiKhoan());
            stmt.executeUpdate();
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

    }
}
