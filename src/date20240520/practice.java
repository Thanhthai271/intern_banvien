package date20240520;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

//     Viết hàm liệt kê các giá trị chẵn trong mảng 1 chiều các số nguyên

    public static int arr (int [] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                return a[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao gia tri cua mang : ");
        int [] ar = new int[n];
        for (int i = 0; i < n; i++){
            ar [i] = scanner.nextInt();
        }
        int b = arr(ar);
        System.out.println("Số nguyên dương đầu tiên trong mảng là : " + b);
    }

}

