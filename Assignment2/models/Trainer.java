package Assignment2.models;

public class Trainer extends Person {

    private String speciality ;    

    public Trainer(String email, String name, String address, char gender, String speciality){
        super( name,  email,  address,  gender); 
        this.speciality =speciality;
    }

     public void  setChosenPackage(String chosenPackage)
    {
        chosenPackage =chosenPackage;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
    public String toString() {
        return 
                super.toString()+", speciality=" + speciality;
    }
}
