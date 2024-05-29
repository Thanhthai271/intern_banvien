package date20240529_2;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private int soLuongDichVu;
    private DichVu[] dichVu ;

    public KhachHang(){
        dichVu = new DichVu[100];
        for (int i = 0; i < soLuongDichVu; i++){
        }
    }

    public KhachHang(String hoVaTen, String diaChi, int sdt,int soLuongDichVu,DichVu[] dichVu) {
        super(hoVaTen, diaChi, sdt);
        this.soLuongDichVu = soLuongDichVu;
        this.dichVu = new DichVu[100];
        for (int i = 0; i < soLuongDichVu; i++){
            this.dichVu = dichVu;
        }
    }

    public int getSoLuongDichVu() {
        return soLuongDichVu;
    }

    public void setSoLuongDichVu(int soLuongDichVu) {
        this.soLuongDichVu = soLuongDichVu;
    }

    public DichVu[] getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu[] dichVu) {
        this.dichVu = dichVu;
    }

@Override
    public void hamNhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thong tin khach hang");
        super.hamNhap();
        System.out.println("Nhap vao so luong dich vu ");
        setSoLuongDichVu(scanner.nextInt());
        scanner.nextLine();
        for (int i = 0; i < soLuongDichVu; i++){
            dichVu[i] = new DichVu();
            System.out.println("Nhap thong tin dich vu thu " + (i+1) + " :");
            dichVu[i].hamnhap();
        }

    }

@Override
    public void hamXuat(){
        System.out.println("Thong tin khach hang : ");
        super.hamXuat();
        System.out.println("So luong dich vu khach hang da su dung : " + this.getSoLuongDichVu());
        for (int i = 0; i < soLuongDichVu; i++){
            System.out.println("Dich vu thu " + (i+1) + " la : ");
            dichVu[i].hamxuat();
        }
    }

    public void tongGiaCuoc(){
        double temp = 0;
        System.out.println("Tong gia cuoc la : ");
        for (int i = 0; i < soLuongDichVu; i++){
            temp += dichVu[i].getGiacuoc();
        }
        System.out.println(temp);
    }
}
