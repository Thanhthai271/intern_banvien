package date20240521;

import java.util.Scanner;

public class baitap5 {
    public static int greatestValue (int[] a) {
            int max = a[0];
            for (int i = 0; i < a.length; i++) {
                max = Math.max(max, a[i]);
            }
            return max;
        }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao gia tri cua mang : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
           arr[i] = scanner.nextInt();
        }
        int max = greatestValue(arr);
        System.out.println("Gia tri lon nhat trong mang la : " + max );
    }
}
