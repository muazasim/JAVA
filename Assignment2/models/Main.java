package Assignment2.models;

import java.util.Scanner;

public class Main {

    Scanner scanner =new Scanner(System.in);
    // StudentMember(String email, String name, String address, char gender,String choosedPackage , double height, double startingWeight, int studentid , String collegename){
      
    StudentMember CreateStudentMember(){

String email; 
String name;
String address;
 char gender;
 String choosedPackage ;
  double height;
double startingWeight;
int studentid ;
String collegename;
     System.out.println("Enter your Email: ");
     email = scanner.nextLine();

     System.out.println("Enter your Name: ");
     name = scanner.nextLine();

     System.out.println("Enter your Address: ");
     address = scanner.nextLine();

     System.out.println("Enter your Gender (M/F): ");
     gender = scanner.next().charAt(0); 

     System.out.println("Enter your Chosen Package: ");
     choosedPackage = scanner.next();

     do {
          System.out.println("Enter your Height (in meters) must be btw 1 - 3 : ");
     height = scanner.nextDouble();
        
     } while (height >=1 && height <=3);
   

     do {
         System.out.println("Enter your Starting Weight (in kgs): ");
     startingWeight = scanner.nextDouble();
     } while (startingWeight >35 && startingWeight <250);
    

     System.out.println("Enter your Student ID: ");
     studentid = scanner.nextInt();

     scanner.nextLine();

     System.out.println("Enter your College Name: ");
     collegename = scanner.nextLine();

     StudentMember student =new StudentMember( email,  name,address,  gender, choosedPackage ,  height,  startingWeight,  studentid ,  collegename);
return  student;

    }

    public static void main(String args [])

    {

    }
    
}
