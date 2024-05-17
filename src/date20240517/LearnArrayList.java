package date20240517;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayList {
    public static void main(String[] args) {

        // Khởi tạo một ArrayList để lưu trữ các số nguyên
        ArrayList<Integer> numbers = new ArrayList<>();

        // Thêm các phần tử vào ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Hiển thị các phần tử trong ArrayList
        System.out.println("Các phần tử trong ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Xóa một phần tử từ ArrayList
        numbers.remove(1);

        // Hiển thị lại các phần tử sau khi xóa
        System.out.println("Các phần tử sau khi xóa:");
        for (int number : numbers) {
            System.out.println(number);
        }

//        Scanner scanner = new Scanner(System.in);
//        ArrayList <Double> input = new ArrayList<>();
//
//        while(true){
//            System.out.print("Nhập số : ");
//            double number = scanner.nextInt();
//            input.add(number);
//            scanner.nextLine();
//
//            System.out.println("continue ? Y / N ? ");
//            String options = scanner.nextLine();
//            if(options.equals("N") || options.equals("n")){
//                break;
//            }
//        }
//        System.out.println("Check Array " + input);
//        double sum = 0;
//        for(int i = 0 ; i < input.size(); i++){
//            sum = sum + input.get(i);
//        }
//        System.out.println("Tổng các số là : " + sum);
    }
}
