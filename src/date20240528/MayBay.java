package date20240528;

import java.util.Scanner;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HaangSanXuat haangSanXuat) {
        super("Máy Bay", haangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("May bay da cat canh");
    }

    public void haCanh(){
        System.out.println("May bay da ha canh");
    }

    @Override
    public double layVantoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van toc may bay la ");
        int vantoc = scanner.nextInt();
        return vantoc;
    }
}
