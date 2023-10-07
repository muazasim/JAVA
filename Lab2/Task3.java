import java.util.Scanner;
class Task3{
	public static void main (String Args[]){
	 Scanner c = new Scanner(System.in);
	 int num1;
	 int num2;
	 char choice;
	 System.out.println("************ WELCOME TO CALCULATOR APP ************");
	 System.out.println("************ ENTER 1 to Add ************");
	 System.out.println("************ ENTER 2 to Subtract ************");
	 System.out.println("************ ENTER 3 to Multiply ************");
	 System.out.println("************ ENTER 4 to Divide ************");
	 System.out.println("************ NOW PLEASE ENTER YOUR CHOICE ************");
	 choice=c.next().charAt(0);
	 System.out.println("Enter A Number 1");
	 num1=c.nextInt();
	 System.out.println("Enter A Number 1");
	 num2=c.nextInt();
	 
	 switch(choice){
	 
	 case '+':
	 System.out.println(num1 + num2);
	 break;
	 case '-':
	 System.out.println(num1 - num2);
	 break;
	 case '*':
	 System.out.println(num1 * num2);
	 break;
	 case '/':
	 System.out.println(num1/num2);
	 break;
	 default :
	 System.out.println("Invalid Choice");
	 
	 }
	
}
}
