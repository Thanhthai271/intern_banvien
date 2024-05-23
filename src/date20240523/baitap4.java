package date20240523;

import java.util.Arrays;
import java.util.Scanner;

public class baitap4 {

    // Hàm tìm ước của số hoàn hảo
    public static int sumUC(int n) {
        int temp = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                temp += i;
            }
        }
        return temp;
    }

    // Hàm kiểm tra số hoàn hảo
    public static int CheckPerfect(int n) {
       for (int i = 0; i < n; i++){
           if(sumUC(n) == n){
               return 1;
           }
       }
       return 0;
    }

    // Hàm đếm số lượng số hoàn hảo

    public static int countPerfect (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count = count + CheckPerfect(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao gia tri cua mang : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.printf("có %d số hoàn hảo " ,countPerfect(arr));
    }
}
