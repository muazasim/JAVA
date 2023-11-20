import java.util.Stack;

public class Task4 {
    
    public static Stack<Integer> reverseStack (Stack<Integer> stack){
        int size = stack.size();
        Integer [] array= new Integer[size];

        System.out.println("Removing the element from stack");
        for(int i = 0 ; i<size ;i++){

            System.out.println(stack.peek());    
            array[i] = stack.pop();
        }


        System.out.println("Adding the element to stack");

        for(int i = 0 ; i<size ;i++){

            stack.push(array[i]);
             System.out.println(stack.peek());  
        }
 
        return stack;

        
    }

        public static void removeDuplicates (Stack<Integer> stack){
        int size = stack.size();
        Integer [] array= new Integer[size];

        System.out.println("Removing the element from stack");
        for(int i = 0 ; i<size ;i++){

            System.out.println(stack.peek());    
            array[i] = stack.pop();
        }


        System.out.println("Adding the element to stack");

        for(int i = size-1 ; i>=0 ;i--){

            if (stack.contains(array[i])) {
                continue;
                
            }
            stack.push(array[i]);
             System.out.println(stack.peek());  
        }
 
       

        
    }

    public static void main(String args[]){
        Stack <Integer> stack = new Stack<Integer>() ;
        
        
        stack.push(85);
        stack.push(99);
        stack.push(5);
        stack.push(8);

        System.out.println("The number at the top of stack is : " + stack.peek());
        stack.pop();
        System.out.println("The number at the top of stack is : " + stack.peek());

        System.out.println("The Stack is empty : "+stack.isEmpty());

        System.out.println("Stack before reversing : "+ stack);
        stack = reverseStack(stack);

        System.out.println("Stack after reversing : "+ stack);
    
        System.out.println("the total elemnts in stack are : " + stack.size());


         stack.push(85);
        stack.push(99);
        stack.push(77);

        System.out.println("Stack before removing duplicates  : "+ stack);
        removeDuplicates(stack);
        System.out.println("Stack After removing duplicates  : "+ stack);
        


    }
}
 