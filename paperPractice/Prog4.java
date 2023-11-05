// ................. STATIC DATA MEMBERS + STATIC FUNCTIONS ...........

import StaticPractice.Id;
import StaticPractice.Idd;

class StaticPractice{

 private static int count = 0; 
 private String Name;
public static int getCount() {
    return count;
}
public static void setCount() {
    StaticPractice.count = ++count;
}
public String getName() {
  
    return Name;
}
public void setName(String name) {
    ++count;
    Name = name;
}

 


    

}

public class Prog4 {
    
    public static void main(String Args []){
        StaticPractice obj1= new StaticPractice();
        // StaticPractice.setCount();
        obj1.setName("Mauz");
        System.out.println("COunt " + StaticPractice.getCount() + obj1.getName());
         StaticPractice obj2= new StaticPractice();
         
        obj2.setName("Bilal");
        // StaticPractice.setCount();
         System.out.println("COunt " + StaticPractice.getCount()  + obj2.getName());
 
        }
}
