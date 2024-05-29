package date20240529_2;

import java.util.Scanner;

public class Nguoi {
    private String hoVaTen,diaChi;
    private int sdt;

    public Nguoi(String hoVaTen, String diaChi, int sdt){
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public Nguoi() {
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public void hamNhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ho va ten : ");
        setHoVaTen(scanner.nextLine());
        System.out.println("Nhap vao dia chi : ");
        setDiaChi(scanner.nextLine());
        System.out.println("Nhap vao sdt : ");
        setSdt(scanner.nextInt());
    }

    public void hamXuat(){
        System.out.println("Ho va ten : " + this.getHoVaTen());
        System.out.println("Dia chi : " + this.getDiaChi());
        System.out.println("So dien thoai : " + this.getSdt());
    }


}
