package Arrays;

import java.util.Arrays;

public class LearnArrays {

//        bài 1:  in ra các phần tử trùng nhau trong mảng

    public static int[] getElementSame(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
//                    System.out.println(a[j]);

                }
            }
        }
    return a;
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



