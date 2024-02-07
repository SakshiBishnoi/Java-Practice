import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.transform.Source;

public class api1 {
    public static void main(String[] args) {
        //Collection<Integer> nums = new ArrayList<Integer>();
       Set<Integer> nums = new TreeSet<Integer>();
        nums.add(49);
        nums.add(58);
        nums.add(65);
        nums.add(100281);
        nums.add(65);

        java.util.Iterator<Integer> values =  nums.iterator();
        
        while (values.hasNext()) 
            System.out.println("Value: " + values.next());
        
        
        // for(int n : nums){
        //     //int n1 = (Integer)n;
        //     //System.out.println(n*2);
        //     System.out.println(n);
        // }
        

    }
}
