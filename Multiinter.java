interface A{ 
    void male();
    void female();

}

interface B{
    void  show();

}

class X implements A,B {
    public void male() {
        System.out.println("I am Male");
    }
    public void female() {
        System.out.println("I am F emale");
    }
    public void show(){
        System.out.println("interface B");
    }

}

public class Multiinter {
    public static void main(String[] args) {
        A obj;
        obj = new X();
        ((X)obj).male();
        ((X)obj).female();
        B obj1 = new X();
        obj1.show();


    }
}
