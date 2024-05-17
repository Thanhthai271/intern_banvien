package date20240516;

public class contructor {
    public static void main(String[] args) {
//        System.out.println("run here");
        LearnOOP code1  = new LearnOOP(); // contructor

        //Khởi tạo 1 hàm tạo cho java
        // mục đích để cung cấp giá trị ban đầu cho biến object
        LearnOOP code2 = new LearnOOP("thuchanh", "lythuyet");
        System.out.println("check obj : " + code2.GetgetTheory() + " check : " + code2.Getpractice());
    }
}
