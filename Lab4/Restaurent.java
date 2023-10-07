import java.util.Scanner;

class Order{
    private int bill ;
    Order(){
        bill=0;
    }
    void header(){
        System.out.println("****************                   ****************"); 
        System.out.println("**************** WELCOME TO MIAN G ****************");
        System.out.println("****************                   ****************");
        
        System.out.println("\nPress 1 Display Menu" );
        System.out.println("Press 2 to Display Bill " );
        System.out.println("Press 3 to Exit " );
          System.out.println("Enter Your Choice");
    }

    void menu(){
        System.out.println("++++++++++++++++++      ++++++++++++++++++");
        System.out.println("++++++++++++++++++ MENU ++++++++++++++++++");
        System.out.println("++++++++++++++++++      ++++++++++++++++++");
        System.out.println("\1n Sr.No :1  Item Name : Mutton Karahi  Item Price :2600" );
        System.out.println("Sr.No :2  Item Name : CHicken Karahi  Item Price :1600" );
        System.out.println("Sr.No :3  Item Name : Biryani  Item Price :300" );
        System.out.println("Sr.No :4  Item Name : Dahi Bhallay  Item Price :150" );
        System.out.println("Sr.No :5  Item Name : Gol Gappy  Item Price :200" );
        System.out.println("Enter Sr No to add item to your Order" );
        System.out.println("Enter 0 to Exit Menu" );
          System.out.println("Enter Your Choice");
    }

    int getBill(){
        return bill;
    }
    void setBill(int amount){
        bill +=amount;
    }

}


public class Restaurent  {
    public static void main(String Args []){
     Scanner c = new Scanner(System.in);
     int choice ;
    
     Order order = new Order();

    do{
        order.header();

      
        choice=c.nextInt();

        switch(choice){

        
            case 1:
          
                int item;
                do{
                          order.menu();
                     
                        item=c.nextInt();

                        switch(item){
                        
                            case 1:
                            order.setBill(2600);
                            
                            break;
                            case 2:
                            order.setBill(1600);
                            break;
                            case 3:
                            order.setBill(300);
                            break;
                            case 4:
                          order.setBill(150);
                            break;
                            case 5:
                            order.setBill(200);
                            break;
                            default :
                            System.out.println("Invalid Choice");
                            break;
                            
                        }
                    }while(item!=0);
                
                break;
            case 2:
                System.out.println("************ THANK YOU ************");
                if (order.getBill()>0){
                System.out.println("************ Your Bill is : "+order.getBill() +  "Rs ************"); 
                }
            case 3:
                choice=2;
                break;
            default :
            System.out.println("Invalid Choice");
            
            }
     }while(choice!=3);
    }
}

