import java.util.Scanner;

public class Task17 {
    	public static void main (String Args[]){
	 Scanner c = new Scanner(System.in);
	 int bill=0;
	
	 int choice;
     do{

        System.out.println("************ WELCOME TO BHAIYAY KABAB ************");
        System.out.println("************ ENTER 1 to Display Menu ************");
        System.out.println("************ ENTER 2 to Display Your Bill & Exit ************");
        System.out.println("Enter Your Choice");
        choice=c.nextInt();

        switch(choice){
        
            case 1:

                int order;
                do{

                        System.out.println("************ MENU ************");
                        System.out.println("************ ENTER 1 Beef Kabeb  Price : 750Rs ************");
                        System.out.println("************ ENTER 2 Mutton Tikka  Price : 1750Rs ************");
                        System.out.println("************ ENTER 3 Chicken Tikka  Price : 1000Rs ************");
                        System.out.println("************ ENTER 4 Chicken Kabeb  Price : 800Rs ************");
                        System.out.println("************ ENTER 5 to Exit Menu ************");
                        System.out.println("Enter Your Choice");
                        order=c.nextInt();

                        switch(order){
                        
                            case 1:
                            bill+=750;
                            
                            break;
                            case 2:
                            bill+=1750;
                            break;
                            case 3:
                            bill+=1000;
                            break;
                            case 4:
                            bill+=800;
                            break;
                            case 5:
                            order=5;
                            break;
                            default :
                            System.out.println("Invalid Choice");
                            break;
                            
                        }
                    }while(order!=5);
                
                break;
            case 2:
                System.out.println("************ THANK YOU ************");
                if (bill>0){
                System.out.println("************ Your Bill is : "+bill +  "Rs ************"); 
                }
                choice=2;
                break;
            default :
            System.out.println("Invalid Choice");
            
            }
     }while(choice!=2);
	
	
}
    
}
