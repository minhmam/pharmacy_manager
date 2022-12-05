//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.NhanVienDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import model.TaiKhoan;

public class FrmThemTaiKhoan extends JFrame implements ActionListener {
    private static final long serialVersionUID = 4988454772471512347L;
    private JPanel contentPane;
    public static JTextField txtTenTaiKhoan;
    private JPasswordField txtMatKhau;
    private JButton btnOk;
    FrmThemDiaChi frmThemDiaChi = new FrmThemDiaChi();
    NhanVienDAO nvDao = new NhanVienDAO();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmThemTaiKhoan frame = new FrmThemTaiKhoan();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmThemTaiKhoan() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 432, 293);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(UIManager.getColor("menu"));
        this.contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        this.setLocationRelativeTo((Component)null);
        JLabel lblUserName = new JLabel("Tên tài khoản:");
        lblUserName.setFont(new Font("Times New Roman", 0, 16));
        lblUserName.setBounds(60, 110, 109, 23);
        this.contentPane.add(lblUserName);
        txtTenTaiKhoan = new JTextField();
        txtTenTaiKhoan.setBounds(181, 108, 167, 23);
        this.contentPane.add(txtTenTaiKhoan);
        txtTenTaiKhoan.setColumns(10);
        JLabel lblNewLabel_1 = new JLabel("Mật khẩu:");
        lblNewLabel_1.setFont(new Font("Times New Roman", 0, 16));
        lblNewLabel_1.setBounds(60, 163, 109, 23);
        this.contentPane.add(lblNewLabel_1);
        this.txtMatKhau = new JPasswordField();
        this.txtMatKhau.setBounds(181, 160, 167, 23);
        this.contentPane.add(this.txtMatKhau);
        this.txtMatKhau.setColumns(10);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(10, 11, 396, 60);
        this.contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        JLabel lblngKTi = new JLabel("Đăng Ký Tài Khoản Nhân Viên");
        lblngKTi.setForeground(Color.RED);
        lblngKTi.setHorizontalAlignment(0);
        lblngKTi.setFont(new Font("Times New Roman", 1, 20));
        lblngKTi.setBounds(10, 11, 375, 38);
        panel.add(lblngKTi);
        this.btnOk = new JButton("Thêm");
        this.btnOk.setFont(new Font("Times New Roman", 0, 16));
        this.btnOk.setBounds(214, 203, 79, 29);
        this.contentPane.add(this.btnOk);
        this.btnOk.addActionListener(this);
        String myPass = String.valueOf(this.txtMatKhau.getPassword());
        System.out.println(myPass);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnOk)) {
            try {
                if (this.kiemTraDuLieu() && this.kiemTraUserNameTonTai()) {
                    String password = String.valueOf(this.txtMatKhau.getPassword());
                    TaiKhoan tk = new TaiKhoan(txtTenTaiKhoan.getText(), password);
                    this.nvDao.addTaiKhoan(tk);
                    JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công !", "Thông báo", -1);
                    FrmQuanLyNhanVien.txtTenTK.setText(txtTenTaiKhoan.getText().trim());
                    this.setVisible(false);
                    (new FrmThemDiaChi()).setVisible(true);
                    if (this.frmThemDiaChi.isVisible()) {
                        FrmQuanLyNhanVien.btnThem.setEnabled(false);
                    } else {
                        FrmQuanLyNhanVien.btnThem.setEnabled(true);
                    }
                }
            } catch (Exception var5) {
                JOptionPane.showMessageDialog(this, "Thêm tài khoản bị lỗi !");
                var5.printStackTrace();
            }
        }

    }

    public boolean kiemTraDuLieu() {
        try {
            if (txtTenTaiKhoan.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên tài khoản !");
                txtTenTaiKhoan.selectAll();
                txtTenTaiKhoan.requestFocus();
                return false;
            }

            if (!txtTenTaiKhoan.getText().trim().matches("[A-Za-z0-9]{2,}")) {
                JOptionPane.showMessageDialog(this, "Tên tài khoản có 2 ký tự trở lên, bao gồm số và chữ !");
                txtTenTaiKhoan.selectAll();
                txtTenTaiKhoan.requestFocus();
                return false;
            }
        } catch (Exception var3) {
            txtTenTaiKhoan.selectAll();
            txtTenTaiKhoan.requestFocus();
            return false;
        }

        FrmQuanLyNhanVien.txtTenTK.setText(txtTenTaiKhoan.getText());

        try {
            String myPass = String.valueOf(this.txtMatKhau.getPassword());
            if (this.txtMatKhau.getPassword().toString().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu !");
                this.txtMatKhau.selectAll();
                this.txtMatKhau.requestFocus();
                return false;
            }

            if (myPass.length() < 8) {
                JOptionPane.showMessageDialog(this, "Mật khẩu gồm 8 ký tự trở lên !");
                this.txtMatKhau.selectAll();
                this.txtMatKhau.requestFocus();
                return false;
            }
        } catch (Exception var2) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không hợp lệ !");
            System.out.println("sai sai sai !");
        }

        return true;
    }

    public boolean kiemTraUserNameTonTai() {
        try {
            List<String> listTenTaiKhoan = new ArrayList();
            this.nvDao.getAllTenTaiKhoan().forEach((x) -> {
                listTenTaiKhoan.add(x);
            });
            Iterator var3 = listTenTaiKhoan.iterator();

            while(var3.hasNext()) {
                String tenTk = (String)var3.next();
                if (tenTk.equals(txtTenTaiKhoan.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Tên tài khoản đã tồn tại !");
                    txtTenTaiKhoan.selectAll();
                    txtTenTaiKhoan.requestFocus();
                    return false;
                }
            }

            return true;
        } catch (Exception var4) {
            var4.printStackTrace();
            return false;
        }
    }
}
