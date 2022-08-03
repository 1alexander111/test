import java.util.InputMismatchException;
class Enum {
    static String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }
    static int convertRomanToArab (String numRoman) {
        try {
            switch (numRoman) {
                case "I" -> {return 1;}
                case "II" -> {return 2;}
                case "III" -> {return 3;}
                case "IV" -> {return 4;}
                case "V" -> {return 5;}
                case "VI" -> {return 6;}
                case "VII" -> {return 7;}
                case "VIII" -> {return 8;}
                case "IX" -> {return 9;}
                case "X" -> {return 10;}
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException();
        } return -1;
    }
    public static int calc(int num1, int num2, char znak) {
        if (num1 <= 0 || num1 > 10 || num2 <= 0 || num2 > 10) throw new IllegalArgumentException("Число больше 10");
        int result = 0;
        switch (znak) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("Допускаются только целые числа");
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак!");
        }
        return result;
    }
}

