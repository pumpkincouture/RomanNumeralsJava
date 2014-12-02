package roman_numerals;

/**
 * Created by administrator on 12/1/14.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class RomanNumeralGeneratorTest{
    RomanNumeralGenerator test = new RomanNumeralGenerator();


    @Test
    public void testConvertsOneToI(){
        assertEquals("I", test.converter(1));
    }

    @Test
    public void testConvertsTwoToII() {
        assertEquals("II", test.converter(2));
    }

    @Test
    public void testConvertsThreeToIII() {
        assertEquals("III", test.converter(3));
    }

    @Test
    public void testConvertsFourToIV() {
        assertEquals("IV", test.converter(4));
    }

}
