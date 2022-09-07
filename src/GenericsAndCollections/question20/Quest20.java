package GenericsAndCollections.question20;

import java.util.HashMap;
import java.util.Map;

public class Quest20 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc","def");
        //System.out.println(m.contains("123"));
    }
}
/*
E. This question looks like it is about generics, but it’s not. It is trying to see if
you noticed that Map does not have a contains() method. It has containsKey() and
containsValue() instead. If containsKey() was called, the answer would be false
because the 123 in the list is an Integer rather than a String.
*/