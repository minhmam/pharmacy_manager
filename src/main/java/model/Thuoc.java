//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.util.Arrays;
import java.util.Date;

public class Thuoc {
    private int maThuoc;
    private String soDangky;
    private String tenThuoc;
    private String nhomThuoc;
    private String phanLoai;
    private String hoatChat;
    private String hamLuong;
    private String dangBaoChe;
    private String QuyCach;
    private String tieuChuan;
    private NhaCungCap nhaCungcap;
    private Date ngaySanXuat;
    private Date hanSuDung;
    private String donViTinh;
    private float giaNhap;
    private float donGia;
    private int soLuongNhap;
    private byte[] hinhAnh;
    private String trangThai;

    public Thuoc() {
    }

    public Thuoc(int maThuoc, String soDangky, String tenThuoc, String nhomThuoc, String phanLoai, String hoatChat, String hamLuong, String dangBaoChe, String quyCach, String tieuChuan, NhaCungCap nhaCungcap, Date ngaySanXuat, Date hanSuDung, String donViTinh, float giaNhap, float donGia, int soLuongNhap, byte[] hinhAnh, String trangThai) {
        this.maThuoc = maThuoc;
        this.soDangky = soDangky;
        this.tenThuoc = tenThuoc;
        this.nhomThuoc = nhomThuoc;
        this.phanLoai = phanLoai;
        this.hoatChat = hoatChat;
        this.hamLuong = hamLuong;
        this.dangBaoChe = dangBaoChe;
        this.QuyCach = quyCach;
        this.tieuChuan = tieuChuan;
        this.nhaCungcap = nhaCungcap;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.donGia = donGia;
        this.soLuongNhap = soLuongNhap;
        this.hinhAnh = hinhAnh;
        this.trangThai = trangThai;
    }

    public Thuoc(String soDangky, String tenThuoc, String nhomThuoc, String phanLoai, String hoatChat, String hamLuong, String dangBaoChe, String quyCach, String tieuChuan, NhaCungCap nhaCungcap, Date ngaySanXuat, Date hanSuDung, String donViTinh, float giaNhap, float donGia, int soLuongNhap, byte[] hinhAnh, String trangThai) {
        this.soDangky = soDangky;
        this.tenThuoc = tenThuoc;
        this.nhomThuoc = nhomThuoc;
        this.phanLoai = phanLoai;
        this.hoatChat = hoatChat;
        this.hamLuong = hamLuong;
        this.dangBaoChe = dangBaoChe;
        this.QuyCach = quyCach;
        this.tieuChuan = tieuChuan;
        this.nhaCungcap = nhaCungcap;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.donGia = donGia;
        this.soLuongNhap = soLuongNhap;
        this.hinhAnh = hinhAnh;
        this.trangThai = trangThai;
    }

    public String getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getMaThuoc() {
        return this.maThuoc;
    }

    public void setMaThuoc(int maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getSoDangky() {
        return this.soDangky;
    }

    public void setSoDangky(String soDangky) {
        this.soDangky = soDangky;
    }

    public String getTenThuoc() {
        return this.tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public String getNhomThuoc() {
        return this.nhomThuoc;
    }

    public void setNhomThuoc(String nhomThuoc) {
        this.nhomThuoc = nhomThuoc;
    }

    public String getPhanLoai() {
        return this.phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    public String getHoatChat() {
        return this.hoatChat;
    }

    public void setHoatChat(String hoatChat) {
        this.hoatChat = hoatChat;
    }

    public String getHamLuong() {
        return this.hamLuong;
    }

    public void setHamLuong(String hamLuong) {
        this.hamLuong = hamLuong;
    }

    public String getDangBaoChe() {
        return this.dangBaoChe;
    }

    public void setDangBaoChe(String dangBaoChe) {
        this.dangBaoChe = dangBaoChe;
    }

    public String getQuyCach() {
        return this.QuyCach;
    }

    public void setQuyCach(String quyCach) {
        this.QuyCach = quyCach;
    }

    public String getTieuChuan() {
        return this.tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public NhaCungCap getNhaCungcap() {
        return this.nhaCungcap;
    }

    public void setNhaCungcap(NhaCungCap nhaCungcap) {
        this.nhaCungcap = nhaCungcap;
    }

    public Date getNgaySanXuat() {
        return this.ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getHanSuDung() {
        return this.hanSuDung;
    }

    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getDonViTinh() {
        return this.donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public float getGiaNhap() {
        return this.giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getDonGia() {
        return this.donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuongNhap() {
        return this.soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public byte[] getHinhAnh() {
        return this.hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String toString() {
        return "Thuoc [maThuoc=" + this.maThuoc + ", soDangky=" + this.soDangky + ", tenThuoc=" + this.tenThuoc + ", nhomThuoc=" + this.nhomThuoc + ", phanLoai=" + this.phanLoai + ", hoatChat=" + this.hoatChat + ", hamLuong=" + this.hamLuong + ", dangBaoChe=" + this.dangBaoChe + ", QuyCach=" + this.QuyCach + ", tieuChuan=" + this.tieuChuan + ", nhaCungcap=" + this.nhaCungcap + ", ngaySanXuat=" + this.ngaySanXuat + ", hanSuDung=" + this.hanSuDung + ", donViTinh=" + this.donViTinh + ", giaNhap=" + this.giaNhap + ", donGia=" + this.donGia + ", soLuongNhap=" + this.soLuongNhap + ", hinhAnh=" + Arrays.toString(this.hinhAnh) + ", trangThai=" + this.trangThai + "]";
    }

    public int hashCode() {
        int prime = 1;
        int result = 1;
        result = 31 * result + this.maThuoc;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            Thuoc other = (Thuoc)obj;
            return this.maThuoc == other.maThuoc;
        }
    }
}
