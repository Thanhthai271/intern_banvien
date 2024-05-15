package Arrays;

import java.util.Arrays;

public class LearnArrays {

//        bài 1:  in ra các phần tử trùng nhau trong mảng

//    public static int[] getElementSame(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i] == a[j]) {
//
//
//                }
//            }
//        }
//    return a;
//    }

    public static int[] getElementSame(int[] a) {
        int[] result = new int[a.length]; // Khởi tạo mảng mới
        int count = 0; // Biến đếm số lượng phần tử giống nhau

        // Duyệt qua mảng a để tìm các phần tử giống nhau
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    // Nếu phần tử a[i] giống với phần tử a[j], thêm a[j] vào mảng result
                    result[count] = a[j];
                    count++; // Tăng số lượng phần tử giống nhau lên 1
                }
            }
        }

        // Tạo một mảng mới có kích thước là số lượng phần tử giống nhau và sao chép các phần tử từ mảng result vào mảng mới
        int[] sameElements = new int[count];
        for (int i = 0; i < count; i++) {
            sameElements[i] = result[i];
        }

        return sameElements; // Trả về mảng mới chứa các phần tử giống nhau
    }

    public static void main(String[] args) {
        int [] result = getElementSame(new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3});
        System.out.println("Các phần tử trùng nhau ở trong mảng là : " + Arrays.toString(result));

    }


//
//    public static int sum(int a, int b){
//    return a+b;
//}
//    public static void main(String[] args) {
//        int result = sum(2,3);
//        System.out.println("Ket qua là : " + result);
//    }
//}

    }



