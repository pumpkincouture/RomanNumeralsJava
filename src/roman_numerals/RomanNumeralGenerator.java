package roman_numerals;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
        Map<String, Integer> m = new HashMap<String, Integer>();

        

        for(int i=0; i < number; i++) {
            romanNumeral += "I";
        }

        System.out.println(m);
        return romanNumeral;
    }
}
