//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FrmThongTin extends JFrame {
    public static JPanel contentPane;
    private JTextField txtXemTT_Ma;
    private JTextField txtXemTT_Ten;
    private JTextField txtXemTT_NgaySinh;
    private JTextField txtXemTT_GioiTinh;
    private JTextField txtXemTT_SoCMND;
    private JTextField txtXemTT_SDT;
    private JTextField txtXemTT_DiaChi;
    private JTextField txtXemTT_TenDangNhap;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmThongTin frame = new FrmThongTin();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmThongTin() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1030, 650);
        this.setLocationRelativeTo((Component)null);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.controlHighlight);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager)null);
        JPanel pnlXemTT = new JPanel();
        pnlXemTT.setBackground(SystemColor.controlHighlight);
        pnlXemTT.setBounds(10, 10, 996, 593);
        contentPane.add(pnlXemTT);
        pnlXemTT.setLayout((LayoutManager)null);
        JLabel lblXemTT_anh = new JLabel("New label");
        lblXemTT_anh.setIcon(new ImageIcon("Hinh\\NhanVien.PNG"));
        lblXemTT_anh.setBounds(384, 24, 176, 176);
        pnlXemTT.add(lblXemTT_anh);
        JLabel lblXemTT_Ma = new JLabel("Mã nhân viên:");
        lblXemTT_Ma.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_Ma.setBounds(75, 220, 125, 43);
        pnlXemTT.add(lblXemTT_Ma);
        this.txtXemTT_Ma = new JTextField();
        this.txtXemTT_Ma.setEditable(false);
        this.txtXemTT_Ma.setBounds(210, 220, 625, 47);
        pnlXemTT.add(this.txtXemTT_Ma);
        this.txtXemTT_Ma.setColumns(10);
        JLabel lblXemTT_Ten = new JLabel("Tên nhân viên:");
        lblXemTT_Ten.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_Ten.setBounds(75, 271, 136, 43);
        pnlXemTT.add(lblXemTT_Ten);
        this.txtXemTT_Ten = new JTextField();
        this.txtXemTT_Ten.setEditable(false);
        this.txtXemTT_Ten.setColumns(10);
        this.txtXemTT_Ten.setBounds(210, 277, 625, 43);
        pnlXemTT.add(this.txtXemTT_Ten);
        JLabel lblXemTT_NgaySinh = new JLabel("Ngày Sinh:");
        lblXemTT_NgaySinh.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_NgaySinh.setBounds(75, 324, 136, 43);
        pnlXemTT.add(lblXemTT_NgaySinh);
        this.txtXemTT_NgaySinh = new JTextField();
        this.txtXemTT_NgaySinh.setEditable(false);
        this.txtXemTT_NgaySinh.setColumns(10);
        this.txtXemTT_NgaySinh.setBounds(210, 324, 262, 47);
        pnlXemTT.add(this.txtXemTT_NgaySinh);
        JLabel lblXemTT_GioiTinh = new JLabel("Giới tính:");
        lblXemTT_GioiTinh.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_GioiTinh.setBounds(473, 328, 136, 43);
        pnlXemTT.add(lblXemTT_GioiTinh);
        this.txtXemTT_GioiTinh = new JTextField();
        this.txtXemTT_GioiTinh.setEditable(false);
        this.txtXemTT_GioiTinh.setColumns(10);
        this.txtXemTT_GioiTinh.setBounds(598, 324, 237, 47);
        pnlXemTT.add(this.txtXemTT_GioiTinh);
        JLabel lblXemTT_SoCMND = new JLabel("Số CMND:");
        lblXemTT_SoCMND.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_SoCMND.setBounds(75, 377, 136, 43);
        pnlXemTT.add(lblXemTT_SoCMND);
        this.txtXemTT_SoCMND = new JTextField();
        this.txtXemTT_SoCMND.setEditable(false);
        this.txtXemTT_SoCMND.setColumns(10);
        this.txtXemTT_SoCMND.setBounds(210, 377, 262, 47);
        pnlXemTT.add(this.txtXemTT_SoCMND);
        JLabel lblXemTT_SDT = new JLabel("Số điện thoại :");
        lblXemTT_SDT.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_SDT.setBounds(473, 381, 136, 43);
        pnlXemTT.add(lblXemTT_SDT);
        this.txtXemTT_SDT = new JTextField();
        this.txtXemTT_SDT.setEditable(false);
        this.txtXemTT_SDT.setColumns(10);
        this.txtXemTT_SDT.setBounds(598, 377, 237, 47);
        pnlXemTT.add(this.txtXemTT_SDT);
        JLabel lblXemTT_DiaChi = new JLabel("Địa chỉ:");
        lblXemTT_DiaChi.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_DiaChi.setBounds(75, 430, 136, 43);
        pnlXemTT.add(lblXemTT_DiaChi);
        this.txtXemTT_DiaChi = new JTextField();
        this.txtXemTT_DiaChi.setEditable(false);
        this.txtXemTT_DiaChi.setColumns(10);
        this.txtXemTT_DiaChi.setBounds(210, 430, 625, 47);
        pnlXemTT.add(this.txtXemTT_DiaChi);
        JLabel lblXemTT_TenDangNhap = new JLabel("Tên đăng nhập:");
        lblXemTT_TenDangNhap.setFont(new Font("Times New Roman", 1, 20));
        lblXemTT_TenDangNhap.setBounds(75, 481, 136, 43);
        pnlXemTT.add(lblXemTT_TenDangNhap);
        this.txtXemTT_TenDangNhap = new JTextField();
        this.txtXemTT_TenDangNhap.setEditable(false);
        this.txtXemTT_TenDangNhap.setColumns(10);
        this.txtXemTT_TenDangNhap.setBounds(210, 483, 466, 47);
        pnlXemTT.add(this.txtXemTT_TenDangNhap);
        JButton btnXemTT_DoiMatKhau = new JButton("Đổi mật khẩu");
        btnXemTT_DoiMatKhau.setFont(new Font("Tahoma", 0, 15));
        btnXemTT_DoiMatKhau.setBounds(686, 487, 147, 43);
        pnlXemTT.add(btnXemTT_DoiMatKhau);
        JButton btnXemTT_Thoat = new JButton("Thoát\r\n");
        btnXemTT_Thoat.setFont(new Font("Times New Roman", 0, 15));
        btnXemTT_Thoat.setBounds(453, 540, 107, 43);
        pnlXemTT.add(btnXemTT_Thoat);
    }
}
