package date20240520;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

//     Viết hàm liệt kê các giá trị chẵn trong mảng 1 chiều các số nguyên

    public static int [] arr (int [] a){
        int [] result = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] > 0){
                result[count] = a[i];
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int [] b = arr(new int[]{-1,2,-3,4,5,6});
        System.out.println("Số nguyên dương đầu tiên trong mảng là : " + Arrays.toString(b));
    }

}

