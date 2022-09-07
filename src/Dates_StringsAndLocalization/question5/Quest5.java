package Dates_StringsAndLocalization.question5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quest5 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en","US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins",fr);
        b.getString("name");
        b.getString("age");
    }
}
