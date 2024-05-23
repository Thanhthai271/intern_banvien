package date20240523;

import java.util.Arrays;
import java.util.Scanner;

public class baitap2 {

//    Viết hàm nhập mảng sao cho khi nhập xong thì giá trị trong mảng sắp xếp giảm dần

    // hàm sap xep giảm dần
    public static void sortDescending (int[] firstarr){
        for (int i = 0; i < firstarr.length - 1; i++){
            for (int j = i + 1; j < firstarr.length; j++){
                if(firstarr[i] < firstarr[j]){
                    int temp = firstarr[i];
                    firstarr[i] = firstarr[j];
                    firstarr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao do dai cua mang : ");
        int n = scanner.nextInt();
        System.out.println("nhap vao gia tri cua mang : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        sortDescending(arr);
        System.out.println("Mảng sau khi đã sắp xếp la : ");
        System.out.println(Arrays.toString(arr));
    }
}
