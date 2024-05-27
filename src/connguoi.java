import java.util.Scanner;

public class connguoi {
    protected String hoVaTen;
    protected int namSinh;

    public connguoi(){
        Scanner scanner = new Scanner(System.in);
        this.hoVaTen = scanner.nextLine();
        this.namSinh = scanner.nextInt();
    }

    public void an(){
        System.out.println("eat");
    }
    public void ngu(){
        System.out.println("Sleep");
    }
}
