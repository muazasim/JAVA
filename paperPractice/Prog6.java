/// ................ GENERICS ..............



class Test<T>{
    T obj ;

    Test(){}
     Test(T obj1){
        obj = obj1;
     }

     void setObject(T Obj1){
        obj = Obj1;
     }
     T getObject(){
        return obj;
     }

}


public class Prog6 {

    public static void main (String Args[]){
        Test <Integer> Obj= new Test<Integer>(85);
        Test <String> Obj2= new Test<String>("Muaz Asim");
        System.out.println(Obj.getObject());

    }
}
