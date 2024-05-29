package date20240529_3;

import java.util.Scanner;

public class CanBo extends Date{
    private String officerCode,officerName;
    private Date dayOfBirth;
    private int salary;
    public static int positionallowances = 200;

    public CanBo (){
        dayOfBirth = new Date();
    }

    public CanBo(int day,int month,int year,int dayOfBirth,int salary,String officerCode,String officerName){
        super(day,month,year);
        this.officerCode = officerCode;
        this.officerName = officerName;
        this.dayOfBirth = new Date();
        this.salary = salary;

    }

    public String getOfficerCode() {
        return officerCode;
    }

    public void setOfficerCode(String officerCode) {
        this.officerCode = officerCode;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void hamNhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scan officer code : ");
        setOfficerCode(scanner.nextLine());
        System.out.println("Scan officer name : ");
        setOfficerName(scanner.nextLine());
        System.out.println("Scan day of birth : ");
        dayOfBirth.hamNhap();
        System.out.println("Scan Salary : ");
        setSalary(scanner.nextInt());
    }

    @Override
    public void hamXuat(){
        System.out.println("Officer code : " + this.getOfficerCode());
        System.out.println("Officer name : " + this.getOfficerName());
        System.out.println("Day of birth : " + dayOfBirth.getDay() + " / " + dayOfBirth.getMonth() + " / " + dayOfBirth.getYear());
        System.out.println("Salary : " + this.getSalary());
    }

    public void payRoll(){
        int temp = this.salary + positionallowances;
        System.out.println("Payroll : " + temp);
    }
}
