//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.util.Date;

public class HoaDon {
    private String ma;
    private Date ngayLap;
    private double tongTien;
    private int nhanVien;
    private int khachHang;

    public HoaDon(String ma, Date ngayLap, double tongTien, int nhanVien, int khachHang) {
        this.ma = ma;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
    }

    public HoaDon() {
    }

    public String getMa() {
        return this.ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayLap() {
        return this.ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public double getTongTien() {
        return this.tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getNhanVien() {
        return this.nhanVien;
    }

    public void setNhanVien(int nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getKhachHang() {
        return this.khachHang;
    }

    public void setKhachHang(int khachHang) {
        this.khachHang = khachHang;
    }

    public String toString() {
        return "HoaDon [ma=" + this.ma + ", ngayLap=" + this.ngayLap + ", tongTien=" + this.tongTien + ", nhanVien=" + this.nhanVien + ", khachHang=" + this.khachHang + "]";
    }
}
