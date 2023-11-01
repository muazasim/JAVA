import java.util.*;
import java.lang.Math;
class Ferry {
    Random r = new Random();
   int[] myNum;


   Ferry(){
    Scanner s = new Scanner(System.in);
    for(int i=0 ; i<3 ; i++ ){
        System.out.println("ENTER THE VALUE OF NUMBER 1");
        myNum[i]= s.nextInt();
    }
   }


 void Add(){
    int index1= r.nextInt(3);
    int index2= r.nextInt(3);

    int ans= myNum[index1] + myNum[index2];
   System.out.println("The Addition of two Random Indexes of the Array is : "+ ans);
}

void Subtract(){
    int index1= r.nextInt(3);
    int index2= r.nextInt(3);
   int ans= myNum[index1] - myNum[index2];
   System.out.println("The Subtraction of two Random Indexes of the Array is : "+ ans);

}

void Divide (){
    int index1= r.nextInt(3);
    int index2= r.nextInt(3);
   int ans= myNum[index1] / myNum[index2];
   System.out.println("The Division of two Random Indexes of the Array is : "+ ans);
}

void Multiply(){

     int index1= r.nextInt(3);
     int index2= r.nextInt(3);

   int ans= myNum[index1] * myNum[index2];
   System.out.println("The MUltiplication of two Random Indexes of the Array is : "+ ans);

}



};

public class Task2 {

    public static void main(String Args[]){

        Ferry ferry = new Ferry();
        ferry.Add();
        ferry.Divide();
        ferry.Subtract();
        ferry.Multiply();
    }


}
