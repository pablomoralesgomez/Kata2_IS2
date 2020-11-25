package kata2_is2;

import java.util.HashMap;
import java.util.Map;

public class Kata2_IS2 {

    public static void main(String[] args) {
        
        int[] data = {1, 2, 1, 3, 5, 3, 4, 2, 1 ,4 ,4, 3, 5, 3, 3};
        
        Map<Integer, Integer>  histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for(Integer key: histogram.keySet()) {
            System.out.println(key + " --> " + histogram.get(key));
        }
    }
    
}
