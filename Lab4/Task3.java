class BankAcc{
private float balance ;
private float intrestrate ;
private float time ;
private  float interest; 

BankAcc(){}
BankAcc(float a , float b , float c )
{
    this.balance = a;
    this.intrestrate= b;
    this.time = c ; 
}

void setInterest(){
    float b = this.intrestrate;
    this.interest= b*this.balance*this.time/100;
}

float getInterest(){
    return this.interest;
}
}
public class Task3 {

    public static void main (String Args[]){
         BankAcc obj = new BankAcc(10000, 5, 3);
         obj.setInterest();
        System.out.println("THE INTEREST IS : "+ obj.getInterest());

    }
    
}