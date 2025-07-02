 //inorder to declare inheritance we use 'extends 'keyword.



class inheritancese {

    String name;
}

    class child extends inheritancese{
        int mileage;
        public void dispaly()
        {
         System.out.println("Name : "+name);
         System.out.println("Mileage : "+mileage);
        }

    }
        public class inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.name="RollsRoyce";
        c.mileage=1597;
        c.dispaly();


        
    }
    }
