package date20240517;

import java.util.ArrayList;

public class LearnString {
  private String name;
  private String id;

  @Override
  public String toString(){
      return "LearnString [name =" + name + ", id = " + id + "]";
  }

    public LearnString (String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
        }

    public String getId(){
        return id;
    }

    public static void main(String[] args) {
        LearnString st1 = new LearnString("Thai","1");
        LearnString st2 = new LearnString("Sang","2");
        LearnString st3 = new LearnString("Tuan","3");
        LearnString st4 = new LearnString("Xuan","4");
        LearnString st5 = new LearnString("Ha","5");

        ArrayList<LearnString> stList = new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        stList.add(st5);

        System.out.println("Student List : " + stList);

        for (int i = 0; i < stList.size(); i++){
            if(stList.get(i).getName().startsWith("Thai")){
                System.out.println("Star with Thai : " + stList.get(i));
            }
        }

    }
    }
