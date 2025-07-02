public class parameterisedConstructor {

    String name;
    String USN;
    int age;
    char gender;
    public parameterisedConstructor(String n, String a, int b, char c){

        this.name=n;
        this.USN=a;
        this.age=b;
        this.gender=c;
        


    }  
    public void dispaly(String n, String a, int b, char c)
    {
        System.out.println("Name"+"\t\t"+"USN"+"\t\t"+"Age"+"\t"+"Gender");
        System.out.println(n+"\t"+a+"\t\t"+b+"\t"+c);
    } 
    public static void main(String[] args) {
        parameterisedConstructor p =new parameterisedConstructor("Mohan_Raj","21cs!@!",20, 'M');
        p.dispaly(p.name,p.USN,p.age,p.gender);
        
    }
}
