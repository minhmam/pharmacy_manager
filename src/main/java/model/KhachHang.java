//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.sql.Date;
import java.util.Vector;

public class KhachHang {
    private int maKhachHang;
    private String ten;
    private String ho;
    private Date ngaySinh;
    private String gioiTinh;
    private String cmnd;
    private String soDienThoai;
    private DiaChi diaChi;

    public int getMaKhachHang() {
        return this.maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
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

    public DiaChi getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public KhachHang(int maKhachHang, String ten, String ho, Date ngaySinh, String gioiTinh, String cmnd, String soDienThoai, DiaChi diaChi) {
        this.maKhachHang = maKhachHang;
        this.ten = ten;
        this.ho = ho;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public KhachHang() {
    }

    public String toString() {
        return "KhachHang [maKhachHang=" + this.maKhachHang + ", ten=" + this.ten + ", ho=" + this.ho + ", ngaySinh=" + this.ngaySinh + ", gioiTinh=" + this.gioiTinh + ", cmnd=" + this.cmnd + ", soDienThoai=" + this.soDienThoai + ", diaChi=" + this.diaChi + "]";
    }

    public Vector<Object> toVector() {
        Vector<Object> v = new Vector();
        v.add("");
        v.add(this.maKhachHang);
        v.add(this.ho);
        v.add(this.ten);
        v.add(this.ngaySinh);
        v.add(this.gioiTinh);
        v.add(this.cmnd);
        v.add(this.soDienThoai);
        v.add(this.diaChi);
        return v;
    }
}
