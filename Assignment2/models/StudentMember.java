package Assignment2.models;

import java.util.Scanner;

public class StudentMember extends Member {
    
    private int studentid ;
    private String collegename;
    


    StudentMember(){}
    public StudentMember(String email, String name, String address, char gender,String choosedPackage , double height, double startingWeight, int studentid , String collegename){
        super(email, name, address, gender,choosedPackage, height,startingWeight);
        this.studentid = studentid;
        this.collegename =collegename;
    }

    
    public void  setChosenPackage(String chosenPackage)
    {
        chosenPackage =chosenPackage;
    }


    public int getStudentid() {
        return studentid;
    }


    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }


    public String getCollegename() {
        return collegename;
    }


    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    

    
    public String toString() {
        return 
                super.toString()+
                ", studentid=" + studentid +
                ", collegename=" + collegename;
    }
    
   static StudentMember CreateStudentMember(){
Scanner scanner = new Scanner(System.in);
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
       
        return student;
            }
}
