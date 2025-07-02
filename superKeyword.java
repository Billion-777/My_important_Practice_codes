


class inheritan {

    String name="Richie";
}

    class childa extends inheritan{
        String name="Rich";
        public void dispaly()
        {
         System.out.print("Name : "+super.name+"_"); // we use super class in times wher local and non static variable are same, so we use 'super' to differenciate parent from child.

         System.out.println(name);
        }

    }
        
    
    public class superKeyword{
        public static void main(String[] args) {
            childa cn = new childa();
            cn.dispaly();
    
}
    }
