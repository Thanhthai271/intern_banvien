package date20240523;

import java.util.Arrays;
import java.util.Scanner;

public class baitap3 {

//    kiểm tra xem có phải số nguyên tố không

    public static int CheckPrime(int n) {
    if(n <= 1){
        return 0;
    }
    for (int i = 2; i < n-1; i++){  // 1 < xxx < n => Số nguyên to chỉ chia hết cho 1 và chính nó
        if(n % i == 0){
            return 0;
        }
    }
        return 1;
    }

    // Hàm đếm số lượng số nguyên tố

    public static int countPrime (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            count = count + CheckPrime(arr[i]);
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
        System.out.printf("có %d số nguyên tố " ,countPrime(arr));
    }
}

