

abstract class AnimalSound {

    public abstract void makeSound();
    
}

class Loin extends AnimalSound {

  public Loin(){
    makeSound();
  }
   public void makeSound(){
        System.out.println("Mai EK Sher ho");
    }
}

class Duck extends AnimalSound {

      public Duck(){
    makeSound();
  }
 
   public void makeSound(){
        System.out.println("Mai EK Batakh ho");
    }
}


public class AnimalSoundMain {

    public static void main(String[] args) {
        
    }
    
}
