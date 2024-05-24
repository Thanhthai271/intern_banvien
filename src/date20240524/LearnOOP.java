package date20240524;

public class LearnOOP {
    private int day;
    private int month;
    private int year;

    public LearnOOP(int getday, int getMonth, int getYear) {
        this.day = getday;
        this.month = getMonth;
        this.year = getYear;
    }

    public void printDay (){
        System.out.println("Ngày : " + day);
    }
    public void printMonth(){
        System.out.println("Tháng : " + month);
    }
    public void printYear(){
        System.out.println("Năm : " + year);
    }

}