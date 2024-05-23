package date20240523;

import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {

    //    4. Thêm 1 phần tử x vào mảng tại vị trí k

    public static int[] add (int[] arr , int x){
        int[] brr = new int[arr.length  + 1];
        for (int i = 0; i < arr.length;i++){
            brr[i] = arr[i];
        }
        brr[brr.length - 1] = x;
        return brr;
    }
    public static void affterchange (int[] arr, int k,int x){

        if (k >= 0 && k < arr.length) {
            int[] newarrays = new int[arr.length];
            for (int i = 0; i < arr[k]; i++) {
                newarrays[i] = arr[i];
            }
            newarrays[k] = x;
            for (int i = k + 1; i < arr.length; i++) {
                newarrays[i] = arr[i - 1];
            }
            System.out.println(Arrays.toString(newarrays));
        }
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
        int x = scanner.nextInt();
        arr = add(arr,x);
        System.out.println("nhap vao vi tri k : ");
        int k = scanner.nextInt();
        System.out.println("Mảng sau khi thay đổi là : ");
        affterchange(arr,k,x);
    }

}

