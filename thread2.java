class X implements Runnable{
    public void run() { 
    for(int i=0; i<=5; i++){
        System.out.println("Cookie" + i);
        try{
            Thread.sleep(10);
            }catch (InterruptedException e){e.printStackTrace(); }
        }
    
    }}
class Y implements Runnable{
    public void run() { 
        for(int j=0; j<=5; j++){
            System.out.println("Pastry" + j);
            try{
                Thread.sleep(10);
                }catch (InterruptedException e){e.printStackTrace(); }
        }
}}

public class thread2 {
    public static void main(String[] args) {
        //X obj1 = new X();
        Runnable obj1 = new X();
        Runnable obj2 = new Y();

        //Thread t1 = new Thread();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

       

        //Thread t1 = new Thread(new X()); //
        //Thread t2 = new Thread(new Y());

        t1.start();
        t2.start();
        
    }
}
