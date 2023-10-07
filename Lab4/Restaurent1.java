import java.util.Scanner;
 class Order {
    private String [] MenuItems  ;
     private String Name;
    private int [] price ;
    private int [] ratings= new int [4] ;

    private  int [] order = new int[20];
    int count;
    private int total;
    
    Order(){

        count=0;
        total =0;
        for(int i=0 ;i<20;i++){
            order[i]=-1;
        }
          for(int i=0 ;i<4;i++){
            ratings[i]=-1;
            
        }
        MenuItems =new String[]{"Karahi" , "Pulao" ,"Raita" ,"Salad" };
        price = new int []{2500,500,100,150};
    }

    void getMenu(){
    for (int i =0 ;i<4 ;i++){
        System.out.println("Enter "+i +" for "+MenuItems[i]+": "+price[i]+"Rps");
    }
    System.out.println("Enter -2 to Remove an Item from Menu");
    System.out.println("Enter -1 to Exit Menu");
    System.out.println("Enter Your Choice!");
        
    }
    void setBiLL(int x){
        order[count]=x;
        count++;
        
    }
    void DisplayOrder(){
         System.out.println("Your Order has Following Items : ");
        for (int i =0 ;i<order.length ;i++){
        System.out.println("Item code"+order[i] +" for "+MenuItems[order[i]]+": "+price[order[i]]+"Rps");
    }
    }

    int getBill(){
        total=0;
        for(int i = 0 ; i< order.length ; i++ ){
            if (order[i]!=-1){
                 total+=price[order[i]];
            }
           
        }

        return total;
    }
    boolean removeItem(int x){
        boolean t=false;

          for(int i = 0 ; i< order.length ; i++ ){
            if (order[i] == x ){
                 order[i]=-1;
                 t=true;
                 break;
            }

           
        }
        return t;
    }

    void Rate(){
        Scanner c= new Scanner(System.in);
        int r;
        int count=0;
        // r=c.nextInt();
        int choice ;
        

    do{
        System.out.println("Rate Our Items out of 5");
        for (int i =0 ;i<4 ;i++){
        System.out.println("Enter "+i +" to rate "+MenuItems[i]);
    }
      
     System.out.println("Or Enter 5 to exit Rating Menu \n Enter your Choice");
        choice =c.nextInt();
        if (choice == 5){
            return;
        }
        else if( choice >=0 && choice <=4) {
            int p ;
            System.out.println("Enter Rating : ");
            ratings[choice]=c.nextInt();   
        }

    
  
    }while(choice!=5);
        



    }

    void DisplayRating(){

        System.out.println("Rating By : "+Name);

          for (int i =0 ;i<4 ;i++){
            if (ratings[i]==-1){
                 System.out.println("No Ratings For "+MenuItems[i]);
            }
            else{
                 System.out.println("Rated "+ratings[i]+" for "+MenuItems[i]);

            }
       
    }
    }

    void setOrder(){

        Scanner c= new Scanner(System.in);
        System.out.println("Enter Your Name");
        Name = c.nextLine();
    

        int x;
        do{
            System.out.println(" Enter 1 to Display Menu! \n Enter 2 to genrate Bill \n Enter 3 to Exit \n Enter 4 to Rate Our Items \n ENter Your Choice");
            x= c.nextInt() ;

            if(x==1){
                int y;
              do{
                getMenu();
                y=c.nextInt();
                if(y>=0 && y<4){
                    setBiLL(y);
                }
                else if(y==-2){
                    int r;
                    System.out.println("Enter No of the Item your want to Your Bill ");
                    r=c.nextInt();
                    if(removeItem(r)){
                       System.out.println("Item Has been Removed from Your Bill ");
                    }
                    else{
                        System.out.println("You have no such Item item in your Order");
                    }
                    
                }
                else{
                    System.out.println("Invalid Choice !");
                }
              }while(y!=-1);
                
            }
            else if (x==2){
                if(getBill()<=0){
                    System.out.println("No Items were Selected");
                }
                else{
                    DisplayOrder();
                     System.out.println("Your Total Bill is "+getBill());
                }
            }
            else if (x==4){
            
                Rate();
                 System.out.println("<<<<<<<<< RATINGS >>>>>>>>>");
                 DisplayRating();


            }
        }while(x!=3);

    }


}

public class Restaurent1{
    public static void main (String Args[]){
        Order obj = new Order();
        obj.setOrder();

    }
}