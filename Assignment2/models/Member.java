package Assignment2.models;
import java.util.HashMap;
import java.util.SortedSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public abstract class Member extends Person { 

    private double height ;
    private double startingWeight ;
    private String chosenPackage;

    private HashMap <LocalDate, Assesment> assessment =  new HashMap<LocalDate,Assesment>();


    Member(){}
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

    public Member(String email, String name, String address, char gender,String choosedPackage , double height, double startingWeight)
     {
        super(email, name, address, gender);
        this.height = height;
         this.chosenPackage = choosedPackage;
        this.startingWeight = startingWeight;
       }
   
    

       public String toString() {
        return 
                super.toString()+
                ", height=" + height +
                ", startingWeight=" + startingWeight +
                ", chosenPackage='" + chosenPackage ;
    }
    

    // public Assesment latestAssessment(ArrayList <Assesment> assessment){

    
    //     Collections.sort(assessment, Comparator.comparing(Assesment::getDate));

    //     if (assessment.isEmpty()){
    //         return null;
    //     }

    //     else {

    //         Assesment a = assessment.get(assessment.size()-1);
    //         return a;
    //     }
    // }

    // public ArrayList <Assesment> sortedAssessmentDates(ArrayList <Assesment> assessment){

    //      Collections.sort(assessment, Comparator.comparing(Assesment::getDate));
    //     return assessment;
    // }

    public HashMap<LocalDate, Assesment> getAssessment() {
        return assessment;
    }

    public void setAssessment(HashMap<LocalDate, Assesment> assessment) {
        this.assessment = assessment;
    }
}
