
class bird{
    char gender;
    String color;
    int weights;

}

class peacock extends bird{
    public void display()
    {
        System.out.println("Gender : "+gender);
        System.out.println("Color : "+color);

        System.out.println("Weights : "+weights);


    }
    public peacock(char gender, String color,int weights)
{
    this.gender=gender;
    this.color = color;
    this.weights=weights;
}
}

public class singleInheritance {
    public static void main(String[] args) {
        peacock p =new peacock('M', "Navy blue",15);
        p.display();

        
    }
}
