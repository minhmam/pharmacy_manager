//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.ConectDatabase;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import model.TaiKhoan;

public class FrmDangNhap extends JFrame implements ActionListener, KeyListener {
    private JPanel contentPane;
    private JTextField txtUser;
    private JTextField txtLoginFRM;
    private JLabel lblUser;
    private JTextField txtPass;
    private JLabel lblPassword;
    private JButton btnLogin;
    private JButton btnReset;
    private JLabel lblSao;
    private JLabel lblSao2;
    private JLabel lblBatBuoc;
    private JLabel lblBatBuoc2;
    private JLabel lblMessLoiUser;
    private JLabel lblMessLoiPass;
    public static TaiKhoan taiKhoan;
    public static boolean TrangThaiDangNhapNhanVien = false;
    public static boolean TrangThaiDangNhapQuanLy = false;
    private String tenTaiKhoanAdmin = "ADMIN";
    private String matKhauAdmin = "ADMIN";
    public static String usernameToGetNhanVien = "";
    private JLabel lblNewLabel;

    public FrmDangNhap() {
        this.setBackground(new Color(153, 153, 255));
        this.setTitle("Đăng nhập");
        this.setBounds(100, 100, 578, 339);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(2);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(SystemColor.window);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        this.txtUser = new JTextField();
        this.txtUser.setForeground(new Color(51, 0, 51));
        this.txtUser.setFont(new Font("Times New Roman", 0, 20));
        this.txtUser.setBackground(new Color(255, 255, 255));
        this.txtUser.setBounds(352, 83, 189, 25);
        this.contentPane.add(this.txtUser);
        this.txtUser.setColumns(10);
        this.lblUser = new JLabel("UserName:");
        this.lblUser.setBackground(Color.LIGHT_GRAY);
        this.lblUser.setFont(new Font("Times New Roman", 0, 18));
        this.lblUser.setBounds(254, 84, 88, 25);
        this.contentPane.add(this.lblUser);
        this.txtPass = new JPasswordField();
        this.txtPass.setBackground(new Color(255, 255, 255));
        this.txtPass.setBounds(352, 144, 189, 25);
        this.txtPass.setFont(new Font("Times New Roman", 0, 20));
        this.contentPane.add(this.txtPass);
        this.txtPass.setColumns(10);
        this.lblPassword = new JLabel("Password:");
        this.lblPassword.setFont(new Font("Times New Roman", 0, 18));
        this.lblPassword.setBounds(254, 146, 81, 25);
        this.contentPane.add(this.lblPassword);
        this.btnLogin = new JButton("Login");
        this.btnLogin.setFont(new Font("Times New Roman", 0, 15));
        this.btnLogin.setBounds(303, 222, 131, 32);
        this.btnLogin.setIcon(new ImageIcon("Hinh\\login.png"));
        this.contentPane.add(this.btnLogin);
        this.btnReset = new JButton("Reset");
        this.btnReset.setIcon(new ImageIcon("Hinh\\arrow_refresh.png"));
        this.btnReset.setFont(new Font("Times New Roman", 0, 15));
        this.btnReset.setBounds(436, 222, 107, 32);
        this.contentPane.add(this.btnReset);
        this.lblMessLoiUser = new JLabel("");
        this.lblMessLoiUser.setFont(new Font("Tahoma", 0, 9));
        this.lblMessLoiUser.setForeground(Color.RED);
        this.lblMessLoiUser.setBounds(240, 112, 298, 21);
        this.contentPane.add(this.lblMessLoiUser);
        this.lblMessLoiPass = new JLabel("");
        this.lblMessLoiPass.setFont(new Font("Tahoma", 0, 9));
        this.lblMessLoiPass.setForeground(Color.RED);
        this.lblMessLoiPass.setBounds(254, 172, 287, 25);
        this.contentPane.add(this.lblMessLoiPass);
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\Luu Pot\\Desktop\\Working\\QLyHieuThuoc\\src\\image\\login.jpg"));
        label.setBounds(0, 0, 244, 300);
        this.contentPane.add(label);
        this.lblNewLabel = new JLabel("Quản Lý Hiệu Thuốc");
        this.lblNewLabel.setFont(new Font("Tahoma", 0, 24));
        this.lblNewLabel.setBounds(314, 25, 227, 36);
        this.contentPane.add(this.lblNewLabel);
        this.btnReset.addActionListener(this);
        this.btnLogin.addActionListener(this);
        this.txtUser.requestFocus();
        this.addKeyListener(this);
    }

    public boolean KiemTraDuLieu() {
        String tenUser = this.txtUser.getText();
        boolean match = tenUser.matches("[a-zA-z0-9 ]{3,20}");
        if (!match) {
            this.lblMessLoiUser.setText("Lỗi: Tên đăng Nhập(Không chưa ký tự đặc biệt,Tối thiểu 3-20 Ký Tự)");
            return false;
        } else {
            return true;
        }
    }

    public void loadTaiKhoan(String tenDangNhap, String matKhau) {
        try {
            ConectDatabase.getInstance();
            Connection con = ConectDatabase.getConnection();
            PreparedStatement stmt = null;
            String sql = "select t.TenTaiKhoan, MatKhau, LoaiNhanVien from pharmacy_manager.TaiKhoan t join pharmacy_manager.NhanVien n on t.TenTaiKhoan = n.TenTaiKhoan where t.TenTaiKhoan=? and t.MatKhau=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, tenDangNhap);
            stmt.setString(2, matKhau);

            String ten;
            String mk;
            String loaiTk;
            for(ResultSet rs = stmt.executeQuery(); rs.next(); taiKhoan = new TaiKhoan(ten, mk, loaiTk)) {
                ten = rs.getString(1).trim();
                mk = rs.getString(2).trim();
                loaiTk = rs.getString(3).trim();
            }
        } catch (Exception var10) {
        }

    }

    public boolean kiemTraDangNhap(String tenDangNhap, String matKhau) {
        if (tenDangNhap.equalsIgnoreCase(this.tenTaiKhoanAdmin) && matKhau.equalsIgnoreCase(this.matKhauAdmin)) {
            TrangThaiDangNhapNhanVien = true;
            TrangThaiDangNhapQuanLy = true;
            return true;
        } else if (taiKhoan.getTenTaiKhoan().equalsIgnoreCase(tenDangNhap) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau) && taiKhoan.getLoaiTaiKhoan().equalsIgnoreCase("NV")) {
            TrangThaiDangNhapNhanVien = true;
            return true;
        } else if (taiKhoan.getTenTaiKhoan().equalsIgnoreCase(tenDangNhap) && taiKhoan.getMatKhau().equalsIgnoreCase(matKhau) && taiKhoan.getLoaiTaiKhoan().equalsIgnoreCase("QL")) {
            TrangThaiDangNhapQuanLy = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean kiemTraDangNhapAdmin(String tenDangNhap, String matKhau) {
        if (tenDangNhap.equalsIgnoreCase(this.tenTaiKhoanAdmin) && matKhau.equalsIgnoreCase(this.matKhauAdmin)) {
            TrangThaiDangNhapNhanVien = true;
            TrangThaiDangNhapQuanLy = true;
            return true;
        } else {
            return false;
        }
    }

    public void logIn() {
        try {
            if (this.KiemTraDuLieu()) {
                String tenDN = this.txtUser.getText().trim();
                String matKhau = this.txtPass.getText().trim();
                this.loadTaiKhoan(tenDN, matKhau);
                FrmManHinhChinh frmManHinhChinh;
                if (this.kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapNhanVien && TrangThaiDangNhapQuanLy) {
                    usernameToGetNhanVien = this.txtUser.getText();
                    frmManHinhChinh = new FrmManHinhChinh();
                    frmManHinhChinh.setVisible(true);
                    this.setVisible(false);
                } else if (this.kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapNhanVien) {
                    usernameToGetNhanVien = this.txtUser.getText();
                    frmManHinhChinh = new FrmManHinhChinh();
                    FrmManHinhChinh.mntmQuanLyThuoc.setEnabled(false);
                    FrmManHinhChinh.mnNhanVien.setEnabled(false);
                    FrmManHinhChinh.mnThongKe.setEnabled(false);
                    frmManHinhChinh.setVisible(true);
                    this.setVisible(false);
                } else if (this.kiemTraDangNhap(tenDN, matKhau) && TrangThaiDangNhapQuanLy) {
                    usernameToGetNhanVien = this.txtUser.getText();
                    frmManHinhChinh = new FrmManHinhChinh();
                    FrmManHinhChinh.mnLapHoaDon.setEnabled(false);
                    frmManHinhChinh.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Tên Đăng Nhập, Hoặc Mật Khẩu Sai.");
                }
            }
        } catch (Exception var4) {
            JOptionPane.showMessageDialog(this, "Tên Đăng Nhập, Hoặc Mật Khẩu Sai.");
        }

    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnReset)) {
            this.txtUser.setText("");
            this.txtPass.setText("");
            this.lblMessLoiUser.setText("");
            this.lblMessLoiPass.setText("");
            this.txtUser.requestFocus();
        } else if (obj.equals(this.btnLogin)) {
            this.logIn();
        }

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            this.logIn();
        }

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            this.logIn();
        }

    }
}
