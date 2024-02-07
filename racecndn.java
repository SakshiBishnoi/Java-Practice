class Counter{
    int count;
    public void increment(){
        count++;
    }
}

public class racecndn {
    private static final ThreadGroup obj1 = null;
    public static void main(String[] args) {

        Counter c =  new Counter();

        Runnable obj = () -> 
        {
         for(int i=0; i<=25; i++){ 
            System.out.println("I am thread 1 : " + i);
                try{Thread.sleep(10);}catch (InterruptedException e){e.printStackTrace();}
                c.increment();
            }
        } ;
        Runnable obj2 = () -> 
        {
            for(int j=0; j<=25; j++){ 
                System.out.println("I am thread 2 : " + j);
                try{Thread.sleep(10);}catch(InterruptedException e){e.printStackTrace();}
                c.increment();
            }
    };
        
        Thread t1=new Thread(obj,"t1"); 
        Thread t2=new Thread(obj2,"t2");  
      
        //Starting the threads  
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        

        System.out.println(c.count);
    
    }
}
