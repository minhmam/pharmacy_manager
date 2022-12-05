import dao.ConectDatabase;
import view.FrmDangNhap;

public class Main {
    public static void main(String[] args) {
        ConectDatabase.getInstance().connect();
        FrmDangNhap frmDangNhap = new FrmDangNhap();
        frmDangNhap.setVisible(true);
        frmDangNhap.setLocationRelativeTo(null);
    }
}
