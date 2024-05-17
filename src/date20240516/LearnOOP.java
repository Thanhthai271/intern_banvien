package date20240516;

public class LearnOOP { // Đối tượng ở đây là LearnOOP

        // Class Attributes
   private String getTheory;
    private String practice;
    int point;


    public LearnOOP(){

    }
    public LearnOOP(String getTheory, String getPractice){
        this.getTheory = getTheory;
        this.practice = getPractice;
    }

    public String GetgetTheory() {
        return this.getTheory;
    }
    public String Getpractice() {
        return this.practice;
    }

        // class method
        public void ketqua() {
            System.out.println("LearnOOP");
        }
    }

