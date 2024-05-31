package date20240531;

public class aaa {
    public static void main(String args[]) {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");

//        try {
//            int data = 25 / 0;
//            System.out.println(data);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("finally block is always executed");
//        }
//        System.out.println("rest of the code...");
    }
}
