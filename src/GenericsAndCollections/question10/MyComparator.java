package GenericsAndCollections.question10;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        String[] values = {"123","Abb","abb"};
        Arrays.sort(values, new MyComparator());
        for (String s : values)
            System.out.print(s + " ");
    }
}


//Abb abb 123. The array is sorted using MyComparator, which sorts the elements in reverse alphabetical
//order in a case-insensitive fashion. Normally, numbers sort before letters. This code
//reverses that by calling the compareTo() method on b instead of a.