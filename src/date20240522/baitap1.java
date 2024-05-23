package date20240522;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {

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

    public static int[] perfectNumbers(int[] arr) {
        int[] perfectNumber = new int[arr.length];
        int count = 0;
        // Tách các số hoàn thiện và các số khác vào hai danh sách
        for (int i = 0; i < arr.length; i++) {
            if (sumUC(arr[i]) == arr[i]) {
                perfectNumber[count] = arr[i];
                count++;
            }
        }

        // tạo ra phần tử mới gồm những giá trị của so hoan hao
        int[] newperfectNumber = new int[count];
        for (int i = 0; i < perfectNumber.length; i++) {
            if (perfectNumber[i] > 0) {
                newperfectNumber[i] = perfectNumber[i];
            }

        }

        return newperfectNumber;
    }

    public static void sapxep(int[] perfectNumbers) {
        // Sắp xếp số hoàn thiện giảm dần
        for (int i = 0; i < perfectNumbers.length - 1; i++) {
            for (int j = i + 1; j < perfectNumbers.length; j++) {
                if (perfectNumbers[i] < perfectNumbers[j]) {
                    int temp1 = perfectNumbers[i];
                    perfectNumbers[i] = perfectNumbers[j];
                    perfectNumbers[j] = temp1;
                }
            }
        }
    }

    public static void setupPerfectNumberReturn(int[] arr,int [] perferctnumbers) { // gia tri: 100  trong gia tri [1,2,3,4]
        //        Đặt lại các số hoàn thiện vào vị trí của chúng trong mảng ban đầu
        int perfectIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sumUC(arr[i]) == arr[i]) {
                arr[i] = perferctnumbers[perfectIndex++];
            }
        }
    }


    public static int[] arrange(int[] a) { // 100
        int[] firstlist = new int[a.length]; // 200
        for(int i = 0; i < a.length; i++){
            firstlist[i] = a[i];
        }
        // Danh sách các số hoàn thiện
        int[] perfectNumber = perfectNumbers(a);

        // Sắp xếp số hoàn thiện giảm dần 0 1
        sapxep(perfectNumber);
        // Đặt lại các số hoàn thiện vào vị trí của chúng trong mảng ban đầu
        setupPerfectNumberReturn(a, perfectNumber); // 100
        return firstlist;
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
            if (option.equals("N") || (option.equals("n"))) {
                break;

            }
            System.out.println("in ra mảng" + arr);
        }
    }

}

