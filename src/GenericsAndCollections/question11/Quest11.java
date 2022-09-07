package GenericsAndCollections.question11;

import java.util.HashMap;
import java.util.Map;

public class Quest11 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>(10);
        for (int i = 1; i <= 10; i++) {
            map.put(i, i * i);
        }
        System.out.println(map.get(4));
    }
}
/*
16. Line 8 uses the diamond operator to create the map. Lines 10 and 12 use autoboxing to
convert between the int primitive and the Integer wrapper class. The keys map to their
squared value. 1 maps to 1, 2 maps to 4, 3 maps to 9, 4 maps to 16, and so on.
*/