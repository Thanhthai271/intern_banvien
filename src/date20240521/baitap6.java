package date20240521;

import java.util.Scanner;

public class baitap6 {
    public static int minValue ( int [] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            min = Math.min(min, a[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("Nhap vao gia tri cua mang : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int min = minValue(arr);
        System.out.println("gia tri nho nhat la : " + min);
    }
}

