package Assignment2.models;

public abstract class Person {

    private String name ;
    private String email ;
    private String address ;
    private char gender ;


    Person(){}

    Person ( String e , String n , String a , char g){
        name = n;
        email =e;
        address = a;
        gender = g;
    }




    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    } 
    

    public String toString() {
        return
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender ;
    }

}
