package Dates_StringsAndLocalization.question4;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quest4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins");
        b.getString("name");
    }
}