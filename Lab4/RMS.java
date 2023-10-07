import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Restaurant {
    private String menuItem;
    private double price;
    private int rating;
    public Restaurant(String menuItem,double price,int rating) {
         this.menuItem = menuItem;
		 this.price = price;
		 this.rating = rating;
	 }
   public String getMenuItem() {
       return menuItem;
	 }
   public double getPrice() {
       return price;
	 }
   public int getRating() {
       return rating;
	 }
}
class Addmenu {
	private String itemN;
	private double price1;
	private int rating;
	 public void addITEMS(List<Restaurant> menu1) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter item that you want to add");
			String itemN = scanner.nextLine();
		 System.out.println("Enter item's price");
		    double price1 = scanner.nextDouble();
		 System.out.println("Enter it's rating");
		 int rating = scanner.nextInt();
		 menu1.add(new Restaurant(itemN,price1,rating));
	 }
}
class removeMenu {
	private String Sfood;
	public void removeITEM(List<Restaurant> menu2) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the food that you want to remove");
        String Sfood = scanner.nextLine();
		for(Restaurant i:menu2) {
			if (i.getMenuItem().equals(Sfood)) {
				menu2.remove(i);
				break;
			 }
			 else {
				 System.out.println("Item not found\nTry again");
				 break;
			 }
		}
}
}
public class RMS {
     public static void main(String[] args) {
	 List<Restaurant> menu = new ArrayList<>();
	 menu.add(new Restaurant("banana",5.6,3));
	 menu.add(new Restaurant("burger",4.5,2));
	 menu.add(new Restaurant("pizza",9.4,4));
	 Addmenu obj = new Addmenu();
	 removeMenu obj2 = new removeMenu();
	 System.out.println("\nWelcome to hotel management System\nPress 1 to show menu List\nPress 2 to add menu product\nPress 3 to remove menu product\nPress 4 to exit program\n");
	Scanner scanner = new Scanner(System.in);
	int choice = scanner.nextInt();
	while (choice != 4) {
	     if(choice==1) {
	        for(Restaurant obj1: menu) {
	            System.out.println("Item: "+obj1.getMenuItem());
	            System.out.println("Price "+obj1.getPrice());
	            System.out.println("Rating "+obj1.getRating());
	        }
	    }
		else if(choice==2) {
			obj.addITEMS(menu);
		}
         else if(choice==3) {
                 obj2.removeITEM(menu);
         }
		else {
			System.out.println("Please choose correct option from the display box\n..Try again");
		}
	 System.out.println("\nWelcome to hotel management System\nPress 1 to show menu List\nPress 2 to add menu product\nPress 3 to remove menu product\nPress 4 to exit program\n");
	  int choice1 = scanner.nextInt();
	  choice = choice1;
}
scanner.close();
}	
}