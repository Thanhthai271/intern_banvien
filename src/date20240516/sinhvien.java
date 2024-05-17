package date20240516;

public class sinhvien {
    private String name;
    private int age;
    private String major;

    public sinhvien(){
        this.name = "unknow";
        this.age = 18;
        this.major = "Undeclared";
        }

    public void DisplayInfor(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println("Major : " + major);
    }

    public static void main(String[] args) {
        sinhvien defaultstudents = new sinhvien();
        System.out.println("Default Students : ");
        defaultstudents.DisplayInfor();
        System.out.println();
//
//        sinhvien specificStudent = new sinhvien("John Doe", 20, "Computer Science");
//        System.out.println("Specific Student:");
//        specificStudent.DisplayInfor();

    }
}
