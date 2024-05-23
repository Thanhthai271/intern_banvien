package date20240521;

import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {
    public static int [] arrange (int [] a){
        for (int i = 0; i < a.length - 1; i++ ){
            for(int j = i + 1; j < a.length; j++){
                if (a[i] % 2 != 0 && a[j] % 2 != 0) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao gia tri cua mang : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int [] b = arrange(arr);
        System.out.println(Arrays.toString(b));
    }
}
