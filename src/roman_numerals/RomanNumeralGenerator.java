package roman_numerals;

import java.util.*;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
        LinkedHashMap<Integer, String> numeralMap = new LinkedHashMap();

        numeralMap.put(5, "V");
        numeralMap.put(4, "IV");
        
        for (Map.Entry<Integer, String> entry : numeralMap.entrySet()) {
          while (number >= entry.getKey()) {
              romanNumeral += entry.getValue();
              number -= entry.getKey();
          }
        }

        for(int i=0; i < number; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;
    }
}
