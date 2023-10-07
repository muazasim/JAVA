import java.util.Scanner;

public class Task13 {


	public static void main (String Args[]){
	 Scanner c = new Scanner(System.in);
	 int choice;
	 System.out.println("************ WELCOME TO CALENDAR ************");
	 System.out.println("************ ENTER ANY NUMBER BTW 1 AND 7 ************");
	 System.out.println("************ NOW PLEASE ENTER YOUR CHOICE ************");
	 choice=c.nextInt();
	 switch(choice){
	 
	 case 1:
	 System.out.println("MONDAY");
	 break;
	 case 2:
	 System.out.println("TUESDAY");
	 break;
     case 3:
	 System.out.println("WEDNESDAY");
	 break;
     case 4:
	 System.out.println("THURSDAY");
	 break;
     case 5:
	 System.out.println("FRIDAY");
	 break;
     case 6:
	 System.out.println("SATURDAY");
	 break;
     case 7:
	 System.out.println("SUNDAY");
	 break;
	 default :
	 System.out.println("Invalid Choice");
	 
	 }
	
}
    
}
