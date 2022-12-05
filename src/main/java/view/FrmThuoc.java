//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import dao.ConectDatabase;
import dao.NhaCungCapDAO;
import dao.ThuocDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import model.Thuoc;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class FrmThuoc extends JFrame {
    public static JPanel contentPane;
    private JTextField txtThuoc_Ma;
    private JTextField txtThuoc_Ten;
    private JTextField txtThuoc_SDK;
    private JTextField txtThuoc_GiaNhap;
    private JTextField txtThuoc_DonGia;
    private JTextField txtThuoc_SLN;
    private JTextField txtThuoc_QuyCach;
    private JTextField txtThuoc_TieuChuan;
    private JTable tblThuoc;
    private JTextField txtThuoc_DBC;
    private DefaultTableModel tbModel = new DefaultTableModel();
    private JComboBox cmbDonViTinh;
    private JComboBox cmbPhanLoai;
    private JComboBox cmbTrangThai;
    private JComboBox cmbNhomThuoc;
    private JComboBox cmbTim;
    public static JComboBox cmbNCC;
    private JDateChooser dateNgaySX;
    private JDateChooser dateHanSD;
    private ThuocDAO dao = new ThuocDAO();
    private NhaCungCapDAO dao_NCC = new NhaCungCapDAO();
    private JTextField txtHoatChat;
    private JTextField txtHamLuong;
    private String filename = null;
    private byte[] imageThuoc;
    private JLabel lblAnhThuoc;
    private JRadioButton radPhanLoai;
    private JRadioButton radMa;
    private JRadioButton radNhomThuoc;
    private JRadioButton radNCC;
    private JRadioButton radTenThuoc;
    private DefaultComboBoxModel cboModeNCC = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModePhanLoai = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeDonViTinh = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTrangThai = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeNhomThuoc = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTim = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeMa = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTenThuoc = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTimPhanLoai = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTimNhomThuoc = new DefaultComboBoxModel();
    private DefaultComboBoxModel cboModeTimNCC = new DefaultComboBoxModel();
    private JButton btnLamMoi;
    private List<String> listPhanLoai = new ArrayList();
    private List<String> listDonViTinh = new ArrayList();
    private List<String> listNhomThuoc = new ArrayList();
    private List<String> listTrangThai = new ArrayList();
    private List<String> listNCC = new ArrayList();
    private List<String> listMa = new ArrayList();
    private List<String> listTenThuoc = new ArrayList();
    private List<String> listTimPhanLoai = new ArrayList();
    private List<String> listTimNhomThuoc = new ArrayList();
    private List<String> listTimNCC = new ArrayList();
    public static JButton btnThem;
    public static JButton btnThemNCC;
    public static JButton btnThemNhomThuoc;
    public static JButton btnThemPhanLoai;
    public static JButton btnThemTrangThai;
    public static JButton btnThemDVT;
    public static JPanel pnlChucNang;
    public static JButton btnXoa;
    public static JButton btnLuu;
    public static JButton btnSua;
    private int trangThaiThem = 0;
    private int trangThaiSua = 0;
    private FrmThemNhaCungCap frmthemNCC = new FrmThemNhaCungCap();

    public FrmThuoc() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1351, 686);
        this.setLocationRelativeTo((Component)null);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.controlHighlight);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager)null);
        JPanel pnl_Thuoc = new JPanel();
        pnl_Thuoc.setBackground(SystemColor.controlHighlight);
        pnl_Thuoc.setBounds(10, -23, 1323, 684);
        contentPane.add(pnl_Thuoc);
        pnl_Thuoc.setLayout((LayoutManager)null);
        JPanel pnlNoiDung = new JPanel();
        pnlNoiDung.setBackground(SystemColor.controlHighlight);
        pnlNoiDung.setBorder(new TitledBorder(new EtchedBorder(1, new Color(255, 255, 255), new Color(160, 160, 160)), "Nội dung quản lý", 4, 2, (Font)null, Color.BLACK));
        pnlNoiDung.setBounds(20, 70, 604, 240);
        pnl_Thuoc.add(pnlNoiDung);
        pnlNoiDung.setLayout((LayoutManager)null);
        JLabel lblThuoc_Ten = new JLabel("Mã :");
        lblThuoc_Ten.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_Ten.setBounds(10, 23, 53, 30);
        pnlNoiDung.add(lblThuoc_Ten);
        this.txtThuoc_Ma = new JTextField();
        this.txtThuoc_Ma.setEditable(false);
        this.txtThuoc_Ma.setBounds(105, 23, 197, 30);
        pnlNoiDung.add(this.txtThuoc_Ma);
        this.txtThuoc_Ma.setColumns(10);
        JLabel lblTen = new JLabel("Tên:\r\n");
        lblTen.setFont(new Font("Tahoma", 1, 10));
        lblTen.setBounds(307, 23, 53, 30);
        pnlNoiDung.add(lblTen);
        this.txtThuoc_Ten = new JTextField();
        this.txtThuoc_Ten.setEditable(false);
        this.txtThuoc_Ten.setColumns(10);
        this.txtThuoc_Ten.setBounds(390, 23, 210, 30);
        pnlNoiDung.add(this.txtThuoc_Ten);
        JLabel lblThuoc_SDK = new JLabel("Số đăng ký:\r\n");
        lblThuoc_SDK.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_SDK.setBounds(10, 56, 71, 30);
        pnlNoiDung.add(lblThuoc_SDK);
        this.txtThuoc_SDK = new JTextField();
        this.txtThuoc_SDK.setEditable(false);
        this.txtThuoc_SDK.setColumns(10);
        this.txtThuoc_SDK.setBounds(105, 56, 197, 30);
        pnlNoiDung.add(this.txtThuoc_SDK);
        JLabel lblThuoc_NCC = new JLabel("Nhà Cung Cấp:");
        lblThuoc_NCC.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_NCC.setBounds(307, 56, 86, 30);
        pnlNoiDung.add(lblThuoc_NCC);
        JLabel lblThuoc_NgSX = new JLabel("Ngày sản xuất :");
        lblThuoc_NgSX.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_NgSX.setBounds(10, 90, 86, 30);
        pnlNoiDung.add(lblThuoc_NgSX);
        JLabel lblThuoc_HSD = new JLabel("Hạn sự dụng:\r\n");
        lblThuoc_HSD.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_HSD.setBounds(307, 89, 76, 30);
        pnlNoiDung.add(lblThuoc_HSD);
        JLabel lblThuoc_DVT = new JLabel("Đơn vị tính:");
        lblThuoc_DVT.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_DVT.setBounds(10, 125, 86, 30);
        pnlNoiDung.add(lblThuoc_DVT);
        JLabel lblThuoc_GiaNhap = new JLabel("Giá nhập:\r\n");
        lblThuoc_GiaNhap.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_GiaNhap.setBounds(307, 125, 76, 30);
        pnlNoiDung.add(lblThuoc_GiaNhap);
        this.txtThuoc_GiaNhap = new JTextField();
        this.txtThuoc_GiaNhap.setEditable(false);
        this.txtThuoc_GiaNhap.setColumns(10);
        this.txtThuoc_GiaNhap.setBounds(390, 125, 210, 30);
        pnlNoiDung.add(this.txtThuoc_GiaNhap);
        JLabel lblThuoc_DonGia = new JLabel("Đơn giá:");
        lblThuoc_DonGia.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_DonGia.setBounds(10, 160, 71, 30);
        pnlNoiDung.add(lblThuoc_DonGia);
        this.txtThuoc_DonGia = new JTextField();
        this.txtThuoc_DonGia.setEditable(false);
        this.txtThuoc_DonGia.setColumns(10);
        this.txtThuoc_DonGia.setBounds(105, 160, 197, 30);
        pnlNoiDung.add(this.txtThuoc_DonGia);
        JLabel lblThuoc_SLN = new JLabel("Số lượng nhập:\r\n");
        lblThuoc_SLN.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_SLN.setBounds(307, 160, 86, 30);
        pnlNoiDung.add(lblThuoc_SLN);
        this.txtThuoc_SLN = new JTextField();
        this.txtThuoc_SLN.setEditable(false);
        this.txtThuoc_SLN.setColumns(10);
        this.txtThuoc_SLN.setBounds(390, 160, 210, 30);
        pnlNoiDung.add(this.txtThuoc_SLN);
        cmbNCC = new JComboBox();
        cmbNCC.setBounds(390, 55, 178, 30);
        pnlNoiDung.add(cmbNCC);
        this.cmbDonViTinh = new JComboBox();
        this.cmbDonViTinh.setForeground(new Color(0, 0, 0));
        this.cmbDonViTinh.setBackground(new Color(255, 255, 255));
        this.cmbDonViTinh.setBounds(105, 125, 166, 30);
        pnlNoiDung.add(this.cmbDonViTinh);
        btnThemNCC = new JButton("");
        btnThemNCC.setBounds(570, 56, 30, 30);
        pnlNoiDung.add(btnThemNCC);
        btnThemNCC.setIcon(new ImageIcon("Hinh\\add.png"));
        btnThemDVT = new JButton("");
        btnThemDVT.setForeground(new Color(0, 255, 0));
        btnThemDVT.setIcon(new ImageIcon("Hinh\\add.png"));
        btnThemDVT.setBounds(273, 125, 30, 30);
        pnlNoiDung.add(btnThemDVT);
        JLabel lblTrangThai = new JLabel("Trạng thái:");
        lblTrangThai.setFont(new Font("Tahoma", 1, 11));
        lblTrangThai.setBounds(10, 197, 71, 30);
        pnlNoiDung.add(lblTrangThai);
        this.cmbTrangThai = new JComboBox();
        this.cmbTrangThai.setBounds(105, 197, 166, 30);
        pnlNoiDung.add(this.cmbTrangThai);
        btnThemTrangThai = new JButton("");
        btnThemTrangThai.setIcon(new ImageIcon("Hinh\\add.png"));
        btnThemTrangThai.setBounds(273, 197, 30, 30);
        pnlNoiDung.add(btnThemTrangThai);
        JLabel lblThuoc_PhanLoai = new JLabel("Phân loại:");
        lblThuoc_PhanLoai.setBounds(307, 197, 61, 30);
        pnlNoiDung.add(lblThuoc_PhanLoai);
        lblThuoc_PhanLoai.setFont(new Font("Tahoma", 1, 11));
        this.cmbPhanLoai = new JComboBox();
        this.cmbPhanLoai.setBounds(390, 196, 176, 30);
        pnlNoiDung.add(this.cmbPhanLoai);
        btnThemPhanLoai = new JButton("");
        btnThemPhanLoai.setBounds(570, 197, 30, 30);
        pnlNoiDung.add(btnThemPhanLoai);
        btnThemPhanLoai.setIcon(new ImageIcon("Hinh\\add.png"));
        this.dateNgaySX = new JDateChooser();
        this.dateNgaySX.setLocale(new Locale("vi", "VN"));
        this.dateNgaySX.setDateFormatString("dd-MM-yyyy");
        this.dateNgaySX.setBounds(105, 90, 197, 30);
        JTextFieldDateEditor editor = (JTextFieldDateEditor)this.dateNgaySX.getDateEditor();
        editor.setEditable(false);
        pnlNoiDung.add(this.dateNgaySX);
        this.dateHanSD = new JDateChooser();
        this.dateHanSD.setLocale(new Locale("vi", "VN"));
        this.dateHanSD.setDateFormatString("dd-MM-yyyy");
        this.dateHanSD.setBounds(390, 90, 210, 30);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor)this.dateHanSD.getDateEditor();
        editor2.setEditable(false);
        pnlNoiDung.add(this.dateHanSD);
        JPanel pnlTTThuoc = new JPanel();
        pnlTTThuoc.setBackground(SystemColor.controlHighlight);
        pnlTTThuoc.setBorder(new TitledBorder((Border)null, "Thông tin thuốc", 4, 2, (Font)null, (Color)null));
        pnlTTThuoc.setBounds(634, 70, 679, 240);
        pnl_Thuoc.add(pnlTTThuoc);
        pnlTTThuoc.setLayout((LayoutManager)null);
        JLabel lblThuoc_QuyCach = new JLabel("Quy cách đóng gói :");
        lblThuoc_QuyCach.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_QuyCach.setBounds(314, 28, 109, 30);
        pnlTTThuoc.add(lblThuoc_QuyCach);
        this.txtThuoc_QuyCach = new JTextField();
        this.txtThuoc_QuyCach.setEditable(false);
        this.txtThuoc_QuyCach.setColumns(10);
        this.txtThuoc_QuyCach.setBounds(434, 28, 198, 30);
        pnlTTThuoc.add(this.txtThuoc_QuyCach);
        JLabel lblThuoc_TieuChuan = new JLabel("Tiêu chuẩn:");
        lblThuoc_TieuChuan.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_TieuChuan.setBounds(314, 62, 81, 30);
        pnlTTThuoc.add(lblThuoc_TieuChuan);
        this.txtThuoc_TieuChuan = new JTextField();
        this.txtThuoc_TieuChuan.setEditable(false);
        this.txtThuoc_TieuChuan.setColumns(10);
        this.txtThuoc_TieuChuan.setBounds(434, 62, 198, 30);
        pnlTTThuoc.add(this.txtThuoc_TieuChuan);
        JLabel lblThuoc_HamLuong = new JLabel("Nồng Độ- hàm lượng:\r\n");
        lblThuoc_HamLuong.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_HamLuong.setBounds(314, 97, 120, 30);
        pnlTTThuoc.add(lblThuoc_HamLuong);
        JLabel lblThuoc_DBC = new JLabel("Dạng bào chế:");
        lblThuoc_DBC.setFont(new Font("Tahoma", 1, 11));
        lblThuoc_DBC.setBounds(10, 62, 89, 30);
        pnlTTThuoc.add(lblThuoc_DBC);
        this.txtThuoc_DBC = new JTextField();
        this.txtThuoc_DBC.setEditable(false);
        this.txtThuoc_DBC.setColumns(10);
        this.txtThuoc_DBC.setBounds(98, 62, 208, 30);
        pnlTTThuoc.add(this.txtThuoc_DBC);
        JLabel lblHoatChat = new JLabel("Hoạt Chất");
        lblHoatChat.setFont(new Font("Tahoma", 1, 11));
        lblHoatChat.setBounds(10, 97, 89, 30);
        pnlTTThuoc.add(lblHoatChat);
        this.txtHoatChat = new JTextField();
        this.txtHoatChat.setEditable(false);
        this.txtHoatChat.setColumns(10);
        this.txtHoatChat.setBounds(98, 97, 208, 30);
        pnlTTThuoc.add(this.txtHoatChat);
        this.txtHamLuong = new JTextField();
        this.txtHamLuong.setEditable(false);
        this.txtHamLuong.setBounds(434, 97, 198, 30);
        pnlTTThuoc.add(this.txtHamLuong);
        this.txtHamLuong.setColumns(10);
        this.lblAnhThuoc = new JLabel("");
        this.lblAnhThuoc.setToolTipText("ảnh thuốc.");
        this.lblAnhThuoc.setForeground(Color.WHITE);
        this.lblAnhThuoc.setBackground(Color.WHITE);
        this.lblAnhThuoc.setBounds(98, 139, 297, 88);
        pnlTTThuoc.add(this.lblAnhThuoc);
        JLabel lblHinhAnh = new JLabel("Hình Ảnh:\r\n");
        lblHinhAnh.setFont(new Font("Tahoma", 1, 11));
        lblHinhAnh.setBounds(10, 160, 89, 30);
        pnlTTThuoc.add(lblHinhAnh);
        JButton btnHinhAnh = new JButton("Chọn ảnh\r\n");
        btnHinhAnh.setBounds(435, 148, 111, 30);
        pnlTTThuoc.add(btnHinhAnh);
        JLabel lblNhomThuoc = new JLabel("Nhóm thuốc:");
        lblNhomThuoc.setFont(new Font("Tahoma", 1, 11));
        lblNhomThuoc.setBounds(10, 23, 89, 30);
        pnlTTThuoc.add(lblNhomThuoc);
        btnThemNhomThuoc = new JButton("");
        btnThemNhomThuoc.setBounds(272, 23, 30, 30);
        pnlTTThuoc.add(btnThemNhomThuoc);
        this.cmbNhomThuoc = new JComboBox();
        this.cmbNhomThuoc.setBounds(98, 23, 172, 30);
        pnlTTThuoc.add(this.cmbNhomThuoc);
        JPanel pnlDsthuoc = new JPanel();
        pnlDsthuoc.setBackground(SystemColor.controlHighlight);
        pnlDsthuoc.setBounds(10, 313, 1313, 206);
        pnl_Thuoc.add(pnlDsthuoc);
        pnlDsthuoc.setLayout((LayoutManager)null);
        this.cboModeTim.addElement("Tìm kiếm theo:");
        this.cboModeTim.addElement("Tìm theo mã thuốc.");
        this.cboModeTim.addElement("Tìm theo tên thuốc.");
        this.cboModeTim.addElement("Tìm theo nhóm thuốc.");
        this.cboModeTim.addElement("Tìm theo phân loại.");
        this.cboModeTim.addElement("Tìm theo nhà cung cấp.");
        JPanel pnl_4_Thuoc = new JPanel();
        pnl_4_Thuoc.setBounds(10, 11, 1293, 191);
        pnlDsthuoc.add(pnl_4_Thuoc);
        pnl_4_Thuoc.setLayout((LayoutManager)null);
        JScrollPane scrollPaneThuoc = new JScrollPane();
        scrollPaneThuoc.setToolTipText("qq\r\n");
        scrollPaneThuoc.setVerticalScrollBarPolicy(22);
        scrollPaneThuoc.setHorizontalScrollBarPolicy(32);
        scrollPaneThuoc.setBounds(10, 11, 1273, 168);
        pnl_4_Thuoc.add(scrollPaneThuoc);
        String[] colsname = new String[]{"STT", "MaThuoc", "SoDangKi", "TenThuoc", "PhanLoai", "Nhóm thuốc", "HoatChat", "NongDo/HamLuong", "DangBaoChe", "QuyCach", "TieuChuan", "NhaCungCap", "NgaySanXuat", "HanSuDung", "DonViTinh", "GiaNhap", "DonGia", "SoLuongNhap", "Trạng thái"};
        this.tbModel = new DefaultTableModel(colsname, 0);
        this.tblThuoc = new JTable(this.tbModel);
        this.tblThuoc.setDefaultEditor(Object.class, (TableCellEditor)null);
        scrollPaneThuoc.setViewportView(this.tblThuoc);
        this.tblThuoc.getColumnModel().getColumn(0).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(1).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(2).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(3).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(4).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(5).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(6).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(7).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(8).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(9).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(10).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(11).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(12).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(13).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(14).setPreferredWidth(120);
        this.tblThuoc.getColumnModel().getColumn(15).setPreferredWidth(120);
        this.tblThuoc.setAutoResizeMode(0);
        this.tblThuoc.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
                try {
                    FrmThuoc.this.hienTable();
                } catch (Exception var3) {
                }

            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseClicked(MouseEvent e) {
            }
        });
        JPanel pnlTitile = new JPanel();
        pnlTitile.setBackground(SystemColor.controlHighlight);
        pnlTitile.setBounds(18, 11, 1295, 48);
        pnl_Thuoc.add(pnlTitile);
        pnlTitile.setLayout((LayoutManager)null);
        JLabel lblTitiel = new JLabel("Quản Lý Thuốc");
        lblTitiel.setBounds(0, 13, 1285, 28);
        pnlTitile.add(lblTitiel);
        lblTitiel.setForeground(Color.RED);
        lblTitiel.setFont(new Font("Tahoma", 1, 20));
        lblTitiel.setHorizontalAlignment(0);
        lblTitiel.setBackground(Color.RED);
        pnlChucNang = new JPanel();
        pnlChucNang.setBackground(SystemColor.controlHighlight);
        pnlChucNang.setBorder(new TitledBorder((Border)null, "Chức năng", 4, 2, (Font)null, (Color)null));
        pnlChucNang.setBounds(10, 521, 1303, 129);
        pnl_Thuoc.add(pnlChucNang);
        pnlChucNang.setLayout((LayoutManager)null);
        btnThem = new JButton("Thêm ");
        btnThem.setBackground(Color.LIGHT_GRAY);
        btnThem.setHorizontalAlignment(2);
        btnThem.setIcon(new ImageIcon("Hinh\\add.png"));
        btnThem.setBounds(10, 93, 102, 30);
        pnlChucNang.add(btnThem);
        btnThem.setFont(new Font("Times New Roman", 1, 12));
        btnXoa = new JButton("Xóa\r\n");
        btnXoa.setBackground(Color.LIGHT_GRAY);
        btnXoa.setIcon(new ImageIcon("Hinh\\delete.png"));
        btnXoa.setHorizontalAlignment(2);
        btnXoa.setBounds(122, 92, 106, 30);
        pnlChucNang.add(btnXoa);
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnXoa.setFont(new Font("Times New Roman", 1, 15));
        btnLuu = new JButton("Lưu");
        btnLuu.setBackground(Color.LIGHT_GRAY);
        btnLuu.setHorizontalAlignment(2);
        btnLuu.setEnabled(false);
        btnLuu.setBounds(354, 92, 106, 30);
        pnlChucNang.add(btnLuu);
        btnLuu.setIcon(new ImageIcon("Hinh\\yes.png"));
        btnLuu.setFont(new Font("Times New Roman", 1, 15));
        JButton btnThoat = new JButton("Thoát");
        btnThoat.setBackground(Color.LIGHT_GRAY);
        btnThoat.setIcon(new ImageIcon("Hinh\\exit.png"));
        btnThoat.setHorizontalAlignment(2);
        btnThoat.setBounds(1175, 92, 118, 30);
        pnlChucNang.add(btnThoat);
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnThoat.setFont(new Font("Times New Roman", 1, 15));
        btnSua = new JButton("Sửa");
        btnSua.setBackground(Color.LIGHT_GRAY);
        btnSua.setHorizontalAlignment(2);
        btnSua.setIcon(new ImageIcon("Hinh\\edit.png"));
        btnSua.setFont(new Font("Times New Roman", 1, 15));
        btnSua.setBounds(238, 92, 106, 30);
        pnlChucNang.add(btnSua);
        this.btnLamMoi = new JButton("LÀM MỚI");
        this.btnLamMoi.setBackground(Color.LIGHT_GRAY);
        this.btnLamMoi.setIcon(new ImageIcon("Hinh\\refresh.png"));
        this.btnLamMoi.setHorizontalAlignment(2);
        this.btnLamMoi.setFont(new Font("Times New Roman", 1, 15));
        this.btnLamMoi.setBounds(483, 92, 132, 30);
        pnlChucNang.add(this.btnLamMoi);
        JPanel panel = new JPanel();
        panel.setLayout((LayoutManager)null);
        panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tìm kiếm hóa đơn", 4, 2, (Font)null, new Color(255, 0, 0)));
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(10, 13, 1283, 72);
        pnlChucNang.add(panel);
        JButton btnTim = new JButton("Tìm kiếm");
        btnTim.setFont(new Font("Times New Roman", 0, 16));
        btnTim.setBounds(976, 16, 127, 25);
        panel.add(btnTim);
        JLabel label = new JLabel("Nhập thông tin tìm kiếm:");
        label.setFont(new Font("Times New Roman", 0, 16));
        label.setBounds(20, 18, 162, 25);
        panel.add(label);
        JLabel label_1 = new JLabel("Tìm theo:");
        label_1.setFont(new Font("Times New Roman", 0, 16));
        label_1.setBounds(30, 43, 63, 25);
        panel.add(label_1);
        this.radNCC = new JRadioButton("Nhà cung cấp");
        this.radNCC.setFont(new Font("Tahoma", 0, 15));
        this.radNCC.setBounds(546, 43, 184, 22);
        panel.add(this.radNCC);
        this.radPhanLoai = new JRadioButton("Phân loại");
        this.radPhanLoai.setFont(new Font("Tahoma", 0, 15));
        this.radPhanLoai.setBounds(918, 43, 184, 22);
        panel.add(this.radPhanLoai);
        this.radMa = new JRadioButton("Mã thuốc");
        this.radMa.setSelected(true);
        this.radMa.setFont(new Font("Tahoma", 0, 15));
        this.radMa.setBounds(174, 43, 184, 22);
        panel.add(this.radMa);
        this.radNhomThuoc = new JRadioButton("Nhóm thuốc");
        this.radNhomThuoc.setFont(new Font("Tahoma", 0, 15));
        this.radNhomThuoc.setBounds(732, 43, 184, 22);
        panel.add(this.radNhomThuoc);
        this.cmbTim = new JComboBox();
        this.cmbTim.setBounds(174, 18, 781, 22);
        panel.add(this.cmbTim);
        this.radTenThuoc = new JRadioButton("Tên thuốc");
        this.radTenThuoc.setFont(new Font("Tahoma", 0, 15));
        this.radTenThuoc.setBounds(360, 43, 184, 22);
        panel.add(this.radTenThuoc);
        ButtonGroup group = new ButtonGroup();
        group.add(this.radMa);
        group.add(this.radNCC);
        group.add(this.radNhomThuoc);
        group.add(this.radPhanLoai);
        group.add(this.radTenThuoc);
        btnHinhAnh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JFileChooser ch = new JFileChooser();
                    ch.showOpenDialog((Component)null);
                    File f = ch.getSelectedFile();
                    FrmThuoc.this.filename = f.getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon((new ImageIcon(FrmThuoc.this.filename)).getImage().getScaledInstance(FrmThuoc.this.lblAnhThuoc.getWidth(), FrmThuoc.this.lblAnhThuoc.getHeight(), 4));
                    FrmThuoc.this.lblAnhThuoc.setIcon(imageIcon);

                    try {
                        File image = new File(FrmThuoc.this.filename);
                        FileInputStream fis = new FileInputStream(image);
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        byte[] b = new byte[2014];

                        int readNum;
                        while((readNum = fis.read(b)) != -1) {
                            bos.write(b, 0, readNum);
                        }

                        FrmThuoc.this.imageThuoc = bos.toByteArray();
                    } catch (Exception var10) {
                    }
                } catch (Exception var11) {
                }

            }
        });
        btnSua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (FrmThuoc.this.trangThaiSua == 0) {
                    FrmThuoc.this.sua();
                } else {
                    FrmThuoc.btnSua.setText("Sữa");
                    FrmThuoc.this.lamMoi();
                    FrmThuoc.this.trangThaiSua = 0;
                    FrmThuoc.btnThem.setEnabled(true);
                    FrmThuoc.btnLuu.setEnabled(false);
                }

            }
        });
        this.btnLamMoi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.lamMoi();
            }
        });
        btnLuu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FrmThuoc.this.luu();
                } catch (ParseException var3) {
                    var3.printStackTrace();
                }

            }
        });
        btnThem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (FrmThuoc.this.trangThaiThem == 0) {
                    FrmThuoc.this.them();
                } else {
                    FrmThuoc.btnThem.setText("Thêm");
                    FrmThuoc.this.lamMoi();
                    FrmThuoc.this.trangThaiThem = 0;
                    FrmThuoc.btnSua.setEnabled(true);
                    FrmThuoc.btnLuu.setEnabled(false);
                }

            }
        });
        btnXoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.xoa();
            }
        });
        btnThemPhanLoai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbPhanLoai.setEditable(true);
                FrmThuoc.this.themPhanLoai();
                FrmThuoc.this.cmbPhanLoai.setEditable(false);
            }
        });
        btnThemDVT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbDonViTinh.setEditable(true);
                FrmThuoc.this.themDonViTinh();
                FrmThuoc.this.cmbDonViTinh.setEditable(false);
            }
        });
        btnThemNhomThuoc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbNhomThuoc.setEditable(true);
                FrmThuoc.this.themNhomThuoc();
                FrmThuoc.this.cmbNhomThuoc.setEditable(false);
            }
        });
        btnThemTrangThai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTrangThai.setEditable(true);
                FrmThuoc.this.themTrangThai();
                FrmThuoc.this.cmbTrangThai.setEditable(false);
            }
        });
        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.timKiem();
            }
        });
        this.radMa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTim.setModel(FrmThuoc.this.cboModeMa);
            }
        });
        this.radNCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTim.setModel(FrmThuoc.this.cboModeTimNCC);
            }
        });
        this.radNhomThuoc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTim.setModel(FrmThuoc.this.cboModeTimNhomThuoc);
            }
        });
        this.radPhanLoai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTim.setModel(FrmThuoc.this.cboModeTimPhanLoai);
            }
        });
        this.radTenThuoc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.cmbTim.setModel(FrmThuoc.this.cboModeTenThuoc);
            }
        });
        btnThemNCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmThuoc.this.frmthemNCC.setVisible(true);
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmManHinhChinh.tabbedPane.remove(FrmThuoc.contentPane);
            }
        });
        AutoCompleteDecorator.decorate(cmbNCC);
        AutoCompleteDecorator.decorate(this.cmbDonViTinh);
        AutoCompleteDecorator.decorate(this.cmbNhomThuoc);
        AutoCompleteDecorator.decorate(this.cmbPhanLoai);
        AutoCompleteDecorator.decorate(this.cmbTrangThai);
        AutoCompleteDecorator.decorate(this.cmbTim);
        this.docDuLieu();
        btnThemDVT.setEnabled(false);
        btnThemNCC.setEnabled(false);
        btnThemNhomThuoc.setEnabled(false);
        btnThemPhanLoai.setEnabled(false);
        btnThemTrangThai.setEnabled(false);
    }

    public void docDuLieu() {
        int d = 1;
        List<Thuoc> list = this.dao.getThuoc();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            Thuoc x = (Thuoc)var4.next();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
            if (!this.listPhanLoai.contains(x.getPhanLoai())) {
                this.cboModePhanLoai.addElement(x.getPhanLoai());
                this.cmbPhanLoai.setModel(this.cboModePhanLoai);
                this.listPhanLoai.add(x.getPhanLoai());
            }

            if (!this.listDonViTinh.contains(x.getDonViTinh())) {
                this.cboModeDonViTinh.addElement(x.getDonViTinh());
                this.cmbDonViTinh.setModel(this.cboModeDonViTinh);
                this.listDonViTinh.add(x.getDonViTinh());
            }

            if (!this.listNhomThuoc.contains(x.getNhomThuoc())) {
                this.cboModeNhomThuoc.addElement(x.getNhomThuoc());
                this.cmbNhomThuoc.setModel(this.cboModeNhomThuoc);
                this.listNhomThuoc.add(x.getNhomThuoc());
            }

            if (!this.listTrangThai.contains(x.getTrangThai())) {
                this.cboModeTrangThai.addElement(x.getTrangThai());
                this.cmbTrangThai.setModel(this.cboModeTrangThai);
                this.listTrangThai.add(x.getTrangThai());
            }

            if (!this.listMa.contains(String.valueOf(x.getMaThuoc()))) {
                this.cboModeMa.addElement(x.getMaThuoc());
                this.listMa.add(String.valueOf(x.getMaThuoc()));
            }

            if (!this.listTenThuoc.contains(x.getTenThuoc())) {
                this.cboModeTenThuoc.addElement(x.getTenThuoc());
                this.listTenThuoc.add(x.getTenThuoc());
            }

            if (!this.listTimPhanLoai.contains(x.getPhanLoai())) {
                this.cboModeTimPhanLoai.addElement(x.getPhanLoai());
                this.listTimPhanLoai.add(x.getPhanLoai());
            }

            if (!this.listTimNhomThuoc.contains(x.getNhomThuoc())) {
                this.cboModeTimNhomThuoc.addElement(x.getNhomThuoc());
                this.listTimNhomThuoc.add(x.getNhomThuoc());
            }
        }

        this.dao.getTenCungCaps().forEach((xx) -> {
            if (!this.listNCC.contains(xx)) {
                this.cboModeNCC.addElement(xx);
                cmbNCC.setModel(this.cboModeNCC);
                this.listNCC.add(xx);
            }

            if (!this.listTimNCC.contains(xx)) {
                this.cboModeTimNCC.addElement(xx);
                this.listTimNCC.add(xx);
            }

        });
    }

    public void hienTable() {
        int row = this.tblThuoc.getSelectedRow();
        this.txtThuoc_Ma.setText(this.tbModel.getValueAt(row, 1).toString());
        this.txtThuoc_SDK.setText(this.tbModel.getValueAt(row, 2).toString());
        this.txtThuoc_Ten.setText(this.tbModel.getValueAt(row, 3).toString());
        this.cmbPhanLoai.setSelectedItem(((Thuoc)this.dao.getThuoc().get(row)).getPhanLoai());
        this.cmbNhomThuoc.setSelectedItem(((Thuoc)this.dao.getThuoc().get(row)).getNhomThuoc());
        this.txtHamLuong.setText(this.tblThuoc.getValueAt(row, 6).toString());
        this.txtHoatChat.setText(this.tblThuoc.getValueAt(row, 7).toString());
        this.txtThuoc_DBC.setText(this.tbModel.getValueAt(row, 8).toString().toString());
        this.txtThuoc_QuyCach.setText(this.tbModel.getValueAt(row, 9).toString());
        this.txtThuoc_TieuChuan.setText(this.tbModel.getValueAt(row, 10).toString());
        cmbNCC.setSelectedItem(this.tbModel.getValueAt(row, 11).toString());
        this.dateNgaySX.setDate(((Thuoc)this.dao.getThuoc().get(row)).getNgaySanXuat());
        this.dateHanSD.setDate(((Thuoc)this.dao.getThuoc().get(row)).getHanSuDung());
        this.cmbDonViTinh.setSelectedItem(this.tbModel.getValueAt(row, 14));
        this.txtThuoc_GiaNhap.setText(this.tbModel.getValueAt(row, 15).toString());
        this.txtThuoc_DonGia.setText(this.tbModel.getValueAt(row, 16).toString());
        this.txtThuoc_SLN.setText(this.tbModel.getValueAt(row, 17).toString());
        this.cmbTrangThai.setSelectedItem(((Thuoc)this.dao.getThuoc().get(row)).getTrangThai());

        try {
            byte[] img = ((Thuoc)this.dao.getThuoc().get(row)).getHinhAnh();
            ImageIcon ima = new ImageIcon((new ImageIcon(img)).getImage().getScaledInstance(this.lblAnhThuoc.getWidth(), this.lblAnhThuoc.getHeight(), 4));
            this.lblAnhThuoc.setIcon(ima);
            this.imageThuoc = img;
        } catch (Exception var5) {
        }

    }

    public void sua() {
        btnThemDVT.setEnabled(true);
        btnThemNCC.setEnabled(true);
        btnThemNhomThuoc.setEnabled(true);
        btnThemPhanLoai.setEnabled(true);
        btnThemTrangThai.setEnabled(true);
        this.txtHamLuong.setEditable(true);
        this.txtHoatChat.setEditable(true);
        this.txtThuoc_DBC.setEditable(true);
        this.txtThuoc_DonGia.setEditable(true);
        this.txtThuoc_GiaNhap.setEditable(true);
        this.txtThuoc_QuyCach.setEditable(true);
        this.txtThuoc_SDK.setEditable(true);
        this.txtThuoc_SLN.setEditable(true);
        this.txtThuoc_Ten.setEditable(true);
        this.txtThuoc_TieuChuan.setEditable(true);
        this.cmbPhanLoai.setSelectedItem("Không kê đơn");
        btnSua.setText("Hủy");
        this.trangThaiSua = 1;
        btnThem.setEnabled(false);
        btnLuu.setEnabled(true);
    }

    public void luu() throws ParseException {
        new SimpleDateFormat("dd-MM-yyyy");
        String maThuoc = this.txtThuoc_Ma.getText().toString();
        String soDangKi = this.txtThuoc_SDK.getText().toString();
        String tenThuoc = this.txtThuoc_Ten.getText().toString();
        String phanLoai = (String)this.cmbPhanLoai.getSelectedItem();
        String nhomThuoc = (String)this.cmbNhomThuoc.getSelectedItem();
        String hoatChat = this.txtHoatChat.getText().toString();
        String hamLuong = this.txtHamLuong.getText().toString();
        String dangBaoChe = this.txtThuoc_DBC.getText().toString();
        String quyCach = this.txtThuoc_QuyCach.getText().toString();
        String tieuChuan = this.txtThuoc_TieuChuan.getText().toString();
        String tenNCC = (String)cmbNCC.getSelectedItem();
        Date ngaySX = this.dateNgaySX.getDate();
        Date ngaySD = this.dateHanSD.getDate();
        String donViTinh = (String)this.cmbDonViTinh.getSelectedItem();
        String gn = this.txtThuoc_GiaNhap.getText().toString();
        String dg = this.txtThuoc_DonGia.getText().toString();
        String sl = this.txtThuoc_SLN.getText().toString();
        String trangThai = (String)this.cmbTrangThai.getSelectedItem();
        if (this.trangThaiThem != 0 && this.trangThaiSua == 0) {
            if (!this.kiemTra()) {
                return;
            }

            this.dao.them(soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, this.dao.getmaNCC(tenNCC), ngaySX, ngaySD, donViTinh, Float.parseFloat(gn), Float.parseFloat(dg), Integer.parseInt(sl), this.imageThuoc, trangThai);
            JOptionPane.showMessageDialog(this, "Thêm thành công ");
            btnThem.setText("Thêm");
            btnSua.setEnabled(true);
            btnLuu.setEnabled(false);
            this.trangThaiThem = 0;
        } else if (this.trangThaiThem == 0 && this.trangThaiSua != 0) {
            if (!this.kiemTra()) {
                return;
            }

            String m = this.txtThuoc_Ma.getText();
            int ma = Integer.parseInt(m);
            this.dao.sua(ma, soDangKi, tenThuoc, phanLoai, nhomThuoc, hoatChat, hamLuong, dangBaoChe, quyCach, tieuChuan, this.dao.getmaNCC(tenNCC), ngaySX, ngaySD, donViTinh, Float.parseFloat(gn), Float.parseFloat(dg), Integer.parseInt(sl), this.imageThuoc, trangThai);
            JOptionPane.showMessageDialog(this, "Sữa Thành Công");
            btnThem.setEnabled(true);
            btnSua.setText("Sửa");
            btnLuu.setEnabled(false);
            this.trangThaiSua = 0;
        }

        this.lamMoi();
    }

    public void themPhanLoai() {
        String moi = JOptionPane.showInputDialog(this, "Phân loại mới");
        this.cmbPhanLoai.setSelectedItem(moi);
    }

    public void themDonViTinh() {
        String moi = JOptionPane.showInputDialog(this, "Đơn vị tính mới");
        this.cmbDonViTinh.setSelectedItem(moi);
    }

    public void themNhomThuoc() {
        String moi = JOptionPane.showInputDialog(this, "Nhóm thuốc mới");
        this.cmbNhomThuoc.setSelectedItem(moi);
    }

    public void themTrangThai() {
        String moi = JOptionPane.showInputDialog(this, "Trạng thái mới");
        this.cmbTrangThai.setSelectedItem(moi);
    }

    public void them() {
        this.lamMoi();
        btnThemDVT.setEnabled(true);
        btnThemNCC.setEnabled(true);
        btnThemNhomThuoc.setEnabled(true);
        btnThemPhanLoai.setEnabled(true);
        btnThemTrangThai.setEnabled(true);
        this.txtHamLuong.setEditable(true);
        this.txtHoatChat.setEditable(true);
        this.txtThuoc_DBC.setEditable(true);
        this.txtThuoc_DonGia.setEditable(true);
        this.txtThuoc_GiaNhap.setEditable(true);
        this.txtThuoc_QuyCach.setEditable(true);
        this.txtThuoc_SDK.setEditable(true);
        this.txtThuoc_SLN.setEditable(true);
        this.txtThuoc_Ten.setEditable(true);
        this.txtThuoc_TieuChuan.setEditable(true);
        btnThem.setText("Hủy");
        this.cmbPhanLoai.setSelectedItem("Không kê đơn");
        this.cmbTrangThai.setSelectedItem("Đang bán");
        this.trangThaiThem = 1;
        btnSua.setEnabled(false);
        btnLuu.setEnabled(true);
    }

    public void xoa() {
        int i = JOptionPane.showConfirmDialog(this, "Bạn có chắ muốn chuyển sang trạng thái ngừng bán");
        if (i == 0) {
            this.dao.xoa(Integer.parseInt(this.txtThuoc_Ma.getText()));
            this.lamMoi();
        } else if (i == 1) {
            return;
        }

    }

    public void xoaTable() {
        this.tbModel.addRow(new Object[0]);
        DefaultTableModel tbl = (DefaultTableModel)this.tblThuoc.getModel();
        tbl.getDataVector().removeAllElements();
    }

    public void lamMoi() {
        this.txtThuoc_Ma.setText("");
        this.txtThuoc_SDK.setText("");
        this.txtThuoc_Ten.setText("");
        this.cmbPhanLoai.setSelectedItem("");
        this.txtHoatChat.setText("");
        this.txtHamLuong.setText("");
        this.txtThuoc_DBC.setText("");
        this.txtThuoc_QuyCach.setText("");
        this.txtThuoc_TieuChuan.setText("");
        cmbNCC.setSelectedItem("");
        this.cmbDonViTinh.setSelectedItem("");
        this.txtThuoc_GiaNhap.setText("");
        this.txtThuoc_DonGia.setText("");
        this.txtThuoc_SLN.setText("");
        this.cmbTrangThai.setSelectedItem("");
        cmbNCC.setSelectedItem("");
        this.cmbDonViTinh.setSelectedItem("");
        this.cmbNhomThuoc.setSelectedItem("");
        this.cmbTrangThai.setSelectedItem("");
        this.txtHamLuong.setEditable(false);
        this.txtHoatChat.setEditable(false);
        this.txtThuoc_DBC.setEditable(false);
        this.txtThuoc_DonGia.setEditable(false);
        this.txtThuoc_GiaNhap.setEditable(false);
        this.txtThuoc_Ma.setEditable(false);
        this.txtThuoc_QuyCach.setEditable(false);
        this.txtThuoc_SDK.setEditable(false);
        this.txtThuoc_SLN.setEditable(false);
        this.txtThuoc_Ten.setEditable(false);
        this.txtThuoc_TieuChuan.setEditable(false);
        this.xoaTable();
        this.docDuLieu();
        this.lblAnhThuoc.setIcon((Icon)null);
        btnSua.setText("Sửa");
        btnSua.setEnabled(true);
        this.trangThaiSua = 0;
        btnThem.setText("Thêm");
        this.trangThaiThem = 0;
        btnThem.setEnabled(true);
        btnThemDVT.setEnabled(false);
        btnThemNCC.setEnabled(false);
        btnThemNhomThuoc.setEnabled(false);
        btnThemPhanLoai.setEnabled(false);
        btnThemTrangThai.setEnabled(false);
    }

    public void timKiem() {
        this.lamMoi();
        int d = 1;
        String tim = "";

        try {
            tim = this.cmbTim.getSelectedItem().toString();
        } catch (NullPointerException var7) {
        }

        if (tim.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Không được rỗng");
        } else {
            if (this.radMa.isSelected()) {
                this.xoaTable();
                Thuoc x = this.dao.getThuocbyMa(Integer.parseInt(tim));
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
            } else {
                Iterator var5;
                SimpleDateFormat df;
                List list;
                Thuoc x;
                if (this.radNhomThuoc.isSelected()) {
                    this.xoaTable();
                    list = this.dao.getThuocbynhomThuoc(tim);
                    var5 = list.iterator();

                    while(var5.hasNext()) {
                        x = (Thuoc)var5.next();
                        df = new SimpleDateFormat("dd-MM-yyyy");
                        this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
                    }
                } else if (this.radPhanLoai.isSelected()) {
                    this.xoaTable();
                    list = this.dao.getThuocbyPhanLoai(tim);
                    var5 = list.iterator();

                    while(var5.hasNext()) {
                        x = (Thuoc)var5.next();
                        df = new SimpleDateFormat("dd-MM-yyyy");
                        this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
                    }
                } else if (this.radNCC.isSelected()) {
                    this.xoaTable();
                    list = this.dao.getThuocbynhaCungCap(tim);
                    var5 = list.iterator();

                    while(var5.hasNext()) {
                        x = (Thuoc)var5.next();
                        df = new SimpleDateFormat("dd-MM-yyyy");
                        this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
                    }
                } else if (this.radTenThuoc.isSelected()) {
                    this.xoaTable();
                    list = this.dao.getThuocbyTen(tim);
                    var5 = list.iterator();

                    while(var5.hasNext()) {
                        x = (Thuoc)var5.next();
                        df = new SimpleDateFormat("dd-MM-yyyy");
                        this.tbModel.addRow(new Object[]{d++, x.getMaThuoc(), x.getSoDangky(), x.getTenThuoc(), x.getPhanLoai(), x.getNhomThuoc(), x.getHamLuong(), x.getHoatChat(), x.getDangBaoChe(), x.getQuyCach(), x.getTieuChuan(), x.getNhaCungcap().getTenNCC(), df.format(x.getNgaySanXuat()), df.format(x.getHanSuDung()), x.getDonViTinh(), x.getGiaNhap(), x.getDonGia(), x.getSoLuongNhap(), x.getTrangThai()});
                    }
                }
            }

        }
    }

    public boolean kiemTra() {
        try {
            new SimpleDateFormat("dd-MM-yyyy");
            String maThuoc = this.txtThuoc_Ma.getText().toString();
            String soDangKi = this.txtThuoc_SDK.getText().toString();
            String tenThuoc = this.txtThuoc_Ten.getText().toString();
            String phanLoai = this.cmbPhanLoai.getSelectedItem().toString();
            String nhomThuoc = this.cmbNhomThuoc.getSelectedItem().toString();
            String hoatChat = this.txtHoatChat.getText().toString();
            String hamLuong = this.txtHamLuong.getText().toString();
            String dangBaoChe = this.txtThuoc_DBC.getText().toString();
            String quyCach = this.txtThuoc_QuyCach.getText().toString();
            String tieuChuan = this.txtThuoc_TieuChuan.getText().toString();
            String tenNCC = (String)cmbNCC.getSelectedItem();
            Date ngaySX = this.dateNgaySX.getDate();
            Date ngaySD = this.dateHanSD.getDate();
            String donViTinh = (String)this.cmbDonViTinh.getSelectedItem();
            String gn = this.txtThuoc_GiaNhap.getText().toString();
            String dg = this.txtThuoc_DonGia.getText().toString();
            String sl = this.txtThuoc_SLN.getText().toString();
            String trangThai = (String)this.cmbTrangThai.getSelectedItem();
            if (soDangKi.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số đăng ký !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_SDK.requestFocus();
                this.txtThuoc_SDK.selectAll();
                return false;
            }

            if (tenThuoc.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_Ten.requestFocus();
                this.txtThuoc_Ten.selectAll();
                return false;
            }

            if (ngaySX == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày sản xuất !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.dateNgaySX.requestFocus();
                return false;
            }

            if (ngaySD == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày sản xuất !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.dateHanSD.requestFocus();
                return false;
            }

            if (phanLoai.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập phân loại của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                return false;
            }

            if (donViTinh.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn vị tính !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                return false;
            }

            if (hoatChat.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập hoạt chất của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtHoatChat.requestFocus();
                this.txtHoatChat.selectAll();
                return false;
            }

            if (hamLuong.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập hàm lượng của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtHamLuong.requestFocus();
                this.txtHamLuong.selectAll();
                return false;
            }

            if (dangBaoChe.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập dạng bào chế của thuốc!", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_DBC.requestFocus();
                this.txtThuoc_DBC.selectAll();
                return false;
            }

            if (quyCach.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập quy cách đóng gói của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_QuyCach.requestFocus();
                this.txtThuoc_QuyCach.selectAll();
                return false;
            }

            if (tieuChuan.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tiêu chuẩn của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_TieuChuan.requestFocus();
                this.txtThuoc_TieuChuan.selectAll();
                return false;
            }

            if (tenNCC.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhà cung cấp của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                return false;
            }

            if (gn.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập giá nhập của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_GiaNhap.requestFocus();
                this.txtThuoc_GiaNhap.selectAll();
                return false;
            }

            if (!gn.matches("^[0-9]*")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập giá nhập bằng số !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_GiaNhap.requestFocus();
                this.txtThuoc_GiaNhap.selectAll();
                return false;
            }

            if (dg.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_DonGia.requestFocus();
                this.txtThuoc_DonGia.selectAll();
                return false;
            }

            if (!dg.matches("^[0-9]*")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá bằng số !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_DonGia.requestFocus();
                this.txtThuoc_DonGia.selectAll();
                return false;
            }

            if (sl.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số lượng nhập !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_SLN.requestFocus();
                this.txtThuoc_SLN.selectAll();
                return false;
            }

            if (!sl.matches("^[0-9]*")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá bằng số !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.txtThuoc_SLN.requestFocus();
                this.txtThuoc_SLN.selectAll();
                return false;
            }

            if (trangThai.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập trạng thái !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                this.cmbTrangThai.requestFocus();
                return false;
            }

            if (this.imageThuoc == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn ảnh của thuốc !", "Thông báo !", 0, new ImageIcon("Hinh\\warning.png"));
                return false;
            }
        } catch (Exception var20) {
        }

        return true;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConectDatabase.getInstance().connect();
                    FrmThuoc frame = new FrmThuoc();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }
}
