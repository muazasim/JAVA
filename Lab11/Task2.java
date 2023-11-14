import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSize.NA;

class Datas{

private int rollno;
private String Name;
private int Marks;

Datas(){

}

public Datas(int rollno, String name, int marks) {
    this.rollno = rollno;
    Name = name;
    Marks = marks;
}
public int getRollno() {
    return rollno;
}
public void setRollno(int rollno) {
    this.rollno = rollno;
}
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
public int getMarks() {
    return Marks;
}
public void setMarks(int marks) {
    Marks = marks;
}


public void displayData(){

    System.out.println("Id : "+rollno + " Name : " + Name + " Marks : " + Marks);
} 


}


public class Task2{


    public static void main ( String Args [])

    {
        Datas std1 = new Datas(252,"Muaz", 879);
        Datas std2 = new Datas(52,"Abdullah ", 899);
        Datas std3 = new Datas(22,"ATTAAAJMSDC", 979);


        List <Datas> data1 =  new ArrayList<Datas>() ;

        data1.add(std1);
        data1.add(std2);
        data1.add(std3);


        for(Datas std : data1){
            std.displayData();
        }


    }


}