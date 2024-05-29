package date20240529;

import java.util.Scanner;

public class HangHoa {
    private String maHang;
    private String tenHang;

    public HangHoa(){
    }

    public HangHoa (String maHang, String tenHang){
        this.maHang = maHang;
        this.tenHang = tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void hamnhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma hang : ");
        this.maHang = scanner.nextLine();
        System.out.println("Nhap vao ten hang : ");
        this.tenHang = scanner.nextLine();
    }

    public void hamxuat(){
        System.out.println("Ma hang : " + this.maHang);
        System.out.println("Ten hang : " + this.tenHang);
    }


}
