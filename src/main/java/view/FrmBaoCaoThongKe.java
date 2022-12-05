//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import dao.DSBaoCaoTKTongQuatDAO;
import dao.DSThongKeHDTheoNhanVienDAO;
import dao.DSThongKeTTThuocDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
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
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import model.ThongKeBaoCaoTQ;
import model.ThongKeHDTheoNhanVien;
import model.Thuoc;

public class FrmBaoCaoThongKe extends JFrame implements ActionListener, MouseListener {
    static JTabbedPane tabbedPane;
    static JPanel pnlThongkeTTThuoc;
    static JPanel pnlToanPhan;
    static JPanel pnTab3;
    static JPanel pnTab4;
    static JPanel panel_2;
    static JPanel pnlThongKeBaoCao;
    static JPanel pnlThongTinChung;
    static JPanel pnlTT;
    static JPanel pnlThongKeChiTiet;
    static JPanel pnlTKtrongCT;
    JLabel lblThongTinKhachHang;
    JLabel lblDiaChi;
    JLabel lblThngKTheo;
    JLabel lblTngSLng_1;
    JLabel lblTngTin;
    JLabel lblMaKH;
    JLabel lblTenKH;
    JLabel lblSDT;
    JLabel lblNN;
    JLabel lblMakh;
    JLabel lblNgay;
    JLabel lblMaNV;
    JLabel lblTenNv;
    JLabel lblDonthuoc;
    JLabel lblTngSHa;
    JTextField txtDiaChi;
    JTextField txtTenKH;
    JTextField txtMaKH;
    JTextField txtNN;
    JTextField txtSDT;
    JTextField txtMakn;
    JButton btnTim;
    JButton btnThem;
    JButton btnXoa;
    JButton btnBaoCao;
    JButton btnXemThuocConLai;
    JButton btnXemThuocDaBan;
    JButton btnXemThuocHetHan;
    JButton btnXemthuocConLaiTrongKho;
    JComboBox cmbMaNV;
    JComboBox cmbNgay;
    JComboBox cmbDonThuoc;
    JComboBox cmbNgayTLTQ;
    ImageIcon background;
    JPanel jpanel;
    JScrollPane scrollPaneTKTTT;
    JScrollPane scrTKTQ;
    JMonthChooser monthChooser;
    JMonthChooser txtThang;
    public static final String strImagePath = "BoundBall.png";
    public static DefaultTableModel tablemodel = new DefaultTableModel();
    public static DefaultTableModel tablemodel1 = new DefaultTableModel();
    DefaultTableModel tablemodel2 = new DefaultTableModel();
    private JLabel lblNgayy;
    public static JTextField txtTongSoLuongThuoc;
    public static JTextField txtTongSoLoaiThuoc;
    private JTextField txtTenNV;
    public static JTextField txtTongSLTDB;
    public static JTextField txtTongTienDaBan;
    public static JTextField txtTongSoHD;
    private JTable table_1;
    private JTextField txtLoiNhuan;
    String s;
    private JTable table2;
    private JTextField txtTongTienThuocDaNhap;
    private JTextField txtTongTienBanDuocTKTq;
    private JTextField txtLoiNhuanThuDkTQ;
    private JButton btnXemBCAoTKTQ;
    private JTable tblThongKeTongQuat;
    private JPanel panel_12;
    private JTextField txtNam;
    private JComboBox comboBox;
    private JPopupMenu popupMenu;
    private JDateChooser txtChonNgay;
    private JDateChooser txtChonNgayThongKeThuoc;
    private JMenuItem mntmXemChiTiet;
    private JRadioButton radioButton_2;
    private JRadioButton radioButton_3;
    private JRadioButton radioButton_4;
    private JRadioButton radioButton_5;
    private JRadioButton radioButton_6;
    private JRadioButton radioButton_7;
    public static FrmXuatHD frmXuatHD = new FrmXuatHD();

    public FrmBaoCaoThongKe() {
        this.setBackground(new Color(176, 224, 230));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("Hinh\\1438_theophylin-dieu-tri-hen.jpg"));
        this.setTitle("QUẢN LÍ HIỆU THUỐC");
        this.setSize(1354, 733);
        this.setLocationRelativeTo((Component)null);
        this.setResizable(false);
        panel_2 = new JPanel();
        pnlThongTinChung = new JPanel();
        pnlTT = new JPanel();
        pnlTT.setBounds(20, 60, 525, 89);
        pnlThongKeChiTiet = new JPanel();
        pnlTKtrongCT = new JPanel();
        txtTongSoHD = new JTextField();
        txtTongSoHD.setForeground(Color.BLUE);
        txtTongSLTDB = new JTextField();
        txtTongSLTDB.setForeground(Color.BLUE);
        txtTongTienDaBan = new JTextField();
        txtTongTienDaBan.setForeground(Color.BLUE);
        txtTongTienDaBan.setFont(new Font("Tahoma", 0, 12));
        txtTongTienDaBan.setText("                            ");
        this.txtTenNV = new JTextField();
        this.cmbMaNV = new JComboBox();
        this.cmbDonThuoc = new JComboBox();
        AbstractButton datePicker = null;
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
        timeFormat.format(today.getTime());
        pnlThongTinChung.setLayout((LayoutManager)null);
        new ImageIcon("Hinh\\iconthongke.jpg");
        tabbedPane = new JTabbedPane();
        tabbedPane.setForeground(new Color(0, 128, 128));
        tabbedPane.setBounds(0, 0, 1338, 693);
        tabbedPane.setBorder((Border)null);
        pnlToanPhan = new JPanel();
        pnlToanPhan.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlToanPhan.setBackground(SystemColor.controlHighlight);
        JPanel pnlTieuDeTKHDTHV = new JPanel();
        pnlTieuDeTKHDTHV.setBackground(SystemColor.controlHighlight);
        pnlTieuDeTKHDTHV.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlTieuDeTKHDTHV.setBounds(10, 11, 1313, 71);
        pnlToanPhan.add(pnlTieuDeTKHDTHV);
        pnlTieuDeTKHDTHV.setLayout((LayoutManager)null);
        JLabel lblTieuDeTKHDTNV = new JLabel("THỐNG KÊ NHÂN VIÊN LẬP HÓA ĐƠN THEO NGÀY");
        lblTieuDeTKHDTNV.setHorizontalAlignment(0);
        lblTieuDeTKHDTNV.setForeground(Color.RED);
        lblTieuDeTKHDTNV.setFont(new Font("Tahoma", 0, 23));
        lblTieuDeTKHDTNV.setBounds(438, 11, 538, 37);
        pnlTieuDeTKHDTHV.add(lblTieuDeTKHDTNV);
        tabbedPane.addTab("Thống kê hóa đơn theo nhân viên", new ImageIcon("Hinh\\iconthongke.jpg"), pnlToanPhan);
        tabbedPane.setForegroundAt(0, new Color(0, 139, 139));
        pnlToanPhan.setLayout((LayoutManager)null);
        pnlThongTinChung.setBackground(SystemColor.controlHighlight);
        pnlThongTinChung.setBounds(10, 93, 555, 157);
        pnlToanPhan.add(pnlThongTinChung);
        this.lblNgay = new JLabel("Ngày:");
        this.lblNgay.setFont(new Font("Tahoma", 0, 15));
        this.lblNgay.setBounds(23, 29, 48, 20);
        this.lblMaNV = new JLabel("Mã Nhân viên:");
        this.lblMaNV.setFont(new Font("Tahoma", 0, 15));
        this.lblTenNv = new JLabel("Tên Nhân viên:");
        this.lblTenNv.setFont(new Font("Tahoma", 0, 15));
        this.lblDonthuoc = new JLabel("Đơn thuốc");
        this.lblDonthuoc.setFont(new Font("Tahoma", 0, 15));
        this.lblTngSHa = new JLabel("Tổng số hóa đơn:");
        this.lblTngSHa.setFont(new Font("Tahoma", 0, 15));
        this.lblTngSLng_1 = new JLabel("Tổng số lượng thuốc đã bán:");
        this.lblTngSLng_1.setFont(new Font("Tahoma", 0, 15));
        this.lblTngTin = new JLabel("Tổng tiền đã bán:");
        this.lblTngTin.setFont(new Font("Tahoma", 0, 15));
        this.lblTenNv.setBounds(7, 41, 107, 14);
        this.lblMaNV.setBounds(7, 8, 107, 14);
        this.lblDonthuoc.setBounds(285, 10, 79, 14);
        this.lblTngSHa.setBounds(43, 72, 150, 20);
        this.lblTngSLng_1.setBounds(43, 14, 200, 20);
        this.lblTngTin.setBounds(43, 42, 150, 22);
        this.txtTenNV.setBounds(124, 38, 130, 20);
        txtTongSLTDB.setBounds(253, 11, 124, 20);
        txtTongTienDaBan.setBounds(253, 38, 124, 20);
        txtTongSoHD.setBounds(253, 69, 124, 20);
        this.txtTenNV.setEditable(false);
        txtTongSLTDB.setEditable(false);
        txtTongTienDaBan.setEditable(false);
        txtTongSoHD.setEditable(false);
        txtTongSLTDB.setColumns(10);
        this.txtTenNV.setColumns(10);
        txtTongTienDaBan.setColumns(10);
        txtTongSoHD.setColumns(10);
        this.cmbMaNV.setBounds(124, 5, 130, 20);
        this.cmbDonThuoc.setBounds(380, 7, 135, 20);
        pnlTKtrongCT.add(this.lblTngTin);
        pnlTKtrongCT.add(this.lblTngSLng_1);
        pnlTKtrongCT.add(txtTongTienDaBan);
        pnlTKtrongCT.add(this.lblTngSHa);
        pnlTKtrongCT.add(txtTongSoHD);
        pnlTT.add(this.lblMaNV);
        pnlTT.add(this.lblTenNv);
        pnlTT.add(this.lblDonthuoc);
        pnlThongTinChung.add(this.lblNgay);
        pnlTT.add(this.cmbMaNV);
        this.cmbMaNV.addItem("Tất cả");
        this.chonMaNhanVien();
        pnlTT.add(this.txtTenNV);
        this.cmbDonThuoc.addItem("Tất cả");
        this.cmbDonThuoc.addItem("Thuốc kê đơn");
        this.cmbDonThuoc.addItem("Không kê đơn");
        pnlTT.add(this.cmbDonThuoc);
        pnlTKtrongCT.add(txtTongSLTDB);
        Border southborder4 = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder4 = new TitledBorder(southborder4, "Thông tin chung");
        southTitleBorder4.setTitleColor(Color.blue);
        pnlThongTinChung.setBorder(new TitledBorder((Border)null, "Thông tin chung", 4, 2, (Font)null, (Color)null));
        pnlToanPhan.add(pnlThongTinChung);
        pnlTT.setBackground(SystemColor.controlHighlight);
        pnlTT.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlThongTinChung.add(pnlTT);
        pnlTT.setLayout((LayoutManager)null);
        pnlThongKeChiTiet.setBackground(SystemColor.controlHighlight);
        pnlThongKeChiTiet.setBounds(575, 93, 748, 157);
        pnlToanPhan.add(pnlThongKeChiTiet);
        pnlThongKeChiTiet.setLayout((LayoutManager)null);
        Border southborder5 = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder5 = new TitledBorder(southborder5, "Chi tiết thống kê");
        southTitleBorder5.setTitleColor(Color.blue);
        pnlThongKeChiTiet.setBorder(new TitledBorder((Border)null, "Thống kê chi tiết", 4, 2, (Font)null, (Color)null));
        pnlToanPhan.add(pnlThongKeChiTiet);
        pnlTKtrongCT.setBackground(SystemColor.controlHighlight);
        pnlTKtrongCT.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlTKtrongCT.setBounds(10, 24, 728, 126);
        pnlThongKeChiTiet.add(pnlTKtrongCT);
        pnlTKtrongCT.setLayout((LayoutManager)null);
        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon("Hinh\\mangxahoi_1366259327 (1).jpg"));
        label_1.setBounds(406, 0, 312, 124);
        pnlTKtrongCT.add(label_1);
        this.radioButton_5 = new JRadioButton("");
        this.radioButton_5.setSelected(true);
        this.radioButton_5.setBackground(SystemColor.controlHighlight);
        this.radioButton_5.setBounds(9, 14, 28, 19);
        pnlTKtrongCT.add(this.radioButton_5);
        this.radioButton_6 = new JRadioButton("");
        this.radioButton_6.setSelected(true);
        this.radioButton_6.setBackground(SystemColor.controlHighlight);
        this.radioButton_6.setBounds(9, 42, 28, 19);
        pnlTKtrongCT.add(this.radioButton_6);
        this.radioButton_7 = new JRadioButton("");
        this.radioButton_7.setSelected(true);
        this.radioButton_7.setBackground(SystemColor.controlHighlight);
        this.radioButton_7.setBounds(9, 67, 28, 22);
        pnlTKtrongCT.add(this.radioButton_7);
        Border southborder = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder = new TitledBorder(southborder, "Hình thức thống kê");
        southTitleBorder.setTitleColor(Color.blue);
        Border southborder1 = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder1 = new TitledBorder(southborder1, "Báo cáo sau thống kê");
        southTitleBorder1.setTitleColor(Color.blue);
        this.getContentPane().setLayout((LayoutManager)null);
        this.getContentPane().add(tabbedPane);
        this.cmbDonThuoc.addActionListener(this);
        this.cmbMaNV.addActionListener(this);
        Border southborder2 = BorderFactory.createLineBorder(Color.blue);
        TitledBorder southTitleBorder2 = new TitledBorder(southborder2, "Danh sách thuốc sau thống kê");
        southTitleBorder2.setTitleColor(Color.blue);
        String[] tb1 = new String[]{"STT", "Mã Hóa Đơn", "Mã Nhân viên", "Ca Làm Việc", "Ngày Lập", "Tổng Tiền", "Loại Hóa Đơn", "Số Lượng"};
        tablemodel = new DefaultTableModel(tb1, 0);
        this.table_1 = new JTable(tablemodel);
        this.table_1.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        this.table_1.setBackground(new Color(255, 250, 205));
        this.table_1.setForeground(new Color(0, 0, 205));
        JScrollPane scrDSTK;
        this.getContentPane().add(scrDSTK = new JScrollPane(this.table_1, 22, 32), "Center");
        this.popupMenu = new JPopupMenu();
        addPopup(this.table_1, this.popupMenu);
        this.mntmXemChiTiet = new JMenuItem("Xem Chi Tiết Hóa Đơn");
        this.popupMenu.add(this.mntmXemChiTiet);
        this.table_1.setRowHeight(20);
        this.txtChonNgay = new JDateChooser();
        this.txtChonNgay.setForeground(new Color(0, 0, 255));
        this.txtChonNgay.getCalendarButton().setFont(new Font("Times New Roman", 0, 14));
        this.txtChonNgay.setLocale(new Locale("vi", "VN"));
        this.txtChonNgay.setDateFormatString("dd/MM/yyyy");
        this.txtChonNgay.setDate(new Date(System.currentTimeMillis()));
        this.txtChonNgay.setBounds(81, 29, 142, 20);
        pnlThongTinChung.add(this.txtChonNgay);
        Border southbordert = BorderFactory.createLineBorder(Color.blue);
        TitledBorder southTitleBordert = new TitledBorder(southbordert, "Thông tin chung về thuốc");
        southTitleBordert.setTitleColor(Color.blue);
        scrDSTK.setBorder(new TitledBorder((Border)null, "Danh sách thống kê", 4, 2, (Font)null, (Color)null));
        pnlToanPhan.add(scrDSTK);
        scrDSTK.setPreferredSize(new Dimension(0, 250));
        pnlToanPhan.setLayout((LayoutManager)null);
        scrDSTK.setBounds(10, 248, 1313, 292);
        JPanel panel_8 = new JPanel();
        scrDSTK.setColumnHeaderView(panel_8);
        panel_8.setBackground(new Color(175, 238, 238));
        panel_8.setLayout((LayoutManager)null);
        this.getContentPane().add(tabbedPane);
        this.getContentPane().add(tabbedPane);
        Border southborder6 = BorderFactory.createLineBorder(Color.blue, 1);
        TitledBorder southTitleBorder6 = new TitledBorder(southborder6, "Chức năng");
        southTitleBorder6.setTitleColor(Color.blue);
        this.panel_12 = new JPanel();
        this.panel_12.setBackground(SystemColor.controlHighlight);
        this.panel_12.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        this.panel_12.setBounds(10, 545, 1313, 91);
        pnlToanPhan.add(this.panel_12);
        this.panel_12.setLayout((LayoutManager)null);
        this.btnBaoCao = new JButton("Xem Báo Cáo");
        this.btnBaoCao.setBounds(508, 22, 255, 52);
        this.panel_12.add(this.btnBaoCao);
        this.btnBaoCao.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.btnBaoCao.addActionListener(this);
        this.btnBaoCao.setForeground(Color.BLACK);
        this.btnBaoCao.setFont(new Font("Tahoma", 1, 11));
        this.btnBaoCao.setBackground(SystemColor.controlHighlight);
        pnlThongkeTTThuoc = new JPanel();
        pnlThongkeTTThuoc.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlThongkeTTThuoc.setBackground(SystemColor.controlHighlight);
        tabbedPane.addTab("Thống kê tình trạng thuốc", new ImageIcon("Hinh\\iconthongke.jpg"), pnlThongkeTTThuoc);
        tabbedPane.setBackgroundAt(1, new Color(255, 255, 240));
        tabbedPane.setForegroundAt(1, new Color(0, 139, 139));
        pnlThongkeTTThuoc.setBounds(0, 50, 900, 240);
        pnlThongkeTTThuoc.setPreferredSize(new Dimension(0, 240));
        pnlThongkeTTThuoc.setLayout((LayoutManager)null);
        pnlThongkeTTThuoc.setLayout((LayoutManager)null);
        tabbedPane.setBackgroundAt(1, new Color(255, 255, 240));
        tabbedPane.setForegroundAt(1, new Color(0, 139, 139));
        JPanel jp2 = new JPanel();
        jp2.setBounds(10, 107, 688, 239);
        jp2.setBackground(SystemColor.controlHighlight);
        pnlThongkeTTThuoc.add(jp2);
        jp2.setLayout((LayoutManager)null);
        jp2.setBorder(new TitledBorder((Border)null, "Hình thức thống kê", 4, 2, (Font)null, (Color)null));
        this.lblNgayy = new JLabel("Ngày:");
        this.lblNgayy.setFont(new Font("Tahoma", 0, 15));
        this.lblNgayy.setForeground(new Color(0, 0, 0));
        this.lblNgayy.setBounds(10, 33, 46, 20);
        jp2.add(this.lblNgayy);
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_3.setBackground(SystemColor.controlHighlight);
        panel_3.setBounds(10, 77, 668, 145);
        jp2.add(panel_3);
        panel_3.setLayout((LayoutManager)null);
        this.btnXemThuocHetHan = new JButton("Xem thuốc hết hạng");
        this.btnXemThuocHetHan.setHorizontalAlignment(2);
        this.btnXemThuocHetHan.setBounds(6, 11, 297, 54);
        panel_3.add(this.btnXemThuocHetHan);
        this.btnXemThuocHetHan.setBackground(SystemColor.controlHighlight);
        this.btnXemThuocHetHan.setForeground(new Color(0, 0, 0));
        this.btnXemThuocHetHan.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.btnXemThuocHetHan.setFont(new Font("Tahoma", 1, 16));
        this.btnXemThuocDaBan = new JButton(" Xem thuốc đã bán");
        this.btnXemThuocDaBan.setHorizontalAlignment(2);
        this.btnXemThuocDaBan.setBounds(6, 76, 297, 54);
        panel_3.add(this.btnXemThuocDaBan);
        this.btnXemThuocDaBan.setBackground(SystemColor.controlHighlight);
        this.btnXemThuocDaBan.setForeground(new Color(0, 0, 0));
        this.btnXemThuocDaBan.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.btnXemThuocDaBan.setFont(new Font("Tahoma", 1, 16));
        this.btnXemThuocConLai = new JButton("  Xem thuốc còn hạn sử dụng");
        this.btnXemThuocConLai.setHorizontalAlignment(2);
        this.btnXemThuocConLai.setBounds(335, 13, 323, 51);
        panel_3.add(this.btnXemThuocConLai);
        this.btnXemThuocConLai.setBackground(SystemColor.controlHighlight);
        this.btnXemThuocConLai.setForeground(new Color(0, 0, 0));
        this.btnXemThuocConLai.setFont(new Font("Tahoma", 1, 16));
        this.btnXemThuocConLai.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.btnXemthuocConLaiTrongKho = new JButton("Xem thuốc còn lại trong kho");
        this.btnXemthuocConLaiTrongKho.setHorizontalAlignment(2);
        this.btnXemthuocConLaiTrongKho.setBounds(335, 76, 323, 55);
        panel_3.add(this.btnXemthuocConLaiTrongKho);
        this.btnXemthuocConLaiTrongKho.setFont(new Font("Tahoma", 1, 16));
        this.btnXemthuocConLaiTrongKho.setBackground(SystemColor.controlHighlight);
        this.btnXemthuocConLaiTrongKho.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.txtChonNgayThongKeThuoc = new JDateChooser();
        this.txtChonNgayThongKeThuoc.getCalendarButton().setForeground(new Color(0, 0, 255));
        this.txtChonNgayThongKeThuoc.getCalendarButton().setFont(new Font("Times New Roman", 0, 14));
        this.txtChonNgayThongKeThuoc.setLocale(new Locale("vi", "VN"));
        this.txtChonNgayThongKeThuoc.setDateFormatString("dd/MM/yyyy");
        this.txtChonNgayThongKeThuoc.setBounds(77, 33, 153, 20);
        this.txtChonNgayThongKeThuoc.setDate(new Date(System.currentTimeMillis()));
        jp2.add(this.txtChonNgayThongKeThuoc);
        AbstractButton datePicker1 = null;
        new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        timeFormat1.format(today.getTime());
        this.btnXemThuocConLai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        JPanel jp3 = new JPanel();
        jp3.setBounds(708, 107, 615, 239);
        jp3.setBackground(SystemColor.controlHighlight);
        jp3.setBorder(new TitledBorder((Border)null, "Báo cáo sau thống kê", 4, 2, (Font)null, (Color)null));
        pnlThongkeTTThuoc.add(jp3);
        jp3.setLayout((LayoutManager)null);
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(SystemColor.controlHighlight);
        panel_4.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_4.setBounds(23, 45, 582, 177);
        jp3.add(panel_4);
        panel_4.setLayout((LayoutManager)null);
        JLabel lblTongSoLuongThuoc = new JLabel("Tổng số lượng thuốc");
        lblTongSoLuongThuoc.setFont(new Font("Tahoma", 0, 15));
        lblTongSoLuongThuoc.setBounds(30, 32, 145, 28);
        panel_4.add(lblTongSoLuongThuoc);
        lblTongSoLuongThuoc.setForeground(new Color(0, 0, 0));
        txtTongSoLuongThuoc = new JTextField();
        txtTongSoLuongThuoc.setEditable(false);
        txtTongSoLuongThuoc.setForeground(Color.BLUE);
        txtTongSoLuongThuoc.setBounds(185, 38, 86, 20);
        panel_4.add(txtTongSoLuongThuoc);
        txtTongSoLuongThuoc.setColumns(10);
        JLabel lblTongSoLoaiThuoc = new JLabel("Tổng số loại thuốc");
        lblTongSoLoaiThuoc.setFont(new Font("Tahoma", 0, 15));
        lblTongSoLoaiThuoc.setBounds(30, 81, 135, 17);
        panel_4.add(lblTongSoLoaiThuoc);
        lblTongSoLoaiThuoc.setForeground(new Color(0, 0, 0));
        txtTongSoLoaiThuoc = new JTextField();
        txtTongSoLoaiThuoc.setForeground(Color.BLUE);
        txtTongSoLoaiThuoc.setBounds(185, 81, 86, 20);
        panel_4.add(txtTongSoLoaiThuoc);
        txtTongSoLoaiThuoc.setEditable(false);
        txtTongSoLoaiThuoc.setColumns(10);
        JRadioButton radioButton = new JRadioButton("");
        radioButton.setSelected(true);
        radioButton.setBackground(SystemColor.controlHighlight);
        radioButton.setBounds(6, 35, 28, 20);
        panel_4.add(radioButton);
        JRadioButton radioButton_1 = new JRadioButton("");
        radioButton_1.setSelected(true);
        radioButton_1.setBackground(SystemColor.controlHighlight);
        radioButton_1.setBounds(6, 81, 28, 17);
        panel_4.add(radioButton_1);
        JLabel lblNewLab = new JLabel("");
        lblNewLab.setIcon(new ImageIcon("Hinh\\mangxahoi_1366259327 (1).jpg"));
        lblNewLab.setBounds(281, 32, 296, 120);
        panel_4.add(lblNewLab);
        this.scrollPaneTKTTT = new JScrollPane();
        this.scrollPaneTKTTT.setHorizontalScrollBarPolicy(32);
        this.scrollPaneTKTTT.setVerticalScrollBarPolicy(22);
        this.scrollPaneTKTTT.setBounds(10, 355, 1323, 269);
        pnlThongkeTTThuoc.add(this.scrollPaneTKTTT);
        String[] tb2 = new String[]{"STT", "Mã Thuốc", "Tên Thuốc", "Phân Loại", "Số lượng", "Ngày Sản Xuất", "Hạn Sử dụng", "Ngày Lập"};
        tablemodel1 = new DefaultTableModel(tb2, 0);
        this.table2 = new JTable(tablemodel1);
        this.table2.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        this.table2.setBackground(new Color(245, 245, 220));
        this.table2.setForeground(Color.BLUE);
        this.table2.getColumnModel().getColumn(3).setPreferredWidth(95);
        this.table2.getColumnModel().getColumn(5).setPreferredWidth(110);
        this.table2.getColumnModel().getColumn(6).setPreferredWidth(121);
        this.scrollPaneTKTTT.setViewportView(this.table2);
        JPanel panel = new JPanel();
        panel.setLayout((LayoutManager)null);
        panel.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(10, 25, 1313, 71);
        pnlThongkeTTThuoc.add(panel);
        JLabel lblT = new JLabel("THỐNG KÊ TÌNH TRẠNG THUỐC");
        lblT.setHorizontalAlignment(0);
        lblT.setForeground(Color.RED);
        lblT.setFont(new Font("Tahoma", 0, 23));
        lblT.setBounds(445, 11, 362, 49);
        panel.add(lblT);
        pnlThongKeBaoCao = new JPanel();
        pnlThongKeBaoCao.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlThongKeBaoCao.setBackground(SystemColor.controlHighlight);
        tabbedPane.addTab("Thống kê báo cáo         \r\n", new ImageIcon("Hinh\\iconthongke.jpg"), pnlThongKeBaoCao);
        pnlThongKeBaoCao.setBounds(0, 50, 900, 240);
        pnlThongKeBaoCao.setPreferredSize(new Dimension(0, 240));
        pnlThongKeBaoCao.setLayout((LayoutManager)null);
        pnlThongKeBaoCao.setLayout((LayoutManager)null);
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(30, 11, 1293, 265);
        panel_1.setBackground(SystemColor.controlHighlight);
        panel_1.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        pnlThongKeBaoCao.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        JPanel panel_5 = new JPanel();
        panel_5.setBounds(10, 89, 367, 164);
        panel_5.setBackground(SystemColor.controlHighlight);
        panel_5.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_1.add(panel_5);
        panel_5.setLayout((LayoutManager)null);
        JLabel lblNgayTKTQ = new JLabel("Tháng:");
        lblNgayTKTQ.setFont(new Font("Tahoma", 0, 15));
        lblNgayTKTQ.setBounds(10, 23, 59, 31);
        panel_5.add(lblNgayTKTQ);
        this.btnXemBCAoTKTQ = new JButton("Xem Báo Cáo");
        this.btnXemBCAoTKTQ.setFont(new Font("Tahoma", 0, 18));
        this.btnXemBCAoTKTQ.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.btnXemBCAoTKTQ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    DSBaoCaoTKTongQuatDAO DS = new DSBaoCaoTKTongQuatDAO();
                    int thang = Integer.parseInt(FrmBaoCaoThongKe.this.comboBox.getSelectedItem().toString());
                    int nam = Integer.parseInt(FrmBaoCaoThongKe.this.txtNam.getText());
                    DecimalFormat tien = new DecimalFormat("###,###,### VND");
                    double tienBan = 0.0D;
                    double tienNhap = 0.0D;
                    double tienLai = 0.0D;
                    double tienBanSetText = 0.0D;

                    ThongKeBaoCaoTQ thongKeBaoCaoTQ;
                    for(Iterator var15 = DS.thongKeThuocDaBan_DoanhThu_TheoThang(thang, nam).iterator(); var15.hasNext(); tienBanSetText += thongKeBaoCaoTQ.getDonGia() * (double)thongKeBaoCaoTQ.getSoLuongBan()) {
                        thongKeBaoCaoTQ = (ThongKeBaoCaoTQ)var15.next();
                    }

                    int checkNull = 0;
                    FrmBaoCaoThongKe.this.tblThongKeTongQuat.setDefaultEditor(Object.class, (TableCellEditor)null);
                    FrmBaoCaoThongKe.this.txtTongTienBanDuocTKTq.setText(tien.format(tienBanSetText));
                    FrmBaoCaoThongKe.this.txtTongTienThuocDaNhap.setText(tien.format(DS.tinhTongTienThuocDaNhapTheoThang(thang, nam)));
                    tienNhap += DS.tinhTongTienThuocDaNhapTheoThang(thang, nam);
                    tienLai = tienBanSetText - tienNhap;
                    FrmBaoCaoThongKe.this.txtLoiNhuanThuDkTQ.setText(tien.format(tienLai));
                    System.out.println(DS.thongKeThuocDaBan_DoanhThu_TheoThang(thang, nam));
                    System.out.println(tienLai);
                    int i = 0;
                    int check = 0;
                    FrmBaoCaoThongKe.this.xoaBanggTKTQ();
                    double tienBanDuoc = 0.0D;

                    for(Iterator var20 = DS.thongKeThuocDaBan_DoanhThu_TheoThang(thang, nam).iterator(); var20.hasNext(); ++check) {
                        ThongKeBaoCaoTQ thongKeBaoCaoTQx = (ThongKeBaoCaoTQ)var20.next();
                        tienBanDuoc = thongKeBaoCaoTQx.getDonGia() * (double)thongKeBaoCaoTQx.getSoLuongBan();
                        DefaultTableModel var10000 = FrmBaoCaoThongKe.this.tablemodel2;
                        Object[] var10001 = new Object[11];
                        ++i;
                        var10001[0] = i;
                        var10001[1] = thongKeBaoCaoTQx.getMaThuoc();
                        var10001[2] = thongKeBaoCaoTQx.getTenThuoc();
                        var10001[3] = tien.format(thongKeBaoCaoTQx.getDonGia());
                        var10001[4] = tien.format(thongKeBaoCaoTQx.getDonGiaNhap());
                        var10001[5] = thongKeBaoCaoTQx.getSoLuongNhap();
                        var10001[6] = thongKeBaoCaoTQx.getSoLuongBan();
                        var10001[7] = tien.format(thongKeBaoCaoTQx.getLoiNhuan());
                        var10001[8] = thongKeBaoCaoTQx.getNgay();
                        var10001[9] = thongKeBaoCaoTQx.getSoDK();
                        var10001[10] = tien.format(tienBanDuoc);
                        var10000.addRow(var10001);
                    }

                    if (check == 0) {
                        JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của tháng:" + thang + "/" + nam);
                    }
                } catch (Exception var21) {
                }

            }
        });
        this.btnXemBCAoTKTQ.setBackground(new Color(0, 206, 209));
        this.btnXemBCAoTKTQ.setBounds(74, 85, 205, 46);
        panel_5.add(this.btnXemBCAoTKTQ);
        this.comboBox = new JComboBox();
        this.comboBox.setForeground(new Color(0, 0, 255));
        this.comboBox.setBounds(79, 23, 85, 31);
        this.comboBox.addItem("1");
        this.comboBox.addItem("2");
        this.comboBox.addItem("3");
        this.comboBox.addItem("4");
        this.comboBox.addItem("5");
        this.comboBox.addItem("6");
        this.comboBox.addItem("7");
        this.comboBox.addItem("8");
        this.comboBox.addItem("9");
        this.comboBox.addItem("10");
        this.comboBox.addItem("11");
        this.comboBox.addItem("12");
        panel_5.add(this.comboBox);
        JLabel lblNm = new JLabel("Năm:");
        lblNm.setFont(new Font("Tahoma", 0, 15));
        lblNm.setBounds(177, 26, 59, 28);
        panel_5.add(lblNm);
        this.txtNam = new JTextField();
        this.txtNam.setForeground(new Color(0, 0, 255));
        this.txtNam.setBounds(245, 23, 85, 31);
        panel_5.add(this.txtNam);
        this.txtNam.setColumns(10);
        JPanel panel_7 = new JPanel();
        panel_7.setBounds(400, 89, 883, 164);
        panel_7.setBackground(SystemColor.controlHighlight);
        panel_7.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_1.add(panel_7);
        panel_7.setLayout((LayoutManager)null);
        JPanel pnlThongtinThongKeTQ = new JPanel();
        pnlThongtinThongKeTQ.setBackground(SystemColor.controlHighlight);
        pnlThongtinThongKeTQ.setBorder(new TitledBorder((Border)null, "Thông tin thống kê ", 4, 2, (Font)null, (Color)null));
        pnlThongtinThongKeTQ.setBounds(10, 29, 495, 124);
        panel_7.add(pnlThongtinThongKeTQ);
        pnlThongtinThongKeTQ.setLayout((LayoutManager)null);
        JLabel lblTongSoLuongDaNhap = new JLabel("Tổng tiền thuốc đã nhập:");
        lblTongSoLuongDaNhap.setFont(new Font("Tahoma", 0, 15));
        lblTongSoLuongDaNhap.setBounds(53, 50, 178, 20);
        pnlThongtinThongKeTQ.add(lblTongSoLuongDaNhap);
        this.txtTongTienThuocDaNhap = new JTextField();
        this.txtTongTienThuocDaNhap.setForeground(new Color(0, 0, 255));
        this.txtTongTienThuocDaNhap.setEditable(false);
        this.txtTongTienThuocDaNhap.setBounds(228, 49, 241, 20);
        pnlThongtinThongKeTQ.add(this.txtTongTienThuocDaNhap);
        this.txtTongTienThuocDaNhap.setColumns(10);
        this.txtTongTienBanDuocTKTq = new JTextField();
        this.txtTongTienBanDuocTKTq.setForeground(new Color(0, 0, 255));
        this.txtTongTienBanDuocTKTq.setEditable(false);
        this.txtTongTienBanDuocTKTq.setColumns(10);
        this.txtTongTienBanDuocTKTq.setBounds(228, 19, 241, 20);
        pnlThongtinThongKeTQ.add(this.txtTongTienBanDuocTKTq);
        JLabel lblLoiNhuanThuDuoc = new JLabel("Lợi nhuận thu được:");
        lblLoiNhuanThuDuoc.setFont(new Font("Tahoma", 0, 15));
        lblLoiNhuanThuDuoc.setBounds(53, 75, 134, 19);
        pnlThongtinThongKeTQ.add(lblLoiNhuanThuDuoc);
        this.txtLoiNhuanThuDkTQ = new JTextField();
        this.txtLoiNhuanThuDkTQ.setForeground(new Color(0, 0, 255));
        this.txtLoiNhuanThuDkTQ.setEditable(false);
        this.txtLoiNhuanThuDkTQ.setColumns(10);
        this.txtLoiNhuanThuDkTQ.setBounds(353, 74, 116, 20);
        pnlThongtinThongKeTQ.add(this.txtLoiNhuanThuDkTQ);
        JLabel lblTongSoTienBanDuoc = new JLabel("Tổng tiền bán được:");
        lblTongSoTienBanDuoc.setFont(new Font("Tahoma", 0, 15));
        lblTongSoTienBanDuoc.setBounds(53, 25, 156, 20);
        pnlThongtinThongKeTQ.add(lblTongSoTienBanDuoc);
        this.radioButton_2 = new JRadioButton("");
        this.radioButton_2.setSelected(true);
        this.radioButton_2.setBackground(SystemColor.controlHighlight);
        this.radioButton_2.setBounds(19, 30, 28, 11);
        pnlThongtinThongKeTQ.add(this.radioButton_2);
        this.radioButton_3 = new JRadioButton("");
        this.radioButton_3.setSelected(true);
        this.radioButton_3.setBackground(SystemColor.controlHighlight);
        this.radioButton_3.setBounds(19, 50, 28, 16);
        pnlThongtinThongKeTQ.add(this.radioButton_3);
        this.radioButton_4 = new JRadioButton("");
        this.radioButton_4.setSelected(true);
        this.radioButton_4.setBackground(SystemColor.controlHighlight);
        this.radioButton_4.setBounds(19, 74, 28, 20);
        pnlThongtinThongKeTQ.add(this.radioButton_4);
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\HanNhuocDuong\\Documents\\Project_Fix_DangNhapLoi\\Nhom16_DeTai01_PTUD_13A_2019\\Hinh\\mangxahoi_1366259327 (1).jpg"));
        label.setBounds(515, 29, 320, 124);
        panel_7.add(label);
        JPanel panel_6 = new JPanel();
        panel_6.setBounds(10, 11, 1273, 71);
        panel_6.setLayout((LayoutManager)null);
        panel_6.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_6.setBackground(SystemColor.controlHighlight);
        panel_1.add(panel_6);
        JLabel lblThngKTheo_1 = new JLabel("THỐNG KÊ THEO DOANH THU THEO THÁNG");
        lblThngKTheo_1.setHorizontalAlignment(0);
        lblThngKTheo_1.setForeground(Color.RED);
        lblThngKTheo_1.setFont(new Font("Tahoma", 0, 23));
        lblThngKTheo_1.setBounds(438, 11, 500, 37);
        panel_6.add(lblThngKTheo_1);
        JScrollPane scrThongKeTongQuat = new JScrollPane();
        scrThongKeTongQuat.setVerticalScrollBarPolicy(22);
        scrThongKeTongQuat.setHorizontalScrollBarPolicy(32);
        scrThongKeTongQuat.setBounds(30, 275, 1293, 338);
        pnlThongKeBaoCao.add(scrThongKeTongQuat);
        String[] tq = new String[]{"STT", "Mã Thuốc", "Tên Thuốc", "Đơn Giá Bán", "Đơn Giá Nhập", "Số Lượng Nhập", "Số Lượng Bán", "Tiền Nhập Thuốc", "Ngày Hết Hạn", "Số Đăng Kí", "Tiền Bán Được"};
        this.tablemodel2 = new DefaultTableModel(tq, 0);
        this.tblThongKeTongQuat = new JTable(this.tablemodel2);
        this.tblThongKeTongQuat.setForeground(new Color(0, 0, 205));
        this.tblThongKeTongQuat.setBackground(new Color(255, 248, 220));
        this.tblThongKeTongQuat.setBorder(new BevelBorder(0, (Color)null, (Color)null, (Color)null, (Color)null));
        this.tblThongKeTongQuat.getColumnModel().getColumn(0).setPreferredWidth(37);
        this.tblThongKeTongQuat.getColumnModel().getColumn(1).setPreferredWidth(65);
        this.tblThongKeTongQuat.getColumnModel().getColumn(3).setPreferredWidth(92);
        this.tblThongKeTongQuat.getColumnModel().getColumn(4).setPreferredWidth(79);
        this.tblThongKeTongQuat.getColumnModel().getColumn(5).setPreferredWidth(133);
        this.tblThongKeTongQuat.getColumnModel().getColumn(6).setPreferredWidth(83);
        this.tblThongKeTongQuat.getColumnModel().getColumn(7).setPreferredWidth(77);
        this.tblThongKeTongQuat.getColumnModel().getColumn(8).setPreferredWidth(90);
        this.tblThongKeTongQuat.getColumnModel().getColumn(9).setPreferredWidth(105);
        scrThongKeTongQuat.setViewportView(this.tblThongKeTongQuat);
        this.btnXemThuocConLai.addActionListener(this);
        this.btnXemThuocDaBan.addActionListener(this);
        this.btnXemThuocHetHan.addActionListener(this);
        this.btnXemBCAoTKTQ.addActionListener(this);
        this.mntmXemChiTiet.addActionListener(this);
        this.btnXemthuocConLaiTrongKho.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
//        int checkNull = 0;
//        Object obj = e.getSource();
//        String chonDon = this.cmbDonThuoc.getSelectedItem().toString();
//        String chonMaNhanVien = this.cmbMaNV.getSelectedItem().toString();
//        AbstractButton datePicker = null;
//        Date today = new Date(System.currentTimeMillis());
//        SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy");
//        this.s = timeFormat.format(today.getTime());
//        new DecimalFormat();
//        DSThongKeTTThuocDAO dsThongKeThuoc;
//        SimpleDateFormat simpleDateFormat;
//        String maHoaDon;
//        int ngay;
//        int thang;
//        int nam;
//        int tongSoLuongThuoc;
//        DefaultTableModel var10000;
//        Thuoc thuoc;
//        Object[] var10001;
//        Iterator var18;
//        Calendar ngayCld;
//        if (obj.equals(this.btnXemThuocHetHan)) {
//            this.scrollPaneTKTTT.setBorder(BorderFactory.createTitledBorder("Danh Sách Thuốc Hết Hạn Sử Dụng"));
//            dsThongKeThuoc = new DSThongKeTTThuocDAO();
//            this.xoaBang();
//            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            maHoaDon = simpleDateFormat.format(this.txtChonNgayThongKeThuoc.getDate());
//            System.out.println(maHoaDon);
//            ngay = java.sql.Date.valueOf(maHoaDon);
//            thang = 0;
//            nam = 0;
//            tongSoLuongThuoc = 0;
//
//            for(var18 = dsThongKeThuoc.danhSachThuocHetHan(ngay).iterator(); var18.hasNext(); ++nam) {
//                thuoc = (Thuoc)var18.next();
//                System.out.println(thuoc);
//                var10000 = tablemodel1;
//                var10001 = new Object[7];
//                ++thang;
//                var10001[0] = thang;
//                var10001[1] = thuoc.getMaThuoc();
//                var10001[2] = thuoc.getTenThuoc();
//                var10001[3] = thuoc.getPhanLoai();
//                var10001[4] = thuoc.getSoLuongNhap();
//                var10001[5] = thuoc.getNgaySanXuat();
//                var10001[6] = thuoc.getHanSuDung();
//                var10000.addRow(var10001);
//                tongSoLuongThuoc += thuoc.getSoLuongNhap();
//            }
//
//            if (nam == 0) {
//                JOptionPane.showMessageDialog((Component)null, "Không có thuốc hết hạn trong ngày:" + ngay);
//            }
//
//            txtTongSoLuongThuoc.setText(String.valueOf(tongSoLuongThuoc));
//            txtTongSoLoaiThuoc.setText(String.valueOf(thang));
//        } else if (obj.equals(this.btnXemThuocConLai)) {
//            this.scrollPaneTKTTT.setBorder(BorderFactory.createTitledBorder("Danh Sách Thuốc Còn Hạn Sử Dụng"));
//            dsThongKeThuoc = new DSThongKeTTThuocDAO();
//            this.xoaBang();
//            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            maHoaDon = simpleDateFormat.format(this.txtChonNgayThongKeThuoc.getDate());
//            System.out.println(maHoaDon);
//            ngay = java.sql.Date.valueOf(maHoaDon);
//            thang = 0;
//            nam = 0;
//            tongSoLuongThuoc = 0;
//
//            for(var18 = dsThongKeThuoc.danhSachThuocConLai(ngay).iterator(); var18.hasNext(); ++nam) {
//                thuoc = (Thuoc)var18.next();
//                System.out.println(thuoc);
//                var10000 = tablemodel1;
//                var10001 = new Object[7];
//                ++thang;
//                var10001[0] = thang;
//                var10001[1] = thuoc.getMaThuoc();
//                var10001[2] = thuoc.getTenThuoc();
//                var10001[3] = thuoc.getPhanLoai();
//                var10001[4] = thuoc.getSoLuongNhap();
//                var10001[5] = thuoc.getNgaySanXuat();
//                var10001[6] = thuoc.getHanSuDung();
//                var10000.addRow(var10001);
//                tongSoLuongThuoc += thuoc.getSoLuongNhap();
//            }
//
//            if (nam == 0) {
//                JOptionPane.showMessageDialog((Component)null, "Không có dữ liệu của ngày:" + ngay);
//            }
//
//            this.table2.setModel(tablemodel1);
//            txtTongSoLuongThuoc.setText(String.valueOf(tongSoLuongThuoc));
//            txtTongSoLoaiThuoc.setText(String.valueOf(thang));
//        } else if (obj.equals(this.mntmXemChiTiet)) {
//            DSThongKeHDTheoNhanVienDAO dsThongKeHDTheoNhanVien = new DSThongKeHDTheoNhanVienDAO();
//            int row = this.table_1.getSelectedRow();
//            maHoaDon = tablemodel.getValueAt(row, 1).toString();
//            System.out.println(maHoaDon);
//            dsThongKeHDTheoNhanVien.XemThongtinCTHoaDon(maHoaDon);
//            dsThongKeHDTheoNhanVien.XemThongtinCTHoaDonn(maHoaDon);
//            dsThongKeHDTheoNhanVien.XemThongtinCTHoaDonnn(maHoaDon);
//            frmXuatHD.setVisible(true);
//        } else if (obj.equals(this.btnXemThuocDaBan)) {
//            this.xoaBang();
//            this.scrollPaneTKTTT.setBorder(BorderFactory.createTitledBorder("Danh sách thuốc đã bán trong ngày"));
//            dsThongKeThuoc = new DSThongKeTTThuocDAO();
//            ngayCld = Calendar.getInstance();
//            System.out.println(this.txtChonNgayThongKeThuoc.getDate());
//            ngayCld.setTime(this.txtChonNgayThongKeThuoc.getDate());
//            ngay = ngayCld.get(Calendar.DATE);
//            thang = ngayCld.get(2) + 1;
//            nam = ngayCld.get(1);
//            dsThongKeThuoc.danhsachThuocDaBan(ngay, thang, nam);
//            String tongSoLoaiThuoc = null;
//
//            try {
//                tongSoLoaiThuoc = String.valueOf(dsThongKeThuoc.tinhTongLoaiThuocDaBan(ngay, ngay, thang));
//            } catch (Exception var19) {
//                var19.printStackTrace();
//            }
//
//            txtTongSoLoaiThuoc.setText(tongSoLoaiThuoc);
//        } else if (obj.equals(this.btnXemthuocConLaiTrongKho)) {
//            this.xoaBang();
//            this.scrollPaneTKTTT.setBorder(BorderFactory.createTitledBorder("Danh Sách Thuốc Trong Kho"));
//            dsThongKeThuoc = new DSThongKeTTThuocDAO();
//            dsThongKeThuoc.danhsachThuocConLaiTrongKho();
//        }
//
//        if (chonMaNhanVien.equalsIgnoreCase("Tất Cả")) {
//            this.txtTenNV.setText("");
//        } else {
//            this.chonTenNhanVien(chonMaNhanVien);
//        }
//
//        if (obj.equals(this.btnBaoCao)) {
//            int stt = 1;
//            this.xoaBangg();
//            DSThongKeHDTheoNhanVienDAO dsThongKeHDTheoNhanVien;
//            if (!chonMaNhanVien.equalsIgnoreCase("Tất cả") && chonDon.equalsIgnoreCase("Thuốc kê đơn")) {
//                this.xoaBangg();
//                ngayCld = Calendar.getInstance();
//                ngayCld.setTime(this.txtChonNgay.getDate());
//                ngay = ngayCld.get(5);
//                ngay = ngayCld.get(2) + 1;
//                thang = ngayCld.get(1);
//                dsThongKeHDTheoNhanVien = new DSThongKeHDTheoNhanVienDAO();
//                dsThongKeHDTheoNhanVien.thongKeNhanVienLapHoaDonKeDon_TheoNgay_TheoMa(ngay, ngay, thang, Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//                System.out.println(Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//            } else if (!chonMaNhanVien.equalsIgnoreCase("Tất cả") && chonDon.equalsIgnoreCase("Không kê đơn")) {
//                this.xoaBangg();
//                ngayCld = Calendar.getInstance();
//                ngayCld.setTime(this.txtChonNgay.getDate());
//                ngay = ngayCld.get(5);
//                ngay = ngayCld.get(2) + 1;
//                thang = ngayCld.get(1);
//                dsThongKeHDTheoNhanVien = new DSThongKeHDTheoNhanVienDAO();
//                dsThongKeHDTheoNhanVien.thongKeNhanVienLapHoaDonKeDon_TheoNgay_TheoMaKeDonKKeDon(ngay, ngay, thang, Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//                System.out.println(Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//            } else if (!chonMaNhanVien.equalsIgnoreCase("Tất cả") && chonDon.equalsIgnoreCase("Tất cả")) {
//                this.xoaBangg();
//                ngayCld = Calendar.getInstance();
//                ngayCld.setTime(this.txtChonNgay.getDate());
//                ngay = ngayCld.get(5);
//                ngay = ngayCld.get(2) + 1;
//                thang = ngayCld.get(1);
//                dsThongKeHDTheoNhanVien = new DSThongKeHDTheoNhanVienDAO();
//                dsThongKeHDTheoNhanVien.thongKeNhanVienLapHoaDon_TheoNgay_TheoMaTatCa(ngay, ngay, thang, Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//                System.out.println(Integer.parseInt(this.cmbMaNV.getSelectedItem().toString()));
//            } else if (chonMaNhanVien.equalsIgnoreCase("Tất cả")) {
//                this.xoaBangg();
//                this.txtTenNV.setText("");
//                DSThongKeHDTheoNhanVienDAO dsThongKeHDTheoNhanVien = new DSThongKeHDTheoNhanVienDAO();
//                Calendar ngayCld = Calendar.getInstance();
//                System.out.println(this.txtChonNgay.getDate());
//                ngayCld.setTime(this.txtChonNgay.getDate());
//                ngay = ngayCld.get(5);
//                thang = ngayCld.get(2) + 1;
//                nam = ngayCld.get(1);
//                dsThongKeHDTheoNhanVien.thongKeNhanVienLapHoaDonTheoNgay(ngay, thang, nam);
//            } else {
//                this.chonTenNhanVien(chonMaNhanVien);
//            }
//        }

    }

    public void hienDuLieuTrenText(Double tongtien, int tonghoadon, int tongthuoc) {
        DecimalFormat tien = new DecimalFormat("#,##0.00 VND");
        String tongHoaDon = String.valueOf(tonghoadon);
        String tongsoluongthuoc = String.valueOf(tongthuoc);
        String tongtienban = tien.format(tongtien);
        txtTongSoHD.setText(tongHoaDon);
        txtTongSLTDB.setText(tongsoluongthuoc);
        txtTongTienDaBan.setText(tongtienban);
    }

    private void chonMaNhanVien() {
        DSThongKeHDTheoNhanVienDAO ql = new DSThongKeHDTheoNhanVienDAO();
        ArrayList<ThongKeHDTheoNhanVien> list = ql.chonMaNhanVien();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            ThongKeHDTheoNhanVien t = (ThongKeHDTheoNhanVien)var4.next();
            this.cmbMaNV.addItem(t.getMaNhanVien());
        }

    }

    private void chonTenNhanVien(String ngay) {
        DSThongKeHDTheoNhanVienDAO ql = new DSThongKeHDTheoNhanVienDAO();
        ArrayList<ThongKeHDTheoNhanVien> list = ql.chonTenNhanVien(ngay);
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            ThongKeHDTheoNhanVien t = (ThongKeHDTheoNhanVien)var5.next();
            this.txtTenNV.setText(t.getTenNhanVien());
        }

    }

    private void xoaBang() {
        while(this.table2.getRowCount() != 0) {
            tablemodel1.removeRow(0);
        }

    }

    private void xoaBangg() {
        while(this.table_1.getRowCount() != 0) {
            tablemodel.removeRow(0);
        }

    }

    private void xoaBanggTKTQ() {
        this.tablemodel2.addRow(new Object[0]);
        this.tablemodel2 = (DefaultTableModel)this.tblThongKeTongQuat.getModel();
        this.tablemodel2.getDataVector().removeAllElements();
    }

    public void mouseClicked(MouseEvent arg0) {
        int row = this.table_1.getSelectedRow();
    }

    public void mouseEntered(MouseEvent arg0) {
    }

    public void mouseExited(MouseEvent arg0) {
    }

    public void mousePressed(MouseEvent arg0) {
    }

    public void mouseReleased(MouseEvent arg0) {
    }

    public JButton createButton(Icon inconlink, String text, String command, String toolTip) {
        JButton btn = new JButton();
        btn.setToolTipText(toolTip);
        btn.setIcon(inconlink);
        btn.setActionCommand(command);
        return btn;
    }

    public void hienDuLieuTrenText(Double tongmua, Double tongban, Double loinhuan) {
        DecimalFormat tien = new DecimalFormat("#,##0.00 VND");
        String tongtienmua = tien.format(tongmua);
        String tongtienban = tien.format(tongban);
        String tongLoiNhuan = tien.format(loinhuan);
        this.txtTongTienThuocDaNhap.setText(tongtienmua);
        this.txtTongTienBanDuocTKTq.setText(tongtienban);
        this.txtLoiNhuanThuDkTQ.setText(tongLoiNhuan);
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
