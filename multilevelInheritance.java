
class Airtransport{
    String types;

}

class flight extends Airtransport{

            String Types;

}
class passenger extends flight
{
    String Pass_name;
    char gender;
    String Seat_Type;



    public void display()
    {
        System.out.println("Airtransport type : "+types);
        System.out.println("Flight Type : "+Types);

        System.out.println("Passenger name : "+Pass_name);
        System.out.println("Gender : "+gender);
        System.out.println("Seat Class : "+ Seat_Type);



    }

    public passenger(String types, String Types,String Pass_name,
    char gender,
    String Seat_Type)
{
    this.types=types;
    this.Types=Types;
    this.Pass_name=Pass_name;
    this.gender = gender;
    this.Seat_Type=Seat_Type;
}
}

public class multilevelInheritance {
    public static void main(String[] args) {
        passenger ps = new passenger("Commercial Flight", "International Emirates", "Richie Rich", 'M', "Business Class");
        ps.display();
        
    }
}
