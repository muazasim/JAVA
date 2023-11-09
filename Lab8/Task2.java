abstract class Employee{
    protected int Emp_id;
    protected String Emp_name;
    protected String Emp_desg;
    protected int Emp_salary = 0;
    protected int Emp_wH;
    abstract String showEmpDetails (int Id);
     abstract int calculateSalary (int Wh,int salary);


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

    String showEmpDetails (int id){
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

}

class Sweeper extends Employee
{
    private boolean crecord=false;

    


}





class Task2{

}