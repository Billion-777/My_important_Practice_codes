public class Oops {
    String name;
    int price;
    String color;
    int seatingCapacity;

     public void dispaly()
     {
        System.out.println("Details of the car"+ name +"\t"+ price +"\t"+ color +"\t"+ seatingCapacity);
     }
    //  Oops(String name, int price, String color, int seatingCapacity){
    //             this.name=name;
    //             this.price =price;
    //             this.color=color;
    //             this.seatingCapacity=seatingCapacity;
    

    public static void main(String[] args) {
        Oops c = new Oops();
        System.out.println("before entries");
        System.out.println(c.name);
        System.out.println(c.price);
        System.out.println(c.color);
        System.out.println(c.seatingCapacity+"\n");
        Oops cn = new Oops();
        System.out.println("After Entries");
        System.out.println(cn.name="RollsRoyce");
        System.out.println(c.price=15000000);
        System.out.println(c.color="Aqua");
        System.out.println(c.seatingCapacity=4);
        cn.dispaly();

        
    }
}

