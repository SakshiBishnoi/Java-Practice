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
        Runnable obj1 = new X();//Creates two Runnable objects (obj1 and obj2) of type X and Y respectively.
        Runnable obj2 = new Y();

        //Thread t1 = new Thread();
        Thread t1 = new Thread(obj1);//Creates two Thread objects (t1 and t2) and associates them with obj1 and obj2.
        Thread t2 = new Thread(obj2);//promoting reusability and potential for managing the Runnable objects independently.

       

        //Thread t1 = new Thread(new X()); //Creates two Thread objects (t1 and t2) directly within the constructor, passing instances of X and Y (created anonymously).
        //Thread t2 = new Thread(new Y());//creating both the thread and the associated object in one step, but sacrifices some potential flexibility.

        t1.start();
        t2.start();
        
    }
}
