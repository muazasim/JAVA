import java.util.Scanner;



 class Student{

    private int age;
    private String name;
    private String course;


    void setName(String n){
        this.name = n;
    }
    
    void setAge(int a ){
        this.age = a;
    }
    void setCourse(String c ){
        this.course = c;
    }

    String getName (){
        return this.name;
    }

    String getCourse (){
        return this.course;
    }

    int getAge(){
        return this.age;
    }
}


public class Task1 {

    public static void main ( String Arg[]){
        Scanner c = new Scanner (System.in);

        Student  obj= new Student(); 
        System.out.println("Enter Your Name : ");
        String n=c.nextLine();
        obj.setName(n);
        System.out.println("Enter Your Course : ");
         String k=c.nextLine();
        obj.setCourse(k);
         System.out.println("Enter Your Age : ");
        int a = c.nextInt();
        c.nextLine();
         obj.setAge(a);

        Student  obj1= new Student(); 
        System.out.println("Enter Your Name : ");
        n=c.nextLine();
        obj1.setName(n);
     System.out.println("Enter Your Course : ");
         k=c.nextLine();
        obj1.setCourse(k);
        
         System.out.println("Enter Your Age : ");
         a = c.nextInt();
           c.nextLine();
         obj1.setAge(a);

          Student  obj2= new Student(); 
        System.out.println("Enter Your Name : ");
        n=c.nextLine();
        obj2.setName(n);
       System.out.println("Enter Your Course : ");
        k=c.nextLine();
        obj2.setCourse(k);
      
        System.out.println("Enter Your Age : ");
        a = (obj.getAge()+ obj1.getAge())/2;
         
         obj2.setAge(a);
        System.out.println("Your Age : " + obj2.getAge());
        System.out.println("Your Name : " +obj2.getName());
        System.out.println("Your Course : " + obj2.getCourse());
    }


    
    
}
