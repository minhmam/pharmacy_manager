//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class NhaCungCap {
    private int maNCC;
    private String tenNCC;
    private String soDienThoai;
    private String gmail;
    private DiaChi diaChi;

    public NhaCungCap() {
    }

    public NhaCungCap(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public NhaCungCap(int maNCC) {
        this.maNCC = maNCC;
    }

    public NhaCungCap(int maNCC, String tenNCC, String soDienThoai, String gmail, DiaChi diaChi) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.soDienThoai = soDienThoai;
        this.gmail = gmail;
        this.diaChi = diaChi;
    }

    public int getMaNCC() {
        return this.maNCC;
    }

    public void setMaNCC(int maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return this.tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getSoDienThoai() {
        return this.soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGmail() {
        return this.gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public DiaChi getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public String toString() {
        return "NhaCungCap [maNCC=" + this.maNCC + ", tenNCC=" + this.tenNCC + ", soDienThoai=" + this.soDienThoai + ", gmail=" + this.gmail + ", diaChi=" + this.diaChi + "]";
    }

    public int hashCode() {
        int prime = 1;
        int result = 1;
        result = 31 * result + this.maNCC;
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
            NhaCungCap other = (NhaCungCap)obj;
            return this.maNCC == other.maNCC;
        }
    }
}
