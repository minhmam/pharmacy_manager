//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package view;

import dao.NhanVienDAO;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import model.DiaChi;

public class FrmThemDiaChi extends JFrame implements ActionListener, KeyListener {
    private static final long serialVersionUID = -5905206843673219821L;
    private JPanel contentPane;
    public static JTextField txtSoNha;
    public static JTextField txtTenDuong;
    public static JTextField txtPhuong;
    public static JTextField txtQuan;
    public static JTextField txtThanhPho;
    public static JTextField txtQuocGia;
    private JButton btnThemDiaChi;
    NhanVienDAO nvDao = new NhanVienDAO();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrmThemDiaChi frame = new FrmThemDiaChi();
                    frame.setVisible(true);
                } catch (Exception var2) {
                    var2.printStackTrace();
                }

            }
        });
    }

    public FrmThemDiaChi() {
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 450, 474);
        this.setResizable(false);
        this.contentPane = new JPanel();
        this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        this.setLocationRelativeTo((Component)null);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(0, 0, 434, 67);
        this.contentPane.add(panel);
        JLabel lblNewLabel = new JLabel("?????a Ch???");
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setHorizontalAlignment(0);
        lblNewLabel.setFont(new Font("Times New Roman", 0, 32));
        panel.add(lblNewLabel);
        JLabel lblSNh = new JLabel("S??? Nh?? :");
        lblSNh.setFont(new Font("Times New Roman", 0, 18));
        lblSNh.setBounds(10, 93, 91, 28);
        this.contentPane.add(lblSNh);
        JLabel lblTnng = new JLabel("T??n ???????ng :");
        lblTnng.setFont(new Font("Times New Roman", 0, 18));
        lblTnng.setBounds(10, 142, 91, 28);
        this.contentPane.add(lblTnng);
        JLabel lblPhng = new JLabel("Ph?????ng/X??:");
        lblPhng.setFont(new Font("Times New Roman", 0, 18));
        lblPhng.setBounds(10, 194, 101, 28);
        this.contentPane.add(lblPhng);
        JLabel lblQun = new JLabel("Qu???n/Huy???n:");
        lblQun.setFont(new Font("Times New Roman", 0, 18));
        lblQun.setBounds(10, 245, 101, 28);
        this.contentPane.add(lblQun);
        JLabel lblThnhPh = new JLabel("Th??nh ph??? :");
        lblThnhPh.setFont(new Font("Times New Roman", 0, 18));
        lblThnhPh.setBounds(10, 301, 91, 28);
        this.contentPane.add(lblThnhPh);
        JLabel lblQucGia = new JLabel("Qu???c gia :");
        lblQucGia.setFont(new Font("Times New Roman", 0, 18));
        lblQucGia.setBounds(10, 350, 91, 28);
        this.contentPane.add(lblQucGia);
        txtSoNha = new JTextField();
        txtSoNha.setFont(new Font("Times New Roman", 0, 16));
        txtSoNha.setBounds(121, 96, 265, 22);
        this.contentPane.add(txtSoNha);
        txtSoNha.setColumns(10);
        txtTenDuong = new JTextField();
        txtTenDuong.setFont(new Font("Times New Roman", 0, 16));
        txtTenDuong.setColumns(10);
        txtTenDuong.setBounds(121, 148, 265, 22);
        this.contentPane.add(txtTenDuong);
        txtPhuong = new JTextField();
        txtPhuong.setFont(new Font("Times New Roman", 0, 16));
        txtPhuong.setColumns(10);
        txtPhuong.setBounds(121, 200, 265, 22);
        this.contentPane.add(txtPhuong);
        txtQuan = new JTextField();
        txtQuan.setFont(new Font("Times New Roman", 0, 16));
        txtQuan.setColumns(10);
        txtQuan.setBounds(121, 251, 265, 22);
        this.contentPane.add(txtQuan);
        txtThanhPho = new JTextField();
        txtThanhPho.setText("H??? Ch?? Minh");
        txtThanhPho.setFont(new Font("Times New Roman", 0, 16));
        txtThanhPho.setColumns(10);
        txtThanhPho.setBounds(121, 307, 265, 22);
        this.contentPane.add(txtThanhPho);
        txtQuocGia = new JTextField();
        txtQuocGia.setHorizontalAlignment(2);
        txtQuocGia.setFont(new Font("Times New Roman", 0, 16));
        txtQuocGia.setText("Vi???t Nam");
        txtQuocGia.setColumns(10);
        txtQuocGia.setBounds(121, 356, 265, 22);
        this.contentPane.add(txtQuocGia);
        this.btnThemDiaChi = new JButton("");
        this.btnThemDiaChi.setBackground(SystemColor.controlHighlight);
        this.btnThemDiaChi.setForeground(new Color(50, 205, 50));
        this.btnThemDiaChi.setIcon(new ImageIcon("Hinh\\iconSave.png"));
        this.btnThemDiaChi.setBounds(180, 389, 89, 35);
        this.contentPane.add(this.btnThemDiaChi);
        this.btnThemDiaChi.addActionListener(this);
        this.contentPane.addKeyListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(this.btnThemDiaChi)) {
            String soNha = txtSoNha.getText().trim();
            String duong = txtTenDuong.getText().trim();
            String phuong = txtPhuong.getText().trim();
            String quan = txtQuan.getText().trim();
            String thanhPho = txtThanhPho.getText().trim();
            String quocGia = txtQuocGia.getText().trim();
            String invalid = "";
            if (!soNha.equalsIgnoreCase("") && soNha.length() > 15) {
                invalid = invalid + "S??? nh?? kh??ng h??p l??? !\n";
            }

            if (!duong.equalsIgnoreCase("") && duong.length() > 30) {
                invalid = invalid + "T??n ???????ng kh??ng h??p l??? !\n";
            }

            if (phuong.equalsIgnoreCase("")) {
                invalid = invalid + "Vui l??ng nh???p ph?????ng/x?? !\n";
            } else if (phuong.length() > 30) {
                invalid = invalid + "Ph?????ng/X?? kh??ng h???p l??? !\n";
            }

            if (quan.equalsIgnoreCase("")) {
                invalid = invalid + "Vui l??ng nh???p qu???n/huy???n !\n";
            } else if (quan.length() > 30) {
                invalid = invalid + "Qu???n/Huy???n kh??ng h???p l??? !\n";
            }

            if (thanhPho.equalsIgnoreCase("")) {
                invalid = invalid + "Vui l??ng nh???p T???nh/Th??nh ph??? !\n";
            } else if (thanhPho.length() > 30) {
                invalid = invalid + "T???nh/Th??nh ph??? kh??ng h???p l??? !\n";
            }

            if (quocGia.equalsIgnoreCase("")) {
                invalid = invalid + "Vui l??ng nh???p qu???c gia !\n";
            } else if (quocGia.length() > 30) {
                invalid = invalid + "Qu???c gia kh??ng h???p l??? !\n";
            }

            String diaChi = "";
            if (!txtSoNha.getText().trim().equalsIgnoreCase("") && !txtTenDuong.getText().trim().equalsIgnoreCase("")) {
                diaChi = txtSoNha.getText() + ", " + txtTenDuong.getText() + ", " + txtPhuong.getText() + ", " + txtQuan.getText() + ", " + txtThanhPho.getText() + ", " + txtQuocGia.getText();
            } else {
                diaChi = txtPhuong.getText() + ", " + txtQuan.getText() + ", " + txtThanhPho.getText() + ", " + txtQuocGia.getText();
            }

            if (invalid.equalsIgnoreCase("")) {
                try {
                    DiaChi dc = new DiaChi(txtSoNha.getText(), txtTenDuong.getText(), txtPhuong.getText(), txtQuan.getText(), txtThanhPho.getText(), txtQuocGia.getText());
                    if (this.nvDao.addDiaChi(dc)) {
                        FrmQuanLyNhanVien.check = true;
                        FrmQuanLyNhanVien.txtMaDiaChi.setText(String.valueOf(this.nvDao.getMaDiaChiMax()));
                        FrmQuanLyNhanVien.txtDiaChi.setText(diaChi);
                        JOptionPane.showMessageDialog(this, "Th??m ?????a ch??? th??nh c??ng !", "Th??ng b??o !", -1);

                        try {
                            FrmQuanLyNhanVien.themNhanVien();
                            JOptionPane.showMessageDialog(this, "???? th??m nh??n vi??n !", "Th??ng b??o !", -1);
                            FrmQuanLyNhanVien.xoaAllDataTable();
                            FrmQuanLyNhanVien.docDuLieu();
                        } catch (Exception var13) {
                            JOptionPane.showMessageDialog(this, "Th??m nh??n vi??n th???t b???i !", "Th??ng b??o !", 0);
                        }

                        FrmQuanLyNhanVien.btnThem.setEnabled(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Th??m ?????a ch??? th???t b???i !", "Th??ng b??o !", 0);
                    }
                } catch (Exception var14) {
                    var14.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, invalid, "Th??ng b??o", 0);
            }
        }

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
