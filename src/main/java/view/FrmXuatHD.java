//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class FrmXuatHD extends JFrame implements Printable, ActionListener {
    private static JPanel contentPane;
    public static JTable table;
    public static JLabel lblQLT;
    public static JLabel lblMSThue;
    public static JLabel lblDiaChi;
    public static JLabel lblDienThoai;
    public static JLabel lblGPKD;
    public static JLabel lblMHDon;
    public static JLabel lblLoaiHD;
    public static JLabel lblHD;
    public static JLabel lblNgayLap;
    public static JLabel lblHoTenKH;
    public static JLabel lblDiaChiKH;
    public static JLabel lblNamSinh;
    public static JLabel lblSDTKH;
    public static JLabel lblGioiTinh;
    public static JLabel lblTenKH1;
    public static JLabel lblLoaiHD1;
    public static JLabel lblMaHD;
    public static JLabel lblNgayLap1;
    public static JLabel lblGTinh1;
    public static JLabel lblDCKH1;
    public static JLabel lblNamSinh1;
    public static JLabel lblsdtkh1;
    public static JLabel lblSL;
    public static JLabel lblTongTThuoc;
    public static JLabel lblTongT;
    public static JLabel lblNguoiBan;
    public static JLabel lblNguoiMuaHang1;
    private static JPanel panel;
    public static DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmXuatHD frame = new FrmXuatHD();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmXuatHD() {
        this.setTitle("HÓA ĐƠN QUẢN LÝ HIỆU THUỐC");
        this.setDefaultCloseOperation(2);
        this.setExtendedState(6);
        this.setSize(1199, 775);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setResizable(false);
        this.setLocationRelativeTo((Component)null);
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager)null);
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(new LineBorder(new Color(0, 0, 128), 1, true));
        panel.setBounds(432, 11, 616, 724);
        contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        lblQLT = new JLabel("QUẦY THUỐC BỆNH VIỆN TÂY NAM");
        lblQLT.setBounds(149, 11, 301, 27);
        lblQLT.setFont(new Font("Tahoma", 1, 16));
        lblQLT.setForeground(new Color(255, 0, 0));
        panel.add(lblQLT);
        lblMSThue = new JLabel("Mã số thuế:");
        lblMSThue.setBounds(33, 38, 75, 14);
        lblMSThue.setForeground(new Color(0, 0, 255));
        lblMSThue.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblMSThue);
        lblDiaChi = new JLabel("Địa chỉ:");
        lblDiaChi.setBounds(33, 93, 58, 14);
        lblDiaChi.setForeground(Color.BLUE);
        lblDiaChi.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblDiaChi);
        lblDienThoai = new JLabel("Điện thoại:");
        lblDienThoai.setBounds(33, 52, 75, 14);
        lblDienThoai.setForeground(Color.BLUE);
        lblDienThoai.setFont(new Font("Tahoma", 0, 14));
        panel.add(lblDienThoai);
        lblGPKD = new JLabel("GPKD số:");
        lblGPKD.setBounds(33, 67, 75, 20);
        lblGPKD.setForeground(Color.BLUE);
        lblGPKD.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblGPKD);
        lblMHDon = new JLabel("Mã hóa đơn:");
        lblMHDon.setBounds(365, 38, 75, 14);
        lblMHDon.setForeground(Color.BLUE);
        lblMHDon.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblMHDon);
        lblLoaiHD = new JLabel("Loại hóa đơn:");
        lblLoaiHD.setBounds(365, 52, 85, 20);
        lblLoaiHD.setForeground(Color.BLUE);
        lblLoaiHD.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblLoaiHD);
        lblHD = new JLabel("HÓA ĐƠN ");
        lblHD.setBounds(202, 111, 193, 35);
        lblHD.setHorizontalAlignment(0);
        lblHD.setForeground(new Color(0, 0, 255));
        lblHD.setFont(new Font("Tahoma", 1, 15));
        panel.add(lblHD);
        lblNgayLap = new JLabel("Ngày lập:");
        lblNgayLap.setBounds(399, 83, 75, 20);
        lblNgayLap.setForeground(Color.BLUE);
        lblNgayLap.setFont(new Font("Times New Roman", 0, 14));
        panel.add(lblNgayLap);
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(10, 176, 596, 84);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 1, true));
        panel.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        lblHoTenKH = new JLabel("Họ tên Khách hàng:");
        lblHoTenKH.setForeground(new Color(0, 0, 255));
        lblHoTenKH.setFont(new Font("Times New Roman", 0, 14));
        lblHoTenKH.setBounds(10, 11, 116, 14);
        panel_1.add(lblHoTenKH);
        lblDiaChiKH = new JLabel("Địa chỉ:");
        lblDiaChiKH.setForeground(Color.BLUE);
        lblDiaChiKH.setFont(new Font("Times New Roman", 0, 14));
        lblDiaChiKH.setBounds(10, 61, 75, 14);
        panel_1.add(lblDiaChiKH);
        lblNamSinh = new JLabel("Năm sinh:");
        lblNamSinh.setForeground(Color.BLUE);
        lblNamSinh.setFont(new Font("Times New Roman", 0, 14));
        lblNamSinh.setBounds(296, 11, 75, 14);
        panel_1.add(lblNamSinh);
        lblSDTKH = new JLabel("Số điện thoại:");
        lblSDTKH.setForeground(Color.BLUE);
        lblSDTKH.setFont(new Font("Times New Roman", 0, 14));
        lblSDTKH.setBounds(296, 36, 106, 14);
        panel_1.add(lblSDTKH);
        lblGioiTinh = new JLabel("Giới tính:");
        lblGioiTinh.setForeground(Color.BLUE);
        lblGioiTinh.setFont(new Font("Tahoma", 0, 14));
        lblGioiTinh.setBounds(10, 36, 67, 17);
        panel_1.add(lblGioiTinh);
        lblTenKH1 = new JLabel("");
        lblTenKH1.setFont(new Font("Times New Roman", 0, 13));
        lblTenKH1.setBounds(128, 12, 147, 14);
        panel_1.add(lblTenKH1);
        lblNamSinh1 = new JLabel("");
        lblNamSinh1.setFont(new Font("Times New Roman", 0, 13));
        lblNamSinh1.setBounds(380, 12, 122, 14);
        panel_1.add(lblNamSinh1);
        lblsdtkh1 = new JLabel("");
        lblsdtkh1.setFont(new Font("Times New Roman", 0, 13));
        lblsdtkh1.setBounds(380, 37, 122, 14);
        panel_1.add(lblsdtkh1);
        lblDCKH1 = new JLabel("");
        lblDCKH1.setFont(new Font("Times New Roman", 0, 13));
        lblDCKH1.setBounds(66, 61, 390, 14);
        panel_1.add(lblDCKH1);
        lblGTinh1 = new JLabel("");
        lblGTinh1.setBounds(78, 36, 106, 14);
        panel_1.add(lblGTinh1);
        JLabel lblDHTTThuoc = new JLabel("THANH TOÁN THUỐC");
        lblDHTTThuoc.setBounds(202, 138, 193, 27);
        lblDHTTThuoc.setHorizontalAlignment(0);
        lblDHTTThuoc.setForeground(new Color(0, 0, 255));
        lblDHTTThuoc.setFont(new Font("Tahoma", 1, 15));
        panel.add(lblDHTTThuoc);
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setViewportBorder(new LineBorder(new Color(0, 0, 128), 1, true));
        scrollPane_1.setBounds(10, 263, 596, 308);
        panel.add(scrollPane_1);
        String[] tb = new String[]{"STT", "Tên Thuốc", "ĐVT", "Đơn Giá", "Số Lượng", "Giảm Giá(%)", "Thành Tiền"};
        tableModel = new DefaultTableModel(tb, 0);
        table = new JTable(tableModel);
        table.setBackground(Color.WHITE);
        table.getColumnModel().getColumn(0).setPreferredWidth(10);
        table.getColumnModel().getColumn(1).setPreferredWidth(104);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(63);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        scrollPane_1.setViewportView(table);
        JLabel lblNguoiMuaHang = new JLabel("Người mua hàng");
        lblNguoiMuaHang.setBounds(41, 650, 134, 14);
        lblNguoiMuaHang.setForeground(Color.BLUE);
        lblNguoiMuaHang.setFont(new Font("Tahoma", 1, 12));
        panel.add(lblNguoiMuaHang);
        JLabel lblkghiRH = new JLabel("(Kí,ghi rõ họ tên)");
        lblkghiRH.setBounds(18, 662, 134, 14);
        lblkghiRH.setHorizontalAlignment(0);
        lblkghiRH.setForeground(Color.BLUE);
        lblkghiRH.setFont(new Font("Tahoma", 2, 10));
        panel.add(lblkghiRH);
        JLabel lblNguoiBanHang = new JLabel("Người bán hàng");
        lblNguoiBanHang.setBounds(444, 650, 134, 14);
        lblNguoiBanHang.setForeground(Color.BLUE);
        lblNguoiBanHang.setFont(new Font("Tahoma", 1, 12));
        panel.add(lblNguoiBanHang);
        JLabel label_1 = new JLabel("(Kí,ghi rõ họ tên)");
        label_1.setBounds(444, 662, 134, 14);
        label_1.setForeground(Color.BLUE);
        label_1.setFont(new Font("Tahoma", 2, 10));
        panel.add(label_1);
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        panel_2.setBounds(10, 572, 596, 35);
        panel_2.setBorder(new LineBorder(new Color(0, 0, 128), 1, true));
        panel.add(panel_2);
        panel_2.setLayout((LayoutManager)null);
        JLabel lblTongTienTh = new JLabel("Tổng tiền thuốc:");
        lblTongTienTh.setForeground(Color.BLUE);
        lblTongTienTh.setFont(new Font("Times New Roman", 0, 14));
        lblTongTienTh.setBounds(289, 6, 106, 24);
        panel_2.add(lblTongTienTh);
        JLabel lblSLuong = new JLabel("Số lượng:");
        lblSLuong.setForeground(Color.BLUE);
        lblSLuong.setFont(new Font("Times New Roman", 0, 14));
        lblSLuong.setBounds(10, 11, 66, 19);
        panel_2.add(lblSLuong);
        lblSL = new JLabel("");
        lblSL.setHorizontalAlignment(2);
        lblSL.setBounds(75, 12, 31, 14);
        panel_2.add(lblSL);
        lblTongTThuoc = new JLabel("");
        lblTongTThuoc.setHorizontalAlignment(4);
        lblTongTThuoc.setBounds(386, 11, 132, 19);
        panel_2.add(lblTongTThuoc);
        JLabel label_3 = new JLabel("(VND)");
        label_3.setForeground(Color.BLUE);
        label_3.setFont(new Font("Tahoma", 0, 12));
        label_3.setBounds(537, 11, 40, 14);
        panel_2.add(label_3);
        JLabel lblThueXuat = new JLabel("Thuế suất(VAT):");
        lblThueXuat.setBounds(104, 11, 106, 14);
        panel_2.add(lblThueXuat);
        lblThueXuat.setForeground(Color.BLUE);
        lblThueXuat.setFont(new Font("Times New Roman", 0, 14));
        JLabel lblThue = new JLabel("5");
        lblThue.setHorizontalAlignment(4);
        lblThue.setBounds(208, 11, 31, 14);
        panel_2.add(lblThue);
        JLabel label_2 = new JLabel("%");
        label_2.setBounds(248, 11, 31, 14);
        panel_2.add(label_2);
        label_2.setForeground(Color.BLUE);
        label_2.setFont(new Font("Tahoma", 0, 12));
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        panel_3.setLayout((LayoutManager)null);
        panel_3.setBorder(new LineBorder(new Color(0, 0, 128)));
        panel_3.setBounds(10, 604, 596, 35);
        panel.add(panel_3);
        JLabel lblTongThanhToan = new JLabel("Tổng tiền thanh toán:");
        lblTongThanhToan.setBounds(227, 12, 133, 23);
        panel_3.add(lblTongThanhToan);
        lblTongThanhToan.setForeground(Color.BLUE);
        lblTongThanhToan.setFont(new Font("Times New Roman", 0, 14));
        lblTongT = new JLabel("");
        lblTongT.setHorizontalAlignment(4);
        lblTongT.setBounds(349, 12, 169, 23);
        panel_3.add(lblTongT);
        JLabel lblvnd = new JLabel("(VND)");
        lblvnd.setForeground(Color.BLUE);
        lblvnd.setFont(new Font("Tahoma", 0, 12));
        lblvnd.setBounds(539, 12, 38, 14);
        panel_3.add(lblvnd);
        JLabel label_4 = new JLabel("");
        label_4.setHorizontalAlignment(4);
        label_4.setBounds(130, 12, 116, 14);
        panel_3.add(label_4);
        JLabel lblMaSoThue = new JLabel("0107853191");
        lblMaSoThue.setFont(new Font("Times New Roman", 0, 14));
        lblMaSoThue.setBounds(107, 38, 106, 14);
        panel.add(lblMaSoThue);
        JLabel lblSDT1 = new JLabel("0802.090.301  - 0975.326.451");
        lblSDT1.setFont(new Font("Tahoma", 0, 14));
        lblSDT1.setBounds(107, 54, 199, 14);
        panel.add(lblSDT1);
        JLabel lblGPDK1 = new JLabel(" 0117070000067");
        lblGPDK1.setFont(new Font("Times New Roman", 0, 14));
        lblGPDK1.setBounds(107, 71, 106, 14);
        panel.add(lblGPDK1);
        JLabel lblDiaChi1 = new JLabel("56 Quang Trung - Quận Gò Vấp - Tp.Hồ Chí Minh");
        lblDiaChi1.setFont(new Font("Times New Roman", 0, 14));
        lblDiaChi1.setBounds(88, 87, 295, 27);
        panel.add(lblDiaChi1);
        lblMaHD = new JLabel("");
        lblMaHD.setBounds(435, 38, 162, 14);
        panel.add(lblMaHD);
        lblLoaiHD1 = new JLabel("");
        lblLoaiHD1.setBounds(460, 52, 120, 14);
        panel.add(lblLoaiHD1);
        lblNgayLap1 = new JLabel("");
        lblNgayLap1.setBounds(471, 88, 126, 14);
        panel.add(lblNgayLap1);
        lblNguoiBan = new JLabel("");
        lblNguoiBan.setHorizontalAlignment(0);
        lblNguoiBan.setFont(new Font("Times New Roman", 0, 16));
        lblNguoiBan.setBounds(410, 675, 168, 27);
        panel.add(lblNguoiBan);
        lblNguoiMuaHang1 = new JLabel("");
        lblNguoiMuaHang1.setHorizontalAlignment(0);
        lblNguoiMuaHang1.setFont(new Font("Times New Roman", 0, 15));
        lblNguoiMuaHang1.setBounds(18, 675, 157, 30);
        panel.add(lblNguoiMuaHang1);
    }

    public void printingHoaDon() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

    }

    public void actionPerformed(ActionEvent e) {
    }

    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        Graphics2D g2d = (Graphics2D)graphics;
        if (pageIndex > 0) {
            return 1;
        } else {
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            panel.printAll(graphics);
            return 0;
        }
    }
}
