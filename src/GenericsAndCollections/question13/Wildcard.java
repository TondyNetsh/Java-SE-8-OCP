package GenericsAndCollections.question13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Wildcard {
    public void showSize(List<?> list) {
        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Wildcard card = new Wildcard();
        //ArrayList<? super Date> list = new ArrayList<Date>();
        Vector<? extends Number> list = new Vector<Integer>();
    }
}
