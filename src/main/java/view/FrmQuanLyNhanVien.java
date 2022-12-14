//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import com.toedter.calendar.JDateChooser;
import dao.NhanVienDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import model.DiaChi;
import model.NhanVien;
import model.TaiKhoan;

public class FrmQuanLyNhanVien extends JFrame implements ActionListener, MouseListener {
    private static final long serialVersionUID = 5201032984984305728L;
    private JTextField txtTimKiem;
    private JTextField txtMaNV;
    private static JTextField txtHo;
    private static JTextField txtTen;
    private static JTextField txtSoDT;
    public static JTextField txtMaDiaChi;
    private static JTextField txtCMND;
    public static JTextField txtTenTK;
    private static DefaultTableModel model;
    private static JTable table;
    private JButton btnTimKiem;
    public static JPanel pnlTabQLNV;
    private JRadioButton radMa;
    private JRadioButton radTen;
    private JRadioButton radSoDT;
    private JRadioButton radCaLamViec;
    public static JButton btnThem;
    private JButton btnXoa;
    private JButton btnThoat;
    private JButton btnXoaRong;
    private JButton btnCapNhat;
    private JButton btnLamMoi;
    private static JComboBox cboGioiTinh;
    private static JComboBox cboCaLamViec;
    private JComboBox cboTrangThai;
    private static JComboBox cboLoaiNV;
    private static JDateChooser dateChooser;
    public static boolean check = false;
    static NhanVienDAO nvDao = new NhanVienDAO();
    FrmThemTaiKhoan frmThemTaiKhoan = new FrmThemTaiKhoan();
    FrmThemDiaChi frmThemDiaChi = new FrmThemDiaChi();
    public static JTextField txtDiaChi;

    public FrmQuanLyNhanVien() {
        pnlTabQLNV = new JPanel();
        pnlTabQLNV.setLayout((LayoutManager)null);
        ButtonGroup buttonGroup = new ButtonGroup();
        String[] tb = new String[]{"STT", "M?? NV", "H???", "T??n", "Ng??y sinh", "Gi???i t??nh", "CMND", "S??? ??T", "Ca l??m vi???c", "M?? ?????a ch???", "T??n TK", "Lo???i NV", "Tr???ng th??i"};
        model = new DefaultTableModel(tb, 0);
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 1317, 642);
        pnlTabQLNV.add(panel);
        panel.setLayout((LayoutManager)null);
        JLabel lblMaNV = new JLabel("M?? NV:");
        lblMaNV.setBounds(25, 73, 50, 25);
        panel.add(lblMaNV);
        lblMaNV.setFont(new Font("Times New Roman", 0, 15));
        this.txtMaNV = new JTextField();
        this.txtMaNV.setFont(new Font("Times New Roman", 0, 15));
        this.txtMaNV.setBounds(103, 73, 185, 25);
        panel.add(this.txtMaNV);
        this.txtMaNV.setToolTipText("Nh???p m?? nh??n vi??n");
        this.txtMaNV.setColumns(10);
        this.txtMaNV.setEditable(false);
        txtCMND = new JTextField();
        txtCMND.setFont(new Font("Times New Roman", 0, 15));
        txtCMND.setBounds(452, 109, 185, 25);
        panel.add(txtCMND);
        txtCMND.setEditable(false);
        txtCMND.setToolTipText("Nh???p ch???ng minh nh??n d??n");
        txtCMND.setColumns(10);
        txtCMND.setEditable(true);
        txtCMND.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        JLabel lblCMND = new JLabel("CMND:");
        lblCMND.setBounds(375, 109, 50, 25);
        panel.add(lblCMND);
        lblCMND.setFont(new Font("Times New Roman", 0, 15));
        JLabel lblTenTK = new JLabel("T??n TK:");
        lblTenTK.setBounds(682, 147, 84, 25);
        panel.add(lblTenTK);
        lblTenTK.setFont(new Font("Times New Roman", 0, 15));
        JLabel lblHo = new JLabel("H???:");
        lblHo.setBounds(375, 73, 24, 25);
        panel.add(lblHo);
        lblHo.setFont(new Font("Times New Roman", 0, 15));
        txtHo = new JTextField();
        txtHo.setFont(new Font("Times New Roman", 0, 15));
        txtHo.setBounds(452, 73, 185, 25);
        panel.add(txtHo);
        txtHo.setEditable(false);
        txtHo.setToolTipText("Nh???p h???");
        txtHo.setColumns(10);
        txtHo.setEditable(true);
        txtTenTK = new JTextField();
        txtTenTK.setFont(new Font("Times New Roman", 0, 15));
        txtTenTK.setBounds(775, 147, 185, 25);
        panel.add(txtTenTK);
        txtTenTK.setEditable(false);
        txtTenTK.setColumns(10);
        JLabel lblLoaiNV = new JLabel("Lo???i NV:");
        lblLoaiNV.setBounds(1000, 109, 73, 25);
        panel.add(lblLoaiNV);
        lblLoaiNV.setFont(new Font("Times New Roman", 0, 15));
        JLabel lblTen = new JLabel("T??n:");
        lblTen.setBounds(682, 75, 53, 25);
        panel.add(lblTen);
        lblTen.setFont(new Font("Times New Roman", 0, 15));
        txtTen = new JTextField();
        txtTen.setFont(new Font("Times New Roman", 0, 15));
        txtTen.setBounds(775, 75, 185, 25);
        panel.add(txtTen);
        txtTen.setEditable(false);
        txtTen.setToolTipText("Nh???p t??n");
        txtTen.setColumns(10);
        txtTen.setEditable(true);
        cboLoaiNV = new JComboBox();
        cboLoaiNV.setFont(new Font("Times New Roman", 0, 15));
        cboLoaiNV.setBounds(1101, 109, 185, 25);
        panel.add(cboLoaiNV);
        cboLoaiNV.setToolTipText("Ch???n lo???i nh??n vi??n");
        cboLoaiNV.addItem("Nh??n vi??n");
        cboLoaiNV.addItem("Qu???n l??");
        JLabel lblNgaySinh = new JLabel("Ng??y sinh:");
        lblNgaySinh.setBounds(1000, 73, 73, 25);
        panel.add(lblNgaySinh);
        lblNgaySinh.setFont(new Font("Times New Roman", 0, 15));
        dateChooser = new JDateChooser();
        dateChooser.setBounds(1101, 73, 185, 25);
        panel.add(dateChooser);
        dateChooser.getCalendarButton().setEnabled(false);
        dateChooser.setLocale(Locale.forLanguageTag("vi-VN"));
        dateChooser.setDateFormatString("dd-MM-yyyy");
        dateChooser.getCalendarButton().setEnabled(true);
        txtMaDiaChi = new JTextField();
        txtMaDiaChi.setFont(new Font("Times New Roman", 0, 15));
        txtMaDiaChi.setBounds(1101, 147, 185, 25);
        panel.add(txtMaDiaChi);
        txtMaDiaChi.setEditable(false);
        txtMaDiaChi.setToolTipText("Nh???p ?????a ch???");
        txtMaDiaChi.setColumns(10);
        JLabel lblMaDiaChi = new JLabel("M?? ?????a ch???:");
        lblMaDiaChi.setBounds(1000, 147, 80, 25);
        panel.add(lblMaDiaChi);
        lblMaDiaChi.setFont(new Font("Times New Roman", 0, 15));
        JLabel lblGioiTinh = new JLabel("Gi???i t??nh:");
        lblGioiTinh.setBounds(682, 111, 84, 25);
        panel.add(lblGioiTinh);
        lblGioiTinh.setFont(new Font("Times New Roman", 0, 15));
        JLabel lblTrangThai = new JLabel("Tr???ng th??i:");
        lblTrangThai.setBounds(375, 145, 73, 25);
        panel.add(lblTrangThai);
        lblTrangThai.setFont(new Font("Times New Roman", 0, 15));
        this.cboTrangThai = new JComboBox();
        this.cboTrangThai.setFont(new Font("Times New Roman", 0, 15));
        this.cboTrangThai.setBounds(452, 145, 185, 25);
        panel.add(this.cboTrangThai);
        this.cboTrangThai.addItem("??ang l??m vi???c");
        this.cboTrangThai.addItem("Ngh??? vi???c");
        this.cboTrangThai.addItem("T???m ngh??? vi???c");
        cboGioiTinh = new JComboBox();
        cboGioiTinh.setFont(new Font("Times New Roman", 0, 15));
        cboGioiTinh.setBounds(775, 111, 185, 25);
        panel.add(cboGioiTinh);
        cboGioiTinh.setToolTipText("Ch???n gi???i t??nh");
        cboGioiTinh.addItem("Nam");
        cboGioiTinh.addItem("N???");
        cboGioiTinh.addItem("Kh??c");
        JLabel lblSoDT = new JLabel("S??? ??T:");
        lblSoDT.setBounds(25, 109, 50, 25);
        panel.add(lblSoDT);
        lblSoDT.setFont(new Font("Times New Roman", 0, 15));
        txtSoDT = new JTextField();
        txtSoDT.setBounds(103, 109, 185, 25);
        panel.add(txtSoDT);
        txtSoDT.setEditable(false);
        txtSoDT.setToolTipText("Nh???p s??? ??i???n tho???i");
        txtSoDT.setColumns(10);
        txtSoDT.setEditable(true);
        txtSoDT.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        JLabel lblCaLamViec = new JLabel("Ca l??m vi???c:");
        lblCaLamViec.setBounds(25, 147, 84, 25);
        panel.add(lblCaLamViec);
        lblCaLamViec.setFont(new Font("Times New Roman", 0, 15));
        cboCaLamViec = new JComboBox();
        cboCaLamViec.setFont(new Font("Times New Roman", 0, 15));
        cboCaLamViec.setBounds(104, 147, 185, 25);
        panel.add(cboCaLamViec);
        cboCaLamViec.setToolTipText("Ch???n ca l??m vi???c");
        cboCaLamViec.addItem("1");
        cboCaLamViec.addItem("2");
        JLabel lblTitle = new JLabel("QU???N L?? NH??N VI??N");
        lblTitle.setBounds(512, 11, 278, 38);
        panel.add(lblTitle);
        lblTitle.setFont(new Font("Times New Roman", 1, 25));
        lblTitle.setForeground(Color.RED);
        lblTitle.setHorizontalAlignment(0);
        JPanel pnlDanhSachNhanVien = new JPanel();
        pnlDanhSachNhanVien.setBounds(10, 237, 1297, 257);
        panel.add(pnlDanhSachNhanVien);
        pnlDanhSachNhanVien.setLayout((LayoutManager)null);
        pnlDanhSachNhanVien.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Danh s??ch nh??n vi??n", 4, 2, (Font)null, (Color)null));
        pnlDanhSachNhanVien.setBackground(SystemColor.control);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(22);
        scrollPane.setHorizontalScrollBarPolicy(32);
        scrollPane.setBounds(10, 20, 1277, 226);
        pnlDanhSachNhanVien.add(scrollPane);
        table = new JTable(model);
        table.setFont(new Font("Times New Roman", 0, 14));
        scrollPane.setViewportView(table);
        JLabel lblDiaChi = new JLabel("?????a ch???:");
        lblDiaChi.setFont(new Font("Times New Roman", 0, 15));
        lblDiaChi.setBounds(682, 181, 72, 25);
        panel.add(lblDiaChi);
        txtDiaChi = new JTextField();
        txtDiaChi.setFont(new Font("Times New Roman", 0, 15));
        txtDiaChi.setEditable(false);
        txtDiaChi.setBounds(775, 182, 509, 25);
        panel.add(txtDiaChi);
        txtDiaChi.setColumns(10);
        btnThem = new JButton("Th??m");
        btnThem.setBounds(103, 196, 120, 30);
        panel.add(btnThem);
        btnThem.setFont(new Font("Times New Roman", 0, 15));
        btnThem.setIcon(new ImageIcon("Hinh\\add.png"));
        this.btnXoa = new JButton("X??a");
        this.btnXoa.setBounds(233, 196, 120, 30);
        panel.add(this.btnXoa);
        this.btnXoa.setFont(new Font("Times New Roman", 0, 15));
        this.btnXoa.setIcon(new ImageIcon("Hinh\\delete.png"));
        this.btnCapNhat = new JButton("C???p nh???t");
        this.btnCapNhat.setBounds(363, 196, 120, 30);
        panel.add(this.btnCapNhat);
        this.btnCapNhat.setFont(new Font("Times New Roman", 0, 15));
        this.btnCapNhat.setIcon(new ImageIcon("Hinh\\edit.png"));
        this.btnXoaRong = new JButton("X??a Tr???ng");
        this.btnXoaRong.setBounds(493, 196, 131, 30);
        panel.add(this.btnXoaRong);
        this.btnXoaRong.setFont(new Font("Times New Roman", 0, 15));
        this.btnXoaRong.setIcon(new ImageIcon("Hinh\\empty.png"));
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(10, 505, 1297, 114);
        panel.add(panel_3);
        panel_3.setBorder(new TitledBorder((Border)null, "T??m ki???m", 4, 2, (Font)null, (Color)null));
        panel_3.setLayout((LayoutManager)null);
        JLabel lblTimKiem = new JLabel("Nh???p th??ng tin t??m ki???m:");
        lblTimKiem.setBounds(10, 11, 161, 30);
        panel_3.add(lblTimKiem);
        lblTimKiem.setFont(new Font("Times New Roman", 0, 14));
        JLabel lblTimTheo = new JLabel("T??m theo:");
        lblTimTheo.setBounds(10, 56, 63, 30);
        panel_3.add(lblTimTheo);
        lblTimTheo.setFont(new Font("Times New Roman", 0, 15));
        this.radMa = new JRadioButton("M??");
        this.radMa.setBounds(79, 48, 63, 23);
        panel_3.add(this.radMa);
        this.radMa.setFont(new Font("Times New Roman", 0, 14));
        buttonGroup.add(this.radMa);
        this.radTen = new JRadioButton("T??n");
        this.radTen.setBounds(79, 74, 63, 23);
        panel_3.add(this.radTen);
        this.radTen.setFont(new Font("Times New Roman", 0, 14));
        buttonGroup.add(this.radTen);
        this.radCaLamViec = new JRadioButton("Ca l??m vi???c");
        this.radCaLamViec.setBounds(144, 76, 94, 23);
        panel_3.add(this.radCaLamViec);
        this.radCaLamViec.setFont(new Font("Times New Roman", 0, 14));
        buttonGroup.add(this.radCaLamViec);
        this.radSoDT = new JRadioButton("S??? ??T");
        this.radSoDT.setBounds(144, 48, 94, 23);
        panel_3.add(this.radSoDT);
        this.radSoDT.setFont(new Font("Times New Roman", 0, 14));
        buttonGroup.add(this.radSoDT);
        this.txtTimKiem = new JTextField();
        this.txtTimKiem.setBounds(165, 15, 232, 25);
        panel_3.add(this.txtTimKiem);
        this.txtTimKiem.setColumns(10);
        this.btnTimKiem = new JButton("T??m ki???m");
        this.btnTimKiem.setBounds(277, 56, 120, 30);
        panel_3.add(this.btnTimKiem);
        this.btnTimKiem.setFont(new Font("Times New Roman", 0, 15));
        this.btnTimKiem.setIcon(new ImageIcon("Hinh\\search.png"));
        this.btnLamMoi = new JButton("L??m M???i");
        this.btnLamMoi.setBounds(407, 56, 120, 30);
        panel_3.add(this.btnLamMoi);
        this.btnLamMoi.setFont(new Font("Times New Roman", 0, 15));
        this.btnLamMoi.setIcon(new ImageIcon("Hinh\\refresh.png"));
        this.btnThoat = new JButton("Tho??t");
        this.btnThoat.setBounds(537, 56, 120, 30);
        panel_3.add(this.btnThoat);
        this.btnThoat.setForeground(Color.BLACK);
        this.btnThoat.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
        this.btnThoat.setFont(new Font("Times New Roman", 0, 15));
        this.btnThoat.setIcon(new ImageIcon("Hinh\\close.png"));
        JLabel lblXinChao = new JLabel("Xin ch??o !");
        lblXinChao.setForeground(Color.RED);
        lblXinChao.setFont(new Font("Times New Roman", 0, 15));
        lblXinChao.setBounds(1028, 44, 84, 22);
        panel.add(lblXinChao);
        JLabel lblTenNV = new JLabel("");
        lblTenNV.setForeground(Color.RED);
        lblTenNV.setFont(new Font("Times New Roman", 0, 16));
        lblTenNV.setBounds(1122, 44, 185, 23);
        panel.add(lblTenNV);
        String tenNhanVienHienTai = nvDao.getTenNhanVienByTenTaiKhoan(FrmDangNhap.taiKhoan.getTenTaiKhoan());
        lblTenNV.setText(tenNhanVienHienTai);
        this.btnThoat.addActionListener(this);
        this.btnLamMoi.addActionListener(this);
        this.btnTimKiem.addActionListener(this);
        this.btnXoaRong.addActionListener(this);
        this.btnCapNhat.addActionListener(this);
        this.btnXoa.addActionListener(this);
        btnThem.addActionListener(this);
        table.addMouseListener(this);
        docDuLieu();
    }

    public static void themNhanVien() {
        NhanVienDAO nhanVienDAO = new NhanVienDAO();
        NhanVien nhanVien = new NhanVien();
        nhanVien.setCaLamViec(cboCaLamViec.getSelectedItem().toString());
        nhanVien.setTen(txtTen.getText().trim());
        nhanVien.setHo(txtHo.getText().trim());
        Date ngaySinhsql = null;

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngaySinhtxt = dateFormat.format(dateChooser.getDate());
            java.util.Date ngaySinh = dateFormat.parse(ngaySinhtxt);
            ngaySinhsql = new Date(ngaySinh.getTime());
        } catch (Exception var8) {
            var8.printStackTrace();
        }

        nhanVien.setNgaySinh(ngaySinhsql);
        nhanVien.setGioiTinh(cboGioiTinh.getSelectedItem().toString());
        nhanVien.setCmnd(txtCMND.getText().trim());
        nhanVien.setSoDienThoai(txtSoDT.getText().trim());
        DiaChi diaChi = new DiaChi();
        diaChi.setMaDiaChi(Integer.parseInt(txtMaDiaChi.getText()));
        nhanVien.setDiaChi(diaChi);
        TaiKhoan taiKhoan = new TaiKhoan();
        taiKhoan.setTenTaiKhoan(txtTenTK.getText());
        nhanVien.setTaiKhoan(taiKhoan);
        String loaiNhanVien = cboLoaiNV.getSelectedItem().toString().trim();
        if (loaiNhanVien.equalsIgnoreCase("Nh??n vi??n")) {
            nhanVien.setLoaiNhanVien("NV");
        } else {
            nhanVien.setLoaiNhanVien("QL");
        }

        nhanVien.setTrangThai("??ang l??m vi???c");

        try {
            nhanVienDAO.themNhanVien(nhanVien);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnThoat)) {
            if (JOptionPane.showConfirmDialog(this, "B???n c?? ch???c mu???n tho??t !") == 0) {
                FrmManHinhChinh.tabbedPane.remove(pnlTabQLNV);
            }
        } else {
            String caLamViec;
            String tenNhanVienHienTai;
            String ngaySinhtxt;
            String loaiNV;
            if (obj.equals(btnThem)) {
                caLamViec = "";
                tenNhanVienHienTai = txtHo.getText().trim();
                ngaySinhtxt = txtTen.getText().trim();
                loaiNV = txtSoDT.getText().trim();
                String cMND = txtCMND.getText().trim();
                Date ngaySinhsql = null;
                if (tenNhanVienHienTai.equalsIgnoreCase("")) {
                    caLamViec = caLamViec + "Vui l??ng nh???p h??? !\n";
                } else if (tenNhanVienHienTai.length() > 30) {
                    caLamViec = caLamViec + "H??? kh??ng h???p l??? !\n";
                }

                if (ngaySinhtxt.equalsIgnoreCase("")) {
                    caLamViec = caLamViec + "Vui l??ng nh???p t??n !\n";
                } else if (ngaySinhtxt.length() > 10) {
                    caLamViec = caLamViec + "T??n kh??ng h???p l??? !\n";
                }

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    ngaySinhtxt = null;
                    java.util.Date ngaySinh = null;
                    int yearsql = 0;
                    String year = null;

                    try {
                        ngaySinhtxt = dateFormat.format(dateChooser.getDate());
                        ngaySinh = dateFormat.parse(ngaySinhtxt);
                        ngaySinhsql = new Date(ngaySinh.getTime());
                        year = ngaySinhsql.toString().substring(0, 4);
                        yearsql = Integer.parseInt(year);
                    } catch (Exception var21) {
                    }

                    try {
                        if (year == null) {
                            caLamViec = caLamViec + "Vui l??ng nh???p ng??y sinh !\n";
                        } else if (LocalDate.now().getYear() - yearsql > 60 || LocalDate.now().getYear() - yearsql < 18) {
                            caLamViec = caLamViec + "Tu???i ph???i t??? 18->60 !\n";
                        }
                    } catch (Exception var22) {
                        caLamViec = caLamViec + "Ng??y sinh kh??ng h???p l??? !\n";
                    }
                } catch (Exception var23) {
                    var23.printStackTrace();
                }

                if (loaiNV.equalsIgnoreCase("")) {
                    caLamViec = caLamViec + "Vui l??ng nh???p s??? ??i???n tho???i !\n";
                } else if (!loaiNV.matches("^0[0-9]{9}$")) {
                    caLamViec = caLamViec + "S??? ??i???n tho???i kh??ng h???p l??? !(10 s??? v?? b???t l?? 0)\n";
                }

                if (cMND.equalsIgnoreCase("")) {
                    caLamViec = caLamViec + "Vui l??ng nh???p s??? CMND !\n";
                } else if (!cMND.matches("^[0-9]{9}$")) {
                    caLamViec = caLamViec + "S??? CMND kh??ng h???p l??? ! (9 s???)\n";
                }

                try {
                    if (caLamViec.equalsIgnoreCase("")) {
                        (new FrmThemTaiKhoan()).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, caLamViec, "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                    }
                } catch (Exception var20) {
                    var20.printStackTrace();
                }
            } else if (obj.equals(this.btnXoaRong)) {
                this.xoaRong();

                try {
                    nvDao.getAllMaNV().forEach((n) -> {
                        System.out.println(n);
                    });
                } catch (Exception var19) {
                    var19.printStackTrace();
                }
            } else {
                int row;
                if (obj.equals(this.btnXoa)) {
                    row = table.getSelectedRow();
                    if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Vui l??ng ch???n nh??n vi??n c???n x??a !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                    } else {
                        try {
                            tenNhanVienHienTai = nvDao.getTenNhanVienByTenTaiKhoan(FrmDangNhap.taiKhoan.getTenTaiKhoan());
                            ngaySinhtxt = (String)table.getValueAt(row, 2) + " " + table.getValueAt(row, 3);
                            if (tenNhanVienHienTai.equalsIgnoreCase(ngaySinhtxt)) {
                                JOptionPane.showMessageDialog(this, "Nh??n vi??n ??ang ????ng nh???p v??o h??? th???ng.\nKh??ng th??? x??a !", "Th??ng b??o !", -1, new ImageIcon("Hinh\\warning.png"));
                            } else {
                                try {
                                    int maNhanVien = Integer.parseInt(this.txtMaNV.getText());
                                    NhanVien nv = nvDao.layThongTinNhanVien(maNhanVien);
                                    int yes = JOptionPane.showConfirmDialog((Component)null, "B???n c?? ch???c mu???n x??a !", "Th??ng b??o !", 1);
                                    if (yes == 0 && nvDao.xoaNhanVien(nv)) {
                                        table.setValueAt(nv.getTrangThai(), row, 12);
                                        JOptionPane.showMessageDialog(this, "???? x??a !\nNh??n vi??n s??? ???????c c???p nh???t l???i tr???ng th??i \"Ngh??? vi???c\".", "Th??ng b??o !", -1, new ImageIcon("Hinh\\yes.png"));
                                        xoaAllDataTable();
                                        docDuLieu();
                                    }
                                } catch (Exception var17) {
                                    var17.printStackTrace();
                                    JOptionPane.showMessageDialog(this, "X??a th???t b???i !", "Th??ng b??o !", -1, new ImageIcon("Hinh\\warning.png"));
                                }
                            }
                        } catch (Exception var18) {
                            var18.printStackTrace();
                        }
                    }
                } else if (obj.equals(this.btnCapNhat)) {
                    try {
                        row = table.getSelectedRow();
                        if (row >= 0) {
                            Date ngaySinhsql = null;
                            ngaySinhtxt = "";

                            try {
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                ngaySinhtxt = dateFormat.format(dateChooser.getDate());
                                java.util.Date ngaySinh = dateFormat.parse(ngaySinhtxt);
                                ngaySinhsql = new Date(ngaySinh.getTime());
                            } catch (Exception var15) {
                                var15.printStackTrace();
                            }

                            loaiNV = cboLoaiNV.getSelectedItem().toString();
                            if (loaiNV.equals("Nh??n vi??n")) {
                                loaiNV = "NV";
                            } else if (loaiNV.equals("Qu???n l??")) {
                                loaiNV = "QL";
                            }

                            if (nvDao.updateNhanVien(Integer.parseInt(this.txtMaNV.getText()), txtHo.getText(), txtTen.getText(), ngaySinhsql, cboGioiTinh.getSelectedItem().toString(), txtCMND.getText(), txtSoDT.getText(), cboCaLamViec.getSelectedItem().toString(), loaiNV, this.cboTrangThai.getSelectedItem().toString())) {
                                JOptionPane.showMessageDialog(this, "C???p nh???t th??nh c??ng.", "Th??ng b??o", -1, new ImageIcon("Hinh\\yes.png"));
                                table.setValueAt(txtHo.getText(), row, 2);
                                table.setValueAt(txtTen.getText(), row, 3);
                                table.setValueAt(ngaySinhsql, row, 4);
                                table.setValueAt(cboGioiTinh.getSelectedItem().toString(), row, 5);
                                table.setValueAt(txtCMND.getText(), row, 6);
                                table.setValueAt(txtSoDT.getText(), row, 7);
                                table.setValueAt(cboCaLamViec.getSelectedItem().toString(), row, 8);
                                table.setValueAt(loaiNV, row, 11);
                                table.setValueAt(this.cboTrangThai.getSelectedItem().toString(), row, 12);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n d??ng ????? c???p nh???t !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                        }
                    } catch (Exception var16) {
                        var16.printStackTrace();
                    }
                } else if (obj.equals(this.btnTimKiem)) {
                    if (!this.radMa.isSelected() && !this.radTen.isSelected() && !this.radSoDT.isSelected() && !this.radCaLamViec.isSelected() && this.txtTimKiem.getText().trim().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui l??ng nh???p th??ng tin v?? ch???n lo???i t??m ki???m !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                    } else if (this.txtTimKiem.getText().trim().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui l??ng nh???p th??ng tin t??m ki???m !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                    } else if (!this.radMa.isSelected() && !this.radTen.isSelected() && !this.radSoDT.isSelected() && !this.radCaLamViec.isSelected()) {
                        JOptionPane.showMessageDialog(this, "Vui l??ng ch???n lo???i t??m ki???m !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                    } else if (this.radMa.isSelected()) {
                        try {
                            row = Integer.parseInt(this.txtTimKiem.getText().trim());
                            this.getTimKiemNhanVienById(row);
                        } catch (Exception var24) {
                            if (!this.txtMaNV.getText().equalsIgnoreCase("")) {
                                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p s??? nguy??n !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                                this.txtTimKiem.requestFocus();
                                this.txtTimKiem.selectAll();
                            } else {
                                JOptionPane.showMessageDialog(this, "???? x???y ra l???i !", "Th??ng b??o", 0, new ImageIcon("Hinh\\warning.png"));
                                this.txtTimKiem.requestFocus();
                                this.txtTimKiem.selectAll();
                            }
                        }
                    } else if (this.radTen.isSelected()) {
                        caLamViec = this.txtTimKiem.getText().trim();
                        this.getTimKiemNhanVienByTen(caLamViec);
                    } else if (this.radSoDT.isSelected()) {
                        caLamViec = this.txtTimKiem.getText().trim();
                        this.getTimKiemNhanVienBySDT(caLamViec);
                    } else if (this.radCaLamViec.isSelected()) {
                        caLamViec = this.txtTimKiem.getText().trim();
                        this.getTimKiemNhanVienByCaLamViec(caLamViec);
                    }
                } else if (obj.equals(this.btnLamMoi)) {
                    xoaAllDataTable();
                    docDuLieu();
                    this.txtTimKiem.requestFocus();
                    this.txtTimKiem.selectAll();
                }
            }
        }

    }

    public void mouseClicked(MouseEvent e) {
        int row = table.getSelectedRow();
        int maNV = Integer.parseInt(model.getValueAt(row, 1).toString());

        try {
            NhanVien nv = nvDao.layThongTinNhanVien(maNV);
            this.txtMaNV.setText(String.valueOf(maNV));
            txtHo.setText(nv.getHo());
            txtTen.setText(nv.getTen());
            dateChooser.setDate(nv.getNgaySinh());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngaySinhtxt = dateFormat.format(dateChooser.getDate());
            Date ngaySinhsql = null;

            try {
                java.util.Date ngaySinh = dateFormat.parse(ngaySinhtxt);
                ngaySinhsql = new Date(ngaySinh.getTime());
                dateChooser.setDate(ngaySinhsql);
            } catch (Exception var18) {
                var18.printStackTrace();
            }

            cboGioiTinh.getModel().setSelectedItem(nv.getGioiTinh());
            txtSoDT.setText(nv.getSoDienThoai());
            txtCMND.setText(nv.getCmnd());
            txtTenTK.setText(nv.getTaiKhoan().getTenTaiKhoan());
            String loaiNV = nv.getLoaiNhanVien().trim();
            if (loaiNV.equalsIgnoreCase("NV")) {
                cboLoaiNV.getModel().setSelectedItem("Nh??n vi??n");
            } else {
                cboLoaiNV.getModel().setSelectedItem("Qu???n l??");
            }

            txtMaDiaChi.setText(String.valueOf(nv.getDiaChi().getMaDiaChi()));
            this.cboTrangThai.getModel().setSelectedItem(nv.getTrangThai());
            cboCaLamViec.getModel().setSelectedItem(nv.getCaLamViec());
            String diaChi = "";
            int maDC = Integer.parseInt(model.getValueAt(row, 9).toString());
            DiaChi dc = nvDao.layThongTinDiaChi(maDC);
            String soNha = dc.getSoNha();
            String tenDuong = dc.getTenDuong().trim();
            String phuong = dc.getPhuong().trim();
            String quan = dc.getQuan().trim();
            String thanhPho = dc.getThanhPho().trim();
            String quocGia = dc.getQuocGia().trim();
            if (!soNha.equalsIgnoreCase("") && !tenDuong.equalsIgnoreCase("")) {
                diaChi = soNha + ", " + tenDuong + ", " + phuong + ", " + quan + ", " + thanhPho + ", " + quocGia;
            } else {
                diaChi = phuong + ", " + quan + ", " + thanhPho + ", " + quocGia;
            }

            txtDiaChi.setText(diaChi);
        } catch (Exception var19) {
        }

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void getTimKiemNhanVienById(int id) {
        NhanVienDAO dao = new NhanVienDAO();
        ArrayList list = null;

        try {
            list = (ArrayList)dao.timkiemNhanVienByMa(id);
        } catch (SQLException | ClassNotFoundException var6) {
            var6.printStackTrace();
        }

        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            NhanVien nhanVien = (NhanVien)var5.next();
            model.addRow(nhanVien.toVector());
        }

        for(int i = 0; i < model.getRowCount(); ++i) {
            model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemNhanVienBySDT(String sdt) {
        NhanVienDAO dao = new NhanVienDAO();
        ArrayList list = null;

        try {
            list = (ArrayList)dao.timkiemNhanVienBySDT(sdt);
        } catch (SQLException | ClassNotFoundException var6) {
            var6.printStackTrace();
        }

        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            NhanVien nhanVien = (NhanVien)var5.next();
            model.addRow(nhanVien.toVector());
        }

        for(int i = 0; i < model.getRowCount(); ++i) {
            model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemNhanVienByTen(String ten) {
        NhanVienDAO dao = new NhanVienDAO();
        ArrayList list = null;

        try {
            list = (ArrayList)dao.timkiemNhanVienByTen(ten);
        } catch (SQLException | ClassNotFoundException var6) {
            var6.printStackTrace();
        }

        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            NhanVien nhanVien = (NhanVien)var5.next();
            model.addRow(nhanVien.toVector());
        }

        for(int i = 0; i < model.getRowCount(); ++i) {
            model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemNhanVienByCaLamViec(String caLamViec) {
        NhanVienDAO dao = new NhanVienDAO();
        ArrayList list = null;

        try {
            list = (ArrayList)dao.timkiemNhanVienByCalamViec(caLamViec);
        } catch (SQLException | ClassNotFoundException var6) {
            var6.printStackTrace();
        }

        model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            NhanVien nhanVien = (NhanVien)var5.next();
            model.addRow(nhanVien.toVector());
        }

        for(int i = 0; i < model.getRowCount(); ++i) {
            model.setValueAt(i + 1, i, 0);
        }

    }

    public static void docDuLieu() {
        try {
            List<NhanVien> list = nvDao.getAllNhanVien();
            int i = 0;
            Iterator var3 = list.iterator();

            while(var3.hasNext()) {
                NhanVien nhanVien = (NhanVien)var3.next();
                ++i;
                model.addRow(new Object[]{String.valueOf(i), String.valueOf(nhanVien.getMaNhanVien()), nhanVien.getHo().trim(), nhanVien.getTen().trim(), nhanVien.getNgaySinh(), nhanVien.getGioiTinh().trim(), nhanVien.getCmnd().trim(), nhanVien.getSoDienThoai().trim(), nhanVien.getCaLamViec(), nhanVien.getDiaChi().getMaDiaChi() + "".trim(), nhanVien.getTaiKhoan().getTenTaiKhoan(), nhanVien.getLoaiNhanVien(), nhanVien.getTrangThai().trim()});
            }

            table.setModel(model);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public boolean kiemTraDuLieu() {
        String soDT;
        try {
            soDT = txtHo.getText().trim();
            if (soDT.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p h??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtHo.requestFocus();
                txtHo.selectAll();
                return false;
            }
        } catch (Exception var12) {
            JOptionPane.showMessageDialog(this, "H??? kh??ng h???p l??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
            return false;
        }

        try {
            soDT = txtTen.getText().trim();
            if (soDT.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p t??n !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtTen.requestFocus();
                txtTen.selectAll();
                return false;
            }
        } catch (Exception var8) {
        }

        String cmnd;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            cmnd = dateFormat.format(dateChooser.getDate());
            Date ngaySinhsql = null;
            String year = "";
            int yearsql = 0;

            try {
                java.util.Date ngaySinh = dateFormat.parse(cmnd);
                ngaySinhsql = new Date(ngaySinh.getTime());
                year = ngaySinhsql.toString().substring(0, 4);
                yearsql = Integer.parseInt(year);
            } catch (Exception var7) {
                var7.printStackTrace();
            }

            if (ngaySinhsql.toString().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui l??ng ch???n ng??y sinh !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                dateChooser.requestFocus();
                return false;
            }

            if (LocalDate.now().getYear() - yearsql < 18) {
                JOptionPane.showMessageDialog(this, "Tu???i c???a b???n ph???i >= 18 !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                dateChooser.requestFocus();
                return false;
            }

            if (LocalDate.now().getYear() - yearsql > 60) {
                JOptionPane.showMessageDialog(this, "Tu???i c???a b???n ph???i <= 60 !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                dateChooser.requestFocus();
                return false;
            }
        } catch (Exception var11) {
            JOptionPane.showMessageDialog(this, "Ng??y sinh kh??ng h???p l??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
            return false;
        }

        soDT = txtSoDT.getText().trim();

        try {
            if (soDT.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p s??? ??i???n tho???i !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtSoDT.requestFocus();
                txtSoDT.selectAll();
                return false;
            }

            if (!soDT.matches("^[0]\\d{9}$")) {
                JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i g???m 10 s???, b???t ?????u b???ng s??? 0 !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtSoDT.requestFocus();
                txtSoDT.selectAll();
                return false;
            }
        } catch (Exception var10) {
            JOptionPane.showMessageDialog(this, "S??? ??i???n tho???i kh??ng h???p l??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
            txtSoDT.requestFocus();
            txtSoDT.selectAll();
            return false;
        }

        cmnd = txtCMND.getText().trim();

        try {
            if (cmnd.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui l??ng nh???p ch???ng minh nh??n d??n !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtCMND.requestFocus();
                txtCMND.selectAll();
                return false;
            }

            if (!cmnd.matches("^[0-9]{9}$")) {
                JOptionPane.showMessageDialog(this, "Ch???ng minh nh??n d??n g???m 8 ch??? s??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
                txtCMND.requestFocus();
                txtCMND.selectAll();
                return false;
            }
        } catch (Exception var9) {
            JOptionPane.showMessageDialog(this, "Ch???ng minh nh??n d??n kh??ng h???p l??? !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
            txtCMND.requestFocus();
            txtCMND.selectAll();
            return false;
        }

        txtTenTK.setText((String)null);
        txtMaDiaChi.setText((String)null);
        String trangThai = this.cboTrangThai.getSelectedItem().toString().trim();
        if (!trangThai.equalsIgnoreCase("Ngh??? vi???c") && !trangThai.equalsIgnoreCase("T???m ngh??? vi???c")) {
            check = true;
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Vui l??ng ch???n tr???ng th??i l?? \"??ang l??m vi???c\" !", "Th??ng b??o !", 0, new ImageIcon("Hinh\\warning.png"));
            return false;
        }
    }

    public static void xoaAllDataTable() {
        model = (DefaultTableModel)table.getModel();
        model.getDataVector().removeAllElements();
    }

    public void xoaRong() {
        this.txtMaNV.setText("");
        txtHo.setText("");
        txtMaDiaChi.setText("");
        txtSoDT.setText("");
        txtTen.setText("");
        txtTenTK.setText("");
        txtCMND.setText("");
        this.txtTimKiem.setText("");
        txtDiaChi.setText("");
        dateChooser.setDate((java.util.Date)null);
    }
}
