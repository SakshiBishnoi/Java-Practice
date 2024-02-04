interface A {
    int pincode = 560045;
    String state = "Karnataka";

    void show();
    void  getDetails();

}
class B implements  A {
    public void show(){
        System.out.println("This is the implementation of show method");
    }
    public void  getDetails() {
        System.out.println("This is the implementation of getDetails method");
    }
}

class C implements A{
    public void show(){
        System.out.println("This is the implementation of show method Overriddin");
    }
    public void  getDetails() {
        System.out.println("This is the implementation of getDetails method Overridden");
    }
}

public class Intervar {
    public static void  main(String[] args) {
       // A.state =  "Maharashtra"; //The final field A.state cannot be assigned
       // A.pincode= 123456;

        A obj ;
        obj = new B();
        obj = new C();
        obj.show();
        obj.getDetails();

        System.out.println(A.pincode);
    }
}