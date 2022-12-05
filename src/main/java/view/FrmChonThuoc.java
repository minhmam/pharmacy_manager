//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.LapHoaDonDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class FrmChonThuoc extends JFrame implements ActionListener {
    private JPanel contentPane;
    public static JTable table;
    private JButton btnThem;
    public static DefaultTableModel tableModel;
    private LapHoaDonDAO lapHoaDonDAO = new LapHoaDonDAO();
    public static JLabel lblThuocCoTen;
    private JMenuItem mntmThm;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmChonThuoc frame = new FrmChonThuoc();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmChonThuoc() {
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.setBounds(100, 100, 1312, 498);
        this.contentPane = new JPanel();
        this.contentPane.setBackground(Color.WHITE);
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 1296, 61);
        this.contentPane.add(panel);
        panel.setLayout((LayoutManager)null);
        lblThuocCoTen = new JLabel("THUỐC CÓ TÊN ");
        lblThuocCoTen.setBackground(Color.WHITE);
        lblThuocCoTen.setFont(new Font("Times New Roman", 0, 30));
        lblThuocCoTen.setHorizontalAlignment(0);
        lblThuocCoTen.setBounds(10, 11, 1091, 39);
        panel.add(lblThuocCoTen);
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(0, 63, 1296, 345);
        this.contentPane.add(panel_1);
        panel_1.setLayout((LayoutManager)null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setFont(new Font("Times New Roman", 0, 20));
        scrollPane.setInheritsPopupMenu(true);
        scrollPane.setVerticalScrollBarPolicy(22);
        scrollPane.setBounds(10, 24, 1286, 310);
        panel_1.add(scrollPane);
        String[] tb = new String[]{"Mã", "Nhóm Thuốc", "Tên Thuốc", "Loại Thuốc", "Hàm Lượng", "Dạng Bào Chế", "Đơn Vị Tính", "Đơn Giá", "Nhà Cung Cấp"};
        tableModel = new DefaultTableModel(tb, 0);
        table = new JTable(tableModel);
        table.setAutoResizeMode(0);
        table.setCursor(Cursor.getPredefinedCursor(0));
        table.setRowHeight(30);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("Times New Roman", 0, 20));
        table.setSelectionMode(0);
        table.setSurrendersFocusOnKeystroke(true);
        table.setBackground(Color.WHITE);
        table.getColumnModel().getColumn(0).setPreferredWidth(40);
        table.getColumnModel().getColumn(1).setPreferredWidth(220);
        table.getColumnModel().getColumn(2).setPreferredWidth(220);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(150);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);
        table.getColumnModel().getColumn(7).setPreferredWidth(150);
        table.getColumnModel().getColumn(8).setPreferredWidth(350);
        table.setDefaultEditor(Object.class, (TableCellEditor)null);
        scrollPane.setViewportView(table);
        JPopupMenu popupMenu = new JPopupMenu();
        addPopup(table, popupMenu);
        this.mntmThm = new JMenuItem("Thêm");
        this.mntmThm.setFont(new Font("Times New Roman", 0, 20));
        popupMenu.add(this.mntmThm);
        this.btnThem = new JButton("");
        this.btnThem.setBackground(Color.WHITE);
        this.btnThem.setIcon(new ImageIcon("Hinh\\add.png"));
        this.btnThem.setBounds(563, 419, 67, 29);
        this.contentPane.add(this.btnThem);
        this.btnThem.addActionListener(this);
        this.mntmThm.addActionListener(this);
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

    public static void xoaDuLieuTableModel() {
        tableModel.addRow(new Object[0]);
        tableModel = (DefaultTableModel)table.getModel();
        tableModel.getDataVector().removeAllElements();
    }

    public void themThuoc() {
        int row = table.getSelectedRow();
        int maThuoc = Integer.parseInt(table.getValueAt(row, 0).toString());
        boolean check = true;

        while(check) {
            try {
                String soLuongThuocObj = JOptionPane.showInputDialog("Nhập số lượng thuốc mua.", 1);
                if (soLuongThuocObj == null) {
                    check = false;
                } else if (soLuongThuocObj != null) {
                    if (soLuongThuocObj.matches("^[0-9]+$")) {
                        int soLuongThuocInt = Integer.parseInt(soLuongThuocObj.toString());
                        if (LapHoaDonDAO.soLuongThuocDaBan(maThuoc) + soLuongThuocInt <= this.lapHoaDonDAO.soLuongNhap(maThuoc)) {
                            FrmLapHoaDon.txtSoLuong.setText(soLuongThuocObj);
                            FrmLapHoaDon.danhSachThuocTheoMaThuoc(maThuoc);
                            this.setVisible(false);
                            check = false;
                        } else {
                            JOptionPane.showMessageDialog(this, "Số Lượng Thuốc Cần Mua Vượt Giới Hạn Thuốc Trong Kho!\n Nhập Số Lượng Ít Hơn " + (this.lapHoaDonDAO.soLuongNhap(maThuoc) - LapHoaDonDAO.soLuongThuocDaBan(maThuoc)));
                        }
                    } else {
                        JOptionPane.showMessageDialog((Component)null, "Số Lượng Phải Nhập Bằng Chữ!");
                        check = true;
                    }
                }
            } catch (NullPointerException var6) {
            } catch (NumberFormatException var7) {
                var7.printStackTrace();
            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnThem)) {
            this.themThuoc();
        } else if (obj.equals(this.mntmThm)) {
            this.themThuoc();
        }

    }
}
