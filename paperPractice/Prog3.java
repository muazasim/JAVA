// import javax.smartcardio.CardException;
import java.util.Scanner;
class Car{

    private int Horsepower;
    private String CarName;


    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    Car(){
        // default constructor 
    }

    // parametrized Constructor 
    Car(int HP , String Carname){
        Horsepower = HP;
        CarName = Carname;
    }

    Car(Car Obj){
        // Object As a parameter
        //copy Constructor
        Horsepower   = Obj.Horsepower; // the object we are getting from main 
        CarName = Obj.CarName;
    }
    

  
}



public class Prog3 {

    

    public static void main(String Args[]){

        Scanner c = new Scanner(System.in);
        // Copy Constructor 
        // Car Mustang = new Car(750, "MUSTANG");
        // Car Fairlady = new Car(Mustang);
        // System.out.println("Car Name  : " + Fairlady.getCarName() +  " HorsePower " + Fairlady.getHorsepower());

        // Array of Objects 
        Car [] ArrayofCars = new Car[2] ;

        for(int i = 0 ; i<ArrayofCars.length ;i++){

            ArrayofCars[i] =new Car();
            ArrayofCars[i].setHorsepower(i+100);
            ArrayofCars[i].setCarName(i+"Mustang");
        }

            for(int i = 0 ; i<ArrayofCars.length ;i++){
                    System.out.println("Name of Car : "+ ArrayofCars[i].getCarName());
        }
      
    }
}
