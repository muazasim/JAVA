import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee{
    protected int Emp_id;
    protected String Emp_name;
    protected String Emp_desg;
    protected int Emp_salary = 0;
    protected int Emp_wH;
    abstract String showEmpDetails ();
     abstract int calculateSalary (int Wh,int salary);
    abstract void updateWh (int Wh);

}



class Lecturer extends Employee{

    private int no_of_pub;
    private int experience;

    Lecturer(int id , String name , String desg , int salary ,int workingH , int pub , int exp){
    
            this.Emp_id = id;
        this.Emp_name = name;
        this.Emp_desg = desg;
        this.Emp_salary = salary;
        this.Emp_wH = workingH;
        this.no_of_pub = pub;
        this.experience = exp;

    }

    String showEmpDetails (){
        return "Employee Id : " + Emp_id + " Name " + " designation  : " + Emp_desg  ;
    }

    int calculateSalary(int i , int sal){
            if(sal>40){
                
                Emp_salary = sal;
                return sal * 1400;
                
            }
            else {  
                  Emp_salary = sal;    
                return sal * 1500;
            }
    }


    void updateWh (int Wh){
        this.Emp_wH =Wh;
    }

}

class Sweeper extends Employee
{
    private boolean crecord=false;


    
    Sweeper(int id , String name , String desg , int salary ,int workingH ,boolean record){
    
            this.Emp_id = id;
        this.Emp_name = name;
        this.Emp_desg = desg;
        this.Emp_salary = salary;
        this.Emp_wH = workingH;
        this.crecord =record;

    }

    String showEmpDetails (){
        return "Employee Id : " + Emp_id + " Name " + " designation  : " + Emp_desg  ;
    }

    int calculateSalary(int i , int sal){
            if(sal>45){
                
                Emp_salary = sal;
                return sal * 600;
                
            }
            else {  
                  Emp_salary = sal;    
                return sal * 500;
            }
    }

        void updateWh (int Wh){
        this.Emp_wH =Wh;
    }


}



class Registrar extends Employee{


   private int  Admin_Exp;
   private int Service_years;



    Registrar(int id , String name , String desg , int salary ,int workingH , int sy , int exp){
    
            this.Emp_id = id;
        this.Emp_name = name;
        this.Emp_desg = desg;
        this.Emp_salary = salary;
        this.Emp_wH = workingH;
        this.Admin_Exp = sy;
        this.Service_years = exp;

    }


     String showEmpDetails (){
        return "Employee Id : " + Emp_id + " Name " + " designation  : " + Emp_desg  ;
    }

        int calculateSalary(int i , int sal){
            if(sal>30){
                
                Emp_salary = sal;
                return sal * 2000;
                
            }
            else {  
                  Emp_salary = sal;    
                return sal * 1500;
            }
    }

    void updateWh (int Wh){
        this.Emp_wH =Wh;
    }



}





class University{


    Scanner c = new Scanner(System.in());
    

    public static void main (String Args[])
{
     List <Employee> uniEmployees = new ArrayList<Employee>();

    
     int choice ;
     do {
        System.out.println("Enter 1 to display record of all Employees");
        System.out.println("Enter 2 to search an employee");
        System.out.println("Enter 3 to update working hours of an employee");
        

        if (choice == 1){

        //    uniEmployees.forEach(null)
        for(Employee Employees :  uniEmployees){
            Employees.showEmpDetails();
        }


        }


     } while (true);
     






     
}


}