import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void converts_1_to_I() {
        String result = RomanNumerals.convertToRoman(1);

        assertEquals("I", result);             //import static unit when lightbulb appears

    }

    @Test
    public void converts_2_to_II() {
        String result = RomanNumerals.convertToRoman(2);

        assertEquals("II", result);
    }

    @Test
    public void converts_3_to_III() {
        String result = RomanNumerals.convertToRoman(3);

        assertEquals("III", result);
    }

    @Test
    public void converts_5_to_V() {
        String result = RomanNumerals.convertToRoman(5);

        assertEquals("V", result);
    }
    @Test
    public void converts_6_to_VI() {
        String result = RomanNumerals.convertToRoman(6);

        assertEquals("VI", result);
    }
}