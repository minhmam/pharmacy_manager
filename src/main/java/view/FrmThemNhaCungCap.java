//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.NhaCungCapDAO;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FrmThemNhaCungCap extends JFrame {
    private JPanel contentPane;
    public static JTextField txtTen;
    public static JTextField txtSDT;
    public static JTextField txtEmail;
    private JButton btnThem;
    private NhaCungCapDAO dao = new NhaCungCapDAO();
    private List<String> listDiaChi = new ArrayList();
    private DefaultComboBoxModel cboModleDiaChi = new DefaultComboBoxModel();
    private JTextField txtSoNha;
    private JTextField txtTenDuong;
    private JTextField txtPhuong;
    private JTextField txtQuan;
    private JTextField txtThanhPho;
    private JTextField txtQuocGia;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmThemNhaCungCap frame = new FrmThemNhaCungCap();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmThemNhaCungCap() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 439, 622);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(0, 0, 434, 67);
        this.contentPane.add(panel);
        JLabel lblNewLabel = new JLabel("NHÀ CUNG CẤP");
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setHorizontalAlignment(0);
        lblNewLabel.setFont(new Font("Times New Roman", 0, 32));
        panel.add(lblNewLabel);
        JLabel lblTen = new JLabel("Tên nhà cung cấp :");
        lblTen.setFont(new Font("Times New Roman", 0, 18));
        lblTen.setBounds(10, 93, 138, 28);
        this.contentPane.add(lblTen);
        JLabel lblSDT = new JLabel("Số điện thoại:");
        lblSDT.setFont(new Font("Times New Roman", 0, 18));
        lblSDT.setBounds(10, 142, 138, 28);
        this.contentPane.add(lblSDT);
        JLabel lblEmail = new JLabel("Email :");
        lblEmail.setFont(new Font("Times New Roman", 0, 18));
        lblEmail.setBounds(10, 194, 91, 28);
        this.contentPane.add(lblEmail);
        JLabel lblDiaChi = new JLabel("Đia chỉ:");
        lblDiaChi.setFont(new Font("Times New Roman", 0, 18));
        lblDiaChi.setBounds(10, 245, 91, 28);
        this.contentPane.add(lblDiaChi);
        txtTen = new JTextField();
        txtTen.setFont(new Font("Times New Roman", 0, 16));
        txtTen.setBounds(159, 96, 227, 22);
        this.contentPane.add(txtTen);
        txtTen.setColumns(10);
        txtSDT = new JTextField();
        txtSDT.setFont(new Font("Times New Roman", 0, 16));
        txtSDT.setColumns(10);
        txtSDT.setBounds(159, 148, 227, 22);
        this.contentPane.add(txtSDT);
        txtEmail = new JTextField();
        txtEmail.setFont(new Font("Times New Roman", 0, 16));
        txtEmail.setColumns(10);
        txtEmail.setBounds(159, 200, 227, 22);
        this.contentPane.add(txtEmail);
        this.btnThem = new JButton("");
        this.btnThem.setBackground(Color.WHITE);
        this.btnThem.setForeground(Color.BLACK);
        this.btnThem.setIcon(new ImageIcon("Hinh\\iconSave.png"));
        this.btnThem.setBounds(114, 531, 89, 35);
        this.contentPane.add(this.btnThem);
        JLabel lblSoNha = new JLabel("Số Nhà :");
        lblSoNha.setFont(new Font("Times New Roman", 0, 18));
        lblSoNha.setBounds(75, 290, 91, 28);
        this.contentPane.add(lblSoNha);
        this.txtSoNha = new JTextField();
        this.txtSoNha.setFont(new Font("Times New Roman", 0, 16));
        this.txtSoNha.setColumns(10);
        this.txtSoNha.setBounds(180, 290, 206, 22);
        this.contentPane.add(this.txtSoNha);
        JLabel lblTenDuong = new JLabel("Tên đường :");
        lblTenDuong.setFont(new Font("Times New Roman", 0, 18));
        lblTenDuong.setBounds(75, 330, 91, 28);
        this.contentPane.add(lblTenDuong);
        this.txtTenDuong = new JTextField();
        this.txtTenDuong.setFont(new Font("Times New Roman", 0, 16));
        this.txtTenDuong.setColumns(10);
        this.txtTenDuong.setBounds(180, 330, 209, 22);
        this.contentPane.add(this.txtTenDuong);
        JLabel lblPhuong = new JLabel("Phường :");
        lblPhuong.setFont(new Font("Times New Roman", 0, 18));
        lblPhuong.setBounds(75, 370, 91, 28);
        this.contentPane.add(lblPhuong);
        this.txtPhuong = new JTextField();
        this.txtPhuong.setFont(new Font("Times New Roman", 0, 16));
        this.txtPhuong.setColumns(10);
        this.txtPhuong.setBounds(180, 370, 209, 22);
        this.contentPane.add(this.txtPhuong);
        JLabel lblQuan = new JLabel("Quận :");
        lblQuan.setFont(new Font("Times New Roman", 0, 18));
        lblQuan.setBounds(75, 410, 91, 28);
        this.contentPane.add(lblQuan);
        this.txtQuan = new JTextField();
        this.txtQuan.setFont(new Font("Times New Roman", 0, 16));
        this.txtQuan.setColumns(10);
        this.txtQuan.setBounds(180, 410, 209, 22);
        this.contentPane.add(this.txtQuan);
        JLabel lblThanhPho = new JLabel("Thành phố :");
        lblThanhPho.setFont(new Font("Times New Roman", 0, 18));
        lblThanhPho.setBounds(75, 450, 91, 28);
        this.contentPane.add(lblThanhPho);
        this.txtThanhPho = new JTextField();
        this.txtThanhPho.setText("Hồ Chí Minh");
        this.txtThanhPho.setFont(new Font("Times New Roman", 0, 16));
        this.txtThanhPho.setColumns(10);
        this.txtThanhPho.setBounds(180, 450, 209, 22);
        this.contentPane.add(this.txtThanhPho);
        JLabel lblQuocGia = new JLabel("Quốc gia :");
        lblQuocGia.setFont(new Font("Times New Roman", 0, 18));
        lblQuocGia.setBounds(75, 490, 91, 28);
        this.contentPane.add(lblQuocGia);
        this.txtQuocGia = new JTextField();
        this.txtQuocGia.setText("Việt Nam");
        this.txtQuocGia.setHorizontalAlignment(2);
        this.txtQuocGia.setFont(new Font("Times New Roman", 0, 16));
        this.txtQuocGia.setColumns(10);
        this.txtQuocGia.setBounds(180, 490, 209, 22);
        this.contentPane.add(this.txtQuocGia);
        JButton btnThoat = new JButton("Thoát");
        btnThoat.setForeground(Color.BLACK);
        btnThoat.setBackground(Color.WHITE);
        btnThoat.setBounds(215, 531, 89, 35);
        this.contentPane.add(btnThoat);
        this.btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThemNhaCungCap.this.them();
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThemNhaCungCap.this.setVisible(false);
            }
        });
    }

    public void them() {
        if (this.kiemTra()) {
            String soNha = this.txtSoNha.getText();
            System.out.println(soNha);
            String tenDuong = this.txtTenDuong.getText();
            System.out.println(tenDuong);
            String phuong = this.txtPhuong.getText();
            String quan = this.txtQuan.getText();
            String thanhPho = this.txtQuan.getText();
            String quocGia = this.txtQuocGia.getText();
            this.dao.themDiaChi(soNha, tenDuong, phuong, quan, thanhPho, quocGia);
            List<Integer> maDC = this.dao.getMaDiaChi(soNha, tenDuong, phuong, quan, thanhPho, quocGia);
            String ten = txtTen.getText();
            String soDienThoai = txtSDT.getText();
            String email = txtEmail.getText();
            System.out.println(maDC);
            System.out.println(maDC.get(0));
            this.dao.them(ten, soDienThoai, email, (Integer)maDC.get(0));
            JOptionPane.showMessageDialog(this, "Thêm nhà cung cấp thành công");
            this.setVisible(false);
            FrmThuoc.cmbNCC.setSelectedItem(ten);
        }
    }

    public boolean kiemTra() {
        if (txtTen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            txtTen.requestFocus();
            txtTen.selectAll();
            return false;
        } else if (txtSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            txtSDT.requestFocus();
            txtSDT.selectAll();
            return false;
        } else if (!txtSDT.getText().matches("^[0]\\d{9}$")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại nhà cung cấp bằng số và gồm 10 chữ số bất đầu bằng số 0 !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            txtSDT.requestFocus();
            txtSDT.selectAll();
            return false;
        } else if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email nhà cung cấp ! ", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            txtEmail.requestFocus();
            txtEmail.selectAll();
            return false;
        } else if (!txtEmail.getText().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng email nhà cung cấp !\\n ví dụ:quoc@gmail.com ", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            txtEmail.requestFocus();
            txtEmail.selectAll();
            return false;
        } else if (this.txtSoNha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtSoNha.requestFocus();
            this.txtSoNha.selectAll();
            return false;
        } else if (this.txtTenDuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtTenDuong.requestFocus();
            this.txtTenDuong.selectAll();
            return false;
        } else if (this.txtPhuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtPhuong.requestFocus();
            this.txtPhuong.selectAll();
            return false;
        } else if (this.txtQuan.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtQuan.requestFocus();
            this.txtQuan.selectAll();
            return false;
        } else if (this.txtThanhPho.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtQuan.requestFocus();
            this.txtQuan.selectAll();
            return false;
        } else if (this.txtQuocGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập địa chỉ nhà cung cấp !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
            this.txtQuan.requestFocus();
            this.txtQuan.selectAll();
            return false;
        } else {
            return true;
        }
    }
}
