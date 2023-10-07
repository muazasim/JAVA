import java.util.Scanner;
public class Task12 {
    public static void main (String args[]){
        Scanner c = new Scanner(System.in);
        System.out.println("Enter No 1 : ");
        int num1 = c.nextInt() ;
        System.out.println("Enter No 2 : ");
        int num2 = c.nextInt() ;
    
        if (num1 >num2){
            System.out.println("The greatest number is no 1 : "+num1);
        }
        else  if (num2 >num1){
            System.out.println("The greatest number is no 2 : "+num2);
        }
    }
    
}
