package kata2_is2;

import java.util.HashMap;
import java.util.Map;

public class Kata2_IS2 {

    public static void main(String[] args) {
        
        int[] data = {1, 2, 1, 3, 5, 3, 4, 2, 1 ,4 ,4, 3, 5, 3, 3};
        
        Map<Integer, Integer>  histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(
                    key, histogram.containsKey(key)? histogram.get(key) + 1: 1);
        }
        
        for(Integer key: histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
    
}
