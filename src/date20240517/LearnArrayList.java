package date20240517;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Double> input = new ArrayList<>();

        while(true){
            System.out.print("Nhập số : ");
            double number = scanner.nextInt();
            input.add(number);
            scanner.nextLine();

            System.out.println("continue ? Y / N ? ");
            String options = scanner.nextLine();
            if(options.equals("N") || options.equals("n")){
                break;
            }
        }
        System.out.println("Check Array " + input);
        double sum = 0;
        for(int i = 0 ; i < input.size(); i++){
            sum = sum + input.get(i);
        }
        System.out.println("Tổng các số là : " + sum);
    }
}
