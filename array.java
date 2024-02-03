public class array{
    public static void main(String[] args) {
        int num[][] = new int[4][]; 
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[2];
        num[3] = new int[1];

int startValue = 1;  

for (int i = 0; i < num.length; i++) {
    //int startValue = 1; 
    int currentvalue = startValue;
    
    for (int j = 0; j < num[i].length; j++) {
        num[i][j] = currentvalue;
        currentvalue++;  
}
}


for (int i = 0; i < num.length; i++) {
    for (int j = 0; j < num[i].length; j++) {
        System.out.print(num[i][j] + " ");
    }
    System.out.println();
}

}
}