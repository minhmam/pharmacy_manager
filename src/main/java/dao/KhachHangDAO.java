//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DiaChi;
import model.KhachHang;

public class KhachHangDAO {
    Connection con;
    PreparedStatement preStm;
    ResultSet rs;

    public KhachHangDAO() {
    }

    public boolean themKhachHang(KhachHang kh) {
        int n = 0;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "insert into KhachHang values(?,?,?,?,?,?,?)";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, kh.getTen());
            this.preStm.setString(2, kh.getHo());
            this.preStm.setDate(3, kh.getNgaySinh());
            this.preStm.setString(4, kh.getGioiTinh());
            this.preStm.setString(5, kh.getCmnd());
            this.preStm.setString(6, kh.getSoDienThoai());
            this.preStm.setInt(7, kh.getDiaChi().getMaDiaChi());
            n = this.preStm.executeUpdate();
        } catch (Exception var4) {
        }

        return n > 0;
    }

    public boolean addDiaChi(DiaChi dc) {
        int n = 0;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "insert into pharmacy_manager.DiaChi values\r\n(?,?,?,?,?,?)";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, dc.getSoNha());
            this.preStm.setString(2, dc.getTenDuong());
            this.preStm.setString(3, dc.getPhuong());
            this.preStm.setString(4, dc.getQuan());
            this.preStm.setString(5, dc.getThanhPho());
            this.preStm.setString(6, dc.getQuocGia());
            n = this.preStm.executeUpdate();
        } catch (Exception var4) {
            System.out.println("loi sql them dia chi frm KhachHang");
            var4.printStackTrace();
        }

        return n > 0;
    }

    public List<KhachHang> getAllKhachHang() throws Exception {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from KhachHang";
            this.preStm = this.con.prepareStatement(sql);
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maKH = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String cmnd = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                KhachHang dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, cmnd, soDT, diaChi);
                result.add(dto);
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }

        return result;
    }

    public boolean xoaKhachHang(int maKH) throws ClassNotFoundException, SQLException {
        boolean check = false;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "delete KhachHang where MaKhachHang=?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setInt(1, maKH);
            check = this.preStm.executeUpdate() > 0;
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return check;
    }

    public KhachHang layThongTinKhachHang(int maKH) throws ClassNotFoundException, SQLException {
        KhachHang dto = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "Select * from KhachHang where MaKhachHang = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setInt(1, maKH);
            this.rs = this.preStm.executeQuery();
            if (this.rs.next()) {
                int maKhachHang = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi);
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }

        return dto;
    }

    public List<KhachHang> timkiemKhachHangByMa(int ma) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from KhachHang where MaKhachHang like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + ma + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maKH = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDienThoai = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                KhachHang dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, CMND, soDienThoai, diaChi);
                result.add(dto);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

        return result;
    }

    public List<KhachHang> timkiemKhachHangByTen(String tenn) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from KhachHang where Ten like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + tenn + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maKH = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDienThoai = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                KhachHang dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, CMND, soDienThoai, diaChi);
                result.add(dto);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
        }

        return result;
    }

    public List<KhachHang> timkiemKhachHangBySDT(String sdt) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from KhachHang where SoDienThoai like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + sdt + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maKH = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDienThoai = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                KhachHang dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, CMND, soDienThoai, diaChi);
                result.add(dto);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            System.out.println("Loi tim khachhang theo sdt sql");
        }

        return result;
    }

    public List<KhachHang> timkiemKhachHangByCMND(String cmnd) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from KhachHang where CMND like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + cmnd + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maKH = this.rs.getInt("MaKhachHang");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDienThoai = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                KhachHang dto = new KhachHang(maKH, ten, ho, ngaySinh, gioiTinh, cmnd, soDienThoai, diaChi);
                result.add(dto);
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            System.out.println("Loi tim khachhang theo cmnd sql");
        }

        return result;
    }

    public boolean capnhatNhanVien(int ma, String ten, String ho, Date ngaySinh, String gioiTinh, String cmnd, String sdt) throws ClassNotFoundException, SQLException {
        boolean check = false;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "Update KhachHang set Ten = ?, Ho = ?, NgaySinh = ?, GioiTinh = ?, CMND = ?, SoDienThoai = ? where MaKhachHang = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, ten);
            this.preStm.setString(2, ho);
            this.preStm.setDate(3, ngaySinh);
            this.preStm.setString(4, gioiTinh);
            this.preStm.setString(5, cmnd);
            this.preStm.setString(6, sdt);
            this.preStm.setInt(7, ma);
            check = this.preStm.executeUpdate() > 0;
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        return check;
    }

    public DiaChi layThongTinDiaChi(int maDC) throws ClassNotFoundException, SQLException {
        DiaChi dto = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "Select * from DiaChi where MaDiaChi = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setInt(1, maDC);
            this.rs = this.preStm.executeQuery();
            if (this.rs.next()) {
                String soNha = this.rs.getString("SoNha");
                String tenDuong = this.rs.getString("TenDuong");
                String phuong = this.rs.getString("Phuong");
                String quan = this.rs.getString("Quan");
                String thanhPho = this.rs.getString("ThanhPho");
                String quocGia = this.rs.getString("QuocGia");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                dto = new DiaChi(maDiaChi, soNha, tenDuong, phuong, quan, thanhPho, quocGia);
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

        return dto;
    }
}
