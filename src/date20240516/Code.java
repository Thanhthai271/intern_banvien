package date20240516;

public class Code {

    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Code result = new Code();
        LearnOOP method = new LearnOOP();
        method.point = 9;
        int a = result.sum(9,10);
        System.out.println("sum = " + (a + method.point) );

    }
}
