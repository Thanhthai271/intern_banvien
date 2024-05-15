package Arrays;

import java.util.Arrays;

public class MethodArrays {
    public static void main(String[] args) {
        int [] method = {3,2,5,9,7,5};
        System.out.println(Arrays.toString(method));
        Arrays.sort(method);
        System.out.println(Arrays.toString(method));

        for (int i = 0; i < method.length - 1 ; i++){
            for (int j = i + 1; j < method.length; j++){
                if (method[i] < method[j]){
                    int temp ;
                    temp = method[i];
                    method[i] = method[j];
                    method[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(method));
    }
}
