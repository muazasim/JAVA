
import java.util.Scanner;
import java.lang.*;
class Palindrome{
  private  int Fivedigitno;
  Scanner c = new Scanner(System.in);
  Palindrome(){
    
    
    do{
        System.out.println("Please Enter A Five Digit No : ");
        Fivedigitno = c.nextInt();
        if(Fivedigitno<10000 || Fivedigitno >99999){
           System.out.println("The no you Entered is not a five digit no please enter once again");
           continue; 
        }
        else{
          this.CheckPalindrome(Fivedigitno);
        }
    }while(Fivedigitno<10000 || Fivedigitno >99999);


}

void CheckPalindrome( int f){
    int number = f;
    String orignal = Integer.toString(number);
    String New="";
    do{
        int n;
        n =  number%10;
        New += Integer.toString(n);
        number = number /10;
        if(number<10){
         New += Integer.toString(number); 
        }
    }while(number >9);
    // System.out.println(orignal + ":::::::"+New+":");
    if(orignal == New){
      System.out.println("THE INPUT YOU GAVE IS PALINDROME");
    }else{
      System.out.println("THE INPUT YOU GAVE IS NOT PALINDROME");
    }
 }
}


public class Question_1_70121043 {
  
  public static void main(String args[]){
    Palindrome obj = new Palindrome();
  }
    
}
