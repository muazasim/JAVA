package Assignment2.models;

public class PremiumMember  extends Member {


    public PremiumMember(String email, String name, String address, char gender,String choosedPackage , double height, double startingWeight ){
        super(email, name, address, gender,choosedPackage, height,startingWeight);
    }

     public void  setChosenPackage(String chosenPackage)
    {
        chosenPackage =chosenPackage;
    }
    

    
}
