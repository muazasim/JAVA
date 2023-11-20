import java.util.Stack;

public class Task5 {
    
    public static Stack<Integer> duplicateEachindex (Stack<Integer> stack){
        int size = stack.size();
        Integer [] array= new Integer[size];

        System.out.println("Removing the element from stack");
        for(int i = 0 ; i<size ;i++){

            System.out.println(stack.peek());    
            array[i] = stack.pop();
        }


        System.out.println("Adding the element to stack");

        for(int i = size -1 ; i>=0 ;i--){

            stack.push(array[i]);
             stack.push(array[i]);
             System.out.println(stack.peek());  
        }
 
        return stack;

        
    }


    public static void main(String args[]){
        Stack <Integer> stack = new Stack<Integer>() ;      
        stack.push(85);
        stack.push(99);
        stack.push(5);
        stack.push(8);

 System.out.println("Stack before duplication of Eacn index : "+ stack);
        
        duplicateEachindex(stack);

        System.out.println("Stack after duplication of Eacn index : "+ stack);


    }
}

 