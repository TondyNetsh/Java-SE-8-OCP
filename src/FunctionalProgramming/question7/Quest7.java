package FunctionalProgramming.question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quest7 {
    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy,(a,b) -> b.compareTo(a));
        return copy;
    }
}
