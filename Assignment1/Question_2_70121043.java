
import java.util.*;
class HeadTail {
    private Scanner c = new Scanner(System.in);
    private  String [] Coin= {"Head","Tail"};
    private  int nofToss =0;
    private int head=0;
    private int tail =0;
    
    String Flip(String arr[]){
        Random rand=new Random();
        int choice =  rand.nextInt(arr.length);
        return arr[choice];
    }

    void setNoofToss(){
        System.out.println("Enter the Number of Times you want to toss");
        nofToss = c.nextInt();
    }
    void Toss(){
        for(int i = 0 ; i < nofToss ; i++){
            int e =i+1;
            System.out.println("This is Toss no "+e);
            System.out.println("Tossing the Coin....");
            if (Flip(Coin) == "Head"){
                System.out.println("The Coin Side is : Head");
                head++;
            }
            else {
                System.out.println("The Coin Side is : Tail");
                tail++;
            }

           
            System.out.println("HEAD : "+head +"| TAIL : "+tail);
             System.out.println(""); 
        }
        System.out.println("The no of Toss Attempts have been finished and the final result is :");
        System.out.println("No of Heads won : "+head + " No of Tails won : "+tail);
    }


}

public class Question_2_70121043{
    public static void main (String args[]){
        HeadTail obj = new HeadTail();
        obj.setNoofToss();
        obj.Toss();
    }

}