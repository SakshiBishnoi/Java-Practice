class A{
    public void show1(){
        System.out.println("In A");
    }
}
class B extends A {
    @Override
    public void show1(){
        System.out.println("In B");
    }
}


public class annotation1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show1();

    }
    
}
