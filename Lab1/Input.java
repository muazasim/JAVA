import java.util.Scanner;

public class Input {

    public static void main (String A[]){
        Scanner c = new Scanner (System.in);
        String Name;
        int Age;

        System.out.println("Enter Your Name Here");
        Name= c.nextLine();
        System.out.println("Enter Your Age Here");
        Age= c.nextInt();
        System.out.println("Your Name is : " + Name +" and your age : " + Age  );
    }
    
}
