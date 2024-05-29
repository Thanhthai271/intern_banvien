package date20240529_3;

import java.util.Scanner;

public class Date {
    private int day,month,year;

    public Date(){
    }

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void hamNhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scan day : ");
        setDay(scanner.nextInt());
        System.out.println("Scan month : ");
        setMonth(scanner.nextInt());
        System.out.println("Scan year : ");
        setYear(scanner.nextInt());
    }

    public void hamXuat(){
        System.out.println(" Day : " + this.getDay());
        System.out.println(" Month : " + this.getMonth());
        System.out.println(" Year : " + this.getYear());
    }


}
