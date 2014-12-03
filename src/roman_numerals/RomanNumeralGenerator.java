package roman_numerals;

import java.util.*;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
        LinkedHashMap<Integer, String> numeralMap = new LinkedHashMap();


        numeralMap.put(1000, "M");
        numeralMap.put(900, "CM");
        numeralMap.put(500, "D");
        numeralMap.put(400, "CD");
        numeralMap.put(100, "C");
        numeralMap.put(90, "XC");
        numeralMap.put(50, "L");
        numeralMap.put(40, "XL");
        numeralMap.put(10, "X");
        numeralMap.put(9, "IX");
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
