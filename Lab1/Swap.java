import java.util.Scanner;
public class Swap {
    public static void main(String A[]){
      
        Scanner c = new Scanner (System.in);
        System.out.println("Enter Value of X:");
        int x= c.nextInt();
        System.out.println("Enter Value of Y:");
        int y= c.nextInt();
        // with temp var
        // int temp = x;
        // x=y;
        // y=temp

        // Without temp var
        x=x+y;
        y=x-y;
        x=x-y;
         System.out.println("X : " + x + "Y : " + y);

    }
    
}
