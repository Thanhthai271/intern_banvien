import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        hocSinh hs = new hocSinh("Thái",2002,"20t1020680",44);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Sửa lớp : " );
//        hs.setLop(scanner.nextInt());
//        scanner.nextLine();
//        System.out.println("Sửa mã sinh viên : ");
//        hs.setMaSinhVien(scanner.nextLine());
//        System.out.println("Lớp mới : " + hs.getLop() + " Mã sinh viên mới : " + hs.getMaSinhVien());
        hs.an();
        hs.ngu();
        hs.dihoc();
        hs.hocbai();

        nhanvien nv = new nhanvien();
        nv.dilam();
    }
}
