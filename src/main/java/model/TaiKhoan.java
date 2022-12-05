//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class TaiKhoan {
    private String tenTaiKhoan;
    private String matKhau;
    private String loaiTaiKhoan;

    public String getTenTaiKhoan() {
        return this.tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return this.matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getLoaiTaiKhoan() {
        return this.loaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String loaiTaiKhoan) {
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public TaiKhoan(String tenTaiKhoan, String matKhau, String loaiTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.loaiTaiKhoan = loaiTaiKhoan;
    }

    public TaiKhoan(String tenTaiKhoan, String matKhau) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
    }

    public TaiKhoan() {
    }

    public String toString() {
        return "TaiKhoan [tenTaiKhoan=" + this.tenTaiKhoan + ", matKhau=" + this.matKhau + ", loaiTaiKhoan=" + this.loaiTaiKhoan + "]";
    }
}
