import java.util.Scanner;
public class Task9 {
    public static void main(String Args[]){
        Scanner c = new Scanner(System.in);
        int number ;
        System.out.println("Enter A three digit no : ");
        number= c.nextInt();
        int num1,num2,num3;
        num1= number / 100;
        num2= number / 10 % 10;
        num3= number % 10;
        System.out.println(num3+""+num2+""+num1);


    }
}
