//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.sql.Date;
import java.util.Vector;

public class NhanVien {
    private int maNhanVien;
    private String caLamViec;
    private String ten;
    private String ho;
    private Date ngaySinh;
    private String gioiTinh;
    private String cmnd;
    private String soDienThoai;
    private DiaChi diaChi;
    private TaiKhoan taiKhoan;
    private String loaiNhanVien;
    private String trangThai;

    public int getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getCaLamViec() {
        return this.caLamViec;
    }

    public void setCaLamViec(String caLamViec) {
        this.caLamViec = caLamViec;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return this.ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDienThoai() {
        return this.soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLoaiNhanVien() {
        return this.loaiNhanVien;
    }

    public void setLoaiNhanVien(String loaiNhanVien) {
        this.loaiNhanVien = loaiNhanVien;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public DiaChi getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public TaiKhoan getTaiKhoan() {
        return this.taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public NhanVien(int maNhanVien, String caLamViec, String ten, String ho, Date ngaySinh, String gioiTinh, String cmnd, String soDienThoai, DiaChi diaChi, TaiKhoan taiKhoan, String loaiNhanVien, String trangThai) {
        this.maNhanVien = maNhanVien;
        this.caLamViec = caLamViec;
        this.ten = ten;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.taiKhoan = taiKhoan;
        this.loaiNhanVien = loaiNhanVien;
        this.trangThai = trangThai;
    }

    public NhanVien() {
    }

    public String toString() {
        return "NhanVien [maNhanVien=" + this.maNhanVien + ", caLamViec=" + this.caLamViec + ", ten=" + this.ten + ", ho=" + this.ho + ", ngaySinh=" + this.ngaySinh + ", gioiTinh=" + this.gioiTinh + ", cmnd=" + this.cmnd + ", soDienThoai=" + this.soDienThoai + ", diaChi=" + this.diaChi + ", taiKhoan=" + this.taiKhoan + ", loaiNhanVien=" + this.loaiNhanVien + ", trangThai=" + this.trangThai + "]";
    }

    public Vector<Object> toVector() {
        Vector<Object> v = new Vector();
        v.add("");
        v.add(this.maNhanVien);
        v.add(this.ho);
        v.add(this.ten);
        v.add(this.ngaySinh);
        v.add(this.gioiTinh);
        v.add(this.cmnd);
        v.add(this.soDienThoai);
        v.add(this.caLamViec);
        v.add(this.diaChi.getMaDiaChi());
        v.add(this.taiKhoan.getTenTaiKhoan());
        v.add(this.loaiNhanVien);
        v.add(this.trangThai);
        return v;
    }
}
