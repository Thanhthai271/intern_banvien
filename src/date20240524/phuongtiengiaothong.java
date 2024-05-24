package date20240524;

import java.util.Scanner;

public class phuongtiengiaothong {
    private String hangsanxuat;
    private String tenphuongtien;
    private int namsanxuat;
    private float vantoctoida;

    //    Hàm get và set
    public String gethangsanxuat() {
        return this.hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public String getTenphuongtien() {
        return this.tenphuongtien;
    }

    public void setTenphuongtien(String tenphuongtien) {
        this.tenphuongtien = tenphuongtien;
    }

    public int getNamsanxuat() {
        if (this.namsanxuat >= 1500 && this.namsanxuat <= 2024) {
            return this.namsanxuat;
        }
        return 0;
    }
    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }
    public float getVantoctoida() {
        if (this.vantoctoida >= 50 && this.vantoctoida <= 500) {
            return this.vantoctoida;
        } return 0;
    }
    public void setVantoctoida(float vantoctoida){
        this.vantoctoida = vantoctoida;
    }

    public void hamnhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên hãng : ");
        setHangsanxuat(scanner.nextLine());
        System.out.println("Nhập vào tên phương tiện : ");
        setTenphuongtien(scanner.nextLine());
        System.out.println("Nhập vào năm sản xuất : ");
        setNamsanxuat(scanner.nextInt());
        System.out.println("Nhập vào vận tốc tối đa : ");
        setVantoctoida(scanner.nextFloat());
    }

    public void hamxuat(){
        System.out.println("Hãng sản xuất : " + gethangsanxuat());
        System.out.println("Tên phương tiện : " + getTenphuongtien());
        System.out.println("Năm sản xuất : " + getNamsanxuat());
        System.out.println("Vận tốc tối đa đạt được : " + getVantoctoida() + " km/h");
    }
}
