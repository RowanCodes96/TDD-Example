public class RomanNumerals {

    public static String convertToRoman(int arabicNumber) {

        String result = "";
        int remaining = arabicNumber;

        if (remaining >= 5) {
            result += "V";
            remaining = remaining - 5;
        }

        while (remaining > 0) {
            result = result + "I";                      // += is the same as {result = result + "I"}
            remaining--;
        }

        return result;
    }
}

        /*
        if (arabicNumber == 3 ) {
            return "III";
        }
        else if (arabicNumber == 2 ) {
            return "II";
        }
        else {
            return "I";
        }

        return result; */
