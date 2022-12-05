//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.ThongTinCaNhanDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import model.NhanVien;
import model.TaiKhoan;

public class FrmXemThongTinCaNhan extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextField txtMaNhanVien;
    private JTextField txtTen;
    private JTextField txtDiaChi;
    private JTextField txtCMND;
    private JTextField txtKQTK;
    private JTable table_1;
    private JTabbedPane tabbedPane;
    public static JPanel pnlTabXemThongTinCaNhan;
    private JTextField txtNgaySinh;
    private JTextField txtTenDangNhap;
    private JPasswordField txtMatKhau;
    private JPasswordField txtMatKhauMoi;
    private JButton btnCapNhat;
    private JComboBox cboGioiTinh;
    private JTextField txtSoDienThoai;
    private JTextField txtHo;
    private JButton btnThoat;

    public FrmXemThongTinCaNhan() {
        this.setSize(1349, 685);
        this.setLocationRelativeTo((Component)null);
        pnlTabXemThongTinCaNhan = new JPanel();
        this.getContentPane().add(pnlTabXemThongTinCaNhan);
        pnlTabXemThongTinCaNhan.setLayout((LayoutManager)null);
        JPanel pnlChucNang = new JPanel();
        pnlChucNang.setLayout((LayoutManager)null);
        pnlChucNang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Các chức năng", 4, 2, (Font)null, (Color)null));
        pnlChucNang.setBackground(SystemColor.controlHighlight);
        pnlChucNang.setBounds(10, 440, 1313, 195);
        pnlTabXemThongTinCaNhan.add(pnlChucNang);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBorder(new TitledBorder((Border)null, "Chức năng", 4, 2, (Font)null, (Color)null));
        panel.setBounds(10, 34, 1293, 150);
        pnlChucNang.add(panel);
        panel.setLayout((LayoutManager)null);
        this.btnThoat = new JButton("Thoát");
        this.btnThoat.setBackground(SystemColor.controlHighlight);
        this.btnThoat.setFont(new Font("Times New Roman", 0, 14));
        this.btnThoat.setBounds(1137, 85, 146, 40);
        this.btnThoat.setIcon(new ImageIcon("images\\exit.png"));
        panel.add(this.btnThoat);
        this.btnCapNhat = new JButton("Cập nhật");
        this.btnCapNhat.setBackground(SystemColor.controlHighlight);
        this.btnCapNhat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        this.btnCapNhat.setFont(new Font("Times New Roman", 0, 20));
        this.btnCapNhat.setBounds(569, 23, 159, 40);
        this.btnCapNhat.setIcon(new ImageIcon("E:\\JPA_WorkSpace\\LTPTJAVA_DHKTPM13B_BAITAPLON_NHOM17\\Hinh\\iconSave.png"));
        panel.add(this.btnCapNhat);
        JPanel pnlThongTinNhanVien = new JPanel();
        pnlThongTinNhanVien.setLayout((LayoutManager)null);
        pnlThongTinNhanVien.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin nhân viên", 1, 2, (Font)null, new Color(0, 0, 0)));
        pnlThongTinNhanVien.setBackground(SystemColor.controlHighlight);
        pnlThongTinNhanVien.setBounds(10, 82, 1313, 347);
        pnlTabXemThongTinCaNhan.add(pnlThongTinNhanVien);
        JPanel pnlThongTinCoBan = new JPanel();
        pnlThongTinCoBan.setLayout((LayoutManager)null);
        pnlThongTinCoBan.setForeground(Color.BLACK);
        pnlThongTinCoBan.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin cơ bản", 4, 2, (Font)null, (Color)null));
        pnlThongTinCoBan.setBackground(SystemColor.controlHighlight);
        pnlThongTinCoBan.setBounds(10, 27, 1293, 309);
        pnlThongTinNhanVien.add(pnlThongTinCoBan);
        JLabel lblMaNhanVien = new JLabel("Mã nhân viên:");
        lblMaNhanVien.setFont(new Font("Times New Roman", 0, 20));
        lblMaNhanVien.setBounds(62, 25, 143, 20);
        pnlThongTinCoBan.add(lblMaNhanVien);
        this.txtMaNhanVien = new JTextField();
        this.txtMaNhanVien.setFont(new Font("Times New Roman", 0, 19));
        this.txtMaNhanVien.setEditable(false);
        this.txtMaNhanVien.setHorizontalAlignment(4);
        this.txtMaNhanVien.setToolTipText("");
        this.txtMaNhanVien.setColumns(10);
        this.txtMaNhanVien.setBounds(251, 25, 290, 20);
        pnlThongTinCoBan.add(this.txtMaNhanVien);
        JLabel lblTen = new JLabel("Tên:");
        lblTen.setFont(new Font("Times New Roman", 0, 20));
        lblTen.setBounds(910, 24, 50, 23);
        pnlThongTinCoBan.add(lblTen);
        this.txtTen = new JTextField();
        this.txtTen.setFont(new Font("Times New Roman", 0, 19));
        this.txtTen.setHorizontalAlignment(4);
        this.txtTen.setToolTipText("Nhập họ");
        this.txtTen.setColumns(10);
        this.txtTen.setBounds(981, 25, 283, 20);
        pnlThongTinCoBan.add(this.txtTen);
        JLabel lblDiaChi = new JLabel("Địa chỉ :");
        lblDiaChi.setFont(new Font("Times New Roman", 0, 20));
        lblDiaChi.setBounds(685, 122, 149, 20);
        pnlThongTinCoBan.add(lblDiaChi);
        this.txtDiaChi = new JTextField();
        this.txtDiaChi.setFont(new Font("Times New Roman", 0, 19));
        this.txtDiaChi.setHorizontalAlignment(4);
        this.txtDiaChi.setToolTipText("Nhập tên");
        this.txtDiaChi.setColumns(10);
        this.txtDiaChi.setBounds(811, 119, 453, 20);
        pnlThongTinCoBan.add(this.txtDiaChi);
        JLabel lblGioiTinh = new JLabel("Giới tính:");
        lblGioiTinh.setFont(new Font("Times New Roman", 0, 20));
        lblGioiTinh.setBounds(685, 75, 150, 17);
        pnlThongTinCoBan.add(lblGioiTinh);
        this.cboGioiTinh = new JComboBox();
        this.cboGioiTinh.setFont(new Font("Times New Roman", 0, 19));
        this.cboGioiTinh.setModel(new DefaultComboBoxModel(new String[]{"Nam", "Nữ", "Khác"}));
        this.cboGioiTinh.setToolTipText("Chọn giới tính");
        this.cboGioiTinh.setBounds(878, 72, 82, 23);
        pnlThongTinCoBan.add(this.cboGioiTinh);
        JLabel lblCMND = new JLabel("CMND:");
        lblCMND.setFont(new Font("Times New Roman", 0, 20));
        lblCMND.setBounds(685, 175, 149, 23);
        pnlThongTinCoBan.add(lblCMND);
        this.txtCMND = new JTextField();
        this.txtCMND.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        this.txtCMND.setFont(new Font("Times New Roman", 0, 19));
        this.txtCMND.setHorizontalAlignment(4);
        this.txtCMND.setToolTipText("Nhập chứng minh nhân dân");
        this.txtCMND.setColumns(10);
        this.txtCMND.setBounds(811, 168, 453, 20);
        pnlThongTinCoBan.add(this.txtCMND);
        JLabel lblNgaySinh = new JLabel("Ngày Sinh :");
        lblNgaySinh.setFont(new Font("Times New Roman", 0, 20));
        lblNgaySinh.setBounds(62, 70, 143, 19);
        pnlThongTinCoBan.add(lblNgaySinh);
        this.txtNgaySinh = new JTextField();
        this.txtNgaySinh.setFont(new Font("Times New Roman", 0, 19));
        this.txtNgaySinh.setHorizontalAlignment(4);
        this.txtNgaySinh.setToolTipText("");
        this.txtNgaySinh.setColumns(10);
        this.txtNgaySinh.setBounds(251, 68, 290, 20);
        pnlThongTinCoBan.add(this.txtNgaySinh);
        this.txtNgaySinh.setEditable(false);
        JLabel lblTenDangNhap = new JLabel("Tên đăng nhập:");
        lblTenDangNhap.setFont(new Font("Times New Roman", 0, 20));
        lblTenDangNhap.setBounds(62, 119, 143, 23);
        pnlThongTinCoBan.add(lblTenDangNhap);
        this.txtTenDangNhap = new JTextField();
        this.txtTenDangNhap.setFont(new Font("Times New Roman", 0, 19));
        this.txtTenDangNhap.setEditable(false);
        this.txtTenDangNhap.setToolTipText("");
        this.txtTenDangNhap.setHorizontalAlignment(4);
        this.txtTenDangNhap.setColumns(10);
        this.txtTenDangNhap.setBounds(251, 118, 290, 20);
        pnlThongTinCoBan.add(this.txtTenDangNhap);
        JLabel lblMatKhau = new JLabel("Mật khẩu:");
        lblMatKhau.setFont(new Font("Times New Roman", 0, 20));
        lblMatKhau.setBounds(62, 172, 143, 26);
        pnlThongTinCoBan.add(lblMatKhau);
        this.txtMatKhau = new JPasswordField();
        this.txtMatKhau.setFont(new Font("Times New Roman", 0, 19));
        this.txtMatKhau.setHorizontalAlignment(4);
        this.txtMatKhau.setBounds(251, 167, 290, 20);
        pnlThongTinCoBan.add(this.txtMatKhau);
        JLabel lblMatKhauMoi = new JLabel("Mật khẩu mới:");
        lblMatKhauMoi.setFont(new Font("Times New Roman", 0, 20));
        lblMatKhauMoi.setBounds(62, 222, 143, 19);
        pnlThongTinCoBan.add(lblMatKhauMoi);
        this.txtMatKhauMoi = new JPasswordField();
        this.txtMatKhauMoi.setFont(new Font("Times New Roman", 0, 19));
        this.txtMatKhauMoi.setHorizontalAlignment(4);
        this.txtMatKhauMoi.setBounds(251, 221, 290, 20);
        pnlThongTinCoBan.add(this.txtMatKhauMoi);
        final JRadioButton radHienMatKhau = new JRadioButton("Hiện mật khẩu");
        radHienMatKhau.setFont(new Font("Times New Roman", 0, 18));
        radHienMatKhau.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (radHienMatKhau.isSelected()) {
                    FrmXemThongTinCaNhan.this.txtMatKhau.setEchoChar('\u0000');
                    FrmXemThongTinCaNhan.this.txtMatKhauMoi.setEchoChar('\u0000');
                } else if (!radHienMatKhau.isSelected()) {
                    FrmXemThongTinCaNhan.this.txtMatKhau.setEchoChar('*');
                    FrmXemThongTinCaNhan.this.txtMatKhauMoi.setEchoChar('*');
                }

            }
        });
        radHienMatKhau.setBounds(251, 259, 162, 23);
        pnlThongTinCoBan.add(radHienMatKhau);
        JPanel pnlTitle = new JPanel();
        pnlTitle.setBackground(SystemColor.controlHighlight);
        pnlTitle.setBounds(10, 11, 1313, 60);
        pnlTabXemThongTinCaNhan.add(pnlTitle);
        pnlTitle.setLayout((LayoutManager)null);
        JLabel lblTitle = new JLabel("THÔNG TIN CÁ NHÂN");
        lblTitle.setFont(new Font("Times New Roman", 1, 22));
        lblTitle.setForeground(Color.RED);
        lblTitle.setHorizontalAlignment(0);
        lblTitle.setBounds(147, 11, 985, 38);
        pnlTitle.add(lblTitle);
        this.txtSoDienThoai = new JTextField();
        this.txtSoDienThoai.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        this.txtSoDienThoai.setFont(new Font("Times New Roman", 0, 19));
        this.txtSoDienThoai.setToolTipText("Nhập chứng minh nhân dân");
        this.txtSoDienThoai.setText((String)null);
        this.txtSoDienThoai.setHorizontalAlignment(4);
        this.txtSoDienThoai.setColumns(10);
        this.txtSoDienThoai.setBounds(811, 220, 453, 20);
        pnlThongTinCoBan.add(this.txtSoDienThoai);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        JLabel lblSDT = new JLabel("Số điện thoại :");
        lblSDT.setFont(new Font("Times New Roman", 0, 20));
        lblSDT.setBounds(685, 224, 149, 23);
        pnlThongTinCoBan.add(lblSDT);
        JLabel lblH = new JLabel("Họ :");
        lblH.setFont(new Font("Times New Roman", 0, 20));
        lblH.setBounds(685, 25, 50, 23);
        pnlThongTinCoBan.add(lblH);
        this.txtHo = new JTextField();
        this.txtHo.setToolTipText("Nhập họ");
        this.txtHo.setHorizontalAlignment(4);
        this.txtHo.setFont(new Font("Times New Roman", 0, 19));
        this.txtHo.setColumns(10);
        this.txtHo.setBounds(729, 27, 150, 20);
        pnlThongTinCoBan.add(this.txtHo);
        this.btnCapNhat.addActionListener(this);
        this.btnThoat.addActionListener(this);
        this.loadThongTinCaNhan();
    }

    public void loadThongTinCaNhan() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        ThongTinCaNhanDAO thongTinCaNhanDAO = new ThongTinCaNhanDAO();

        try {
            NhanVien nhanVien = thongTinCaNhanDAO.loadNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan());
            System.out.println(nhanVien);
            this.txtMaNhanVien.setText(String.valueOf(nhanVien.getMaNhanVien()));
            String ngaySinh = "";
            if (nhanVien.getNgaySinh() != null) {
                ngaySinh = ngaySinh + dateFormat.format(nhanVien.getNgaySinh());
            }

            this.txtNgaySinh.setText(ngaySinh);
            this.txtTenDangNhap.setText(nhanVien.getTaiKhoan().getTenTaiKhoan());
            this.txtMatKhau.setText(nhanVien.getTaiKhoan().getMatKhau());
            this.txtHo.setText(nhanVien.getHo());
            this.txtTen.setText(nhanVien.getTen());
            this.cboGioiTinh.setSelectedItem(nhanVien.getGioiTinh());
            String diaChi = nhanVien.getDiaChi().getSoNha() + "," + nhanVien.getDiaChi().getTenDuong() + "," + nhanVien.getDiaChi().getPhuong() + "," + nhanVien.getDiaChi().getQuan() + "," + nhanVien.getDiaChi().getThanhPho() + "," + nhanVien.getDiaChi().getQuocGia();
            this.txtDiaChi.setText(diaChi);
            this.txtCMND.setText(nhanVien.getCmnd());
            this.txtSoDienThoai.setText(nhanVien.getSoDienThoai());
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public boolean kiemTraDuLieu() {
        String soDienThoai = this.txtSoDienThoai.getText();
        String soChungMinh = this.txtCMND.getText();
        String sodient = String.valueOf(0);
        if (!String.valueOf(0).equalsIgnoreCase("0")) {
            JOptionPane.showMessageDialog((Component)null, "Số điện thoại phải bắt đầu bằng số 0!");
            return false;
        } else if (soDienThoai.length() < 10) {
            JOptionPane.showMessageDialog((Component)null, "Số điện thoại không được bé hơn 10 số! ");
            return false;
        } else if (soDienThoai.length() > 10) {
            JOptionPane.showMessageDialog((Component)null, "Số điện thoại không được lớn hơn 10 số!");
            return false;
        } else {
            return true;
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        if (obj.equals(this.btnCapNhat)) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.setMaNhanVien(Integer.parseInt(this.txtMaNhanVien.getText()));
            Date ngaySinhSQL = null;

            try {
                java.util.Date ngaySinh = (new SimpleDateFormat("dd/MM/yyyy")).parse(this.txtNgaySinh.getText());
                ngaySinhSQL = new Date(ngaySinh.getTime());
            } catch (ParseException var10) {
                var10.printStackTrace();
            }

            nhanVien.setNgaySinh(ngaySinhSQL);
            TaiKhoan taiKhoan = new TaiKhoan();
            taiKhoan.setTenTaiKhoan(this.txtTenDangNhap.getText());
            taiKhoan.setMatKhau(this.txtMatKhauMoi.getText());
            nhanVien.setTaiKhoan(taiKhoan);
            nhanVien.setGioiTinh(this.cboGioiTinh.getSelectedItem().toString());
            nhanVien.setTen(this.txtTen.getText());
            nhanVien.setHo(this.txtHo.getText());
            nhanVien.setCmnd(this.txtCMND.getText());
            nhanVien.setSoDienThoai(this.txtSoDienThoai.getText());
            ThongTinCaNhanDAO thongTinCaNhanDAO = new ThongTinCaNhanDAO();
            Object check = JOptionPane.showConfirmDialog(this, "Chắc chắc sửa thông tin?");
            if (check.equals(0) && this.kiemTraDuLieu()) {
                if (!this.txtTenDangNhap.getText().equalsIgnoreCase("ADMIN")) {
                    thongTinCaNhanDAO.updateThongTinCaNhan(nhanVien);
                    thongTinCaNhanDAO.updateTaiKhoan(nhanVien);
                    JOptionPane.showMessageDialog(this, "Cập nhật thông tin thành công!");
                } else {
                    JOptionPane.showMessageDialog(this, "Không được sửa thông tin của ADMIN");
                }
            }
        } else if (obj.equals(this.btnThoat)) {
            FrmManHinhChinh.tabbedPane.remove(pnlTabXemThongTinCaNhan);
        }
    }
}
