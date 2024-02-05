enum Status{
    Running, Pending, Failed, Success //named constants 
}

public class enumprc {
    public static void main (String[] args) {
        //Status s = Status.Running;

        Status[] ss = Status.values();

        for (Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
