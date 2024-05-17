package date20240516;

public class Code {

    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        // Khai báo 1 object
        LearnOOP thai = new LearnOOP("Hoc Ly Thuyet", "Phai Thuc Hanh"); // Tạo ra đối tượng cụ thể từ class LearnOOP
//        thai.getTheory = " Hoc ly Thuyet "; //truy cập tới thuộc tính
//        thai.practice = " Phai Thuc Hanh "; //Object.thuộc tính và gán giá trị cho thuộc tính

        System.out.println("Để học giỏi thì " + thai.GetgetTheory() + " và " + thai.Getpractice() );
        // Đây là cách sử dụng method từ class
    }
}
