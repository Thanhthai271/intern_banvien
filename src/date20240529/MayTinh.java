package date20240529;

import java.util.Scanner;

public class MayTinh extends HangHoa{
    private String nhaSanXuat;
    private int namSanXuat, giaBanNiemYet;
    public static double tyLeKhuyenMai = 0.5;
    public MayTinh(String maHang, String tenHang, String nhaSanXuat, int namSanXuat, int giaBanNiemYet) {
        super(maHang, tenHang);
        this.nhaSanXuat = nhaSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBanNiemYet = giaBanNiemYet;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getGiaBanNiemYet() {
        return giaBanNiemYet;
    }

    public void setGiaBanNiemYet(int giaBanNiemYet) {
        this.giaBanNiemYet = giaBanNiemYet;
    }

    public void hamnhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma hang : ");
        setMaHang(scanner.nextLine());
        System.out.println("Nhap vao ten hang : ");
        setTenHang(scanner.nextLine());
        System.out.println("Nhap vao nha san xuat : ");
        setNhaSanXuat(scanner.nextLine());
        System.out.println("Nhap vao nam san xuat : ");
        setNamSanXuat(scanner.nextInt());
        System.out.println("Nhap vao gia ban niem yet : ");
        setGiaBanNiemYet(scanner.nextInt());
    }

    public void hamxuat(){
        System.out.println("Ma hang : " + this.getMaHang());
        System.out.println("Ten hang : " + this.getTenHang());
        System.out.println("Nha san xuat : " + this.nhaSanXuat);
        System.out.println("Nam san xuat : " + this.namSanXuat);
        System.out.println("Gia ban niem yet : " + this.giaBanNiemYet);
    }

    public double tinhGiaBanThucTe(){
        double giaThucTe = giaBanNiemYet - (giaBanNiemYet * tyLeKhuyenMai);
        return giaThucTe;
    }

    public String getMayTinhSamSung(){
        String a = "null";
        if(nhaSanXuat.equals("SAMSUNG")){
            return getTenHang();
        }return a;
    }

}
