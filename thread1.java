class A extends Thread{
    public void run(){
        for(int i=0; i<=50 ;i++){
            System.out.println("In class A: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace(); }
        }
}}
class B extends Thread {
    public void run(){
        for( int j=0; j<=50; j++){
            System.out.println("In class B : " + j);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace(); }
        }
}}
public class thread1{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
        
    }
}