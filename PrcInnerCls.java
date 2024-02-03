class Outer{
    int age;
    public void show(){
        System.out.println("Outer Class in show");
    }

    static class Inner{
        public  void display(){
            System.out.println("Inner Class Inside display");
        }
    }
}

public class PrcInnerCls {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = new Outer.Inner(); 
    } 
}