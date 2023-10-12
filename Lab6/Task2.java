class Rectangle {
   private int hieght ;
   private int width ;

    Rectangle(){}
    Rectangle(int a, int b){
        hieght =a;
        width =b;
    }
    

     public Boolean equals(Rectangle a){
        if( hieght == a.hieght && width == a.width){
            return true;
        }
        else {
            return false;
        }
     }
 }


public class Task2 {
    public static void main ( String atrgs[])
    { 
        Rectangle obj = new Rectangle(10, 20);
    
        Rectangle obj1 = new Rectangle(10, 20);
        
        Rectangle obj3 = new Rectangle(3, 20);
        

        if(obj.equals(obj3)){
            System.out.println("SAME OBJ");
        }else{
            System.out.println("Not SAME OBJ");

        }
    }
    
}
