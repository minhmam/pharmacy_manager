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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DiaChi;
import model.NhanVien;
import model.TaiKhoan;

public class NhanVienDAO {
    Connection con;
    PreparedStatement preStm;
    ResultSet rs;

    public NhanVienDAO() {
    }

    private void closeConnection() throws SQLException {
        if (this.rs != null) {
            this.rs.close();
        }

        if (this.preStm != null) {
            this.preStm.close();
        }

        if (this.con != null) {
            this.con.close();
        }

    }

    public boolean themNhanVien(NhanVien dto) throws SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        int n = 0;

        try {
            String sql = "insert into NhanVien\r\n values(?,?,?,?,?,?,?,?,?,?,?)";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, dto.getCaLamViec());
            this.preStm.setString(2, dto.getTen());
            this.preStm.setString(3, dto.getHo());
            this.preStm.setDate(4, dto.getNgaySinh());
            this.preStm.setString(5, dto.getGioiTinh());
            this.preStm.setString(6, dto.getCmnd());
            this.preStm.setString(7, dto.getSoDienThoai());
            this.preStm.setInt(8, dto.getDiaChi().getMaDiaChi());
            this.preStm.setString(9, dto.getTaiKhoan().getTenTaiKhoan());
            this.preStm.setString(10, dto.getLoaiNhanVien());
            this.preStm.setString(11, dto.getTrangThai());
            n = this.preStm.executeUpdate();
        } catch (Exception var4) {
            System.out.println("Loi add nhanVien sql");
            var4.printStackTrace();
        }

        return n > 0;
    }

    public boolean xoaNhanVien(NhanVien nv) throws ClassNotFoundException, SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        boolean check = false;

        try {
            String sql = "update NhanVien\r\nset TrangThai=N'Nghỉ việc' where MaNhanVien=?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setInt(1, nv.getMaNhanVien());
            check = this.preStm.executeUpdate() > 0;
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Loi xóa sql");
        }

        return check;
    }

    public boolean deleteNhanVien(int ma, String trangThai) throws SQLException {
        Connection con = null;
        ConectDatabase.getInstance();
        con = ConectDatabase.getConnection();
        int n = 0;

        try {
            String sql = "Update NhanVien set TrangThai = ? where MaNhanVien = ?";
            this.preStm = con.prepareStatement(sql);
            this.preStm.setString(1, trangThai);
            this.preStm.setInt(2, ma);
            n = this.preStm.executeUpdate();
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return n > 0;
    }

    public boolean capnhatNhanVien(NhanVien dto) throws ClassNotFoundException, SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        int n = 0;

        try {
            String sql = "Update NhanVien set Ho = ?,Ten = ?,NgaySinh = ?,GioiTinh = ?,CMND = ?,SoDienThoai = ?,CaLamViec = ?,LoaiNhanVien = ?,TrangThai = ? where MaNhanVien = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, dto.getHo());
            this.preStm.setString(2, dto.getTen());
            this.preStm.setDate(3, dto.getNgaySinh());
            this.preStm.setString(4, dto.getGioiTinh());
            this.preStm.setString(5, dto.getCmnd());
            this.preStm.setString(6, dto.getSoDienThoai());
            this.preStm.setString(7, dto.getCaLamViec());
            this.preStm.setString(8, dto.getLoaiNhanVien());
            this.preStm.setString(9, dto.getTrangThai());
            this.preStm.setInt(10, dto.getMaNhanVien());
            n = this.preStm.executeUpdate();
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Loi cap nhat sql");
        }

        return n > 0;
    }

    public boolean updateNhanVien(int ma, String ho, String ten, Date ngaySinh, String gioiTinh, String cmnd, String sdt, String caLamViec, String loaiNV, String trangThai) throws SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        int n = 0;

        try {
            String sql = "Update NhanVien set Ho = ?,Ten = ?,NgaySinh = ?,GioiTinh = ?,CMND = ?,SoDienThoai = ?,CaLamViec = ?,LoaiNhanVien = ?,TrangThai = ? where MaNhanVien = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, ho);
            this.preStm.setString(2, ten);
            this.preStm.setDate(3, ngaySinh);
            this.preStm.setString(4, gioiTinh);
            this.preStm.setString(5, cmnd);
            this.preStm.setString(6, sdt);
            this.preStm.setString(7, caLamViec);
            this.preStm.setString(8, loaiNV);
            this.preStm.setString(9, trangThai);
            this.preStm.setInt(10, ma);
            n = this.preStm.executeUpdate();
        } catch (Exception var13) {
            var13.printStackTrace();
            System.out.println("Loi cap nhat sql");
        }

        return n > 0;
    }

    public List<NhanVien> timkiemNhanVienByMa(int ma) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from NhanVien where MaNhanVien like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + ma + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maNV = this.rs.getInt("MaNhanVien");
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                NhanVien dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
                result.add(dto);
            }
        } catch (Exception var19) {
            var19.printStackTrace();
            System.out.println("Loi tim nhan vien theo id sql");
        }

        return result;
    }

    public List<NhanVien> timkiemNhanVienBySDT(String sdt) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from NhanVien where SoDienThoai like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + sdt + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maNV = this.rs.getInt("MaNhanVien");
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                NhanVien dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
                result.add(dto);
            }
        } catch (Exception var19) {
            var19.printStackTrace();
        }

        return result;
    }

    public List<NhanVien> timkiemNhanVienByTen(String tennv) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from NhanVien where Ten like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + tennv + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maNV = this.rs.getInt("MaNhanVien");
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                NhanVien dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
                result.add(dto);
            }
        } catch (Exception var19) {
            var19.printStackTrace();
        }

        return result;
    }

    public List<NhanVien> timkiemNhanVienByCalamViec(String caLamViecc) throws ClassNotFoundException, SQLException {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select * from NhanVien where CaLamViec like ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, "%" + caLamViecc + "%");
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maNV = this.rs.getInt("MaNhanVien");
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                NhanVien dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
                result.add(dto);
            }
        } catch (Exception var19) {
            var19.printStackTrace();
        }

        return result;
    }

    public NhanVien layThongTinNhanVien(int maNV) throws ClassNotFoundException, SQLException {
        NhanVien dto = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "Select * from NhanVien where MaNhanVien = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setInt(1, maNV);
            this.rs = this.preStm.executeQuery();
            if (this.rs.next()) {
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
            }
        } catch (Exception var17) {
            var17.printStackTrace();
        }

        return dto;
    }

    public List<NhanVien> getAllNhanVien() throws Exception {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select MaNhanVien,CaLamViec,Ten ,Ho,NgaySinh,GioiTinh,CMND,SoDienThoai,MaDiaChi,TenTaiKhoan,LoaiNhanVien,TrangThai from NhanVien";
            this.preStm = this.con.prepareStatement(sql);
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                int maNV = this.rs.getInt("MaNhanVien");
                String caLamViec = this.rs.getString("CaLamViec");
                String ten = this.rs.getString("Ten");
                String ho = this.rs.getString("Ho");
                Date ngaySinh = this.rs.getDate("NgaySinh");
                String gioiTinh = this.rs.getString("GioiTinh");
                String CMND = this.rs.getString("CMND");
                String soDT = this.rs.getString("SoDienThoai");
                int maDiaChi = this.rs.getInt("MaDiaChi");
                String tenTK = this.rs.getString("TenTaiKhoan");
                String loaiNV = this.rs.getString("LoaiNhanVien");
                String trangThai = this.rs.getString("TrangThai");
                DiaChi diaChi = new DiaChi();
                diaChi.setMaDiaChi(maDiaChi);
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setTenTaiKhoan(tenTK);
                NhanVien dto = new NhanVien(maNV, caLamViec, ten, ho, ngaySinh, gioiTinh, CMND, soDT, diaChi, taiKhoan, loaiNV, trangThai);
                result.add(dto);
            }
        } catch (Exception var18) {
            var18.printStackTrace();
        }

        return result;
    }

    public boolean addTaiKhoan(TaiKhoan tk) throws ClassNotFoundException, SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        int n = 0;

        try {
            this.preStm = this.con.prepareStatement("insert into TaiKhoan values\r\n(?,?)");
            this.preStm.setString(1, tk.getTenTaiKhoan());
            this.preStm.setString(2, tk.getMatKhau());
            n = this.preStm.executeUpdate();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return n > 0;
    }

    public List<String> getAllTenTaiKhoan() throws Exception {
        ArrayList result = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select TenTaiKhoan from  pharmacy_manager.TaiKhoan";
            this.preStm = this.con.prepareStatement(sql);
            this.rs = this.preStm.executeQuery();
            result = new ArrayList();

            while(this.rs.next()) {
                String taiKhoan = this.rs.getString(1);
                result.add(taiKhoan);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return result;
    }

    public boolean addDiaChi(DiaChi dc) throws SQLException {
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();
        boolean check = false;

        try {
            this.preStm = this.con.prepareStatement("insert into pharmacy_manager.DiaChi values\r\n(?,?,?,?,?,?)");
            this.preStm.setString(1, dc.getSoNha());
            this.preStm.setString(2, dc.getTenDuong());
            this.preStm.setString(3, dc.getPhuong());
            this.preStm.setString(4, dc.getQuan());
            this.preStm.setString(5, dc.getThanhPho());
            this.preStm.setString(6, dc.getQuocGia());
            check = this.preStm.executeUpdate() > 0;
        } catch (Exception var4) {
            System.out.println("loi sql them dia chi");
            var4.printStackTrace();
        }

        return check;
    }

    public List<Integer> getAllMaDiaChi() throws Exception {
        List<Integer> result = new ArrayList();
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();

        try {
            String sql = "select [MaDiaChi] from  pharmacy_manager.[DiaChi]";
            this.preStm = this.con.prepareStatement(sql);
            ResultSet rs = this.preStm.executeQuery();

            while(rs.next()) {
                int maDC = rs.getInt(1);
                result.add(maDC);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            System.out.println("Lỗi lấy all MaDiaChi");
        }

        return result;
    }

    public int getMaDiaChiMax() {
        int maDiaChiMax = 0;
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();

        try {
            String sql = "select MAX(MaDiaChi)\r\nfrom pharmacy_manager.DiaChi";
            Statement statement = this.con.createStatement();

            for(ResultSet rs = statement.executeQuery(sql); rs.next(); maDiaChiMax = rs.getInt(1)) {
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return maDiaChiMax;
    }

    public int getMaNhanVienMax() throws SQLException {
        int maNhanVienMax = 0;
        ConectDatabase.getInstance();
        this.con = ConectDatabase.getConnection();

        try {
            String sql = "select MAX(MaNhanVien)\r\nfrom pharmacy_manager.NhanVien";
            Statement statement = this.con.createStatement();

            for(ResultSet rs = statement.executeQuery(sql); rs.next(); maNhanVienMax = rs.getInt(1)) {
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return maNhanVienMax;
    }

    public List<Integer> getAllMaNV() throws Exception {
        ArrayList result = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select MaNhanVien from NhanVien";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                int maNV = rs.getInt(1);
                result.add(maNV);
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return result;
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

    public String getTenNhanVienByTenTaiKhoan(String tenTaiKhoan) {
        String tenTaiKhoan1 = null;

        try {
            ConectDatabase.getInstance();
            this.con = ConectDatabase.getConnection();
            String sql = "select Ho + ' '+Ten from pharmacy_manager.NhanVien n join pharmacy_manager.TaiKhoan t on n.TenTaiKhoan = t.TenTaiKhoan where t.TenTaiKhoan = ?";
            this.preStm = this.con.prepareStatement(sql);
            this.preStm.setString(1, tenTaiKhoan);

            for(this.rs = this.preStm.executeQuery(); this.rs.next(); tenTaiKhoan1 = this.rs.getString(1)) {
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Error getTenNhanVienByTenTaiKhoan SQL !");
        }

        return tenTaiKhoan1;
    }
}
