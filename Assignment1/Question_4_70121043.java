
import java.util.*;
 
 class Vehicle{
    Scanner c= new Scanner(System.in);
    private int  year;
    private String model;
  
    private String make;
    private Double price;

    Vehicle(){
        String t;
        int x;
        double f;
        System.out.println("Enter The Type of Vehicle : ");
        t=c.nextLine();
        setMake(t);
         System.out.println("Enter The Model of Vehicle : ");
        t=c.nextLine();
        setModel(t);
        do{
         System.out.println("Enter The Manfacturing Year of Vehicle : ");
        x=c.nextInt();
        setYear(x);
        }while(x<1900 || x>2023);
       
          do{
         System.out.println("Enter The Price of Vehicle : ");
        f=c.nextDouble();
        setPrice(f);
        }while(f<0);

    }


    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
      public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }
}

class Car extends Vehicle{
    Scanner c = new Scanner(System.in);
    private int noofdoors;
    private boolean Electric;

    Car(){
        String t;
        int x;
      
        System.out.println("Is Car Electric or Not Enter Y for yes and N for No  ");
        t=c.nextLine();
        if(t=="Y"){
              setElectric(true);
        }
        else if(t=="N"){
                 setElectric(false);
        }
        else{
            setElectric(false);
            System.out.println("Invalid input please enter a correct Choice");
        }
      
        
        System.out.println("Enter the number of doors of Car");
        x=c.nextInt();
        setNoofdoors(x);
    }

    public int getNoofdoors() {
        return noofdoors;
    }
    public void setNoofdoors(int noofdoors) {
        this.noofdoors = noofdoors;
    }
    public boolean isElectric() {
        return Electric;
    }
    public void setElectric(boolean electric) {
        Electric = electric;
    }

}

public class Question_4_70121043 {
    public static void main( String Args[]){
        System.out.println("Enter Values for Vehicle 1");
        Vehicle vehicle=new Vehicle();
        System.out.println("Enter Values for CAR 1");
        Car car1 = new Car();
        System.out.println("Enter Values for CAR 2");
        Car car2 = new Car();
    }

}
