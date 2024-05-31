package date20240531;

import java.util.Scanner;

public class Sinhvien {
    private String masv, hoten;
    private double diem;
    private int age;

    public Sinhvien() {

    }

    public Sinhvien(String masv, String hoten, double diem, int age) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        if (this.diem >= 0 && this.diem < 10) {
            this.diem = diem;
        } this.diem = 1;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age > 18 && this.age < 100) {
            this.age = age;
        } this.age = 18;
    }

    public void hamNhap() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên : ");
        setMasv(scanner.nextLine());
        System.out.println("Nhập vào họ và tên : ");
        setHoten(scanner.nextLine());
        System.out.println("Nhập vào điểm của sinh viên : ");
        setDiem(scanner.nextDouble());
        while (true) {
            System.out.println("Nhập vào tuổi của sinh viên : ");
            try {
                setAge(scanner.nextInt());
                break;
            }catch (Exception e){
                System.out.println("Error, Please try again ");
                scanner.next();
            }

        }
    }
    @Override
    public String toString() {
        return "Sinhvien [Mã sinh viên :  = " + masv + ", họ và tên : = " + hoten + ", điểm : = " + diem + ", tuổi : = " + age + "]";
    }

}
