

//static data members
class StaticField
{
    static int objectCount = 0;

    public StaticField()
    {
        objectCount++;
    }

    public String toString()
    {
        return new String ("There are " + objectCount + " objects of class " + this.getClass().getName());
    }

    public static String numOfObjects()
    {
        return new String ("There are " + objectCount + " objects of class " + StaticField.class.getName());
    }



    public static void main(String[] args)
    {
        System.out.println(StaticField.numOfObjects());

        StaticField s1 = new StaticField();
        StaticField s2 = new StaticField();

        System.out.println(s1);
        System.out.println(s2);

    }
}
//static member functions

class StaticMethod {
    int instVar = 10;
    static int staticVar = 20;

    public static void staticMethod() {
        //You can not access instVar directly.
        //  System.out.println(instVar); //error: Cannot make a static reference to the non-static field instVar

        System.out.println(staticVar);

        StaticMethod smObject = new StaticMethod();
        System.out.println(smObject.instVar);
    }


    public static void main(String[] args) {
        StaticMethod.staticMethod();
    }
}
//copy constructor
class Laptop{
    private int model,generation,ram;
    Laptop(int model,int generation,int ram){
        this.model=model;
        this.generation=generation;
        this.ram=ram;
    }
    Laptop(Laptop obj){
        this(obj.model,obj.generation,obj.ram);
    }
    int getModel(){
        return model;
    }
    int getGeneration(){
        return generation;
    }
    int getRam(){
        return ram;
    }
    void display(){
        System.out.println(model);
        System.out.println(generation);
        System.out.println(ram);
    }
}

class main{
    public static void main(String[]args){
        Laptop obj1=new Laptop(1,10,20);
        Laptop obj2=new Laptop(obj1);
        obj1.display();
        obj2.display();


    }
}
//composition
public class Engine {
    private String model;
    private int weight;
    private String color;
    private int price=0;


    public Engine(String model, int weight, String color, int price) {
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public Engine(String rpm, int weight, String silver) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Vehicle {
    private String name;
    private String color;
    private int price;
    private int wheels;
    private Engine engine;


    public Vehicle(String name, String color, int price, int wheels, Engine engine) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}



class mmain{
    public static void main(String[] args) {
        Engine engine=new Engine("2000",20,"black",2000);
        Vehicle vehicle=new Vehicle("Benz","white",900000,4,engine);
        System.out.println("I have a "+ vehicle.getColor()+" "+ vehicle.getName());
        System.out.println("With a weight of "+ vehicle.getEngine().getWeight()+" TONNES");
        System.out.println("The Price is "+ vehicle.getPrice());
    }
}

//objects as paramters

 class test{
    private int i,j;

     public int getI() {
         return i;
     }

     public void setI(int i) {
         this.i = i;
     }

     public int getJ() {
         return j;
     }

     public void setJ(int j) {
         this.j = j;
     }

     test addObject(test obj1,test obj2){
         test temp=new test();
         temp.i=obj1.i+obj2.i;
         temp.j=obj1.j+obj2.j;

         return temp;
     }

     public static void main(String []args){
         test test1=new test();
         test test2=new test();
         test test3=new test();

         test1.setI(4);
         test1.setJ(10);
         test2.setI(12);
         test2.setJ(100);
         System.out.println(test1.getI());
         System.out.println(test1.getJ());
         System.out.println(test2.getI());
         System.out.println(test2.getJ());
         test3=test3.addObject(test1,test2);
         System.out.println(test3.getI());
         System.out.println(test3.getJ());

     }

 }


 //array of objects

class student {
    int rollno;
    String name;
    int marks;

    public student(int rollno,String name,int marks) {
        this.rollno = rollno;
        this.name=name;
        this.marks=marks;
    }


}

class mainnn{
    public static void main(String [] args){
        student s1=new student(1,"Sara",99);
        student s2=new student(2,"Jannat",50);
        student s3=new student(3,"Ali",80);

        student [] s4 =new student[3];
        s4[0]=s1;
        s4[1]=s2;
        s4[2]=s3;

        for(int i=0;i<s4.length;i++){
            System.out.print("Data of Student"+" "+(i+1)+" "+"is"+" "+s4[i].rollno+","+s4[i].name+","+s4[i].marks);
            System.out.println();
        }


    }
}

//generics
// Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type
class Test<T,U> {
    // An object of type T is declared
    T obj;
    U obj1;
    Test(T obj,U obj1) {
        this.obj = obj;
        this.obj1=obj1;
    } // constructor
    void print(){
        System.out.println(obj);
        System.out.println(obj1);
    }
}

// Driver class to test above
class Main {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer,String> Obj = new Test<Integer,String>(15,"b");
        Obj.print();

        // instance of String type
    //    Test<String> sObj
     //           = new Test<String>("GeeksForGeeks");
    //    System.out.println(sObj.getObject());
    }
}

// Java program to show working of user defined
// Generic functions

class Test1 {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11);

        // Calling generic method with String argument
        genericDisplay("GeeksForGeeks");

        // Calling generic method with double argument
        genericDisplay(1.0);
    }
}













