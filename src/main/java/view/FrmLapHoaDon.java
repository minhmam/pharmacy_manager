//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import com.toedter.calendar.JDateChooser;
import dao.ConectDatabase;
import dao.LapHoaDonDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import model.ChiTietHoaDon;
import model.KhachHang;
import model.Thuoc;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FrmLapHoaDon extends JFrame implements ActionListener, MouseListener, TableModelListener, KeyListener {
    JTabbedPane tabbedPane;
    public static JPanel jp1;
    public static JPanel pnTab2;
    public static JPanel pnTab3;
    public static JPanel pnTab4;
    JLabel lblThongTinKhachHang;
    JLabel lblDiaChi;
    JLabel lblMaHD;
    JLabel lblTenKH;
    JLabel lblSDT;
    JLabel lblNN;
    JLabel lblMakh;
    JLabel lblLHD;
    JTextField txtHD;
    JButton btnTim;
    JButton btnThem;
    public static DefaultTableModel tablemodel;
    public static JTextField txtNgay;
    private JLabel lblNhanVien;
    public static JTextField txtNhanVien;
    public static JRadioButton radKeDon;
    public static JRadioButton radKhongKeDon;
    public static JTextField txtHoKh;
    public static JTextField txtTenkh;
    public static JTextField txtCMND;
    private JLabel lblDC;
    public static JTextField txtDChi;
    private JLabel lblSdt;
    public static JTextField txtSdt;
    private JTable table;
    private JLabel lblTongTienThuoc;
    public static JTextField txtTongTienThuoc;
    private JLabel lblGiamGia;
    private JLabel lblTongThanhToan;
    private JTextField txtThue;
    public static JTextField txtTongThanhToan;
    private JLabel lblMHd;
    private JPanel jp2;
    private JComboBox cboDVT;
    private JComboBox<Integer> cboSoLuong;
    private JComboBox cboGiamGia;
    public static JComboBox cboTimKiemThuoc;
    private JButton btnThemThuocTim;
    private JButton btnInHd;
    private JButton btnXoa;
    public static DefaultComboBoxModel cboModeTimKiemThuoc = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModelTableThuoc = new DefaultComboBoxModel();
    private JSpinner spinner = new JSpinner(new SpinnerNumberModel(new Integer(1), new Integer(1), (Comparable)null, new Integer(1)));
    public static int i = 0;
    private JTextField txtTienNhan;
    private JTextField txtTienThoiLai;
    private JButton btnMayTinh;
    private static JComboBox cboGiamGia1;
    public static JTextField txtSoLuong;
    public static JLabel lblThongBao;
    private static float tongThanhToan = 0.0F;
    public static String setLoaiThuoc = "";
    private JButton btnThemHoaDon;
    private JMenuItem mntmSoLuong;
    private JMenuItem mntmXoa;
    public static JComboBox cboGioiTinh;
    public static JDateChooser txtNgaySinh;
    private JButton btnThemDiaChi;
    private FrmXuatHD frmXuatHD = new FrmXuatHD();
    private FrmThemDiaChiKhachHang frmThemDiaChiKhachHang = new FrmThemDiaChiKhachHang();
    private FrmChonThuoc frmChonThuoc = new FrmChonThuoc();
    private static LapHoaDonDAO lapHoaDonDAO = new LapHoaDonDAO();
    String tenThuocSoSanh = "";

    public FrmLapHoaDon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("Hinh\\D01014613-p1.jpg"));
        this.setTitle("QUẢN LÍ QUẦY THUỐC BỆNH VIỆN TÂY NAM");
        this.setSize(1354, 733);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(true);
        this.tabbedPane = new JTabbedPane();
        this.tabbedPane.setBorder(new BevelBorder(0, new Color(128, 128, 128), (Color)null, (Color)null, (Color)null));
        jp1 = new JPanel();
        jp1.setBackground(SystemColor.controlHighlight);
        pnTab2 = new JPanel();
        new ImageIcon("leaves-icon.png");
        this.tabbedPane.addTab("Lập hóa đơn", (Icon)null, jp1);
        jp1.add(this.lblLHD = new JLabel("LẬP HÓA ĐƠN"));
        this.lblLHD.setFont(new Font("Times New Roman", 1, 30));
        this.lblLHD.setForeground(Color.RED);
        jp1.add(this.lblMaHD = new JLabel("Mã HD:"));
        this.lblMaHD.setFont(new Font("Times New Roman", 0, 18));
        this.lblMaHD.setForeground(new Color(0, 0, 0));
        jp1.add(this.lblMakh = new JLabel("Nhập mã khách hàng:"));
        jp1.add(this.txtHD = new JTextField());
        this.txtHD.setFont(new Font("Times New Roman", 0, 18));
        this.lblLHD.setBounds(574, 11, 247, 38);
        this.lblMaHD.setBounds(10, 55, 74, 20);
        this.txtHD.setBounds(82, 55, 178, 20);
        this.txtHD.setEditable(false);
        JLabel lblNgay = new JLabel("Ngày:");
        lblNgay.setForeground(new Color(0, 0, 0));
        lblNgay.setFont(new Font("Times New Roman", 0, 18));
        lblNgay.setBounds(304, 55, 74, 20);
        jp1.add(lblNgay);
        txtNgay = new JTextField();
        txtNgay.setFont(new Font("Times New Roman", 0, 18));
        txtNgay.setEditable(false);
        txtNgay.setBounds(388, 54, 152, 20);
        jp1.add(txtNgay);
        this.lblNhanVien = new JLabel("Nhân viên:");
        this.lblNhanVien.setForeground(new Color(0, 0, 0));
        this.lblNhanVien.setFont(new Font("Times New Roman", 0, 18));
        this.lblNhanVien.setBounds(564, 60, 147, 20);
        jp1.add(this.lblNhanVien);
        txtNhanVien = new JTextField();
        txtNhanVien.setFont(new Font("Times New Roman", 0, 17));
        txtNhanVien.setEditable(false);
        txtNhanVien.setBounds(718, 63, 236, 20);
        jp1.add(txtNhanVien);
        radKeDon = new JRadioButton("Kê Đơn");
        radKeDon.setEnabled(false);
        radKeDon.setForeground(new Color(0, 0, 0));
        radKeDon.setFont(new Font("Times New Roman", 0, 18));
        radKeDon.setBounds(1051, 44, 85, 23);
        jp1.add(radKeDon);
        radKhongKeDon = new JRadioButton("Không Kê Đơn");
        radKhongKeDon.setEnabled(false);
        radKhongKeDon.setForeground(new Color(0, 0, 0));
        radKhongKeDon.setFont(new Font("Times New Roman", 0, 18));
        radKhongKeDon.setBounds(1158, 44, 161, 23);
        jp1.add(radKhongKeDon);
        JLabel lblTnKh = new JLabel("Họ KH:");
        lblTnKh.setForeground(new Color(0, 0, 0));
        lblTnKh.setFont(new Font("Times New Roman", 0, 18));
        lblTnKh.setBounds(301, 86, 79, 20);
        jp1.add(lblTnKh);
        txtHoKh = new JTextField();
        txtHoKh.setFont(new Font("Times New Roman", 0, 18));
        txtHoKh.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (FrmLapHoaDon.txtSdt.getText().equalsIgnoreCase("")) {
                    FrmLapHoaDon.txtSdt.requestFocus();
                    FrmLapHoaDon.lblThongBao.setText("Nhập số điện thoại khách hàng!");
                } else {
                    FrmLapHoaDon.lblThongBao.setText("");
                }

            }

            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '\b') {
                    e.consume();
                }

            }
        });
        txtHoKh.setBounds(390, 86, 152, 20);
        jp1.add(txtHoKh);
        JLabel lblTenkh = new JLabel("Tên KH:");
        lblTenkh.setForeground(new Color(0, 0, 0));
        lblTenkh.setFont(new Font("Times New Roman", 0, 18));
        lblTenkh.setBounds(564, 91, 147, 20);
        jp1.add(lblTenkh);
        txtTenkh = new JTextField();
        txtTenkh.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == '\b') {
                    e.consume();
                }

            }
        });
        txtTenkh.setFont(new Font("Times New Roman", 0, 17));
        txtTenkh.setBounds(718, 94, 236, 20);
        jp1.add(txtTenkh);
        JLabel lblCMND = new JLabel("Số CMND:");
        lblCMND.setForeground(new Color(0, 0, 0));
        lblCMND.setFont(new Font("Times New Roman", 0, 18));
        lblCMND.setBounds(641, 125, 105, 20);
        jp1.add(lblCMND);
        txtCMND = new JTextField();
        txtCMND.setFont(new Font("Times New Roman", 0, 17));
        txtCMND.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        txtCMND.setBounds(778, 125, 176, 20);
        jp1.add(txtCMND);
        this.lblDC = new JLabel("Địa Chỉ:");
        this.lblDC.setForeground(new Color(0, 0, 0));
        this.lblDC.setFont(new Font("Times New Roman", 1, 18));
        this.lblDC.setBounds(10, 120, 85, 20);
        jp1.add(this.lblDC);
        txtDChi = new JTextField();
        txtDChi.setFont(new Font("Times New Roman", 0, 18));
        txtDChi.setEditable(false);
        txtDChi.setBounds(82, 119, 506, 20);
        jp1.add(txtDChi);
        this.lblSdt = new JLabel("SDT:");
        this.lblSdt.setForeground(new Color(0, 0, 0));
        this.lblSdt.setFont(new Font("Times New Roman", 0, 18));
        this.lblSdt.setBounds(10, 86, 62, 20);
        jp1.add(this.lblSdt);
        txtSdt = new JTextField();
        txtSdt.setFont(new Font("Times New Roman", 0, 18));
        txtSdt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }

            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == 10 && e.getKeyCode() == 10) {
                    if (FrmLapHoaDon.txtSdt.getText().length() == 10) {
                        FrmLapHoaDon.this.timKhachHangBySDT(FrmLapHoaDon.txtSdt.getText());
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Số điện thoại phải là 10 số!");
                    }
                }

                if (FrmLapHoaDon.lapHoaDonDAO.timKhachHangBySDT(FrmLapHoaDon.txtSdt.getText()).isEmpty()) {
                    FrmLapHoaDon.txtHoKh.setText("");
                    FrmLapHoaDon.txtTenkh.setText("");
                    FrmLapHoaDon.txtDChi.setText("");
                    FrmLapHoaDon.txtCMND.setText("");
                }

                FrmLapHoaDon.this.timKhachHangBySDT(FrmLapHoaDon.txtSdt.getText());
            }

            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        txtSdt.setBounds(82, 86, 178, 20);
        jp1.add(txtSdt);
        Border southborder = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder = new TitledBorder(southborder, "Thông tin chung");
        southTitleBorder.setTitleColor(Color.blue);
        JScrollPane scroll = new JScrollPane();
        String[] tb = new String[]{"STT", "Mã", "Tên Thuốc", "Loại Thuốc", "Đơn Vị Tính", "Hàm Lượng", "Đơn Giá(VNĐ)", "Số Lượng", "Giảm Giá(%)", "Thành Tiền(VNĐ)"};
        tablemodel = new DefaultTableModel(tb, 0);
        this.table = new JTable(tablemodel);
        this.table.setFont(new Font("Times New Roman", 0, 14));
        this.table.setBackground(Color.WHITE);
        scroll.setViewportView(this.table);
        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(this.table, popupMenu);
        this.mntmSoLuong = new JMenuItem("Sửa số lượng");
        popupMenu.add(this.mntmSoLuong);
        this.mntmXoa = new JMenuItem("Xóa");
        popupMenu.add(this.mntmXoa);
        this.table.setRowHeight(30);
        this.table.getColumnModel().getColumn(0).setPreferredWidth(1);
        this.table.getColumnModel().getColumn(1).setPreferredWidth(20);
        this.table.getColumnModel().getColumn(2).setPreferredWidth(320);
        this.table.getColumnModel().getColumn(7).setPreferredWidth(10);
        this.table.getColumnModel().getColumn(8).setPreferredWidth(10);
        tablemodel.addTableModelListener(this);
        this.table.setDefaultEditor(Object.class, (TableCellEditor)null);
        txtSoLuong = new JTextField();
        txtSoLuong.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        txtSoLuong.setEditable(false);
        DefaultCellEditor colSoLuong = new DefaultCellEditor(txtSoLuong);
        this.table.getColumnModel().getColumn(7).setCellEditor(colSoLuong);
        this.cboGiamGia = new JComboBox();
        this.cboGiamGia.addItem("0");
        this.cboGiamGia.addItem("5");
        this.cboGiamGia.addItem("10");
        this.cboGiamGia.addItem("15");
        this.cboGiamGia.addItem("20");
        this.cboGiamGia.addItem("25");
        this.cboGiamGia.addItem("30");
        this.cboGiamGia.addItem("35");
        this.cboGiamGia.addItem("40");
        this.cboGiamGia.addItem("45");
        this.cboGiamGia.addItem("50");
        this.cboGiamGia.addItem("55");
        this.cboGiamGia.addItem("60");
        this.cboGiamGia.addItem("65");
        this.cboGiamGia.addItem("70");
        DefaultCellEditor col7 = new DefaultCellEditor(this.cboGiamGia);
        this.table.getColumnModel().getColumn(8).setCellEditor(col7);
        Border southborder2 = BorderFactory.createLineBorder(Color.blue);
        TitledBorder southTitleBorder2 = new TitledBorder(southborder2, "Thông tin hóa đơn");
        southTitleBorder2.setTitleColor(Color.blue);
        scroll.setBorder(southTitleBorder2);
        jp1.add(scroll);
        scroll.setPreferredSize(new Dimension(0, 250));
        jp1.setLayout((LayoutManager)null);
        scroll.setBounds(20, 202, 1299, 248);
        this.getContentPane().add(this.tabbedPane);
        this.btnXoa = new JButton("Xóa ");
        this.btnXoa.setHorizontalAlignment(2);
        this.btnXoa.setFont(new Font("Times New Roman", 1, 18));
        this.btnXoa.setBackground(SystemColor.controlHighlight);
        this.btnXoa.setIcon(new ImageIcon("Hinh\\iconDeleteRow.png"));
        this.btnXoa.setBounds(20, 167, 105, 23);
        jp1.add(this.btnXoa);
        this.btnThemThuocTim = new JButton("Thêm");
        this.btnThemThuocTim.setFont(new Font("Times New Roman", 0, 18));
        this.btnThemThuocTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        this.btnThemThuocTim.setBackground(SystemColor.controlHighlight);
        this.btnThemThuocTim.setIcon(new ImageIcon("Hinh\\iconSearch.png"));
        this.btnThemThuocTim.setBounds(1177, 158, 120, 23);
        jp1.add(this.btnThemThuocTim);
        this.lblTongTienThuoc = new JLabel("Tổng tiền Thuốc (VNĐ):");
        this.lblTongTienThuoc.setForeground(Color.BLACK);
        this.lblTongTienThuoc.setFont(new Font("Times New Roman", 0, 16));
        this.lblTongTienThuoc.setBounds(28, 492, 189, 20);
        jp1.add(this.lblTongTienThuoc);
        cboTimKiemThuoc = new JComboBox();
        cboTimKiemThuoc.setFont(new Font("Times New Roman", 0, 18));
        cboTimKiemThuoc.setEditable(true);
        cboTimKiemThuoc.setBounds(886, 158, 267, 23);
        jp1.add(cboTimKiemThuoc);
        this.lblMHd = new JLabel("Tên Thuốc:");
        this.lblMHd.setForeground(new Color(0, 0, 0));
        this.lblMHd.setFont(new Font("Times New Roman", 0, 18));
        this.lblMHd.setBounds(763, 159, 113, 20);
        jp1.add(this.lblMHd);
        this.jp2 = new JPanel();
        this.jp2.setBackground(SystemColor.controlHighlight);
        this.jp2.setForeground(Color.BLUE);
        this.jp2.setBounds(10, 455, 1309, 166);
        jp1.add(this.jp2);
        Border southborder3 = BorderFactory.createLineBorder(Color.blue);
        TitledBorder southTitleBorder3 = new TitledBorder(southborder3, "Thông tin chi tiết");
        southTitleBorder3.setTitleColor(Color.BLUE);
        this.jp2.setBorder(southTitleBorder3);
        jp1.add(this.jp2);
        this.jp2.setLayout((LayoutManager)null);
        this.btnThemHoaDon = new JButton("Thêm hóa đơn mới");
        this.btnThemHoaDon.setBackground(SystemColor.controlHighlight);
        this.btnThemHoaDon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        this.btnThemHoaDon.setFont(new Font("Tahoma", 0, 12));
        this.btnThemHoaDon.setHorizontalAlignment(2);
        this.btnThemHoaDon.setIcon(new ImageIcon("Hinh\\hoadon.png"));
        this.btnThemHoaDon.setBounds(820, 109, 181, 46);
        this.jp2.add(this.btnThemHoaDon);
        this.lblGiamGia = new JLabel("Giảm Giá (%):");
        this.lblGiamGia.setBounds(20, 104, 181, 25);
        this.jp2.add(this.lblGiamGia);
        this.lblGiamGia.setForeground(Color.BLACK);
        this.lblGiamGia.setFont(new Font("Times New Roman", 0, 16));
        this.lblTongThanhToan = new JLabel("Tổng tiền thanh toán (VNĐ):");
        this.lblTongThanhToan.setBounds(20, 135, 215, 20);
        this.jp2.add(this.lblTongThanhToan);
        this.lblTongThanhToan.setForeground(Color.BLACK);
        this.lblTongThanhToan.setFont(new Font("Times New Roman", 0, 16));
        this.txtThue = new JTextField();
        this.txtThue.setHorizontalAlignment(4);
        this.txtThue.setBounds(245, 72, 355, 20);
        this.jp2.add(this.txtThue);
        this.txtThue.setText("5%");
        this.txtThue.setEditable(false);
        this.txtThue.setColumns(10);
        txtTongThanhToan = new JTextField();
        txtTongThanhToan.setHorizontalAlignment(4);
        txtTongThanhToan.setBounds(245, 134, 355, 20);
        this.jp2.add(txtTongThanhToan);
        txtTongThanhToan.setEditable(false);
        txtTongThanhToan.setColumns(10);
        JLabel lblThue = new JLabel("Thuế GTGT (%):");
        lblThue.setBounds(20, 73, 181, 25);
        this.jp2.add(lblThue);
        lblThue.setForeground(Color.BLACK);
        lblThue.setFont(new Font("Times New Roman", 0, 16));
        JLabel lblTienNhan = new JLabel("Tiền nhận (VNĐ) :");
        lblTienNhan.setFont(new Font("Tahoma", 0, 14));
        lblTienNhan.setBounds(687, 41, 120, 20);
        this.jp2.add(lblTienNhan);
        JLabel lblTienThoiLai = new JLabel("Tiền thối lại (VNĐ):");
        lblTienThoiLai.setFont(new Font("Tahoma", 0, 14));
        lblTienThoiLai.setBounds(687, 73, 120, 20);
        this.jp2.add(lblTienThoiLai);
        this.txtTienNhan = new JTextField();
        final DecimalFormat tien = new DecimalFormat("#,##0.00");
        this.txtTienNhan.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent arg0) {
                try {
                    double tienNhan;
                    double tienThoiLai;
                    if (FrmLapHoaDon.this.txtTienNhan.getText() == "") {
                        tienNhan = Double.parseDouble("0");
                        FrmLapHoaDon.this.txtTienNhan.setText("0");
                        tienThoiLai = tienNhan - (double)FrmLapHoaDon.tongThanhToan;
                        FrmLapHoaDon.this.txtTienThoiLai.setText(tien.format(tienThoiLai) + " VNĐ");
                    } else {
                        tienNhan = Double.parseDouble(FrmLapHoaDon.this.txtTienNhan.getText());
                        tienThoiLai = tienNhan - (double)FrmLapHoaDon.tongThanhToan;
                        FrmLapHoaDon.this.txtTienThoiLai.setText(tien.format(tienThoiLai) + " VNĐ");
                    }
                } catch (Exception var6) {
                }

            }

            public void keyReleased(KeyEvent e) {
                try {
                    double tienNhan;
                    double tienThoiLai;
                    if (FrmLapHoaDon.this.txtTienNhan.getText() == "") {
                        tienNhan = Double.parseDouble("0");
                        FrmLapHoaDon.this.txtTienNhan.setText("0");
                        tienThoiLai = tienNhan - (double)FrmLapHoaDon.tongThanhToan;
                        FrmLapHoaDon.this.txtTienThoiLai.setText(tien.format(tienThoiLai) + " VNĐ");
                    } else {
                        tienNhan = Double.parseDouble(FrmLapHoaDon.this.txtTienNhan.getText());
                        tienThoiLai = tienNhan - (double)FrmLapHoaDon.tongThanhToan;
                        FrmLapHoaDon.this.txtTienThoiLai.setText(tien.format(tienThoiLai) + " VNĐ");
                    }
                } catch (Exception var6) {
                }

            }

            public void keyTyped(KeyEvent e) {
                if ((e.getKeyChar() < '0' || e.getKeyChar() > '9') && e.getKeyChar() != '\b') {
                    e.consume();
                }

            }
        });
        this.txtTienNhan.setHorizontalAlignment(4);
        this.txtTienNhan.setFont(new Font("Tahoma", 0, 12));
        this.txtTienNhan.setBounds(820, 39, 270, 28);
        this.jp2.add(this.txtTienNhan);
        this.txtTienNhan.setColumns(20);
        this.txtTienThoiLai = new JTextField();
        this.txtTienThoiLai.setHorizontalAlignment(4);
        this.txtTienThoiLai.setEditable(false);
        this.txtTienThoiLai.setFont(new Font("Tahoma", 0, 12));
        this.txtTienThoiLai.setColumns(10);
        this.txtTienThoiLai.setBounds(820, 73, 270, 28);
        this.jp2.add(this.txtTienThoiLai);
        txtTongTienThuoc = new JTextField();
        txtTongTienThuoc.setHorizontalAlignment(4);
        txtTongTienThuoc.setBounds(245, 34, 355, 20);
        this.jp2.add(txtTongTienThuoc);
        txtTongTienThuoc.setEditable(false);
        txtTongTienThuoc.setColumns(10);
        this.btnInHd = new JButton("In HD");
        this.btnInHd.setHorizontalAlignment(2);
        this.btnInHd.setBounds(1159, 41, 129, 52);
        this.jp2.add(this.btnInHd);
        this.btnInHd.setFont(new Font("Tahoma", 1, 12));
        this.btnInHd.setBackground(SystemColor.controlHighlight);
        this.btnInHd.setIcon(new ImageIcon("Hinh\\iconPrinter.png"));
        cboGiamGia1 = new JComboBox();
        cboGiamGia1.setEditable(true);
        cboGiamGia1.setBounds(427, 103, 173, 20);
        cboGiamGia1.addItem("0");
        cboGiamGia1.addItem("5");
        cboGiamGia1.addItem("10");
        cboGiamGia1.addItem("15");
        cboGiamGia1.addItem("20");
        cboGiamGia1.addItem("25");
        cboGiamGia1.addItem("30");
        cboGiamGia1.addItem("35");
        cboGiamGia1.addItem("40");
        cboGiamGia1.addItem("45");
        cboGiamGia1.addItem("50");
        cboGiamGia1.addItem("55");
        cboGiamGia1.addItem("60");
        cboGiamGia1.addItem("65");
        cboGiamGia1.addItem("70");
        cboGiamGia1.addItem("75");
        cboGiamGia1.addItem("80");
        cboGiamGia1.addItem("85");
        cboGiamGia1.addItem("90");
        cboGiamGia1.addItem("95");
        cboGiamGia1.addItem("100");
        cboGiamGia1.setEditable(false);
        this.jp2.add(cboGiamGia1);
        this.btnInHd.addActionListener(this);
        this.getContentPane().add(this.tabbedPane);
        cboTimKiemThuoc.addActionListener(this);
        this.btnThemThuocTim.addActionListener(this);
        this.btnXoa.addActionListener(this);
        this.table.addMouseListener(this);
        cboGiamGia1.addActionListener(this);
        this.btnThemHoaDon.addActionListener(this);
        AutoCompleteDecorator.decorate(cboTimKiemThuoc);
        lblThongBao = new JLabel("");
        lblThongBao.setFont(new Font("Times New Roman", 0, 16));
        lblThongBao.setForeground(Color.RED);
        lblThongBao.setBackground(Color.RED);
        lblThongBao.setBounds(10, 143, 436, 20);
        jp1.add(lblThongBao);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy , hh:mm");
        txtNgay.setText(LocalDateTime.now().format(formatter));
        txtNhanVien.setText(LapHoaDonDAO.tenNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        cboGioiTinh = new JComboBox();
        cboGioiTinh.setFont(new Font("Times New Roman", 0, 18));
        cboGioiTinh.setModel(new DefaultComboBoxModel(new String[]{"Nam", "Nữ", "Khác"}));
        cboGioiTinh.setBounds(1158, 74, 95, 22);
        jp1.add(cboGioiTinh);
        JLabel lblGoiTinh = new JLabel("Giới tính:");
        lblGoiTinh.setFont(new Font("Times New Roman", 0, 18));
        lblGoiTinh.setBounds(1050, 80, 86, 26);
        jp1.add(lblGoiTinh);
        JLabel lblNgaySinh = new JLabel("Ngày sinh:");
        lblNgaySinh.setFont(new Font("Times New Roman", 0, 18));
        lblNgaySinh.setBounds(1050, 114, 86, 33);
        jp1.add(lblNgaySinh);
        txtNgaySinh = new JDateChooser();
        txtNgaySinh.getCalendarButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        txtNgaySinh.getCalendarButton().setFont(new Font("Times New Roman", 0, 14));
        txtNgaySinh.setBounds(1157, 110, 162, 20);
        txtNgaySinh.setLocale(Locale.forLanguageTag("vi-VN"));
        txtNgaySinh.setDateFormatString("dd/MM/yyyy");
        jp1.add(txtNgaySinh);
        this.btnThemDiaChi = new JButton("");
        this.btnThemDiaChi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmLapHoaDon.this.frmThemDiaChiKhachHang.setVisible(true);
                FrmLapHoaDon.this.frmThemDiaChiKhachHang.setLocationRelativeTo((Component)null);
            }
        });
        this.btnThemDiaChi.setIcon(new ImageIcon("Hinh\\iconAdd.png"));
        this.btnThemDiaChi.setFont(new Font("Tahoma", 1, 12));
        this.btnThemDiaChi.setBackground(SystemColor.controlHighlight);
        this.btnThemDiaChi.setBounds(591, 116, 36, 23);
        JButton btnThoat = new JButton("Thoát");
        btnThoat.setHorizontalAlignment(2);
        btnThoat.setBounds(1159, 110, 129, 45);
        this.jp2.add(btnThoat);
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                FrmManHinhChinh.tabbedPane.remove(FrmLapHoaDon.jp1);
            }
        });
        btnThoat.setFont(new Font("Tahoma", 1, 12));
        btnThoat.setBackground(SystemColor.controlHighlight);
        btnThoat.setIcon(new ImageIcon("Hinh\\iconDelete.png"));
        jp1.add(this.btnThemDiaChi);
        txtSdt.addKeyListener(this);
        cboGiamGia1.addKeyListener(this);
        this.mntmSoLuong.addActionListener(this);
        this.mntmXoa.addActionListener(this);
        cboTimKiemThuoc.removeAllItems();
        this.updateComboxTenThuoc();
    }

    public void themHoaDonKeDon() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String soNha = FrmThemDiaChiKhachHang.txtSoNha.getText();
        String tenDuong = FrmThemDiaChiKhachHang.txtTenDuong.getText();
        String phuong = FrmThemDiaChiKhachHang.txtPhuong.getText();
        String Quan = FrmThemDiaChiKhachHang.txtQuan.getText();
        String thanhPho = FrmThemDiaChiKhachHang.txtThanhPho.getText();
        String quocGia = FrmThemDiaChiKhachHang.txtQuocGia.getText();
        String ten = txtTenkh.getText();
        String ho = txtHoKh.getText();
        String ngaySinhtxt = simpleDateFormat.format(txtNgaySinh.getDate());
        System.out.println(ngaySinhtxt);
        Date ngaySinhSQL = null;

        try {
            java.util.Date ngaySinh = simpleDateFormat.parse(ngaySinhtxt);
            ngaySinhSQL = new Date(ngaySinh.getTime());
        } catch (ParseException var19) {
            var19.printStackTrace();
        }

        String gioiTinh = cboGioiTinh.getSelectedItem().toString();
        String cmnd = txtCMND.getText();
        String soDienThoai = txtSdt.getText();
        int maNhanVien = Integer.parseInt(lapHoaDonDAO.maNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        int maKhachHang = lapHoaDonDAO.maKhachHangBySDT(soDienThoai);
        lapHoaDonDAO.addDiaChi(soNha, tenDuong, phuong, Quan, thanhPho, quocGia);
        lapHoaDonDAO.addKhachHang(ten, ho, ngaySinhSQL, gioiTinh, cmnd, soDienThoai, lapHoaDonDAO.maDiaChiMax());
        float tongTien = 0.0F;
        tongTien = tongThanhToan;
        lapHoaDonDAO.addHoaDonLoaiKeDon(maNhanVien, maKhachHang, tongTien);
        String loaiHoaDon = "";
        if (radKeDon.isSelected()) {
            loaiHoaDon = "Thuốc kê đơn";
        } else if (radKhongKeDon.isSelected()) {
            loaiHoaDon = "Không kê đơn";
        }

        this.setDuLieuFrmInHd(lapHoaDonDAO.maHoaDon(String.valueOf(maNhanVien)), loaiHoaDon, txtNgay.getText(), ho + " " + ten, ngaySinhtxt, gioiTinh, soDienThoai, txtDChi.getText(), "", txtTongTienThuoc.getText(), txtTongThanhToan.getText(), txtNhanVien.getText(), txtTenkh.getText());
        FrmXuatHD.lblSL.setText(String.valueOf(i));
    }

    public void timKhachHangBySDT(String sdt) {
        DateTimeFormatter var2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            Iterator var4 = lapHoaDonDAO.timKhachHangBySDT(sdt).iterator();

            while(var4.hasNext()) {
                KhachHang khachHang = (KhachHang)var4.next();
                String ho = khachHang.getHo();
                String ten = khachHang.getTen();
                String gioiTinh = khachHang.getGioiTinh();
                String CMND = khachHang.getCmnd();
                String ngaySinh = khachHang.getNgaySinh().toString();
                String soNha = khachHang.getDiaChi().getSoNha();
                String tenDuong = khachHang.getDiaChi().getTenDuong();
                String phuong = khachHang.getDiaChi().getPhuong();
                String quan = khachHang.getDiaChi().getQuan();
                String thanhPho = khachHang.getDiaChi().getThanhPho();
                String quocGia = khachHang.getDiaChi().getQuocGia();
                FrmThemDiaChiKhachHang.txtSoNha.setText(soNha);
                FrmThemDiaChiKhachHang.txtTenDuong.setText(tenDuong);
                FrmThemDiaChiKhachHang.txtPhuong.setText(phuong);
                FrmThemDiaChiKhachHang.txtQuan.setText(quan);
                FrmThemDiaChiKhachHang.txtQuocGia.setText(quocGia);
                txtHoKh.setText(ho);
                txtTenkh.setText(ten);
                cboGioiTinh.setSelectedItem(gioiTinh);
                txtCMND.setText(CMND);
                txtDChi.setText(soNha + " " + tenDuong + "," + phuong + "," + quan + "," + thanhPho + "," + quocGia);
                Date date = Date.valueOf(ngaySinh);
                txtNgaySinh.setDate(date);
            }
        } catch (Exception var17) {
        }

    }

    public void updateComboxTenThuoc() {
        cboTimKiemThuoc.removeAllItems();

        try {
            cboModeTimKiemThuoc.addElement((Object)null);
            String tenThuoc = "";

            for(Iterator var3 = lapHoaDonDAO.updateComboxTenThuoc().iterator(); var3.hasNext(); this.tenThuocSoSanh = tenThuoc) {
                Thuoc thuoc = (Thuoc)var3.next();
                if (!thuoc.getTenThuoc().equalsIgnoreCase(this.tenThuocSoSanh)) {
                    tenThuoc = thuoc.getTenThuoc();
                    cboModeTimKiemThuoc.addElement(tenThuoc);
                    cboTimKiemThuoc.setModel(cboModeTimKiemThuoc);
                }
            }
        } catch (Exception var4) {
        }

    }

    public boolean addHoaDon() {
        int maNhanVien = Integer.parseInt(lapHoaDonDAO.maNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        float tongTien = 0.0F;
        tongTien = tongThanhToan;
        ConectDatabase.getInstance();
        Connection con = ConectDatabase.getConnection();
        PreparedStatement stmt = null;
        int n = 0;

        try {
            stmt = con.prepareStatement("insert into pharmacy_manager.HoaDon(MaNhanVien,TongTien) values\r\n(?,?)");
            stmt.setInt(1, maNhanVien);
            stmt.setFloat(2, tongThanhToan);
            n = stmt.executeUpdate();
        } catch (Exception var7) {
        }

        return n > 0;
    }

    public static void danhSachThuocTheoMaThuoc(int maThuoc) {
        if (LapHoaDonDAO.soLuongThuocDaBan(maThuoc) > lapHoaDonDAO.soLuongNhap(maThuoc)) {
            JOptionPane.showMessageDialog(jp1, "Thuốc đã tạm hết thuốc trong kho ! \n Vui lòng chọn loại thuốc khác");
        } else {
            try {
                new Thuoc();
                Thuoc thuoc = lapHoaDonDAO.ThuocTheoMa(maThuoc);
                if (thuoc != null) {
                    int maThuocInt = thuoc.getMaThuoc();
                    String tenThuocs = thuoc.getTenThuoc();
                    String loaiThuoc = thuoc.getPhanLoai();
                    String donViTinhs = thuoc.getDonViTinh();
                    String hamLuong = thuoc.getHamLuong();
                    String donGia = String.valueOf(thuoc.getDonGia());
                    double thanhTien = (double)Integer.parseInt(txtSoLuong.getText()) * Double.parseDouble(donGia);
                    if (loaiThuoc.equalsIgnoreCase("Thuốc kê đơn")) {
                        radKeDon.setSelected(true);
                        radKhongKeDon.setSelected(false);
                        setLoaiThuoc = "Thuốc kê đơn";
                        lblThongBao.setText("Thuốc kê đơn vui lòng nhập thông tin khách hàng!");
                        txtSdt.requestFocus();
                    } else if (loaiThuoc.equalsIgnoreCase("Không kê đơn") && !setLoaiThuoc.equalsIgnoreCase("Thuốc kê đơn")) {
                        radKhongKeDon.setSelected(true);
                        radKeDon.setSelected(false);
                        lblThongBao.setText("");
                    }

                    tablemodel.addRow(new Object[]{++i, maThuocInt, tenThuocs, loaiThuoc, donViTinhs, hamLuong, donGia, txtSoLuong.getText(), 0, thanhTien});
                    updateTongTien();
                }
            } catch (Exception var10) {
            }
        }

    }

    public boolean updateTableChonThuoc(String tenThuoc) {
        try {
            FrmChonThuoc.xoaDuLieuTableModel();
            FrmChonThuoc.lblThuocCoTen.setText("THUỐC CÓ TÊN " + tenThuoc);
            if (!lapHoaDonDAO.danhSachThuocTimKiemTheoTen_TimKiemTuongDoi(tenThuoc).isEmpty()) {
                Iterator var3 = lapHoaDonDAO.danhSachThuocTimKiemTheoTen_TimKiemTuongDoi(tenThuoc).iterator();

                while(var3.hasNext()) {
                    Thuoc thuoc = (Thuoc)var3.next();
                    FrmChonThuoc.tableModel.addRow(new Object[]{thuoc.getMaThuoc(), thuoc.getNhomThuoc(), thuoc.getTenThuoc(), thuoc.getPhanLoai(), thuoc.getHamLuong(), thuoc.getDangBaoChe(), thuoc.getDonViTinh(), thuoc.getDonGia(), thuoc.getNhaCungcap().getTenNCC()});
                    FrmChonThuoc.table.setModel(FrmChonThuoc.tableModel);
                }

                FrmChonThuoc.table.setRowSelectionInterval(0, 0);
                return true;
            }

            JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu!");
        } catch (Exception var4) {
        }

        return false;
    }

    public boolean kiemTraThongTinKhachHang() {
        if (txtSdt.getText().equalsIgnoreCase("")) {
            txtSdt.requestFocus();
            lblThongBao.setText("Vui lòng nhập số điện thoại!");
            return false;
        } else if (txtTenkh.getText().equalsIgnoreCase("")) {
            txtTenkh.requestFocus();
            lblThongBao.setText("Vui lòng nhập vào tên khách hàng!");
            return false;
        } else if (txtHoKh.getText().equalsIgnoreCase("")) {
            txtHoKh.requestFocus();
            lblThongBao.setText("Vui lòng nhập vào họ khách hàng!");
            return false;
        } else if (txtDChi.getText().equalsIgnoreCase("")) {
            txtDChi.requestFocus();
            lblThongBao.setText("Vui lòng nhập vào địa chỉ!");
            return false;
        } else {
            return true;
        }
    }

    public boolean kiemTraThuocKeDon() {
        List data = tablemodel.getDataVector();
        Object[] list1 = data.toArray();

        for(int k = 0; k < list1.length; ++k) {
            String loaiThuoc = tablemodel.getValueAt(k, 3).toString();
            if (loaiThuoc.equalsIgnoreCase("Thuốc kê đơn")) {
                radKeDon.setSelected(true);
                radKhongKeDon.setSelected(false);
                lblThongBao.setText("Thuốc kê đơn vui lòng nhập thông tin khách hàng!");
                return true;
            }
        }

        return false;
    }

    public boolean kiemTraTrungThuoc(String tenThuoc) {
        List data = tablemodel.getDataVector();
        Object[] list1 = data.toArray();

        for(int k = 0; k < list1.length; ++k) {
            String tenThuocTable = tablemodel.getValueAt(k, 2).toString();
            if (tenThuoc.equalsIgnoreCase(tenThuocTable)) {
                this.table.setRowSelectionInterval(k, k);
                return true;
            }
        }

        return false;
    }

    public boolean kiemTraNhapKhachHangThuocKeDon() {
        if (radKeDon.isSelected()) {
            if (txtSdt.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Nhập số điện thoại của khách hàng.");
                txtSdt.requestFocus();
                return false;
            }

            if (txtTenkh.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Nhập tên của khách hàng.");
                txtTenkh.requestFocus();
                return false;
            }

            if (txtDChi.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "Nhập địa chỉ của khách hàng.");
                txtDChi.requestFocus();
                return false;
            }
        } else if (!radKeDon.isSelected()) {
            return false;
        }

        return true;
    }

    public void xoaHetDuLieuTrenTableModel() {
        tablemodel.addRow(new Object[0]);
        tablemodel = (DefaultTableModel)this.table.getModel();
        tablemodel.getDataVector().removeAllElements();
    }

    public void xoaTrangTxt() {
        txtSdt.setText("");
        txtHoKh.setText("");
        txtTenkh.setText("");
        txtDChi.setText("");
        txtCMND.setText("");
    }

    public void setDuLieuFrmInHd(String maHoaDon, String loaiHoaDon, String ngayLap, String hoTenKh, String namSinh, String gioiTinh, String soDT, String diaChi, String soLuong, String tongTienThuoc, String tongTienThanhToan, String tenNguoiBan, String tenKhachHang) {
        FrmXuatHD.lblMaHD.setText(maHoaDon);
        FrmXuatHD.lblLoaiHD1.setText(loaiHoaDon);
        FrmXuatHD.lblNgayLap1.setText(ngayLap);
        FrmXuatHD.lblTenKH1.setText(tenKhachHang);
        FrmXuatHD.lblGTinh1.setText(gioiTinh);
        FrmXuatHD.lblDCKH1.setText(diaChi);
        FrmXuatHD.lblNamSinh1.setText(namSinh);
        FrmXuatHD.lblsdtkh1.setText(soDT);
        FrmXuatHD.lblTongTThuoc.setText(tongTienThuoc);
        FrmXuatHD.lblTongT.setText(tongTienThanhToan);
        FrmXuatHD.lblNguoiBan.setText(tenNguoiBan);
        FrmXuatHD.lblNguoiMuaHang1.setText(tenKhachHang);
    }

    public void themHoaDonVaChiTietHoaDonKeDon() {
        this.themHoaDonKeDon();
        new ChiTietHoaDon();
        ArrayList<ChiTietHoaDon> listCT_HD = new ArrayList();
        List data = tablemodel.getDataVector();
        Object[] list1 = data.toArray();
        String maHoaDon = lapHoaDonDAO.maHoaDon(lapHoaDonDAO.maNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        int stt = 0;

        for(int k = 0; k < list1.length; ++k) {
            try {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(maHoaDon, Integer.parseInt(tablemodel.getValueAt(k, 1).toString()), Float.parseFloat(tablemodel.getValueAt(k, 6).toString()), Float.parseFloat(tablemodel.getValueAt(k, 8).toString()), Integer.parseInt(tablemodel.getValueAt(k, 7).toString()), tablemodel.getValueAt(k, 4).toString());
                listCT_HD.add(chiTietHoaDon);
                DefaultTableModel var10000 = FrmXuatHD.tableModel;
                Object[] var10001 = new Object[7];
                ++stt;
                var10001[0] = stt;
                var10001[1] = tablemodel.getValueAt(k, 2).toString();
                var10001[2] = tablemodel.getValueAt(k, 4);
                var10001[3] = tablemodel.getValueAt(k, 6);
                var10001[4] = tablemodel.getValueAt(k, 7);
                var10001[5] = tablemodel.getValueAt(k, 8);
                var10001[6] = tablemodel.getValueAt(k, 9);
                var10000.addRow(var10001);
            } catch (Exception var9) {
                var9.printStackTrace();
            }
        }

        Iterator var8 = listCT_HD.iterator();

        while(var8.hasNext()) {
            ChiTietHoaDon hoaDon = (ChiTietHoaDon)var8.next();
            lapHoaDonDAO.addCT_HoaDon(hoaDon.getMaHoaDon(), hoaDon.getMaThuoc(), hoaDon.getDonGia(), hoaDon.getGiamGia(), hoaDon.getSoLuong(), hoaDon.getDonViTinh());
        }

        this.btnInHd.setEnabled(false);
        this.frmXuatHD.setVisible(true);
        this.frmXuatHD.setLocationRelativeTo((Component)null);
        this.frmXuatHD.printingHoaDon();
    }

    public void themHoaDonVaChiTietHoaDonKhongKeDon() {
        this.addHoaDon();
        new ChiTietHoaDon();
        ArrayList<ChiTietHoaDon> listCT_HD = new ArrayList();
        List data = tablemodel.getDataVector();
        Object[] list1 = data.toArray();
        String maHoaDon = lapHoaDonDAO.maHoaDon(lapHoaDonDAO.maNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        System.out.println(list1.length);
        int stt = 0;

        int maNhanVien;
        for(maNhanVien = 0; maNhanVien < list1.length; ++maNhanVien) {
            try {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(maHoaDon, Integer.parseInt(tablemodel.getValueAt(maNhanVien, 1).toString()), Float.parseFloat(tablemodel.getValueAt(maNhanVien, 6).toString()), Float.parseFloat(tablemodel.getValueAt(maNhanVien, 8).toString()), Integer.parseInt(tablemodel.getValueAt(maNhanVien, 7).toString()), tablemodel.getValueAt(maNhanVien, 4).toString());
                listCT_HD.add(chiTietHoaDon);
                DefaultTableModel var10000 = FrmXuatHD.tableModel;
                Object[] var10001 = new Object[7];
                ++stt;
                var10001[0] = stt;
                var10001[1] = tablemodel.getValueAt(maNhanVien, 2).toString();
                var10001[2] = tablemodel.getValueAt(maNhanVien, 4);
                var10001[3] = tablemodel.getValueAt(maNhanVien, 6);
                var10001[4] = tablemodel.getValueAt(maNhanVien, 7);
                var10001[5] = tablemodel.getValueAt(maNhanVien, 8);
                var10001[6] = tablemodel.getValueAt(maNhanVien, 9);
                var10000.addRow(var10001);
            } catch (Exception var9) {
                var9.printStackTrace();
            }
        }

        Iterator var8 = listCT_HD.iterator();

        while(var8.hasNext()) {
            ChiTietHoaDon hoaDon = (ChiTietHoaDon)var8.next();
            lapHoaDonDAO.addCT_HoaDon(hoaDon.getMaHoaDon(), hoaDon.getMaThuoc(), hoaDon.getDonGia(), hoaDon.getGiamGia(), hoaDon.getSoLuong(), hoaDon.getDonViTinh());
        }

        this.btnInHd.setEnabled(false);
        maNhanVien = Integer.parseInt(lapHoaDonDAO.maNhanVien(FrmDangNhap.taiKhoan.getTenTaiKhoan()));
        this.setDuLieuFrmInHd(lapHoaDonDAO.maHoaDon(String.valueOf(maNhanVien)), "Không kê đơn", txtNgay.getText(), "", "", "", "", "", "", txtTongTienThuoc.getText(), txtTongThanhToan.getText(), LapHoaDonDAO.tenNhanVien(txtNhanVien.getText()), "");
        FrmXuatHD.lblSL.setText(String.valueOf(i));
        this.frmXuatHD.setVisible(true);
        this.frmXuatHD.setLocationRelativeTo((Component)null);
        this.frmXuatHD.printingHoaDon();
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        new ChiTietHoaDon();
        new ArrayList();
        String tenThuoc;
        int row;
        int soLuongThuocMoi;
        int soLuongThuocCuMoi;
        if (obj.equals(this.btnThemThuocTim)) {
            Object objTenThuoc = cboTimKiemThuoc.getSelectedItem();
            tenThuoc = String.valueOf(objTenThuoc);
            System.out.println(tenThuoc);
            if (!this.kiemTraTrungThuoc(tenThuoc)) {
                if (this.updateTableChonThuoc(tenThuoc)) {
                    this.frmChonThuoc.setVisible(true);
                    this.frmChonThuoc.setLocationRelativeTo((Component)null);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Thuốc đã có trong bảng ! Vui lòng nhập số lượng.");
                boolean check = true;
                row = this.table.getSelectedRow();
                soLuongThuocMoi = (Integer)this.table.getValueAt(row, 1);

                while(check) {
                    try {
                        String soLuongThuocObj = JOptionPane.showInputDialog("Nhập số lượng thuốc mua.", 1);
                        if (soLuongThuocObj == null) {
                            check = false;
                        } else if (soLuongThuocObj != null) {
                            if (soLuongThuocObj.matches("^[0-9]+$")) {
                                soLuongThuocCuMoi = Integer.parseInt(soLuongThuocObj.toString());
                                int soLuongThuocCu = Integer.parseInt(this.table.getValueAt(row, 7).toString());
                                if (LapHoaDonDAO.soLuongThuocDaBan(soLuongThuocMoi) + soLuongThuocCuMoi + soLuongThuocCu <= lapHoaDonDAO.soLuongNhap(soLuongThuocMoi)) {
                                    soLuongThuocCuMoi = soLuongThuocCuMoi + soLuongThuocCu;
                                    this.table.setValueAt(soLuongThuocCuMoi, row, 7);
                                    check = false;
                                } else {
                                    JOptionPane.showMessageDialog(this, "Số Lượng Thuốc Cần Mua Vượt Giới Hạn Thuốc Trong Kho!\n Nhập Số Lượng Ít Hơn " + (lapHoaDonDAO.soLuongNhap(soLuongThuocMoi) - (LapHoaDonDAO.soLuongThuocDaBan(soLuongThuocMoi) + soLuongThuocCu)));
                                }
                            } else {
                                JOptionPane.showMessageDialog((Component)null, "Số Lượng Phải Nhập Bằng Chữ!");
                                check = true;
                            }
                        }
                    } catch (NullPointerException var17) {
                    } catch (NumberFormatException var18) {
                        var18.printStackTrace();
                        JOptionPane.showMessageDialog((Component)null, "Số Lượng Nhập Quá Lớn!");
                    }
                }
            }
        } else if (obj.equals(this.btnInHd)) {
            Object o = JOptionPane.showConfirmDialog(this, "Bạn có chăc chắn in hóa đơn?");
            tenThuoc = o.toString();
            if (tenThuoc.equalsIgnoreCase("0")) {
                if (this.kiemTraNhapKhachHangThuocKeDon()) {
                    this.themHoaDonVaChiTietHoaDonKeDon();
                } else if (radKhongKeDon.isSelected() && !txtSdt.getText().equalsIgnoreCase("")) {
                    this.themHoaDonVaChiTietHoaDonKeDon();
                } else if (radKhongKeDon.isSelected() && txtSdt.getText().equalsIgnoreCase("")) {
                    this.themHoaDonVaChiTietHoaDonKhongKeDon();
                }
            }
        } else {
            double tongTien;
            Vector data;
            Object[] list1;
            int soLuongThuocCu;
            double tong;
            if (obj.equals(this.btnXoa)) {
                try {
                    row = this.table.getSelectedRow();
                    if (row != -1) {
                        tablemodel.removeRow(row);
                        --i;
                        if (!this.kiemTraThuocKeDon()) {
                            radKhongKeDon.setSelected(true);
                            radKeDon.setSelected(false);
                            lblThongBao.setText("");
                        }

                        tongTien = 0.0D;
                        data = tablemodel.getDataVector();
                        list1 = data.toArray();

                        for(soLuongThuocCu = 0; soLuongThuocCu < list1.length; ++soLuongThuocCu) {
                            tong = Double.parseDouble(tablemodel.getValueAt(soLuongThuocCu, 9).toString());
                            tongTien += tong;
                        }

                        txtTongTienThuoc.setText(String.valueOf(tongTien));
                    }
                } catch (Exception var20) {
                    var20.printStackTrace();
                }
            } else if (obj.equals(cboGiamGia1)) {
                DecimalFormat tien = new DecimalFormat("#,##0.00");
                tongTien = Double.parseDouble(txtTongTienThuoc.getText());
                row = Integer.parseInt(cboGiamGia1.getSelectedItem().toString());
                if (row == 0) {
                    tongThanhToan = (float)(tongTien + tongTien * 0.05D);
                    txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
                } else if (row != 0) {
                    tongThanhToan = (float)(tongTien - tongTien * (double)row / 100.0D + (tongTien - tongTien * (double)row / 100.0D) * 0.05D);
                    txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
                }
            } else if (obj.equals(this.btnThemHoaDon)) {
                tablemodel.addRow(new Object[0]);
                tablemodel = (DefaultTableModel)this.table.getModel();
                tablemodel.getDataVector().removeAllElements();
                this.btnInHd.setEnabled(true);
                radKeDon.setSelected(false);
                radKhongKeDon.setSelected(false);
                this.xoaTrangTxt();
                FrmXuatHD.lblMaHD.setText("");
                FrmXuatHD.lblLoaiHD1.setText("");
                FrmXuatHD.lblNgayLap1.setText("");
                FrmXuatHD.lblTenKH1.setText("");
                FrmXuatHD.lblGioiTinh.setText("");
                FrmXuatHD.lblDCKH1.setText("");
                FrmXuatHD.lblNamSinh1.setText("");
                FrmXuatHD.lblsdtkh1.setText("");
                FrmXuatHD.lblTongTThuoc.setText("");
                FrmXuatHD.lblTongT.setText("");
                FrmXuatHD.lblNguoiBan.setText("");
                FrmXuatHD.lblNguoiMuaHang1.setText("");
                FrmXuatHD.tableModel.addRow(new Object[0]);
                FrmXuatHD.tableModel = (DefaultTableModel)FrmXuatHD.table.getModel();
                FrmXuatHD.tableModel.getDataVector().removeAllElements();
                i = 0;
                txtTongTienThuoc.setText("");
                txtTongThanhToan.setText("");
                setLoaiThuoc = "";
            } else if (obj.equals(this.mntmSoLuong)) {
                boolean check = true;
                row = this.table.getSelectedRow();
                int maThuoc = (Integer)this.table.getValueAt(row, 1);

                while(check) {
                    try {
                        String soLuongThuocObj = JOptionPane.showInputDialog("Nhập số lượng thuốc mua.", 1);
                        if (soLuongThuocObj == null) {
                            check = false;
                        } else if (soLuongThuocObj != null) {
                            if (soLuongThuocObj.matches("^[0-9]+$")) {
                                soLuongThuocMoi = Integer.parseInt(soLuongThuocObj.toString());
                                soLuongThuocCu = Integer.parseInt(this.table.getValueAt(row, 7).toString());
                                if (LapHoaDonDAO.soLuongThuocDaBan(maThuoc) + soLuongThuocMoi + soLuongThuocCu <= lapHoaDonDAO.soLuongNhap(maThuoc)) {
                                    soLuongThuocCuMoi = soLuongThuocMoi + soLuongThuocCu;
                                    this.table.setValueAt(soLuongThuocCuMoi, row, 7);
                                    check = false;
                                } else {
                                    JOptionPane.showMessageDialog(this, "Số Lượng Thuốc Cần Mua Vượt Giới Hạn Thuốc Trong Kho!\n Nhập Số Lượng Ít Hơn " + (lapHoaDonDAO.soLuongNhap(maThuoc) - (LapHoaDonDAO.soLuongThuocDaBan(maThuoc) + soLuongThuocCu)));
                                }
                            } else {
                                JOptionPane.showMessageDialog((Component)null, "Số Lượng Phải Nhập Bằng Chữ!");
                                check = true;
                            }
                        }
                    } catch (NullPointerException var14) {
                    } catch (NumberFormatException var15) {
                        var15.printStackTrace();
                        JOptionPane.showMessageDialog((Component)null, "Số Lượng Nhập Quá Lớn!");
                        check = true;
                    } catch (ArrayIndexOutOfBoundsException var16) {
                        JOptionPane.showMessageDialog(this, "Chọn Vào Thuốc Cần Thêm Số Lượng!");
                    }
                }
            } else if (obj.equals(this.mntmXoa)) {
                try {
                    row = this.table.getSelectedRow();
                    if (row != -1) {
                        tablemodel.removeRow(row);
                        --i;
                        if (!this.kiemTraThuocKeDon()) {
                            radKhongKeDon.setSelected(true);
                            radKeDon.setSelected(false);
                            lblThongBao.setText("");
                        }

                        tongTien = 0.0D;
                        data = tablemodel.getDataVector();
                        list1 = data.toArray();

                        for(soLuongThuocCu = 0; soLuongThuocCu < list1.length; ++soLuongThuocCu) {
                            tong = Double.parseDouble(tablemodel.getValueAt(soLuongThuocCu, 9).toString());
                            tongTien += tong;
                        }

                        txtTongTienThuoc.setText(String.valueOf(tongTien));
                    }
                } catch (Exception var19) {
                    var19.printStackTrace();
                }
            }
        }

    }

    public static void updateTongTien() {
        DecimalFormat tien = new DecimalFormat("#,##0.00");
        int soLuong = 0;
        double donGia = 0.0D;
        double thanhTien = 0.0D;
        double tongTien = 0.0D;
        int giamGia1 = Integer.parseInt(cboGiamGia1.getSelectedItem().toString());
        List data = tablemodel.getDataVector();
        Object[] list1 = data.toArray();

        for(int k = 0; k < list1.length; ++k) {
            double tong = Double.parseDouble(tablemodel.getValueAt(k, 9).toString());
            tongTien += tong;
        }

        txtTongTienThuoc.setText(String.valueOf(tongTien));
        if (giamGia1 == 0) {
            tongThanhToan = (float)(tongTien + tongTien * 0.05D);
            txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
        } else if (giamGia1 != 0) {
            tongThanhToan = (float)(tongTien - tongTien * (double)giamGia1 / 100.0D + (tongTien - tongTien * (double)giamGia1 / 100.0D) * 0.05D);
            txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
        }

    }

    public void tableChanged(TableModelEvent e) {
        DecimalFormat tien = new DecimalFormat("#,##0.00");
        int row = e.getFirstRow();
        int col = e.getColumn();
        int soLuong = 0;
        double donGia = 0.0D;
        double thanhTien = 0.0D;

        try {
            int giamGia = Integer.parseInt(tablemodel.getValueAt(row, 8).toString());
            if ((col == 7 || col == 8) && giamGia == 0) {
                soLuong = Integer.parseInt(tablemodel.getValueAt(row, 7).toString());
                donGia = Double.parseDouble(tablemodel.getValueAt(row, 6).toString());
                thanhTien = (double)soLuong * donGia;
                tablemodel.setValueAt(thanhTien, row, 9);
            } else if ((col == 7 || col == 8) && giamGia != 0) {
                soLuong = Integer.parseInt(tablemodel.getValueAt(row, 7).toString());
                donGia = Double.parseDouble(tablemodel.getValueAt(row, 6).toString());
                thanhTien = (double)soLuong * donGia - (double)soLuong * donGia * (double)giamGia / 100.0D;
                tablemodel.setValueAt(thanhTien, row, 9);
            } else if (col == 9) {
                double tongTien = 0.0D;
                int giamGia1 = Integer.parseInt(cboGiamGia1.getSelectedItem().toString());
                List data = tablemodel.getDataVector();
                Object[] list1 = data.toArray();

                for(int k = 0; k < list1.length; ++k) {
                    double tong = Double.parseDouble(tablemodel.getValueAt(k, 9).toString());
                    tongTien += tong;
                }

                txtTongTienThuoc.setText(String.valueOf(tongTien));
                if (giamGia1 == 0) {
                    tongThanhToan = (float)(tongTien + tongTien * 0.05D);
                    txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
                } else if (giamGia1 != 0) {
                    tongThanhToan = (float)(tongTien - tongTien * (double)giamGia1 / 100.0D + (tongTien - tongTien * (double)giamGia1 / 100.0D) * 0.05D);
                    txtTongThanhToan.setText(tien.format((double)tongThanhToan) + " VNĐ");
                }
            }
        } catch (Exception var19) {
        }

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    this.showMenu(e);
                }

            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    this.showMenu(e);
                }

            }

            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
