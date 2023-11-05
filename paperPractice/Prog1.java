import java.util.Scanner; 

 class Student { 

    Student(){
        System.out.println("");
    }

    private int StudentId; 
    private String StudentName;
    private int Marks;
    int[] Subjects = new int[5];

    void setStudentId(int ID){
        StudentId =ID;
    }
    void setStudentName(String Name){
        StudentName= Name;
    }
    
    int getStudentId(){
       return StudentId; 
    }

    String getStudentName(){
        return StudentName;
    }

    void setMarks(){
        switch(StudentId) {

            case 100: 
                 Marks =100;
                 break; 
            case 200 : 
                Marks = 200;
                break; 
            default :
                Marks = 1232;
                break;

        }
    }

    int getMarks(){
        return Marks;
    }
    void setSubjects(){

        for (int i = 0 ; i<Subjects.length ; i++){
            Subjects[i] = i+100;
        }
    }
 int[] getSubjects(){
        for (int i = 0 ; i<Subjects.length ; i++){
           System.out.println("ID of Subject "+i +Subjects[i]);
        }
        return Subjects;
 }


}

public class Prog1{
public static void main(String  Args []){
    Student Obj1 = new Student(); 
    
    Obj1.setStudentId(24300);
    Obj1.setStudentName("Muaz");
    Obj1.setMarks();
    Obj1.setSubjects();

    System.out.println("Student Id : " + Obj1.getStudentId());
    System.out.println("Student Name : " + Obj1.getStudentName());
    System.out.println("Student Marks : " + Obj1.getMarks());
    int [] arry = Obj1.getSubjects();
}

}





