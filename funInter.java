@FunctionalInterface
interface A{
    void show();
}
// class X implements A{

//     @Override
//     public void show() {
//         System.out.println("iplemented in B");
//     }
    
// }

public class funInter{
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
               System.out.println("implemented");
                }
        };
        obj.show();
    }
}