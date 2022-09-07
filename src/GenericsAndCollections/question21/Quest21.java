package GenericsAndCollections.question21;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quest21 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        Iterator iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
