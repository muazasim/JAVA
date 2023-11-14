// package Lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task1 {


    public  static void main (String Args[]){

            List <String> Colours = new ArrayList<String>();

            
            Colours.add("Black");
            Colours.add("Orange");
            Colours.add("Green");

            System.out.println(Colours);
            
            Colours.add(0, "red");

            System.out.print(Colours.get(2));

            Colours.set(2,"Grey");


            Colours.remove(2);


            if(Colours.contains("Grey")){
            for(String color : Colours){
                            if (color=="Grey")
                            {
                                System.out.println("The Searched color is : "+color);
                            }
                        }
            }
         
            Collections.sort(Colours);

            System.out.println(Colours);

            Collections.shuffle(Colours);
            System.out.println(Colours);

            Collections.reverse(Colours);
            System.out.println(Colours);


            Collections.swap(Colours, 0, 2);
            System.out.println(Colours);

            List <String> newList =  Colours.subList(1, 3);

            System.out.println(newList);


            Colours.set(1, "Purple");

            Colours.clear();

            System.out.println(Colours.isEmpty());


            Colours.addAll(Colours);
    }

    
    
}
