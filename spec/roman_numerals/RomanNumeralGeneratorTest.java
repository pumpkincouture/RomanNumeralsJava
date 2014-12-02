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
    public void testConvertsFourToIV() { assertEquals("IV", test.converter(4)); }

    @Test
    public void testConvertsFivetoV() { assertEquals("V", test.converter(5)); }

    @Test
    public void testConvertsSixtoVI() { assertEquals("VI", test.converter(6)); }

    @Test
    public void testConvertsSeventoVII() { assertEquals("VII", test.converter(7)); }

    @Test
    public void testConvertsEighttoVIII() { assertEquals("VIII", test.converter(8)); }

    @Test
    public void testConvertsNinetoIX() { assertEquals("IX", test.converter(9)); }

    @Test
    public void testConvertsTentoX() { assertEquals("X", test.converter(10)); }

    @Test
    public void testConvertsEleventoXI() { assertEquals("XI", test.converter(11)); }

    @Test
    public void testConvertsTwelvetoXII() { assertEquals("XII", test.converter(12)); }

    @Test
    public void testConvertsFifteentoXV() { assertEquals("XV", test.converter(15)); }

    @Test
    public void testConvertsTwentytoXX() { assertEquals("XX", test.converter(20)); }

    @Test
    public void testConvertsFortytoXL() { assertEquals("XL", test.converter(40)); }

    @Test
    public void testConvertsFiftytoL() { assertEquals("L", test.converter(50)); }

    @Test
    public void testConvertsSixtytoLX() { assertEquals("LX", test.converter(60)); }

    @Test
    public void testConvertsNinetytoXC() { assertEquals("XC", test.converter(90)); }

    @Test
    public void testConvertsOneHundredtoC() { assertEquals("C", test.converter(100)); }

    @Test
    public void testConvertsFourHundredtoCD() { assertEquals("CD", test.converter(400)); }

    @Test
    public void testConvertsFiveHundredtoD() { assertEquals("D", test.converter(500)); }
}
