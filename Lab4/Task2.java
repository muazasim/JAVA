import java.util.Scanner;
class Course{
    private int credithourse;
    private String name;
    private String coursename;
   
    Course(){
    
    }

    Course(int a, String b , String c){
        this.credithourse = a;
        this.name = b;
        this.coursename = c;
    }
    void setname(String n){
        this.name = n;
    }
    
    void setcredithourse(int a ){
        this.credithourse = a;
    }
    void setcoursenamename(String c ){
        this.coursename = c;
    }

    String getName (){
        return this.name;
    }

    String getcoursename (){
        return this.coursename;
    }

    int getcredithourse(){
        return this.credithourse;
    }
}


public class Task2 {
    
    public static void main (String Arg[]){
        Scanner c = new Scanner(System.in);

    Course obj1 = new Course(12,"Muaz","English");
    Course obj2 = new Course(16,"Bilal","Math");
    int k = (obj1.getcredithourse()+obj2.getcredithourse())/2; 
    Course obj3 = new Course(k,"Hasham","Phy");

    System.out.println("Course Name : " + obj3.getName() + "Instructor Name : " +obj3.getName() + "Credit Hourse : " + obj3.getcredithourse());
    }
}
