import java.util.Scanner;
class Task2{
	public static void main (String Args[]){
	 Scanner c = new Scanner(System.in);
	 int num;
	 System.out.println("Enter A Number");
	 num=c.nextInt();
		if (num>0){
			System.out.println("Positive Number");
	 
	}
	else if (num<0){
			System.out.println("Negative Number");
	 
	}
	else {
			System.out.println("Zero");
	 
	}
}
}
