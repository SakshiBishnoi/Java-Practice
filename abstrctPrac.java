abstract class Cloth {
    public abstract void Brand() ;
        //System.out.println("In abstract  class and a abstract method.");
    public abstract void Color();

    public void Type(){
        System.out.println("In abstract  class and not an abstract method.");
    }
}
abstract class WomensWear extends Cloth{
    public void Brand() {
        System.out.println("Called in extended class");
    }
}

class TopWear extends WomensWear{
    public void  Color() {
        System.out.println("Color of the womens wear is Red");
    }
}

public class abstrctPrac {
    public static void main(String[] args) {
        Cloth C= new TopWear();
        C.Brand(); 
        C.Type();
        C.Color();
    }
}