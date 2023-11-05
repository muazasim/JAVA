package Assignment2.models;
import java.util.HashMap;
import java.util.Date;

public abstract class Member extends Person { 

    private double height ;
    private double startingWeight ;
    private String chosenPackage;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getStartingWeight() {
        return startingWeight;
    }

    public void setStartingWeight(double startingWeight) {
        this.startingWeight = startingWeight;
    }

    public String getChosenPackage() {
        return chosenPackage;
    }

    public abstract void setChosenPackage(String chosenPackage);

    public Member(String email, String name, String address, char gender,String choosedPackage , double height, double startingWeight )
     {
        super(email, name, address, gender);
        this.height = height;
         this.chosenPackage = choosedPackage;
        this.startingWeight = startingWeight;
       }
   
    


    
}
