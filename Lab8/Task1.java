// package Lab8;

class Animal {

    private String name;
    private String species;
    private int age;


    Animal(String Name , String Species , int Age){
        name= Name;
        species = Species;
        age =Age;
    }
    Animal(Animal a){
         name= a.name;
        species = a.species;
        age =a.age;
    }

    public  void  makesound(){
        System.out.println("Animal");
    }


    public String toString(){
        return "Name : "+name +" Specie : " + species +" Age : "+ age;
    }


}

class Lion extends Animal{

    Lion( String Name , String Specie , int Age){
        super(Name, Specie, Age);
    }

    public void makesound (){
        System.out.println("Lion");
    }
}


class Elephant extends Animal{

    Elephant( String Name , String Specie , int Age){
        super(Name, Specie, Age);
    }

    public void makesound (){
        System.out.println("Elephant");
    }
}

class Cage {
   Animal[] ListofAnimal = new Animal[3];
//    ListofAnimal[1] new Animal()  
   public static int AnimlaNo= 0; 

    void addAnimal (Animal obj){
            ListofAnimal[AnimlaNo] = obj;
            ++AnimlaNo;
         }

    void printAnimalSounds (){

        for(int i=0 ; i<AnimlaNo; i++){

            ListofAnimal[i].makesound();
        }

    }

}

public class Task1 {
    
public static void main(String Args []){
    Cage cage1= new Cage();
    Lion lion = new Lion("Muaz","Mamal", 13);
    Elephant ele = new Elephant("Ele","Mamal", 50);

    cage1.addAnimal(lion);
    cage1.addAnimal(ele);
    cage1.printAnimalSounds();
}

}
