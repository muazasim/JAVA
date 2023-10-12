
class Person{
    private String Name;
    private String Address;
    private int Age;

    Person(){}
    Person(String n , String b , int c){
        Name = n;
        Address = b;
        Age = c;
    }
// @Override
public String toString(){
    return "Ths Person is  Name : "+Name +" Address : "+Address+" Age : "+Age;
}

}


public class Task1 {
 public static void main(String Args[]){

    Person obj = new Person("Muaz","Lahore", 12);
    
    System.out.println(obj.toString());
 }   
}

