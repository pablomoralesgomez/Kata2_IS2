package kata2_is2;

import java.util.HashMap;
import java.util.Map;

public class Kata2_IS2 {

    public static void main(String[] args) {
        
        Integer[] data = {1, 2, 1, 3, 5, 3, 4, 2, 1 ,4 ,4, 3, 5, 3, 3};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for(Integer key: histogr.keySet()) {
            System.out.println(key + " --> " + histogr.get(key));
        }
    }
    
}
