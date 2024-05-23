package date20240523;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {

    //    4. Thêm 1 phần tử x vào mảng tại vị trí k

    public static int[] add (int[] arr , int k){
        int[] brr = new int[arr.length  + 1];
        for (int i = 0; i < arr.length;i++){
            brr[i] = arr[i];
        }
        brr[brr.length - 1] = k;
        return brr;
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("nhap vao gia tri cua mang : ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("nhap vao gia tri can them");
        int k = scanner.nextInt();
        arr = add(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}

