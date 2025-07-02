
            //Encapsulation using Getter and Setter methods when the variables in the class are private.

public class encapsulation {

private double balance;
public double getBalance()
{
    return balance;
}

 public void setBalance(double balance)
 {
    if(balance<=0)
    {
        System.out.println("Insufficient balance");
        this.balance=balance;
    }
    else{
    this.balance = balance;
    }
 }

    public static void main(String[] args) {

        encapsulation c  =new encapsulation();
        //encapsulation c  =new encapsulation();
        c.setBalance(490);
        System.out.println(c.getBalance());
        c.setBalance(-500);
        System.out.println(c.getBalance());
        
    }
}
