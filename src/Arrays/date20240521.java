package Arrays;

import java.util.Scanner;

public class date20240521 {

//        Viết hàm tìm giá trị lớn nhất trong mảng 1 chiều các số thực

        public static int greatestValue (int [] a) {
            int max = 0;
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

