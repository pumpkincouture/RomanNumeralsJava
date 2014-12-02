package roman_numerals;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
//        Map<String, Integer> m = new HashMap<String, Integer>();
          HashMap newmap = new HashMap();

          newmap.put(4, "IV");
          newmap.put(1, "I");

        for(int i=0; i < number; i++){
            if (number < 4) {
                romanNumeral += "I";
            } else {
                romanNumeral = "IV";
            }
        }
        return romanNumeral;
    }
}
