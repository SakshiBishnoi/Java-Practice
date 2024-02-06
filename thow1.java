class SelfCreatedException extends  Exception {
	public SelfCreatedException(String message) { 
        super(message); }

}



public class thow1 {
    public static void main(String[] args) {
        int num1 = 1000;
        int num2 =5000;

        try {
            
            int r = num2/num1;
            System.out.println("Result is " + r);
            if(r==0)
            throw new  SelfCreatedException("hey, you went wrong here!"); //throw a user-defined exception
        }
        catch (SelfCreatedException e){
            System.out.println("Caught an Exception: " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong here" + e);
        }
    
        
    }
}
