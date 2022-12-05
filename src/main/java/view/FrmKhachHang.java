//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import com.toedter.calendar.JDateChooser;
import dao.KhachHangDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import model.DiaChi;
import model.KhachHang;

public class FrmKhachHang extends JFrame implements ActionListener, MouseListener {
    private static final long serialVersionUID = -4885536806341977801L;
    public static JPanel contentPane;
    private JTextField txtMa;
    private JTextField txtHo;
    private JTextField txtSoCMND;
    private JTextField txtDiaChi;
    private JTextField txtSDT;
    private JTable tblKH;
    private JTextField txtTen;
    private JTextField txtTim;
    private JDateChooser dateCNgaySinh;
    private JButton btnSua;
    private JButton btnXoaRong;
    private JButton btnTim;
    private JButton btnThoat;
    private JRadioButton radNam;
    private JRadioButton radNu;
    private JRadioButton radMa;
    private JRadioButton radSDT;
    private JRadioButton radTen;
    private JRadioButton radCMND;
    private DefaultTableModel model;
    KhachHangDAO khDao = new KhachHangDAO();
    private ButtonGroup buttonGroupGioiTinh;
    private JTextField txtMaDiaChi;
    private JLabel lblMaDiaChi;
    private JButton btnLamMoi;
    private ButtonGroup buttonGroupTim;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmKhachHang frame = new FrmKhachHang();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmKhachHang() {
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 1354, 675);
        this.setLocationRelativeTo((Component)null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(contentPane);
        contentPane.setLayout((LayoutManager)null);
        JPanel pnlKH = new JPanel();
        pnlKH.setBounds(10, 11, 1318, 614);
        contentPane.add(pnlKH);
        pnlKH.setLayout((LayoutManager)null);
        JLabel lblKH_Ma = new JLabel("Mã:");
        lblKH_Ma.setFont(new Font("Times New Roman", 0, 15));
        lblKH_Ma.setBounds(20, 76, 64, 26);
        pnlKH.add(lblKH_Ma);
        this.txtMa = new JTextField();
        this.txtMa.setEditable(false);
        this.txtMa.setFont(new Font("Times New Roman", 0, 15));
        this.txtMa.setBounds(119, 76, 296, 25);
        pnlKH.add(this.txtMa);
        this.txtMa.setColumns(10);
        JLabel lblKH_Ho = new JLabel("Họ:");
        lblKH_Ho.setFont(new Font("Times New Roman", 0, 15));
        lblKH_Ho.setBounds(460, 77, 54, 21);
        pnlKH.add(lblKH_Ho);
        this.txtHo = new JTextField();
        this.txtHo.setFont(new Font("Times New Roman", 0, 15));
        this.txtHo.setColumns(10);
        this.txtHo.setBounds(536, 77, 296, 25);
        pnlKH.add(this.txtHo);
        JLabel lblKH_NgaySinh = new JLabel("Ngày sinh:");
        lblKH_NgaySinh.setFont(new Font("Times New Roman", 0, 15));
        lblKH_NgaySinh.setBounds(20, 113, 89, 26);
        pnlKH.add(lblKH_NgaySinh);
        JLabel lblKH_SoCMND = new JLabel("Số CMND:");
        lblKH_SoCMND.setFont(new Font("Times New Roman", 0, 15));
        lblKH_SoCMND.setBounds(914, 114, 78, 25);
        pnlKH.add(lblKH_SoCMND);
        this.txtSoCMND = new JTextField();
        this.txtSoCMND.setFont(new Font("Times New Roman", 0, 15));
        this.txtSoCMND.setColumns(10);
        this.txtSoCMND.setBounds(996, 113, 296, 25);
        pnlKH.add(this.txtSoCMND);
        JLabel lblKH_SDT = new JLabel("Số điện thoại \r\n:");
        lblKH_SDT.setFont(new Font("Times New Roman", 0, 15));
        lblKH_SDT.setBounds(20, 150, 99, 26);
        pnlKH.add(lblKH_SDT);
        this.txtDiaChi = new JTextField();
        this.txtDiaChi.setEditable(false);
        this.txtDiaChi.setFont(new Font("Times New Roman", 0, 15));
        this.txtDiaChi.setColumns(10);
        this.txtDiaChi.setBounds(806, 150, 486, 25);
        pnlKH.add(this.txtDiaChi);
        JLabel lblKH_DiaChi = new JLabel("Địa chỉ:");
        lblKH_DiaChi.setFont(new Font("Times New Roman", 0, 15));
        lblKH_DiaChi.setBounds(730, 152, 54, 21);
        pnlKH.add(lblKH_DiaChi);
        this.txtSDT = new JTextField();
        this.txtSDT.setFont(new Font("Times New Roman", 0, 15));
        this.txtSDT.setColumns(10);
        this.txtSDT.setBounds(119, 151, 296, 25);
        pnlKH.add(this.txtSDT);
        this.btnSua = new JButton("Cập nhật");
        this.btnSua.setIcon(new ImageIcon("Hinh\\edit.png"));
        this.btnSua.setFont(new Font("Times New Roman", 0, 15));
        this.btnSua.setBounds(161, 200, 120, 30);
        pnlKH.add(this.btnSua);
        JPanel pnlKH1 = new JPanel();
        pnlKH1.setBorder(new TitledBorder((Border)null, "Danh sách khách hàng", 4, 2, (Font)null, (Color)null));
        pnlKH1.setBounds(10, 256, 1298, 236);
        pnlKH.add(pnlKH1);
        pnlKH1.setLayout((LayoutManager)null);
        JScrollPane scrKH = new JScrollPane();
        scrKH.setBounds(10, 22, 1278, 203);
        pnlKH1.add(scrKH);
        String[] tb = new String[]{"STT", "Mã KH", "Họ", "Tên", "Ngày Sinh", "Giới Tính", "Số CMND", "Số ĐT", "Mã Địa Chỉ"};
        this.model = new DefaultTableModel(tb, 0);
        this.tblKH = new JTable(this.model);
        this.tblKH.setFont(new Font("Times New Roman", 0, 15));
        scrKH.setViewportView(this.tblKH);
        JLabel lblKH_GioiTinh = new JLabel("Giới Tính:");
        lblKH_GioiTinh.setFont(new Font("Times New Roman", 0, 15));
        lblKH_GioiTinh.setBounds(460, 113, 68, 26);
        pnlKH.add(lblKH_GioiTinh);
        this.radNam = new JRadioButton("Nam");
        this.radNam.setFont(new Font("Times New Roman", 0, 15));
        this.radNam.setBounds(556, 118, 63, 21);
        pnlKH.add(this.radNam);
        this.radNu = new JRadioButton("Nữ");
        this.radNu.setFont(new Font("Times New Roman", 0, 15));
        this.radNu.setBounds(634, 118, 63, 21);
        pnlKH.add(this.radNu);
        this.buttonGroupGioiTinh = new ButtonGroup();
        this.buttonGroupGioiTinh.add(this.radNam);
        this.buttonGroupGioiTinh.add(this.radNu);
        JLabel lblNewLabel = new JLabel("THÔNG TIN KHÁCH HÀNG");
        lblNewLabel.setFont(new Font("Times New Roman", 1, 25));
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setHorizontalAlignment(0);
        lblNewLabel.setBounds(10, 11, 1298, 54);
        pnlKH.add(lblNewLabel);
        this.dateCNgaySinh = new JDateChooser();
        this.dateCNgaySinh.setBounds(119, 114, 296, 25);
        pnlKH.add(this.dateCNgaySinh);
        this.dateCNgaySinh.setLocale(Locale.forLanguageTag("vi-VN"));
        this.dateCNgaySinh.setDateFormatString("dd/MM/yyyy");
        JLabel lblKH_Ten = new JLabel("Tên:");
        lblKH_Ten.setFont(new Font("Times New Roman", 0, 15));
        lblKH_Ten.setBounds(914, 76, 54, 26);
        pnlKH.add(lblKH_Ten);
        this.txtTen = new JTextField();
        this.txtTen.setFont(new Font("Times New Roman", 0, 15));
        this.txtTen.setColumns(10);
        this.txtTen.setBounds(996, 77, 296, 25);
        pnlKH.add(this.txtTen);
        this.btnXoaRong = new JButton("Xóa rỗng");
        this.btnXoaRong.setIcon(new ImageIcon("Hinh\\empty.png"));
        this.btnXoaRong.setFont(new Font("Times New Roman", 0, 15));
        this.btnXoaRong.setBounds(295, 200, 120, 30);
        pnlKH.add(this.btnXoaRong);
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(1, new Color(255, 255, 255), new Color(160, 160, 160)), "Tìm kiếm theo", 4, 2, (Font)null, new Color(0, 0, 0)));
        panel.setBounds(10, 503, 982, 100);
        pnlKH.add(panel);
        panel.setLayout((LayoutManager)null);
        this.radMa = new JRadioButton("Mã");
        this.radMa.setFont(new Font("Times New Roman", 0, 15));
        this.radMa.setBounds(6, 20, 55, 23);
        panel.add(this.radMa);
        this.radSDT = new JRadioButton("Số ĐT");
        this.radSDT.setFont(new Font("Times New Roman", 0, 15));
        this.radSDT.setBounds(6, 60, 65, 23);
        panel.add(this.radSDT);
        this.radTen = new JRadioButton("Tên");
        this.radTen.setFont(new Font("Times New Roman", 0, 15));
        this.radTen.setBounds(100, 20, 55, 23);
        panel.add(this.radTen);
        this.radCMND = new JRadioButton("Số CMND");
        this.radCMND.setFont(new Font("Times New Roman", 0, 15));
        this.radCMND.setBounds(100, 60, 106, 23);
        panel.add(this.radCMND);
        this.buttonGroupTim = new ButtonGroup();
        this.buttonGroupTim.add(this.radMa);
        this.buttonGroupTim.add(this.radSDT);
        this.buttonGroupTim.add(this.radTen);
        this.buttonGroupTim.add(this.radCMND);
        JLabel lblNhpThngTin = new JLabel("Nhập thông tin tìm kiếm:");
        lblNhpThngTin.setFont(new Font("Times New Roman", 0, 15));
        lblNhpThngTin.setBounds(234, 39, 158, 25);
        panel.add(lblNhpThngTin);
        this.txtTim = new JTextField();
        this.txtTim.setBounds(397, 40, 270, 25);
        panel.add(this.txtTim);
        this.txtTim.setColumns(10);
        this.btnTim = new JButton("Tìm");
        this.btnTim.setIcon(new ImageIcon("Hinh\\search.png"));
        this.btnTim.setFont(new Font("Times New Roman", 0, 15));
        this.btnTim.setBounds(690, 39, 120, 30);
        panel.add(this.btnTim);
        this.btnLamMoi = new JButton("Làm Mới");
        this.btnLamMoi.setIcon(new ImageIcon("Hinh\\refresh.png"));
        this.btnLamMoi.setFont(new Font("Times New Roman", 0, 15));
        this.btnLamMoi.setBounds(835, 39, 120, 30);
        panel.add(this.btnLamMoi);
        this.btnThoat = new JButton("Thoát");
        this.btnThoat.setIcon(new ImageIcon("Hinh\\close.png"));
        this.btnThoat.setFont(new Font("Times New Roman", 0, 15));
        this.btnThoat.setBounds(1091, 546, 120, 30);
        pnlKH.add(this.btnThoat);
        this.txtMaDiaChi = new JTextField();
        this.txtMaDiaChi.setEditable(false);
        this.txtMaDiaChi.setFont(new Font("Times New Roman", 0, 15));
        this.txtMaDiaChi.setColumns(10);
        this.txtMaDiaChi.setBounds(553, 150, 150, 25);
        pnlKH.add(this.txtMaDiaChi);
        this.lblMaDiaChi = new JLabel("Mã đia chỉ:");
        this.lblMaDiaChi.setFont(new Font("Times New Roman", 0, 15));
        this.lblMaDiaChi.setBounds(460, 151, 78, 25);
        pnlKH.add(this.lblMaDiaChi);
        this.btnSua.addActionListener(this);
        this.btnXoaRong.addActionListener(this);
        this.btnTim.addActionListener(this);
        this.btnThoat.addActionListener(this);
        this.btnLamMoi.addActionListener(this);
        this.tblKH.addMouseListener(this);
        this.docDuLieu();
    }

    public void mouseClicked(MouseEvent e) {
        int row = this.tblKH.getSelectedRow();
        int maKH = Integer.parseInt(this.model.getValueAt(row, 1).toString());

        try {
            KhachHang kh = this.khDao.layThongTinKhachHang(maKH);
            this.txtMa.setText(String.valueOf(maKH));
            this.txtTen.setText(kh.getTen());
            this.txtHo.setText(kh.getHo());
            this.dateCNgaySinh.setDate(kh.getNgaySinh());
            String gioiTinh = kh.getGioiTinh().toString().trim();
            if (gioiTinh.equalsIgnoreCase("Nam")) {
                this.radNam.setSelected(true);
                this.radNu.setSelected(false);
            } else {
                this.radNu.setSelected(true);
                this.radNam.setSelected(false);
            }

            this.txtSoCMND.setText(kh.getCmnd());
            this.txtSDT.setText(kh.getSoDienThoai());
            this.txtMaDiaChi.setText(String.valueOf(kh.getDiaChi().getMaDiaChi()));
            int maDC = Integer.parseInt(this.model.getValueAt(row, 8).toString());
            DiaChi dc = this.khDao.layThongTinDiaChi(maDC);
            String soNha = dc.getSoNha();
            String tenDuong = dc.getTenDuong().trim();
            String phuong = dc.getPhuong().trim();
            String quan = dc.getQuan().trim();
            String thanhPho = dc.getThanhPho().trim();
            String quocGia = dc.getQuocGia().trim();
            String diaChi = "";
            if (!soNha.equalsIgnoreCase("") && !tenDuong.equalsIgnoreCase("")) {
                diaChi = soNha + ", " + tenDuong + ", " + phuong + ", " + quan + ", " + thanhPho + ", " + quocGia;
            } else {
                diaChi = phuong + ", " + quan + ", " + thanhPho + ", " + quocGia;
            }

            this.txtDiaChi.setText(diaChi);
        } catch (Exception var15) {
            System.out.println("error mouse clicked");
            var15.printStackTrace();
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

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnThoat)) {
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát !") == 0) {
                FrmManHinhChinh.tabbedPane.remove(contentPane);
            }
        } else if (obj.equals(this.btnXoaRong)) {
            this.xoaRong();
        } else {
            int row;
            if (obj.equals(this.btnSua)) {
                row = this.tblKH.getSelectedRow();

                try {
                    if (row != -1) {
                        Date ngaySinhsql = null;

                        String ho;
                        try {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            ho = dateFormat.format(this.dateCNgaySinh.getDate());
                            java.util.Date ngaySinh = dateFormat.parse(ho);
                            ngaySinhsql = new Date(ngaySinh.getTime());
                        } catch (Exception var13) {
                            var13.printStackTrace();
                        }

                        String gioiTinh = "";
                        if (this.radNam.isSelected()) {
                            gioiTinh = "Nam";
                        } else if (this.radNu.isSelected()) {
                            gioiTinh = "Nữ";
                        }

                        ho = this.txtHo.getText().trim();
                        String ten = this.txtTen.getText().trim();
                        String sdt = this.txtSDT.getText().trim();
                        String cmnd = this.txtSoCMND.getText().trim();
                        String invalid1 = "";
                        if (ho.equalsIgnoreCase("")) {
                            invalid1 = invalid1 + "Vui lòng nhập họ !\n";
                        } else if (ho.length() > 25) {
                            invalid1 = invalid1 + "Họ không hợp lệ !\n";
                        }

                        if (ten.equalsIgnoreCase("")) {
                            invalid1 = invalid1 + "Vui lòng nhập tên !\n";
                        } else if (ten.length() > 10) {
                            invalid1 = invalid1 + "Tên không hợp lệ !\n";
                        }

                        String year = ngaySinhsql.toString().substring(0, 4);
                        int yearsql = Integer.parseInt(year);
                        if (ngaySinhsql.toString().equalsIgnoreCase("")) {
                            invalid1 = invalid1 + "Vui lòng nhập ngày sinh !\n";
                        }

                        if (LocalDate.now().getYear() - yearsql > 60 || LocalDate.now().getYear() - yearsql < 18) {
                            invalid1 = invalid1 + "Tuổi phải từ 18->60 !\n";
                        }

                        if (sdt.equalsIgnoreCase("")) {
                            invalid1 = invalid1 + "Vui lòng nhập số điện thoại !\n";
                        } else if (!sdt.matches("^0[0-9]{9}$")) {
                            invalid1 = invalid1 + "Số điện thoại không hợp lệ !(10 số và bắt là 0)\n";
                        }

                        if (cmnd.equalsIgnoreCase("")) {
                            invalid1 = invalid1 + "Vui lòng nhập CMND !\n";
                        } else if (!cmnd.matches("^[0-9]{9}$")) {
                            invalid1 = invalid1 + "Số CMND không hợp lệ ! (9 số)\n";
                        }

                        if (invalid1.equalsIgnoreCase("")) {
                            if (this.khDao.capnhatNhanVien(Integer.parseInt(this.txtMa.getText()), this.txtTen.getText(), this.txtHo.getText(), ngaySinhsql, gioiTinh, this.txtSoCMND.getText(), this.txtSDT.getText())) {
                                JOptionPane.showMessageDialog(this, "Đã cập nhật !", "Thông báo", -1, new ImageIcon("Hinh\\yes.png"));
                                this.tblKH.setValueAt(this.txtTen.getText(), row, 2);
                                this.tblKH.setValueAt(this.txtHo.getText(), row, 3);
                                this.tblKH.setValueAt(ngaySinhsql, row, 4);
                                this.tblKH.setValueAt(gioiTinh, row, 5);
                                this.tblKH.setValueAt(this.txtSoCMND.getText(), row, 6);
                                this.tblKH.setValueAt(this.txtSDT.getText(), row, 7);
                                this.deleteAllDataTable();
                                this.docDuLieu();
                            }
                        } else {
                            JOptionPane.showMessageDialog((Component)null, invalid1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng để cập nhật !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                }
            } else if (obj.equals(this.btnTim)) {
                if (!this.radMa.isSelected() && !this.radTen.isSelected() && !this.radSDT.isSelected() && !this.radCMND.isSelected() && this.txtTim.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin và chọn loại tìm kiếm !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                } else if (this.txtTim.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                } else if (!this.radMa.isSelected() && !this.radTen.isSelected() && !this.radSDT.isSelected() && !this.radCMND.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Vui lòng chọn loại tìm kiếm !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                } else if (this.radMa.isSelected()) {
                    try {
                        row = Integer.parseInt(this.txtTim.getText().trim());
                        this.getTimKiemKhachHangById(row);
                    } catch (Exception var15) {
                        if (!this.txtMa.getText().equalsIgnoreCase("")) {
                            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                            this.txtTim.requestFocus();
                            this.txtTim.selectAll();
                        } else {
                            JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên !", "Thông báo", 0, new ImageIcon("Hinh\\warning.png"));
                            this.txtTim.requestFocus();
                            this.txtTim.selectAll();
                        }
                    }
                } else {
                    String cmnd;
                    if (this.radTen.isSelected()) {
                        cmnd = this.txtTim.getText().trim();
                        this.getTimKiemKhachHangByTen(cmnd);
                    } else if (this.radSDT.isSelected()) {
                        cmnd = this.txtTim.getText().trim();
                        this.getTimKiemKhachHangBySoDT(cmnd);
                    } else if (this.radCMND.isSelected()) {
                        cmnd = this.txtTim.getText().trim();
                        this.getTimKiemKhachHangByCMND(cmnd);
                    }
                }
            } else if (obj.equals(this.btnLamMoi)) {
                this.txtTim.selectAll();
                this.txtTim.requestFocus();
                this.deleteAllDataTable();
                this.docDuLieu();
            }
        }

    }

    private void docDuLieu() {
        try {
            List<KhachHang> list = this.khDao.getAllKhachHang();
            int i = 0;
            Iterator var4 = list.iterator();

            while(var4.hasNext()) {
                KhachHang khachHang = (KhachHang)var4.next();
                ++i;
                this.model.addRow(new Object[]{String.valueOf(i), khachHang.getMaKhachHang(), khachHang.getHo().trim(), khachHang.getTen().trim(), khachHang.getNgaySinh(), khachHang.getGioiTinh().trim(), khachHang.getCmnd().trim(), khachHang.getSoDienThoai().trim(), khachHang.getDiaChi().getMaDiaChi()});
            }

            this.tblKH.setModel(this.model);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    public void xoaRong() {
        this.txtMa.setText("");
        this.txtHo.setText("");
        this.txtTen.setText("");
        this.txtDiaChi.setText("");
        this.txtSDT.setText("");
        this.txtSoCMND.setText("");
        this.txtTim.setText("");
        this.buttonGroupGioiTinh.clearSelection();
        this.txtMaDiaChi.setText("");
        this.dateCNgaySinh.setDate((java.util.Date)null);
    }

    public void deleteAllDataTable() {
        this.model = (DefaultTableModel)this.tblKH.getModel();
        this.model.getDataVector().removeAllElements();
    }

    public void getTimKiemKhachHangById(int ma) {
        ArrayList list = null;

        try {
            list = (ArrayList)this.khDao.timkiemKhachHangByMa(ma);
        } catch (SQLException | ClassNotFoundException var5) {
            var5.printStackTrace();
        }

        this.model = (DefaultTableModel)this.tblKH.getModel();
        this.model.setRowCount(0);
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            KhachHang khachhang = (KhachHang)var4.next();
            this.model.addRow(khachhang.toVector());
        }

        for(int i = 0; i < this.model.getRowCount(); ++i) {
            this.model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemKhachHangByTen(String ten) {
        ArrayList list = null;

        try {
            list = (ArrayList)this.khDao.timkiemKhachHangByTen(ten);
        } catch (SQLException | ClassNotFoundException var5) {
            var5.printStackTrace();
        }

        this.model = (DefaultTableModel)this.tblKH.getModel();
        this.model.setRowCount(0);
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            KhachHang khachhang = (KhachHang)var4.next();
            this.model.addRow(khachhang.toVector());
        }

        for(int i = 0; i < this.model.getRowCount(); ++i) {
            this.model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemKhachHangByCMND(String cmnd) {
        ArrayList list = null;

        try {
            list = (ArrayList)this.khDao.timkiemKhachHangByCMND(cmnd);
        } catch (SQLException | ClassNotFoundException var5) {
            var5.printStackTrace();
        }

        this.model = (DefaultTableModel)this.tblKH.getModel();
        this.model.setRowCount(0);
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            KhachHang khachhang = (KhachHang)var4.next();
            this.model.addRow(khachhang.toVector());
        }

        for(int i = 0; i < this.model.getRowCount(); ++i) {
            this.model.setValueAt(i + 1, i, 0);
        }

    }

    public void getTimKiemKhachHangBySoDT(String sdt) {
        ArrayList list = null;

        try {
            list = (ArrayList)this.khDao.timkiemKhachHangBySDT(sdt);
        } catch (SQLException | ClassNotFoundException var5) {
            var5.printStackTrace();
        }

        this.model = (DefaultTableModel)this.tblKH.getModel();
        this.model.setRowCount(0);
        Iterator var4 = list.iterator();

        while(var4.hasNext()) {
            KhachHang khachhang = (KhachHang)var4.next();
            this.model.addRow(khachhang.toVector());
        }

        for(int i = 0; i < this.model.getRowCount(); ++i) {
            this.model.setValueAt(i + 1, i, 0);
        }

    }
}
