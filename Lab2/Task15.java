import java.util.Scanner;
public class Task15 {
    public static void main(String Args[])
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = c.nextInt();
         System.out.println("The Number is sum of following Natural Numbers :");
        for ( int i = 1 ; i<=num ; i++){
            if(i<num-1){
                 System.out.print(i+"+");
            }
            else if (i==num){
               System.out.print(" = " +num); 
            }
            else{
                 System.out.print(i);

            }
           

        }



    }
    
}
