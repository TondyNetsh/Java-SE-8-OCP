package Dates_StringsAndLocalization.question17;

import java.util.Properties;

public class Quest17 {
    private static void print(Properties props) {
        //System.out.println(props.get("veggies","none") + " " + props.get("omni","none"));
    }
}
/*
What is the output of the following method if props contains {veggies=brontosaurus,
meat=velociraptor}?
A. brontosaurus none
B. brontosaurus null
C. none none
D. none null
E. The code does not compile.
F. A runtime exception is thrown.
==============================================================================================
E. The Properties class defines a get() method that does not allow for a default value.
It also has a getProperty() method, which returns the default value if the key is not provided.
*/