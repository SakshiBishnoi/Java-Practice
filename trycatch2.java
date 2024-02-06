public class trycatch2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;
        int arr[] = new int[5];
        String str = null;

        try{
            int r = num1/num2;
            System.out.println("Result: " + r);
            System.out.println(arr[3]);
            System.out.println(arr[6]);   
        }
        try{
            System.out.println(str.length());
        }

        catch(ArithmeticException e){
            System.out.println("Error! Cannot divide by zero.");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of array");
        }

        catch(Exception e){
            System.out.println("error" + e);
        }
        //System.out.println("complete");
    }
}
