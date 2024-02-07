import java.util.HashMap;
import java.util.Map;

public class map1 {
    public static void main(String[] args) {
        Map<String, Integer> area = new HashMap<>();

        area.put("Bagaluru", 560045);
        area.put("Hydrabad", 500081);
        area.put("Bangaolre", 140234);
        area.put("Delhi", 122329);
        area.put("Delhi", 9439512);

        
        //System.out.println(area.replace(  "Hydrabad" , 70000));
        for( String key : area.keySet() ) {
            System.out.println(key + " - " + area.get(key));
    }
    
    }
}
