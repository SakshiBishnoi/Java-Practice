public class trycatch1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        
        //try block
        try{
            num2 = num2/num1;
        }
        catch(Exception e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Output is " + num2);

        try{
            int result = num1 + num2;
            System.out.println("Addition is "+ result);
        }
        catch(Exception e){
            System.out.println("Unsuccessful.");
        }
        //System.out.println(result);
    }
}
