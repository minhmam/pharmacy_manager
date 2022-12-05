//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class FrmCT_HoaDon extends JFrame {
    private JPanel contentPane;
    private JTextField txtMaHD;
    private JTextField txtDonGia;
    private JTextField txtGiamGia;
    private JTextField txtMaThuoc;
    private JTextField txtDonViTinh;
    private JTextField textField;
    private JTable table;
    private JScrollPane scrollPane;
    DefaultTableModel tablemodel2 = new DefaultTableModel();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmCT_HoaDon frame = new FrmCT_HoaDon();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmCT_HoaDon() {
        this.setTitle("Thông tin chi tiết hóa đơn");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 850, 600);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(new Color(240, 255, 255));
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel.setBounds(10, 11, 814, 550);
        this.contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 11, 794, 71);
        panel_1.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel_1.setBackground(SystemColor.controlHighlight);
        panel.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        JLabel lblNewLabel = new JLabel("Thông Tin Chi Tiết Hóa Đơn");
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setFont(new Font("Tahoma", 1, 18));
        lblNewLabel.setBounds(268, 11, 356, 49);
        panel_1.add(lblNewLabel);
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 93, 794, 178);
        panel_2.setBackground(SystemColor.controlHighlight);
        panel_2.setBorder(new BevelBorder(1, (Color)null, (Color)null, (Color)null, (Color)null));
        panel.add(panel_2);
        panel_2.setLayout((LayoutManager)null);
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.controlHighlight);
        panel_3.setBorder(new TitledBorder((Border)null, "Thông tin chi tiết hóa đơn", 4, 2, (Font)null, (Color)null));
        panel_3.setBounds(10, 11, 761, 156);
        panel_2.add(panel_3);
        panel_3.setLayout((LayoutManager)null);
        JLabel lblMaHD = new JLabel("Mã Hóa  Đơn");
        lblMaHD.setBounds(31, 37, 69, 14);
        panel_3.add(lblMaHD);
        this.txtMaHD = new JTextField();
        this.txtMaHD.setBounds(120, 34, 141, 31);
        panel_3.add(this.txtMaHD);
        this.txtMaHD.setColumns(10);
        JLabel lblMThuc = new JLabel("Mã Thuốc");
        lblMThuc.setBounds(271, 37, 88, 14);
        panel_3.add(lblMThuc);
        JLabel lblSLng = new JLabel("Số Lượng");
        lblSLng.setBounds(497, 37, 88, 14);
        panel_3.add(lblSLng);
        JLabel lblnGi = new JLabel("Đơn Giá");
        lblnGi.setBounds(31, 104, 69, 14);
        panel_3.add(lblnGi);
        this.txtDonGia = new JTextField();
        this.txtDonGia.setColumns(10);
        this.txtDonGia.setBounds(120, 96, 141, 31);
        panel_3.add(this.txtDonGia);
        JLabel lblGimGi = new JLabel("Giảm Giá");
        lblGimGi.setBounds(271, 104, 88, 14);
        panel_3.add(lblGimGi);
        JLabel lblnVTnh = new JLabel("Đơn Vị Tính");
        lblnVTnh.setBounds(484, 104, 88, 14);
        panel_3.add(lblnVTnh);
        this.txtGiamGia = new JTextField();
        this.txtGiamGia.setColumns(10);
        this.txtGiamGia.setBounds(327, 96, 141, 31);
        panel_3.add(this.txtGiamGia);
        this.txtMaThuoc = new JTextField();
        this.txtMaThuoc.setColumns(10);
        this.txtMaThuoc.setBounds(327, 34, 141, 31);
        panel_3.add(this.txtMaThuoc);
        this.txtDonViTinh = new JTextField();
        this.txtDonViTinh.setColumns(10);
        this.txtDonViTinh.setBounds(568, 96, 141, 31);
        panel_3.add(this.txtDonViTinh);
        this.textField = new JTextField();
        this.textField.setColumns(10);
        this.textField.setBounds(568, 34, 141, 31);
        panel_3.add(this.textField);
        this.scrollPane = new JScrollPane();
        this.scrollPane.setBounds(10, 282, 794, 257);
        panel.add(this.scrollPane);
        this.table = new JTable();
        String[] tq = new String[]{"STT", "Mã Hóa Đơn", "Mã Thuốc", "Đơn Giá", "Giảm Giá", "Số Lượng", "Đơn Vị Tính"};
        this.tablemodel2 = new DefaultTableModel(tq, 0);
        this.table.setModel(new DefaultTableModel(new Object[0][], new String[]{"STT", "Mã Hóa  Đơn", "Mã Thuốc", "Đơn Giá", "Giảm Giá", "Số Lượng", "Đơn Vị Tính"}));
        this.scrollPane.setViewportView(this.table);
    }
}
