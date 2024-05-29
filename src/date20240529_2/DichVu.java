package date20240529_2;

import java.util.Scanner;

public class DichVu {
    private String maDv,tenDv;
    private int giacuoc;

    public DichVu() {
    }

    public DichVu(String maDv, String tenDv, int giacuoc){
        this.maDv = maDv;
        this.giacuoc = giacuoc;
        this.tenDv = tenDv;
    }

    public String getMaDv() {
        return maDv;
    }

    public void setMaDv(String maDv) {
        this.maDv = maDv;
    }

    public String getTenDv() {
        return tenDv;
    }

    public void setTenDv(String tenDv) {
        this.tenDv = tenDv;
    }

    public int getGiacuoc() {
        return giacuoc;
    }

    public void setGiacuoc(int giacuoc) {
        this.giacuoc = giacuoc;
    }

    public void hamnhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma dich vu : ");
        setMaDv(scanner.nextLine());
        System.out.println("Nhap vao ten dich vu : ");
        setTenDv(scanner.nextLine());
        System.out.println("Nhap vao gia cuoc : ");
        setGiacuoc(scanner.nextInt());
    }

    public void hamxuat(){
        System.out.println("Ma dich vu : " + this.getMaDv());
        System.out.println("Ten dich vu : " + this.getTenDv());
        System.out.println("Gia cuoc : " + this.getGiacuoc());
    }

    public void layGiaCuoc(){
        System.out.println("Gia cuoc la : " + this.getGiacuoc());
    }
}
