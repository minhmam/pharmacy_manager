//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.DiaChi;
import model.NhaCungCap;

public class NhaCungCapDAO {
    public NhaCungCapDAO() {
        ConectDatabase.getInstance().connect();
    }

    public List<NhaCungCap> getNhaCungCaps() {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select * from pharmacy_manager.[NhaCungCap]";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                int maNCC = rs.getInt(1);
                String ten = rs.getString(2);
                String soDienThoai = rs.getString(3);
                String gmail = rs.getString(4);
                int maDC = rs.getInt(5);
                DiaChi dc = new DiaChi(maDC);
                NhaCungCap ncc = new NhaCungCap(maNCC, ten, soDienThoai, gmail, dc);
                list.add(ncc);
            }
        } catch (SQLException var13) {
            var13.printStackTrace();
        }

        return list;
    }

    public boolean themDiaChi(String soNha, String tenDuong, String phuong, String quan, String thanhPho, String quocGia) {
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        PreparedStatement stmt = null;
        int n = 0;

        try {
            stmt = con.prepareStatement("insert into pharmacy_manager.DiaChi values\r\n(?,?,?,?,?,?)");
            stmt.setString(1, soNha);
            stmt.setString(2, tenDuong);
            stmt.setString(3, phuong);
            stmt.setString(4, quan);
            stmt.setString(5, thanhPho);
            stmt.setString(6, quocGia);
            n = stmt.executeUpdate();
        } catch (Exception var11) {
        }

        return n > 0;
    }

    public boolean them(String ten, String sdt, String email, int maDC) {
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        PreparedStatement stmt = null;
        int n = 0;

        try {
            stmt = con.prepareStatement("insert pharmacy_manager.[NhaCungCap] values \r\n(?,?,?,?)");
            stmt.setString(1, ten);
            stmt.setString(2, sdt);
            stmt.setString(3, email);
            stmt.setInt(4, maDC);
            n = stmt.executeUpdate();
        } catch (Exception var9) {
        }

        return n > 0;
    }

    public List<Integer> getMaDiaChi(String soNha, String tenDuong, String phuong, String quan, String thanhPho, String quocGia) {
        ArrayList list = new ArrayList();

        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            String sql = "select[MaDiaChi]  \r\nfrom pharmacy_manager.[DiaChi]\r\nwhere [SoNha] like N'" + soNha + "' and [TenDuong] like N'" + tenDuong + "' and [Phuong] like N'" + phuong + "' and [Quan] like N'" + quan + "' " + "and [ThanhPho] like N'" + thanhPho + "'  and [QuocGia]like N'" + quocGia + "'\r\n";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while(rs.next()) {
                int t = rs.getInt(1);
                list.add(t);
            }
        } catch (Exception var13) {
        }

        return list;
    }
}
