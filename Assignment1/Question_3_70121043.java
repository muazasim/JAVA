import java.util.*;
class Clock {
  Scanner c= new Scanner(System.in);
   private int Hours=0;
  private int Minutes=0;
   private int Seconds=0; 
 
   public int getHours() {
    return Hours;
}

public void setHours(int hours) {
    Hours = hours;
}

public int getMinutes() {
    return Minutes;
}

public void setMinutes(int minutes) {
    Minutes = minutes;
}

public int getSeconds() {
    return Seconds;
}

public void setSeconds(int seconds) {
    Seconds = seconds;
}

Clock(){
    int x;
    System.out.println("Enter no of Hours");
    x=c.nextInt();
    setHours(x);
    System.out.println("Enter no of Minutes");
    x=c.nextInt();
    setMinutes(x);
    System.out.println("Enter no of Seconds");
    x=c.nextInt();
    setSeconds(x);

    if(getHours()>23 || getMinutes() >50 ||getSeconds() > 59){
        setHours(0);
        setMinutes(0);
        setSeconds(0);
    }

     System.out.println("The Time is as Follows : ");
     System.out.println(getHours()+":"+getMinutes()+":"+getSeconds());
}

   


}

public class Question_3_70121043 {
    public static void main(String Args[]){
        Clock obj = new Clock();
    }
 
}
