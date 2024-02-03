public class star {
    public static void main(String args[]){
	    
        int num[][] = new int[4][];
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[2];
        num[3] = new int[1];
	
	for(int i=0;i<num.length;i++){
	  int startingValue = 1;
	   
	  for(int j=0;j<num[i].length;j++){
	    num[i][j] = startingValue;
	    startingValue++;
	     
	    System.out.print("* ");
	  }
	  System.out.println();
	}
}
}





