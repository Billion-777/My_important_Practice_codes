public class constructorOverloading {

    String name;
    double salary;
    String subject;
    char gender;
    public constructorOverloading()
    {
        System.out.println("*------------------*-----------------*");

        System.out.println("no argument constructor");
    }
        public constructorOverloading(String name)
        {
            this.name = name;

        }
        public constructorOverloading(String name,double salary)
        {
            this.name = name;
            this.salary =salary;
        }
        public constructorOverloading(String name,double salary,String subject)
        {
            this.name = name;
            this.salary =salary;
            this.subject = subject;
        }
        public constructorOverloading(String name,double salary,String subject,char gender)
        {
            this.name = name;
            this.salary =salary;
            this.subject = subject;
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
        constructorOverloading s= new constructorOverloading();
        s.dispaly();
        constructorOverloading sc = new constructorOverloading("Deeksha");
        sc.dispaly();
        constructorOverloading scc  =new constructorOverloading("Deeksha",200000);
        scc.dispaly();
        constructorOverloading scn =new constructorOverloading("Deeksha", 200000, "Advance Java");
        scn.dispaly();
        constructorOverloading snn =new constructorOverloading("Deeksha", 200000, "Advance Java",'F');
        snn.dispaly();
    }
}
