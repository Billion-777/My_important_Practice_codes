
  /// callini one constructor from another contructor is call constructor chaining
  // using call to "this" i.e this(var1,var2, ....,varn)

public class constructorChaining {
    String name;
    double salary;
    String subject;
    char gender;
    public constructorChaining()
    {
        System.out.println("*------------------*-----------------*");

        System.out.println("no argument constructor");
    }
        public constructorChaining(String name)
        {
            this.name = name;

        }
        public constructorChaining(String name,double salary)
        {
            this(name);    // constructor chaining method
            this.salary =salary;
        }
        public constructorChaining(String name,double salary,String subject)
        {
            this(name,salary);  // constructor chaining method
            this.subject = subject;
        }
        public constructorChaining(String name,double salary,String subject,char gender)
        {
            this(name,salary,subject); // constructor chaining method
            this.gender = gender;
        }
        public void dispaly()
        {
            System.out.println("NAME : "+ name);
            System.out.println("SALARY : "+ salary);
            System.out.println("SUBJECT : "+ subject);
            System.out.println("GENDER : "+ gender);
            System.out.println("*------------------*-----------------*");

        }
    public static void main(String[] args) {
        constructorChaining s= new constructorChaining();
        s.dispaly();
        constructorChaining sc = new constructorChaining("Deeksha");
        sc.dispaly();
        constructorChaining scc  =new constructorChaining("Deeksha",200000);
        scc.dispaly();
        constructorChaining scn =new constructorChaining("Deeksha", 200000, "Advance Java");
        scn.dispaly();
        constructorChaining snn =new constructorChaining("Deeksha", 200000, "Advance Java",'F');
        snn.dispaly();
    }
}

