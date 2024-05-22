package date20240521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class baitap3 {

//    Sắp xếp số hoàn thiện giảm dần nhưng giá trị khác giữ nguyên vị trí

//    Hàm kiểm tra số hoàn thiện
// Sắp xếp số hoàn thiện giảm dần nhưng giữ nguyên vị trí các giá trị khác :
    // Danh sách các số hoàn thiện và các số khác
// Tách các số hoàn thiện và các số khác vào hai danh sách
// Sắp xếp số hoàn thiện giảm dần
// Đặt lại các số hoàn thiện vào vị trí của chúng trong mảng ban đầu
// Trả về mảng đã được sắp xếp

    public static int sumUC(int n) {
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                temp += i;
            }
        }
        return temp;
    }

    public static int[] arrange(int[] a) {

//        Danh sách các số hoàn thiện và các số khác
        int[] perfectNumber = new int[a.length];
        int[] otherNumber = new int[a.length];

// Tách các số hoàn thiện và các số khác vào hai danh sách
        for (int i = 0; i < a.length; i++) {
            if (sumUC(a[i]) == a[i]) {
                perfectNumber[i] = a[i];
            } else {
                otherNumber[i] = a[i];
            }
        }

        // Sắp xếp số hoàn thiện giảm dần 0 1
        for (int i = 0; i < perfectNumber.length - 1; i++) {
            for (int j = i + 1; j < perfectNumber.length; j++) {
                if (perfectNumber[i] < perfectNumber[j]) {
                    int temp1 = perfectNumber[i];
                    perfectNumber[i] = perfectNumber[j];
                    perfectNumber[j] = temp1;
                }
            }
        }

//        Đặt lại các số hoàn thiện vào vị trí của chúng trong mảng ban đầu
        int perfectIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (sumUC(a[i]) == a[i]) {
                a[i] = perfectNumber[perfectIndex++];
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhap vao do dai cua mang : ");
            int n = scanner.nextInt();
            System.out.println("Nhap vao gia tri cua mang : ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int[] b = arrange(arr);
            System.out.println(Arrays.toString(b));
            scanner.nextLine();
            System.out.print("Bạn có muốn tiếp tục không ? Y/N ? : ");
            String option = scanner.nextLine();
            if(option.equals("N") || (option.equals("n"))) {
                break;
            }
        }
    }
}







