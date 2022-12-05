//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class ChiTietHoaDon {
    private String maHoaDon;
    private int maThuoc;
    private float donGia;
    private float giamGia;
    private int soLuong;
    private String donViTinh;

    public String getMaHoaDon() {
        return this.maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public int getMaThuoc() {
        return this.maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }

    public float getDonGia() {
        return this.donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return this.donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public ChiTietHoaDon(String maHoaDon, int maThuoc, float donGia, float giamGia, int soLuong, String donViTinh) {
        this.maHoaDon = maHoaDon;
        this.maThuoc = maThuoc;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
    }

    public ChiTietHoaDon() {
    }

    public String toString() {
        return "ChiTietHoaDon [maHoaDon=" + this.maHoaDon + ", maThuoc=" + this.maThuoc + ", donGia=" + this.donGia + ", giamGia=" + this.giamGia + ", soLuong=" + this.soLuong + ", donViTinh=" + this.donViTinh + "]";
    }
}
