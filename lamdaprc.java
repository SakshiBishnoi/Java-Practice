interface A{
    void show();
}
interface B{
    void show(int num, String name);
}
interface C{
    void show(int age);
}
interface D{
    int show(int a, int b);
}

public class lamdaprc {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello World!");
        obj.show();
        B obj1 = (int num,  String name) -> System.out.println("num - " + num + " name - " + name);
        obj1.show(17, "Cookie");

        C obj2 = age -> System.out.println(age);
        obj2.show(35);

        D obj3 = (a ,b ) -> a+b; 
        int result = obj3.show(5, 5);
        System.out.println(result);

        
        
        
    }

}
