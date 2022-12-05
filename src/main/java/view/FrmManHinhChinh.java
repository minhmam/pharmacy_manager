//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class FrmManHinhChinh extends JFrame implements ActionListener, MenuListener {
    private JPanel contentPane;
    private FrmLapHoaDon frmLapHoaDon;
    private FrmQuanLyHoaDon frmQuanLyHoaDon = new FrmQuanLyHoaDon();
    private FrmBaoCaoThongKe frmBaoCaoThongKe = new FrmBaoCaoThongKe();
    private FrmQuanLyNhanVien frmQuanLyNhanVien = new FrmQuanLyNhanVien();
    private FrmKhachHang frmKhachHang = new FrmKhachHang();
    private FrmXemThongTinCaNhan frmXemThongTinCaNhan = new FrmXemThongTinCaNhan();
    private JMenuItem mntmThemHoaDonMoi;
    private JMenuItem mntmHuyHoaDon;
    public static JTabbedPane tabbedPane;
    private JMenuBar menuBar;
    private JMenu mnAbout;
    private JMenu mnHelp;
    private JMenu mnExit;
    private JMenu mnXemHoaDon;
    private JMenuItem mntmXemThongTinThuoc;
    public static JMenuItem mntmQuanLyThuoc;
    private JMenuItem mntmThongKeHoaDon;
    private JMenuItem mntmThongKeTinhTrangThuoc;
    private JMenuItem mntmThongKeDoanhThu;
    private JMenuItem mntmThongTinKhachHang;
    private JMenuItem mntmDangXuat;
    public static JMenu mnNhanVien;
    public static JMenu mnThongKe;
    public static JMenuBar menuBar_LapHoaDon;
    public static JMenu mnLapHoaDon;

    public FrmManHinhChinh() {
        this.setTitle("QUẢN LÝ HIỆU THUỐC");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Luu Pot\\Desktop\\Working\\QLyHieuThuoc\\src\\image\\login.jpg"));
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 450, 300);
        this.setSize(1376, 838);
        this.setLocationRelativeTo((Component)null);
        this.setExtendedState(6);
        this.menuBar = new JMenuBar();
        this.menuBar.setBackground(Color.WHITE);
        this.setJMenuBar(this.menuBar);
        this.mnExit = new JMenu("Exit");
        this.mnExit.addMenuListener(new MenuListener() {
            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }

            public void menuSelected(MenuEvent e) {
                Object chon = JOptionPane.showConfirmDialog((Component)null, "Bạn có chắc chắn muốn thoát?");
                if (chon.equals(0)) {
                    System.exit(0);
                }

            }
        });
        this.menuBar.add(this.mnExit);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.contentPane.setLayout(new BorderLayout(0, 0));
        this.setContentPane(this.contentPane);
        JToolBar toolBar = new JToolBar();
        toolBar.setBackground(Color.WHITE);
        toolBar.setFont(new Font("Times New Roman", 0, 20));
        toolBar.setFloatable(false);
        toolBar.setEnabled(false);
        this.contentPane.add(toolBar, "North");
        menuBar_LapHoaDon = new JMenuBar();
        toolBar.add(menuBar_LapHoaDon);
        mnLapHoaDon = new JMenu("Lập Hóa Đơn");
        mnLapHoaDon.setIcon(new ImageIcon("Hinh\\ThemHoaDon.png"));
        mnLapHoaDon.setFont(new Font("Times New Roman", 0, 20));
        mnLapHoaDon.setMnemonic(10);
        menuBar_LapHoaDon.add(mnLapHoaDon);
        this.mntmThemHoaDonMoi = new JMenuItem("Thêm mới hóa đơn");
        this.mntmThemHoaDonMoi.setIcon(new ImageIcon("Hinh\\add-HoaDon.png"));
        this.mntmThemHoaDonMoi.setFont(new Font("Times New Roman", 0, 18));
        this.mntmThemHoaDonMoi.setAccelerator(KeyStroke.getKeyStroke(112, 8));
        mnLapHoaDon.add(this.mntmThemHoaDonMoi);
        this.mntmHuyHoaDon = new JMenuItem("Hủy hóa đơn        Esc");
        this.mntmHuyHoaDon.setIcon(new ImageIcon("Hinh\\delete.png"));
        this.mntmHuyHoaDon.setFont(new Font("Times New Roman", 0, 18));
        this.mntmHuyHoaDon.setAccelerator(KeyStroke.getKeyStroke(69, 8));
        this.mntmHuyHoaDon.setAccelerator(KeyStroke.getKeyStroke('\u001b'));
        mnLapHoaDon.add(this.mntmHuyHoaDon);
        JMenuBar menuBar_2 = new JMenuBar();
        toolBar.add(menuBar_2);
        this.mnXemHoaDon = new JMenu("Xem Hóa Đơn      ");
        this.mnXemHoaDon.addMenuListener(new MenuListener() {
            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }

            public void menuSelected(MenuEvent e) {
                FrmManHinhChinh.tabbedPane.remove(FrmManHinhChinh.tabbedPane.getSelectedComponent());
                FrmManHinhChinh.tabbedPane.add(FrmQuanLyHoaDon.contentPane);
                FrmManHinhChinh.tabbedPane.setSelectedComponent(FrmQuanLyHoaDon.contentPane);
            }
        });
        this.mnXemHoaDon.setIcon(new ImageIcon("Hinh\\hoadon.png"));
        this.mnXemHoaDon.setFont(new Font("Times New Roman", 0, 20));
        this.mnXemHoaDon.setMnemonic(113);
        menuBar_2.add(this.mnXemHoaDon);
        JMenuBar menuThuoc = new JMenuBar();
        menuThuoc.setFont(new Font("Times New Roman", 0, 20));
        toolBar.add(menuThuoc);
        JMenu mnThuoc = new JMenu("Thuốc      ");
        mnThuoc.setIcon(new ImageIcon("Hinh\\pill-29114.jpg"));
        mnThuoc.setFont(new Font("Times New Roman", 0, 20));
        menuThuoc.add(mnThuoc);
        this.mntmXemThongTinThuoc = new JMenuItem("Xem thông tin thuốc");
        this.mntmXemThongTinThuoc.setFont(new Font("Times New Roman", 0, 18));
        this.mntmXemThongTinThuoc.setIcon(new ImageIcon("Hinh\\xemThongTinThuoc.jpg"));
        this.mntmXemThongTinThuoc.setAccelerator(KeyStroke.getKeyStroke(114, 8));
        mnThuoc.add(this.mntmXemThongTinThuoc);
        mntmQuanLyThuoc = new JMenuItem("Quản lý danh mục thuốc");
        mntmQuanLyThuoc.setIcon(new ImageIcon("Hinh\\IconThuocThongKe.jpg"));
        mntmQuanLyThuoc.setFont(new Font("Times New Roman", 0, 18));
        mntmQuanLyThuoc.setAccelerator(KeyStroke.getKeyStroke(115, 8));
        mnThuoc.add(mntmQuanLyThuoc);
        JMenuBar menuThongKe = new JMenuBar();
        toolBar.add(menuThongKe);
        mnThongKe = new JMenu("Thống Kê       ");
        mnThongKe.setIcon(new ImageIcon("Hinh\\iconthongke.jpg"));
        mnThongKe.setFont(new Font("Times New Roman", 0, 20));
        menuThongKe.add(mnThongKe);
        this.mntmThongKeHoaDon = new JMenuItem("Thống kê hóa đơn lập theo nhân viên");
        this.mntmThongKeHoaDon.setFont(new Font("Times New Roman", 0, 18));
        this.mntmThongKeHoaDon.setIcon(new ImageIcon("Hinh\\customer.png"));
        this.mntmThongKeHoaDon.setAccelerator(KeyStroke.getKeyStroke(116, 8));
        mnThongKe.add(this.mntmThongKeHoaDon);
        this.mntmThongKeTinhTrangThuoc = new JMenuItem("Thống kê tình trạng thuốc");
        this.mntmThongKeTinhTrangThuoc.setIcon(new ImageIcon("Hinh\\IconThuoc.png"));
        this.mntmThongKeTinhTrangThuoc.setFont(new Font("Times New Roman", 0, 18));
        this.mntmThongKeTinhTrangThuoc.setAccelerator(KeyStroke.getKeyStroke(117, 8));
        mnThongKe.add(this.mntmThongKeTinhTrangThuoc);
        this.mntmThongKeDoanhThu = new JMenuItem("Thống kê doanh thu");
        this.mntmThongKeDoanhThu.setIcon(new ImageIcon("Hinh\\thongke.png"));
        this.mntmThongKeDoanhThu.setFont(new Font("Times New Roman", 0, 18));
        this.mntmThongKeDoanhThu.setAccelerator(KeyStroke.getKeyStroke(118, 8));
        mnThongKe.add(this.mntmThongKeDoanhThu);
        JMenuBar menuKhachHang = new JMenuBar();
        toolBar.add(menuKhachHang);
        JMenuBar menuNhanVien = new JMenuBar();
        menuKhachHang.add(menuNhanVien);
        mnNhanVien = new JMenu("Nhân Viên    ");
        mnNhanVien.addMenuListener(new MenuListener() {
            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }

            public void menuSelected(MenuEvent e) {
                FrmManHinhChinh.tabbedPane.remove(FrmManHinhChinh.tabbedPane.getSelectedComponent());
                FrmManHinhChinh.tabbedPane.add(FrmQuanLyNhanVien.pnlTabQLNV);
            }
        });
        mnNhanVien.setIcon(new ImageIcon("Hinh\\NhanVien.jpg"));
        mnNhanVien.setFont(new Font("Times New Roman", 0, 20));
        mnNhanVien.setMnemonic(119);
        menuNhanVien.add(mnNhanVien);
        JMenu mnKhachHang = new JMenu("Khách Hàng                            ");
        mnKhachHang.setIcon(new ImageIcon("Hinh\\customer.png"));
        mnKhachHang.setFont(new Font("Times New Roman", 0, 20));
        mnKhachHang.setEnabled(true);
        menuKhachHang.add(mnKhachHang);
        this.mntmThongTinKhachHang = new JMenuItem("Thông tin khách hàng  ");
        this.mntmThongTinKhachHang.setIcon(new ImageIcon("Hinh\\ListKhachHang.png"));
        this.mntmThongTinKhachHang.setAccelerator(KeyStroke.getKeyStroke(120, 8));
        this.mntmThongTinKhachHang.setFont(new Font("Times New Roman", 0, 18));
        mnKhachHang.add(this.mntmThongTinKhachHang);
        JMenuBar menuThongTinCaNhan = new JMenuBar();
        toolBar.add(menuThongTinCaNhan);
        JMenu mnThongTinCaNhan = new JMenu("Thông Tin Cá Nhân");
        mnThongTinCaNhan.addMenuListener(new MenuListener() {
            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }

            public void menuSelected(MenuEvent e) {
                FrmManHinhChinh.tabbedPane.remove(FrmManHinhChinh.tabbedPane.getSelectedComponent());
                FrmManHinhChinh.tabbedPane.add(FrmXemThongTinCaNhan.pnlTabXemThongTinCaNhan);
            }
        });
        mnThongTinCaNhan.setIcon(new ImageIcon("Hinh\\ThongTinCaNhan.png"));
        mnThongTinCaNhan.setFont(new Font("Times New Roman", 0, 20));
        menuThongTinCaNhan.add(mnThongTinCaNhan);
        mnThongTinCaNhan.setMnemonic(121);
        JMenuBar menuDangNhap = new JMenuBar();
        toolBar.add(menuDangNhap);
        JMenu mnDangNhap_DangXuat = new JMenu("");
        mnDangNhap_DangXuat.setFont(new Font("Times New Roman", 0, 20));
        mnDangNhap_DangXuat.setIcon(new ImageIcon("Hinh\\close2222.png"));
        menuDangNhap.add(mnDangNhap_DangXuat);
        this.mntmDangXuat = new JMenuItem("Đăng xuất");
        this.mntmDangXuat.setIcon(new ImageIcon("Hinh\\logout.png"));
        this.mntmDangXuat.setFont(new Font("Times New Roman", 0, 18));
        mnDangNhap_DangXuat.setMnemonic(122);
        mnDangNhap_DangXuat.add(this.mntmDangXuat);
        tabbedPane = new JTabbedPane(4);
        tabbedPane.setBackground(Color.WHITE);
        this.contentPane.add(tabbedPane, "Center");
        this.mntmThemHoaDonMoi.addActionListener(this);
        this.mntmHuyHoaDon.addActionListener(this);
        this.mnXemHoaDon.addActionListener(this);
        this.mnXemHoaDon.addMenuListener(this);
        this.mntmXemThongTinThuoc.addActionListener(this);
        mntmQuanLyThuoc.addActionListener(this);
        this.mntmThongKeHoaDon.addActionListener(this);
        this.mntmThongKeTinhTrangThuoc.addActionListener(this);
        this.mntmThongKeDoanhThu.addActionListener(this);
        this.mntmThongTinKhachHang.addActionListener(this);
        this.mntmDangXuat.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.mntmThemHoaDonMoi)) {
            try {
                FrmLapHoaDon.cboTimKiemThuoc.removeAllItems();
            } catch (Exception var4) {
            }

            tabbedPane.remove(tabbedPane.getSelectedComponent());
            this.frmLapHoaDon = new FrmLapHoaDon();
            tabbedPane.add(FrmLapHoaDon.jp1);
        } else if (obj.equals(this.mntmHuyHoaDon)) {
            tabbedPane.remove(FrmLapHoaDon.jp1);
        } else if (obj.equals(this.mntmXemThongTinThuoc)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            new FrmThuoc();
            FrmThuoc.pnlChucNang.remove(FrmThuoc.btnThem);
            FrmThuoc.pnlChucNang.remove(FrmThuoc.btnLuu);
            FrmThuoc.pnlChucNang.remove(FrmThuoc.btnXoa);
            FrmThuoc.pnlChucNang.remove(FrmThuoc.btnSua);
            tabbedPane.add(FrmThuoc.contentPane);
        } else if (obj.equals(mntmQuanLyThuoc)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            new FrmThuoc();
            tabbedPane.add(FrmThuoc.contentPane);
        } else if (obj.equals(this.mntmThongKeHoaDon)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            tabbedPane.add(FrmBaoCaoThongKe.pnlToanPhan);
        } else if (obj.equals(this.mntmThongKeTinhTrangThuoc)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            tabbedPane.add(FrmBaoCaoThongKe.pnlThongkeTTThuoc);
        } else if (obj.equals(this.mntmThongKeDoanhThu)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            tabbedPane.add(FrmBaoCaoThongKe.pnlThongKeBaoCao);
        } else if (obj.equals(this.mntmThongTinKhachHang)) {
            tabbedPane.remove(tabbedPane.getSelectedComponent());
            tabbedPane.add(FrmKhachHang.contentPane);
        } else if (obj.equals(this.mntmDangXuat)) {
            this.setVisible(false);
            FrmDangNhap.TrangThaiDangNhapNhanVien = false;
            FrmDangNhap.TrangThaiDangNhapQuanLy = false;
            FrmDangNhap frmDangNhap = new FrmDangNhap();
            frmDangNhap.setVisible(true);
        }

    }

    public void menuSelected(MenuEvent e) {
    }

    public void menuDeselected(MenuEvent e) {
    }

    public void menuCanceled(MenuEvent e) {
    }
}
