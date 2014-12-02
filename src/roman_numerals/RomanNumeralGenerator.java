package roman_numerals;

import java.util.HashMap;

/**
 * Created by administrator on 12/1/14.
 */
public class RomanNumeralGenerator {
    public String converter(int number) {
        String romanNumeral = "";
        HashMap numeralMap = new HashMap();

        numeralMap.put(4, "IV");
        numeralMap.put(1, "I");


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
