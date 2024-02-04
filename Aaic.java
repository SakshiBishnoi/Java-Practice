abstract class OuterA{
    public abstract void show() ;
}

public class Aaic {
    public static void main(String[] args) {
        OuterA obj  = new OuterA()
        { // Anonymous inner class of type OuterA 
            public void show()
            { 
                System.out.println("Hello from Inner Class"); 
            }
         };
         obj.show();
    }
}