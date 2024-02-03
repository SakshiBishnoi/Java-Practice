import java.net.SocketPermission;

class laptop {
    String brand;
    String model;
    int price;

    @Override
    public String toString() {
        return brand +  " : " + model + " : " + price; 
    }

    public boolean equals(laptop that){
        return (this.brand.equals(that.brand)  && this.model.equals(that.model)  && this.price == that.price);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

public class hashcodepr{
    public static void main(String[] args) {
        laptop obj1 = new laptop();
        obj1.brand = "Apple" ;
        obj1.model = "Macbook Pro 2019";
        obj1.price = 23456789;

        laptop obj2 =  new laptop();
        obj2.brand ="Dell";
        obj2.model = "Inspiron 15 5000 Gaming";
        obj2.price = 23456789 + 1000000;

        laptop obj3 = new laptop();
        obj3.brand="HP";
        obj3.model=obj1.model;
        obj3.price=obj1.price+obj2.price/2;

        laptop obj4 = new laptop();
        obj4.brand = "Apple" ;
        obj4.model = "Macbook Pro 2019";
        obj4.price = 23456789;

        boolean result = obj1.equals(obj4) ;
        
        // System.out.println("Hash code of obj1 : "+obj1.hashCode());
        // System.out.println("\n Hash code of obj2 : "+obj2.hashCode());
        // System.out.println("\n Hash code of obj3 : "+obj3.hashCode()+"\n");

        //System.out.println(obj1.toString()); 

        System.out.println(result);

    }
}
