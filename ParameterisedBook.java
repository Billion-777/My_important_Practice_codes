public class ParameterisedBook {
    String name;
    int Price;
    String Title;
    int no_of_pages;

    public ParameterisedBook(String n,int P,String T,int noofpages)
    {
        name=n;
    Price=P;
    Title=T;
    no_of_pages=noofpages;
    System.out.println("Author"+"\t\t"+"Price"+"\t\t"+"Title"+"\t\t"+"Pages");
    System.out.println(n+"\t"+P+"\t\t"+T+"\t"+noofpages);

    }
    public static void main(String[] args) {
        ParameterisedBook pn = new ParameterisedBook("J.K.Rowling", 2000, "Harry Potter",1000);
        
    }
}
