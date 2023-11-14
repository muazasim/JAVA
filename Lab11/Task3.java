import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        List <String> Names = new ArrayList<String>();

        while (true) {
            
            System.out.println("Enter the Name of the cintestent or Enter Quit to terminate program");
            String input;
            input = c.nextLine();

            if(input.equals("Quit")){
                System.out.println("1"+input+"1");
                break;
            }
            else {
                  System.out.println("#"+input+"#");
                Names.add(input);


            }
        }
; 


            System.out.println("The Winner is : " + Names.get(
        ThreadLocalRandom 
            .current() 
            .nextInt(-1, Names.size())));


    }
    



    
}
