//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.HoaDonDAO;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import model.ChiTietHoaDon;
import model.HoaDon;

public class FrmQuanLyHoaDon extends JFrame {
    public static JPanel contentPane;
    private JTextField txtMa;
    private JTextField txtTenKH;
    private JTextField txtNVLap;
    private JTable tblHoaDon;
    private JTextField txtTongTien;
    private JTable tblChiTiet;
    private DefaultTableModel tblModelHoaDon = new DefaultTableModel();
    private DefaultTableModel tblModelChiTiet = new DefaultTableModel();
    private HoaDonDAO dao = new HoaDonDAO();
    private JTextField txtNgayLap;
    private JComboBox cmbTim;
    private JRadioButton radMaHD;
    private JRadioButton radTenKH;
    private JRadioButton radTenNV;
    private JRadioButton radNgayLap;
    private DefaultComboBoxModel cboModetenKH = new DefaultComboBoxModel();
    private List<String> listtenKH = new ArrayList();
    private DefaultComboBoxModel cboModetenNV = new DefaultComboBoxModel();
    private List<String> listtenNV = new ArrayList();
    private DefaultComboBoxModel cboModema = new DefaultComboBoxModel();
    private List<String> listma = new ArrayList();
    private DefaultComboBoxModel cboModeNgayLap = new DefaultComboBoxModel();
    private List<String> listNgayLap = new ArrayList();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmQuanLyHoaDon frame = new FrmQuanLyHoaDon();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmQuanLyHoaDon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("Hinh\\pm.png"));
        this.setType(Type.POPUP);
        this.setResizable(false);
        this.setForeground(new Color(176, 224, 230));
        this.setBackground(new Color(176, 224, 230));
        this.setTitle("Phần mềm quản lý nhà thuốc Tây Nam");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1300, 662);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.controlHighlight);
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager)null);
        JPanel pnlThongTinHD = new JPanel();
        pnlThongTinHD.setBackground(SystemColor.controlHighlight);
        pnlThongTinHD.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin hóa đơn", 1, 2, (Font)null, new Color(255, 0, 0)));
        pnlThongTinHD.setBounds(10, 75, 643, 208);
        contentPane.add(pnlThongTinHD);
        pnlThongTinHD.setLayout((LayoutManager)null);
        JLabel lblMHan = new JLabel("Mã hóa đơn:");
        lblMHan.setFont(new Font("Times New Roman", 0, 20));
        lblMHan.setBounds(10, 20, 122, 30);
        pnlThongTinHD.add(lblMHan);
        this.txtMa = new JTextField();
        this.txtMa.setEnabled(false);
        this.txtMa.setBounds(155, 22, 484, 30);
        pnlThongTinHD.add(this.txtMa);
        this.txtMa.setColumns(10);
        JLabel lblTnKhchHng = new JLabel("Khách Hàng:");
        lblTnKhchHng.setFont(new Font("Times New Roman", 0, 20));
        lblTnKhchHng.setBounds(10, 132, 147, 30);
        pnlThongTinHD.add(lblTnKhchHng);
        this.txtTenKH = new JTextField();
        this.txtTenKH.setBounds(155, 132, 484, 30);
        pnlThongTinHD.add(this.txtTenKH);
        this.txtTenKH.setColumns(10);
        JLabel lblNhanVien = new JLabel("Nhân viên :");
        lblNhanVien.setFont(new Font("Times New Roman", 0, 20));
        lblNhanVien.setBounds(10, 98, 122, 30);
        pnlThongTinHD.add(lblNhanVien);
        this.txtNVLap = new JTextField();
        this.txtNVLap.setBounds(154, 98, 484, 30);
        pnlThongTinHD.add(this.txtNVLap);
        this.txtNVLap.setColumns(10);
        JLabel lblNgayLap = new JLabel("Ngày lập:");
        lblNgayLap.setFont(new Font("Times New Roman", 0, 20));
        lblNgayLap.setBounds(10, 58, 100, 30);
        pnlThongTinHD.add(lblNgayLap);
        JLabel lblTongtien = new JLabel("Tổng Tiền:");
        lblTongtien.setFont(new Font("Times New Roman", 0, 20));
        lblTongtien.setBounds(10, 171, 100, 30);
        pnlThongTinHD.add(lblTongtien);
        this.txtTongTien = new JTextField();
        this.txtTongTien.setColumns(10);
        this.txtTongTien.setBounds(155, 165, 484, 30);
        pnlThongTinHD.add(this.txtTongTien);
        this.txtNgayLap = new JTextField();
        this.txtNgayLap.setColumns(10);
        this.txtNgayLap.setBounds(154, 58, 484, 30);
        pnlThongTinHD.add(this.txtNgayLap);
        JPanel pnlChucNang = new JPanel();
        pnlChucNang.setBackground(SystemColor.controlHighlight);
        pnlChucNang.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Các chức năng", 4, 2, (Font)null, Color.RED));
        pnlChucNang.setBounds(10, 476, 1270, 150);
        contentPane.add(pnlChucNang);
        pnlChucNang.setLayout((LayoutManager)null);
        new ImageIcon("Hinh/add.png");
        new ImageIcon("Hinh/delete.png");
        new ImageIcon("Hinh/update.png");
        ImageIcon iconSearch = new ImageIcon("Hinh/search.png");
        new ImageIcon("Hinh/save.png");
        new ImageIcon("Hinh/exit.png");
        new ImageIcon("Hinh/excel.png");
        JPanel pnlTimKiem = new JPanel();
        pnlTimKiem.setBackground(SystemColor.controlHighlight);
        pnlTimKiem.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Tìm kiếm hóa đơn", 4, 2, (Font)null, new Color(255, 0, 0)));
        pnlTimKiem.setBounds(12, 13, 1265, 96);
        pnlChucNang.add(pnlTimKiem);
        pnlTimKiem.setLayout((LayoutManager)null);
        JButton btnTimKiem = new JButton("Tìm kiếm");
        btnTimKiem.setBounds(979, 21, 136, 30);
        pnlTimKiem.add(btnTimKiem);
        btnTimKiem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnTimKiem.setFont(new Font("Times New Roman", 0, 16));
        btnTimKiem.setIcon(iconSearch);
        JLabel lblNhpThngTin = new JLabel("Nhập thông tin tìm kiếm:");
        lblNhpThngTin.setFont(new Font("Times New Roman", 0, 16));
        lblNhpThngTin.setBounds(20, 18, 162, 30);
        pnlTimKiem.add(lblNhpThngTin);
        JLabel lblTmTheo = new JLabel("Tìm theo:");
        lblTmTheo.setFont(new Font("Times New Roman", 0, 16));
        lblTmTheo.setBounds(20, 61, 63, 30);
        pnlTimKiem.add(lblTmTheo);
        this.radTenKH = new JRadioButton("Tên Khách Hàng ");
        this.radTenKH.setFont(new Font("Tahoma", 0, 15));
        this.radTenKH.setBounds(401, 60, 207, 29);
        pnlTimKiem.add(this.radTenKH);
        this.radNgayLap = new JRadioButton("Ngày lập");
        this.radNgayLap.setFont(new Font("Tahoma", 0, 15));
        this.radNgayLap.setBounds(841, 60, 207, 29);
        pnlTimKiem.add(this.radNgayLap);
        this.radMaHD = new JRadioButton("Mã Hóa Đơn");
        this.radMaHD.setBounds(174, 59, 207, 30);
        pnlTimKiem.add(this.radMaHD);
        this.radMaHD.setFont(new Font("Tahoma", 0, 15));
        this.radMaHD.setSelected(true);
        this.radTenNV = new JRadioButton("Tên nhân viên");
        this.radTenNV.setFont(new Font("Tahoma", 0, 15));
        this.radTenNV.setBounds(617, 60, 207, 29);
        pnlTimKiem.add(this.radTenNV);
        JButton btnThoat = new JButton("Thoát");
        btnThoat.setBackground(Color.LIGHT_GRAY);
        btnThoat.setHorizontalAlignment(2);
        new ImageIcon("Hinh/exit.png");
        btnThoat.setIcon(new ImageIcon("E:\\Phat Trien Ung Dung\\File_GopCuoi_Quoc\\Nhom16_DeTai01_PTUD_13A_2019\\Hinh\\iconDelete.png"));
        btnThoat.setFont(new Font("Times New Roman", 0, 16));
        btnThoat.setBounds(1124, 112, 136, 30);
        pnlChucNang.add(btnThoat);
        JPanel pnlTitle = new JPanel();
        pnlTitle.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlTitle.setBackground(SystemColor.controlHighlight);
        pnlTitle.setBounds(0, 0, 1300, 68);
        contentPane.add(pnlTitle);
        pnlTitle.setLayout((LayoutManager)null);
        JLabel lblQunLNhn = new JLabel("XEM HÓA ĐƠN");
        lblQunLNhn.setBackground(SystemColor.controlHighlight);
        lblQunLNhn.setForeground(Color.RED);
        lblQunLNhn.setHorizontalAlignment(0);
        lblQunLNhn.setFont(new Font("Times New Roman", 1, 25));
        lblQunLNhn.setBounds(10, 11, 1278, 53);
        pnlTitle.add(lblQunLNhn);
        JPanel pnlHoaDon = new JPanel();
        pnlHoaDon.setLayout((LayoutManager)null);
        pnlHoaDon.setForeground(Color.BLACK);
        pnlHoaDon.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Danh sách hóa đơn", 4, 2, (Font)null, Color.RED));
        pnlHoaDon.setBackground(SystemColor.controlHighlight);
        pnlHoaDon.setBounds(10, 290, 1270, 187);
        contentPane.add(pnlHoaDon);
        JScrollPane scrHoaDon = new JScrollPane();
        scrHoaDon.setVerticalScrollBarPolicy(22);
        scrHoaDon.setHorizontalScrollBarPolicy(32);
        scrHoaDon.setBounds(12, 22, 1250, 154);
        pnlHoaDon.add(scrHoaDon);
        String[] col = new String[]{"STT", "Mã hóa đơn", "Ngày lập", "Tổng tiền", "Tên khách hàng", "Nhân viên lập"};
        this.tblModelHoaDon = new DefaultTableModel(col, 0);
        this.tblHoaDon = new JTable(this.tblModelHoaDon);
        scrHoaDon.setViewportView(this.tblHoaDon);
        JPanel pnlChiTiet = new JPanel();
        pnlChiTiet.setBackground(SystemColor.controlHighlight);
        pnlChiTiet.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin chi tiết hóa đơn", 4, 2, (Font)null, new Color(255, 0, 0)));
        pnlChiTiet.setBounds(664, 75, 618, 208);
        contentPane.add(pnlChiTiet);
        pnlChiTiet.setLayout((LayoutManager)null);
        JScrollPane scrChiTiet = new JScrollPane();
        scrChiTiet.setVerticalScrollBarPolicy(22);
        scrChiTiet.setBounds(10, 21, 596, 176);
        pnlChiTiet.add(scrChiTiet);
        String[] col2 = new String[]{"STT", "Tên thuốc", "Đơn vị tính", "Đơn giá", "Số lượng", "Giảm giá", "Thành tiền"};
        this.tblModelChiTiet = new DefaultTableModel(col2, 0);
        this.tblChiTiet = new JTable(this.tblModelChiTiet);
        scrChiTiet.setViewportView(this.tblChiTiet);
        ButtonGroup group = new ButtonGroup();
        group.add(this.radMaHD);
        group.add(this.radNgayLap);
        group.add(this.radTenNV);
        group.add(this.radTenKH);
        this.cmbTim = new JComboBox();
        this.cmbTim.setBounds(184, 22, 771, 22);
        pnlTimKiem.add(this.cmbTim);
        JButton btnLamMoi = new JButton("Làm mới");
        btnLamMoi.setBackground(Color.LIGHT_GRAY);
        btnLamMoi.setHorizontalAlignment(2);
        btnLamMoi.setIcon(new ImageIcon("E:\\Phat Trien Ung Dung\\File_GopCuoi_Quoc\\Nhom16_DeTai01_PTUD_13A_2019\\Hinh\\refresh.png"));
        btnLamMoi.setFont(new Font("Times New Roman", 0, 16));
        btnLamMoi.setBounds(543, 112, 136, 30);
        pnlChucNang.add(btnLamMoi);
        this.docDuLieuHD();
        this.tblHoaDon.addMouseListener(new MouseListener() {
            public void mouseReleased(MouseEvent e) {
                FrmQuanLyHoaDon.this.cilckMouse();
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
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLamMoi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.lamMoi();
                FrmQuanLyHoaDon.this.docDuLieuHD();
            }
        });
        btnTimKiem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.TimKiem();
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmManHinhChinh.tabbedPane.remove(FrmQuanLyHoaDon.contentPane);
            }
        });
        this.radMaHD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.cmbTim.setModel(FrmQuanLyHoaDon.this.cboModema);
            }
        });
        this.radTenKH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.cmbTim.setModel(FrmQuanLyHoaDon.this.cboModetenKH);
            }
        });
        this.radTenNV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.cmbTim.setModel(FrmQuanLyHoaDon.this.cboModetenNV);
            }
        });
        this.radNgayLap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FrmQuanLyHoaDon.this.cmbTim.setModel(FrmQuanLyHoaDon.this.cboModeNgayLap);
            }
        });
        this.docDuLieuCmb();
    }

    public void docDuLieuHD() {
        int d = 1;
        List<HoaDon> list = this.dao.getHoaDons();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            HoaDon x = (HoaDon)var4.next();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String nhanVien = this.dao.getTenNV(x.getNhanVien());
            String khachHang = this.dao.getTenKH(x.getKhachHang());
            this.tblModelHoaDon.addRow(new Object[]{d++, x.getMa(), df.format(x.getNgayLap()), x.getTongTien(), khachHang, nhanVien});
        }

    }

    public void docDuLieuCmb() {
        int d = 1;
        List<HoaDon> list = this.dao.getHoaDons();
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            HoaDon x = (HoaDon)var4.next();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String nhanVien = this.dao.getTenNV(x.getNhanVien());
            String khachHang = this.dao.getTenKH(x.getKhachHang());
            if (!this.listtenKH.contains(khachHang)) {
                this.cboModetenKH.addElement(khachHang);
                this.listtenKH.add(khachHang);
            }

            if (!this.listtenNV.contains(nhanVien)) {
                this.cboModetenNV.addElement(nhanVien);
                this.listtenNV.add(nhanVien);
            }

            if (!this.listma.contains(x.getMa())) {
                this.cboModema.addElement(x.getMa());
                this.listma.add(x.getMa());
            }

            if (!this.listNgayLap.contains(df.format(x.getNgayLap()))) {
                this.cboModeNgayLap.addElement(df.format(x.getNgayLap()));
                this.listNgayLap.add(df.format(x.getNgayLap()));
            }
        }

    }

    public void xoaTableChiTiet() {
        this.tblModelChiTiet.addRow(new Object[0]);
        DefaultTableModel tblModel1 = (DefaultTableModel)this.tblChiTiet.getModel();
        tblModel1.getDataVector().removeAllElements();
    }

    public void xoaTableHoaDon() {
        this.tblModelHoaDon.addRow(new Object[0]);
        DefaultTableModel tblModel2 = (DefaultTableModel)this.tblHoaDon.getModel();
        tblModel2.getDataVector().removeAllElements();
    }

    public void lamMoi() {
        this.txtMa.setText("");
        this.txtNgayLap.setText("");
        this.txtNVLap.setText("");
        this.txtTenKH.setText("");
        this.txtTongTien.setText("");
        this.xoaTableChiTiet();
        this.xoaTableHoaDon();
    }

    public void cilckMouse() {
        int d = 1;
        int row = this.tblHoaDon.getSelectedRow();
        this.txtMa.setText(this.tblHoaDon.getValueAt(row, 1).toString());
        this.txtNgayLap.setText(this.tblHoaDon.getValueAt(row, 2).toString());
        this.txtNVLap.setText(this.tblHoaDon.getValueAt(row, 5).toString());
        this.txtTenKH.setText(this.tblHoaDon.getValueAt(row, 4).toString());
        this.txtTongTien.setText(this.tblHoaDon.getValueAt(row, 3).toString());
        List<ChiTietHoaDon> list = this.dao.getChiTiets(this.tblHoaDon.getValueAt(row, 1).toString());
        this.xoaTableChiTiet();
        Iterator var5 = list.iterator();

        while(var5.hasNext()) {
            ChiTietHoaDon ct = (ChiTietHoaDon)var5.next();
            String thuoc = this.dao.gettenThuoc(ct.getMaThuoc());
            double tongTien = (double)(ct.getDonGia() * (float)ct.getSoLuong() - ct.getGiamGia());
            this.tblModelChiTiet.addRow(new Object[]{d++, thuoc, ct.getDonViTinh(), ct.getDonGia(), ct.getSoLuong(), ct.getGiamGia(), tongTien});
        }

    }

    public void TimKiem() {
        String nl;
        if (this.radMaHD.isSelected()) {
            int d = 1;
            nl = this.cmbTim.getSelectedItem().toString();
            HoaDon hd = this.dao.getHoaDonByMa(nl);
            this.lamMoi();
            String nhanVien = this.dao.getTenNV(hd.getNhanVien());
            String khachHang = this.dao.getTenKH(hd.getKhachHang());
            this.tblModelHoaDon.addRow(new Object[]{Integer.valueOf(d), hd.getMa(), hd.getNgayLap(), hd.getTongTien(), khachHang, nhanVien});
        }

        String nhanVien;
        String khachHang;
        int d;
        List hds;
        HoaDon hd;
        Iterator var17;
        if (this.radTenKH.isSelected()) {
            d = 1;
            nl = this.cmbTim.getSelectedItem().toString();
            hds = this.dao.getHoaDonsByKhachHang(nl);
            this.lamMoi();
            var17 = hds.iterator();

            while(var17.hasNext()) {
                hd = (HoaDon)var17.next();
                nhanVien = this.dao.getTenNV(hd.getNhanVien());
                khachHang = this.dao.getTenKH(hd.getKhachHang());
                this.tblModelHoaDon.addRow(new Object[]{d++, hd.getMa(), hd.getNgayLap(), hd.getTongTien(), khachHang, nhanVien});
            }
        }

        if (this.radTenNV.isSelected()) {
            d = 1;
            nl = this.cmbTim.getSelectedItem().toString();
            System.out.println(nl);
            hds = this.dao.getHoaDonsByNhanVien(nl);
            this.lamMoi();
            var17 = hds.iterator();

            while(var17.hasNext()) {
                hd = (HoaDon)var17.next();
                nhanVien = this.dao.getTenNV(hd.getNhanVien());
                khachHang = this.dao.getTenKH(hd.getKhachHang());
                this.tblModelHoaDon.addRow(new Object[]{d++, hd.getMa(), hd.getNgayLap(), hd.getTongTien(), khachHang, nhanVien});
            }
        }

        if (this.radNgayLap.isSelected()) {
            d = 1;
            nl = this.cmbTim.getSelectedItem().toString();
            String[] ngaylap = nl.split("-");
            int ngay = Integer.parseInt(ngaylap[0]);
            int thang = Integer.parseInt(ngaylap[1]);
            int nam = Integer.parseInt(ngaylap[2]);
            hds = this.dao.getHoaDonsByNgayLap(ngay, thang, nam);
            this.lamMoi();
            Iterator var9 = hds.iterator();

            while(var9.hasNext()) {
                hd = (HoaDon)var9.next();
                nhanVien = this.dao.getTenNV(hd.getNhanVien());
                khachHang = this.dao.getTenKH(hd.getKhachHang());
                this.tblModelHoaDon.addRow(new Object[]{d++, hd.getMa(), hd.getNgayLap(), hd.getTongTien(), khachHang, nhanVien});
            }
        }

    }
}
