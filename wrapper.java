public class wrapper {
  public static void main(String[] args) {
    int num = 17;

    //Integer num1  = new Integer(num);//boxing
    //Integer num1 = 7;
    Integer num1 = num; //autoboxing
      int num2 = num1.intValue(); //unboxing

    System.out.println(num2);

    String str = "23";
    int num3 =  Integer.parseInt(str); //parse a string to an integer
    
    System.out.println("The number is: "+num3*2);

  }  
}
