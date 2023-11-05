// package paperPractice;


class Vehicle{
    // constructor overloading done 
    // constructor overriding  done 
    // copy constructor pending 

    Vehicle(){
        System.out.println("Constructor of Vehicle class");
    }
     Vehicle(String Name){
       
        System.out.println("Constructor of Vehicle class + " + Name);

    }

    void DisplayName(){
        System.out.println("Muaz Asim --- for Vehcile ");
    }


    private String vehicleType;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    } 
     
}

class Car extends Vehicle{

    

    Car(){
         System.out.println("Constructor of Car class  firstt  ");
    }

    Car(String Name){
      
         System.out.println("Constructor of Car class  seconnnnd " + Name);
    }

    Car(String Name , int Age ){
      
         System.out.println("Constructor of Car class thirdddd " + Name);
    }
    Car (Car a){

        /// COPY CONSTRUCTOR 
        setHorsepower(a.getHorsepower());
        setVehicleType(a.getVehicleType());
    }

      void DisplayName(){
        System.out.println("Bilal Qayyum ---- for Car");
    }
    private int horsepower;
    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }


} 





public class Prog2 {

    public static void main(String Args []){



        Car car1 = new Car("Muaz" , 785);
        Vehicle vehcile1 = new Vehicle("CHACHU");
        // Car car2 = new Car("Muaz")
        car1.setVehicleType("Car");
        car1.setHorsepower(900);

        Car car2 = new Car(car1);
        car1.DisplayName();
        vehcile1.DisplayName();


        // System.out.println("Data of Car 2  Vehicle Type : " + car2.getVehicleType() + "|  Car Horsepower : " + car2.getHorsepower() );


    }
    
}
