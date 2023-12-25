import java.util.*;

public class Inheritance {

    public static void main(String args[]) {
   
        Scanner c = new Scanner(System.in);
        System.out.println("Select Catergory");
        System.out.println("Press 1 For Car Press 2 For truck");
        int choice = c.nextInt();
        if(choice == 1){     
            String M;
            System.out.println("enter the model of car");
            M = c.nextLine();
       Car obj2 = new Car("Mehran", "blue", 4);

        System.out.println("Your Car Model is :"+obj2.getModel());
        System.out.println("Your Car Color is :"+obj2.getColor());
        System.out.println("Your Car have Capacity of People:"+obj2.getCapacity());
        }
        else{
            Truck obj3 = new Truck("Japense", "Black", 10, 1000);
         System.out.println("Your Truck Model is :"+obj3.getModel());
        System.out.println("Your Truck Color is :"+obj3.getColor());
        System.out.println("Your Truck have Capacity of People:"+obj3.getCapacity());
        }


    }
    // Vehicle obj1 = new Vehicle();

}

class Vehicle {

    Vehicle() {
    }

    private String Model;
    private String Color;
    private int Capacity;

    void setModel(String parameter1) {
        Model = parameter1;

    }

    void setColor(String parameter2) {
        Color = parameter2;
    }

    void setCapacity(int parameter3) {
        Capacity = parameter3;
    }

    String getModel() {
        return Model;
    }

    String getColor() {
        return Color;
    }

    int getCapacity() {
        return Capacity;
    }

    Vehicle(String Model, String Color, int Capacity) {
        this.Model = Model;
        this.Color = Color;
        this.Capacity = Capacity;
    }
}

class Car extends Vehicle {
    // Scanner c = new Scanner(System.in)
    Car() {
    }

    Car(String Model, String Color, int Capacity) {
        super(Model, Color, Capacity);
    }
}

class Truck extends Vehicle {
    private int wieght;

    void setWieght(int w) {
        wieght = w;
    }

    int getWieght() {
        return wieght;
    }

    Truck() {
    }

    Truck(String Model, String Color, int Capacity, int wieght) {
        super(Model, Color, Capacity);
        this.wieght = wieght;
    }
}