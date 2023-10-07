 
 class Menu{
    void header(){
        System.out.println("****************                   ****************"); 
        System.out.println("**************** WELCOME TO MIAN G ****************");
        System.out.println("****************                   ****************");
        
        System.out.println("/nPress 1 to Enter As Hotel Staff " );
        System.out.println("Press 2 to Enter As Customer " );
        System.out.println("Press 3 to Exit " );
    }

    void menu(){
          System.out.println("++++++++++++++++++      ++++++++++++++++++");
          System.out.println("++++++++++++++++++ MENU ++++++++++++++++++");
          System.out.println("++++++++++++++++++      ++++++++++++++++++");
    }
    void displayItem(String Name, int price,int srno){
         System.out.println("Sr.No :"+srno+" Item Name : "+Name +" Item Price : "+price );
         
    }
      void displayBill(int srno,int total){
         System.out.println("Bill.No : "+srno+" Total Bill : "+total );
         
    }

    void customerpanel(){
         System.out.println("/nPress 1 Display Menu" );
        System.out.println("Press 2 to Display Bill " );
        System.out.println("Press 3 to Exit " );
    }
    void staffpanel(){
         System.out.println("/nPress 1 Display All Bills" );
        System.out.println("Press 2 to Display All Items" );
        System.out.println("Press 3 to Exit " );
    }

      void customerupdatebill(){
         System.out.println("/nPress 1 Add an item" );
        System.out.println("Press 2 to Remove an Item " );
        System.out.println("Press 3 to Exit " );
    }
    void stafftoupdateitems(){
         System.out.println("/nPress 1 Add an Item" );
        System.out.println("Press 2 to delete an Item" );
        System.out.println("Press 3 to Exit " );
    }
    
}

class Item{
    public static int serialno =0;
    int price ;
    String Name; 
    int srno;
    void setItem (String n, int pr ){
        Name =n;
        price =pr;
        srno= serialno;
        serialno++;
    }
    int getItemPrice(){
        return price;
    }
    int getItemSrno(){
        return srno;
    }
    String getName(){
        return Name;
    }

}

class Bill{
    public static int Billno =0;
    int total ;
   
    int bno;

    Bill(){
        total=0;
        bno=Billno;
        Billno++;
    }
    void addItemPrice(int price){
        total+= price;
    }
    void removeItemPrice(int price){
        total-= price;
    }


}


class Order {
    Item [] item = new Item[10];
    Bill  bill = new Bill();

    

}





public class RestuarentPro {
    public static void main (String Args[]){

    }
}
