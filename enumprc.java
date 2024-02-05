enum Status{
    Running, Pending, Failed, Success //named constants 
}

public class enumprc {
    public static void main (String[] args) {
        Status s = Status.Failed;

        //Status[] ss = Status.values();
       

        if (s == Status.Running)
            System.out.println("Your code is Running now");
        else if (s == Status.Pending)
            System.out.println("Please wait, Your  code is Pending!");
        else if(s == Status.Failed)
            System.out.println("Sorry your Code has failed");
        else
            System.out.println("Congratulations! Your code has been successfully executed.");

    

        switch(s){
            case Running:
                System.out.println("Running");
            break;
            case Failed:
            System.out.println("Failed");
                
            break;
            case Pending:
                System.out.println("Pending");
            break;
            default:
                System.out.println("completed");
            break;
            

        }
    }
}
