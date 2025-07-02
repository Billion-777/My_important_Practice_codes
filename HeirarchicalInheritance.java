
// will execute only in eclipse


class Laptop{
    String os;
    int Battery;
}

class Dell extends Laptop{

            int RAM;
            Dell(String os,int Battery,int RAM)
            {
                this.os = os;
                this.Battery = Battery;
                this.RAM=RAM;
            }
     public void display1()
    {
        System.out.println("Laptop OS : "+os);
        System.out.println("Battery Life : "+Battery);
        System.out.println("RAM Specification : "+RAM);

    }

}
class HP extends Laptop{

    int ROM;
HP(String os,int Battery,int ROM)
    {
        this.os =os;
        this.Battery=Battery;
        this.ROM=ROM;
    }

        public void display2()
        {
            System.out.println("Laptop OS : "+os);
            System.out.println("Battery Life : "+Battery+"mAh");
            System.out.println("RAM Specification : "+ROM);
    
        }
}
class Lenovo extends Laptop{
    int ROMs,RAMs;

Lenovo(String os,int Battery,int ROMs,int RAMs)
    {
        this.os=os;
        this.Battery=Battery;
        this.ROMs=ROMs;
        this.RAMs=RAMs;
    }
    
        public void display3()
        {
            System.out.println("Laptop OS : "+os);
            System.out.println("Battery Life : "+Battery);
    
        }
}

public class HeirarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("The Details of HP");
        HP hp =new HP("Windows 8.1", 5500,8);
        hp.display2();
        System.out.println("The Details of Dell");
        Dell de =new Dell("Windows 10", 6000,16);
        de.display1();
        System.out.println("The Details of HP");
        Lenovo le =new Lenovo("Windows 11",6500, 8, 8);
        le.display3();
    }
}
