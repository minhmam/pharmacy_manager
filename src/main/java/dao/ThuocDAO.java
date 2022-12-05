//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.NhaCungCap;
import model.Thuoc;

public class ThuocDAO {
    public ThuocDAO() {
        ConectDatabase.getInstance().connect();
    }

    public List<Thuoc> getThuoc() {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select MaThuoc, SoDangKi, TenThuoc, PhanLoai, HoatChat, HamLuong, DangBaoChe, QuyCachDongGoi, TieuChua, n.Ten, NgaySanXuat, HanSuDung, DonViTinh, GiaNhap, DonGia, SoLuongNhap, HinhAnh, TrangThai, NhomThuoc from pharmacy_manager.Thuoc t join pharmacy_manager.NhaCungCap n on t.MaNhaCungCap=n.MaNhaCungCap";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                Thuoc thuoc = new Thuoc(ma, soDangKi, tenThuoc, nhomThuoc, phanLoai, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
                list.add(thuoc);
            }
        } catch (Exception var28) {
            var28.printStackTrace();
        }

        return list;
    }

    public boolean them(String soDangKi, String tenThuoc, String phanLoai, String nhomThuoc, String hoatChat, String hamLuong, String dangBaoChe, String quyCach, String tieuChuan, int ncc, Date ngaySanXuat, Date hanSuDung, String donViTinh, float giaNhap, float donGia, int soLuong, byte[] hinhAnh, String trangThai) throws ParseException {
        new SimpleDateFormat("yyyy-MM-dd");
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        String sql = "Insert into pharmacy_manager.[Thuoc] values\r\n(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = null;
        boolean var23 = false;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, soDangKi);
            stmt.setString(2, tenThuoc);
            stmt.setString(3, phanLoai);
            stmt.setString(4, nhomThuoc);
            stmt.setString(5, hoatChat);
            stmt.setString(6, hamLuong);
            stmt.setString(7, dangBaoChe);
            stmt.setString(8, quyCach);
            stmt.setString(9, tieuChuan);
            stmt.setString(10, String.valueOf(ncc));
            java.sql.Date nsx = new java.sql.Date(ngaySanXuat.getTime());
            java.sql.Date hsd = new java.sql.Date(hanSuDung.getTime());
            stmt.setDate(11, nsx);
            stmt.setDate(12, hsd);
            stmt.setString(13, donViTinh);
            stmt.setString(14, String.valueOf(giaNhap));
            stmt.setString(15, String.valueOf(giaNhap));
            stmt.setString(16, String.valueOf(soLuong));
            stmt.setBytes(17, hinhAnh);
            stmt.setString(18, trangThai);
            stmt.executeUpdate();
        } catch (SQLException var26) {
            var26.printStackTrace();
        }

        return true;
    }

    public boolean sua(int ma, String soDangKi, String tenThuoc, String phanLoai, String nhomThuoc, String hoatChat, String hamLuong, String dangBaoChe, String quyCach, String tieuChuan, int ncc, Date ngaySanXuat, Date hanSuDung, String donViTinh, float giaNhap, float donGia, int soLuong, byte[] hinhAnh, String trangThai) throws ParseException {
        new SimpleDateFormat("yyyy-MM-dd");
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        String sql = "Update pharmacy_manager.[Thuoc]\r\nset [SoDangKi]=?,[TenThuoc]=?,[PhanLoai]=?,[NhomThuoc] = ?, [HoatChat]=?,[HamLuong]=?,[DangBaoChe]=?,[QuyCachDongGoi]=?,[TieuChuan]=?,[MaNhaCungCap]=?,[NgaySanXuat]=?,[HanSuDung]=?,[DonViTinh]=?,[GiaNhap]=?,[DonGia]=?,[SoLuongNhap]=?,[HinhAnh]=?,[TrangThai]=?\r\nwhere [MaThuoc]=?";
        PreparedStatement stmt = null;
        boolean var24 = false;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, soDangKi);
            stmt.setString(2, tenThuoc);
            stmt.setString(3, phanLoai);
            stmt.setString(4, nhomThuoc);
            stmt.setString(5, hoatChat);
            stmt.setString(6, hamLuong);
            stmt.setString(7, dangBaoChe);
            stmt.setString(8, quyCach);
            stmt.setString(9, tieuChuan);
            stmt.setString(10, String.valueOf(ncc));
            java.sql.Date nsx = new java.sql.Date(ngaySanXuat.getTime());
            java.sql.Date hsd = new java.sql.Date(hanSuDung.getTime());
            stmt.setDate(11, nsx);
            stmt.setDate(12, hsd);
            stmt.setString(13, donViTinh);
            stmt.setString(14, String.valueOf(giaNhap));
            stmt.setString(15, String.valueOf(giaNhap));
            stmt.setString(16, String.valueOf(soLuong));
            stmt.setBytes(17, hinhAnh);
            stmt.setString(18, trangThai);
            stmt.setInt(19, ma);
            stmt.executeUpdate();
        } catch (SQLException var27) {
            var27.printStackTrace();
        }

        return true;
    }

    public void xoa(int ma) {
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        String qrl = "update pharmacy_manager.[Thuoc]\r\nset [TrangThai]=N'Ngừng bán'\r\nwhere [MaThuoc]=?";

        try {
            PreparedStatement stm = con.prepareStatement(qrl);
            stm.setInt(1, ma);
            stm.executeUpdate();
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

    }

    public List<String> getTenCungCaps() {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [Ten]\r\nfrom pharmacy_manager.[NhaCungCap]";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                String t = rs.getString(1);
                list.add(t);
            }
        } catch (Exception var7) {
        }

        return list;
    }

    public int getmaNCC(String ten) {
        int ma = 0;

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaNhaCungCap]\r\nfrom pharmacy_manager.[NhaCungCap]\r\nwhere [Ten] like N'" + ten + "'";
            Statement statement = con.createStatement();

            int t;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); ma = t) {
                t = rs.getInt(1);
            }
        } catch (Exception var8) {
        }

        return ma;
    }

    public Thuoc getThuocbyMa(int maTim) {
        Thuoc t = new Thuoc();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[SoDangKi],[TenThuoc],[PhanLoai],[HoatChat],[HamLuong],[DangBaoChe],[QuyCachDongGoi],[TieuChuan],n.Ten,[NgaySanXuat],[HanSuDung],[DonViTinh],[GiaNhap],[DonGia],[SoLuongNhap],[HinhAnh],[TrangThai],[NhomThuoc]\r\nfrom pharmacy_manager.[Thuoc] t join pharmacy_manager.[NhaCungCap] n on t.MaNhaCungCap=n.MaNhaCungCap\r\nwhere [MaThuoc] = " + maTim;
            Statement statement = con.createStatement();

            Thuoc thuoc;
            for(ResultSet rs = statement.executeQuery(sql); rs.next(); t = thuoc) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                thuoc = new Thuoc(ma, soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        return t;
    }

    public List<Thuoc> getThuocbyTen(String tenTim) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[SoDangKi],[TenThuoc],[PhanLoai],[HoatChat],[HamLuong],[DangBaoChe],[QuyCachDongGoi],[TieuChuan],n.Ten,[NgaySanXuat],[HanSuDung],[DonViTinh],[GiaNhap],[DonGia],[SoLuongNhap],[HinhAnh],[TrangThai],[NhomThuoc]\r\nfrom pharmacy_manager.[Thuoc] t join pharmacy_manager.[NhaCungCap] n on t.MaNhaCungCap=n.MaNhaCungCap\r\nwhere [TenThuoc] like N'%" + tenTim + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                Thuoc thuoc = new Thuoc(ma, soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
                list.add(thuoc);
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        return list;
    }

    public List<Thuoc> getThuocbynhomThuoc(String nhomThuocTim) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[SoDangKi],[TenThuoc],[PhanLoai],[HoatChat],[HamLuong],[DangBaoChe],[QuyCachDongGoi],[TieuChuan],n.Ten,[NgaySanXuat],[HanSuDung],[DonViTinh],[GiaNhap],[DonGia],[SoLuongNhap],[HinhAnh],[TrangThai],[NhomThuoc]\r\nfrom pharmacy_manager.[Thuoc] t join pharmacy_manager.[NhaCungCap] n on t.MaNhaCungCap=n.MaNhaCungCap\r\nwhere [NhomThuoc] like N'%" + nhomThuocTim + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                Thuoc thuoc = new Thuoc(ma, soDangKi, tenThuoc,nhomThuoc, phanLoai, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
                list.add(thuoc);
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        return list;
    }

    public List<Thuoc> getThuocbyPhanLoai(String phanLoaiTim) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[SoDangKi],[TenThuoc],[PhanLoai],[HoatChat],[HamLuong],[DangBaoChe],[QuyCachDongGoi],[TieuChuan],n.Ten,[NgaySanXuat],[HanSuDung],[DonViTinh],[GiaNhap],[DonGia],[SoLuongNhap],[HinhAnh],[TrangThai],[NhomThuoc]\r\nfrom pharmacy_manager.[Thuoc] t join pharmacy_manager.[NhaCungCap] n on t.MaNhaCungCap=n.MaNhaCungCap\r\nwhere [PhanLoai] like N'%" + phanLoaiTim + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                Thuoc thuoc = new Thuoc(ma, soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
                list.add(thuoc);
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        return list;
    }

    public List<Thuoc> getThuocbynhaCungCap(String nccTim) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select [MaThuoc],[SoDangKi],[TenThuoc],[PhanLoai],[HoatChat],[HamLuong],[DangBaoChe],[QuyCachDongGoi],[TieuChuan],n.Ten,[NgaySanXuat],[HanSuDung],[DonViTinh],[GiaNhap],[DonGia],[SoLuongNhap],[HinhAnh],[TrangThai],[NhomThuoc]\r\nfrom pharmacy_manager.[Thuoc] t join pharmacy_manager.[NhaCungCap] n on t.MaNhaCungCap=n.MaNhaCungCap\r\nwhere  n.Ten like N'%" + nccTim + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                new SimpleDateFormat("dd/MM/yyyy");
                int ma = rs.getInt(1);
                String soDangKi = rs.getString(2);
                String tenThuoc = rs.getString(3);
                String phanLoai = rs.getString(4);
                String hoatChat = rs.getString(5);
                String hamLuong = rs.getString(6);
                String dangBaoChe = rs.getString(7);
                String quyCach = rs.getString(8);
                String tieuChuan = rs.getString(9);
                String nhaCungCap = rs.getString(10);
                Date ngaySanXuat = rs.getDate(11);
                Date hanSuDung = rs.getDate(12);
                String donViTinh = rs.getString(13);
                float giaNhap = rs.getFloat(14);
                float donGia = rs.getFloat(15);
                int sl = rs.getInt(16);
                byte[] hinhAnh = rs.getBytes(17);
                String trangThai = rs.getString(18);
                String nhomThuoc = rs.getString(19);
                NhaCungCap ncc = new NhaCungCap(nhaCungCap);
                Thuoc thuoc = new Thuoc(ma, soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, ncc, ngaySanXuat, hanSuDung, donViTinh, giaNhap, donGia, sl, hinhAnh, trangThai);
                list.add(thuoc);
            }
        } catch (Exception var29) {
            var29.printStackTrace();
        }

        return list;
    }
}
