import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Task6 {
    
    public static boolean equal (Stack<Integer> stack1,Stack<Integer>stack2){
        int size = stack1.size();
        Integer [] array= new Integer[size];

        // System.out.println("Removing the element from stack1");
        for(int i = 0 ; i<size ;i++){

            System.out.println(stack1.peek());    
            array[i] = stack1.pop();
        }

        int size2 = stack2.size();
        Integer [] array2= new Integer[size2];

      for(int i = 0 ; i<size2 ;i++){

            System.out.println(stack2.peek());    
            array2[i] = stack2.pop();
        }

        System.out.println(stack1.size()+""+stack2.size());

        if (array.length == array2.length){

            for(int i=0;i<array.length ;i++){
                System.out.println(array[i]+"=="+array2[i]);
                if (array[i]== array2[i]){
                    continue;
                }
                else{
                    return false;
                }
            }

            return true;
        }
        else{
            return false;
        }
        

        
    }


    public static void main(String args[]){
        Stack <Integer> stack1 = new Stack<Integer>() ;      
        stack1.push(85);
        stack1.push(99);
        stack1.push(5);
        stack1.push(8);

           Stack <Integer> stack2 = new Stack<Integer>() ;      
        stack2.push(85);
        stack2.push(99);
        stack2.push(5);
        stack2.push(8);



        
        System.out.println(equal(stack1, stack2));


    }
}

 