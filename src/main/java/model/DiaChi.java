//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class DiaChi {
    private int maDiaChi;
    private String soNha;
    private String tenDuong;
    private String phuong;
    private String quan;
    private String thanhPho;
    private String quocGia;

    public DiaChi(int maDiaChi, String soNha, String tenDuong, String phuong, String quan, String thanhPho, String quocGia) {
        this.maDiaChi = maDiaChi;
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
    }

    public DiaChi(String soNha, String tenDuong, String phuong, String quan, String thanhPho, String quocGia) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
    }

    public DiaChi(int maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public DiaChi() {
    }

    public int getMaDiaChi() {
        return this.maDiaChi;
    }

    public void setMaDiaChi(int maDiaChi) {
        this.maDiaChi = maDiaChi;
    }

    public String getSoNha() {
        return this.soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getTenDuong() {
        return this.tenDuong;
    }

    public void setTenDuong(String tenDuong) {
        this.tenDuong = tenDuong;
    }

    public String getPhuong() {
        return this.phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return this.quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return this.thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return this.quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String toString() {
        return this.soNha + "," + this.tenDuong + "," + this.phuong + "," + this.quan + "," + this.thanhPho + "," + this.quocGia;
    }

    public int hashCode() {
        int prime = 1;
        int result = 1;
        result = 31 * result + this.maDiaChi;
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
            DiaChi other = (DiaChi)obj;
            return this.maDiaChi == other.maDiaChi;
        }
    }
}
