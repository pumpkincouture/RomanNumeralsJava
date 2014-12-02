package roman_numerals;

import java.util.HashMap;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
        HashMap<Integer, String> numeralMap = new HashMap();

        numeralMap.put(4, "IV");
        numeralMap.put(1, "I");
        numeralMap.put(5, "V");


        for(int i=0; i < number; i++){
            if (number < 4) {
                romanNumeral += "I";
            } else if (number < 6) {
                romanNumeral = numeralMap.get(number);
            } else {
                romanNumeral = "VI";
            }
        }
        return romanNumeral;
    }
}
