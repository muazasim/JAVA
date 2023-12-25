import java.util.*;
public class Polymorphism {
    public static void main(String[] args) {
Animal obj1 = new Animal();
Lion L = new Lion("Yellow", "Male");    
Cat C = new Cat("Black", "Female");    
System.out.println(L.makeSound()); 
   System.out.println(C.makeSound());
}
}
class Animal {

    String Color;
    String Speshi;

    String makeSound(){
        return "Animal";
    }
    void setColor(String parameter1){
        Color = parameter1;
    }
    String getColor(){
        return Color;
    }
    void setSpeshi(String parameter2){
        Speshi = parameter2;
    }
    String getSpeshi(){
        return Speshi;
    }
Animal(){}
Animal(String Color , String Speshi){
    this.Color=Color;
    this.Speshi=Speshi;
}
}
class Lion extends Animal{
    @Override
    String makeSound() {
        // TODO Auto-generated method stub
        return super.makeSound() + "roar";
    }
    Lion(){}
    Lion(String Color,String Speshi){
        super(Color, Speshi);
    }
    }
class Cat extends Animal{
    @Override
    String makeSound() {
        // TODO Auto-generated method stub
       return super.makeSound() + "Meaooww";
    }
    Cat(){}
    Cat(String Color,String Speshi){
        super(Color, Speshi);
    }
    }