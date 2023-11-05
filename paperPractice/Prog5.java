//     ...........  COMPOSITION .............
class BabyShark{

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    BabyShark(){

    }
   public BabyShark(String name) {
        Name = name;
    }

}





class Dodo{
    private BabyShark Obj;  
    private int size;  

    Dodo(){

    }

    Dodo(int s , BabyShark Shark){
        size =s;
        Obj = Shark;
        
    }
    public BabyShark getObj() {
        return Obj;
    }
    public void setObj(BabyShark obj) {
        Obj = obj;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }


}







class Prog5{

    public static void main(String Args[]){

        BabyShark sharkii = new BabyShark("BABAY SHAT tu ru Tu ru ");
        Dodo Dodo1 = new Dodo(12, sharkii);

    


    }


}