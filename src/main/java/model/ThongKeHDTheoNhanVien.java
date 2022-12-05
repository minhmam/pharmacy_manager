//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.text.DecimalFormat;

public class ThongKeHDTheoNhanVien {
    private String ngay;
    private String maNhanVien;
    private String tenNhanVien;
    private String caLam;
    private String donthuoc;
    private String maThuoc;
    private String tenThuoc;
    private int soLuong;
    private double donGia;
    private double loiNhuan;
    DecimalFormat df = new DecimalFormat("#,###.0(VND)");

    public String getNgay() {
        return this.ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getMaNhanVien() {
        return this.maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return this.tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getCaLam() {
        return this.caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    public String getDonthuoc() {
        return this.donthuoc;
    }

    public void setDonthuoc(String donthuoc) {
        this.donthuoc = donthuoc;
    }

    public String getMaThuoc() {
        return this.maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return this.tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getLoiNhuan() {
        return this.loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    public ThongKeHDTheoNhanVien() {
    }

    public ThongKeHDTheoNhanVien(String ngay, String maNhanVien, String tenNhanVien, String caLam, String donthuoc, String maThuoc, String tenThuoc, int soLuong, double donGia, double loiNhuan) {
        this.ngay = ngay;
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.caLam = caLam;
        this.donthuoc = donthuoc;
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.loiNhuan = loiNhuan;
    }

    public String toString() {
        return "Class_ThongKeHDTheoNhanVien [ngay=" + this.ngay + ", maNhanVien=" + this.maNhanVien + ", tenNhanVien=" + this.tenNhanVien + ", caLam=" + this.caLam + ", donthuoc=" + this.donthuoc + ", maThuoc=" + this.maThuoc + ", tenThuoc=" + this.tenThuoc + ", soLuong=" + this.soLuong + ", donGia=" + this.df.format(this.getDonGia()) + "loiNhuan=" + this.loiNhuan + "]";
    }
}
