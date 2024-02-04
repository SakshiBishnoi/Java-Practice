interface Computer{
    public void show();
}

class Laptop implements Computer{
    public void show(){
        System.out.println("Coding in a Laptop");
    }
}

class Desktop implements Computer{
    public void show(){
        System.out.println("Coding in a Desktop");
    }
}

class Developer{
 public void Devshow( Computer  c){
    System.out.println("Coding, is my work as developer");
   c.show();
 }  
}
 
public class Interface1 {
    public static void main(String[] args) {
        Computer Lap =  new Laptop();
        Computer Desk = new Desktop();
        Developer Dev = new Developer();
        Dev.Devshow(Lap);
    }
}
