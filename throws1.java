class Calc{
    public void show() throws ClassNotFoundException{
        //System.out.println("This is a Calc Class");
        Class.forName("Z");
    }
}



public class throws1 {
    public static void main(String[] args) {
        Calc obj  = new Calc();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();//prints the eniter stack, and you can track which method is calling which method, and you can because of which method the problem ha arised
        }
    }
    
}
