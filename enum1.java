enum Laptop{
    Macbook(120000),
    MicrosoftSurface(900000),
    Thinkpad(20000),
    ChromeBook(30000),
    AsusBook();

    private int price;
   //private String NL = "Not Launched" ;

    

    private Laptop() {

    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}




public class enum1 {
    public static void main(String[] args) {

        //Laptop lap  = Laptop.Macbook;
        //System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println("The price of the " + lap + " is "+ lap.getPrice());
        }
    }
}
