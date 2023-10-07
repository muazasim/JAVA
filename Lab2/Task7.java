import java.util.Scanner;
class Task7{
	public static void main (String Args[]){
	 Scanner c = new Scanner(System.in);
	 float num1;
	 System.out.println("Enter A Marks of Subject 1");
	 num1=c.nextInt();
	float num2;
	 System.out.println("Enter A Marks of Subject 2");
	 num2=c.nextInt();
	 float num3;
	 System.out.println("Enter A Marks of Subject 3");
	 num3=c.nextInt();
	
	float ans= ((num1+num2+num3)/300)*100;
	 System.out.println(ans);
}
}