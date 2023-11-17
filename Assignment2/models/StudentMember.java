package Assignment2.models;

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
    
}
