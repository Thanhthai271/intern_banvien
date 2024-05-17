package date20240516;

public class sinhvien {
    private String name;
    private int age;
    private String major;

//    public sinhvien(){
//        this.name = "unknow";
//        this.age = 18;
//        this.major = "Undeclared";
//        }
    public sinhvien(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void DisplayInfor(){
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println("Major : " + major);
    }

    public static void main(String[] args) {
//        sinhvien defaultstudents = new sinhvien();
//        System.out.println("Default Students : ");
//        defaultstudents.DisplayInfor();
//        System.out.println();
//
        sinhvien specificStudent = new sinhvien("John Doe", 20, "Computer Science");
        System.out.println("Specific Student:");
        specificStudent.DisplayInfor();
        System.out.println("\n");

        sinhvien specificStudent1 = new sinhvien("ThanhThai" , 22, "IT");
        System.out.println("Specific Student : ");
        specificStudent1.DisplayInfor();

    }
}
