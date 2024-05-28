package date20240528;

import java.util.Scanner;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap(HaangSanXuat haangSanXuat) {
        super("Xe Dap", haangSanXuat);
    }

    @Override
    public double layVantoc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Van toc Xe dap la ");
        int vantoc = scanner.nextInt();
        return vantoc;
    }
}
