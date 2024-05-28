package date20240528;

import java.util.Scanner;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public XeOto(String loaiNhienLieu, HaangSanXuat haangSanXuat) {
        super("xe Oto",haangSanXuat);
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVantoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van toc Oto la ");
        int vantoc = scanner.nextInt();
        return vantoc;
    }
}
