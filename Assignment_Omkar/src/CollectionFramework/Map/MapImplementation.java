package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapImplementation {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Omkar");
        map.put(2, "Shubham");
        map.put(3, "Dhanashree");
        map.put(4, "Shivani");

        System.out.println("---------------------using entryset()-------------------------");

        //iteration using entryset()
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("---------------------using keyset()-------------------------");
        //iteration using keyset()
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("--------------after removing---------------------");
        map.remove(4);
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
