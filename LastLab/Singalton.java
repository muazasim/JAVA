 class SingaltonClass{

     private static SingaltonClass ObjectChecker =  null;

    private SingaltonClass(){
    }

    public static void CreateObject(){
        if (ObjectChecker == null){
            ObjectChecker =  new SingaltonClass();
        }
        System.out.println("Hash Code : "+ ObjectChecker.hashCode());
    }



}
public class Singalton{
    public static void main(String[] args) {
        SingaltonClass.CreateObject();
        SingaltonClass.CreateObject();
        SingaltonClass.CreateObject();
    }
}