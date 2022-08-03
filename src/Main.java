import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static int var1, var2;
    static char operation;
    static int result;
    public static void main(String[] args) {
        System.out.println("Введите два числа : ");
        String userInput = scan.nextLine();
        char[] oper_char = new char[10];
        for (int i = 0; i < userInput.length(); i++) {
            oper_char[i] = userInput.charAt(i);
            if (oper_char[i] == '+') {
                operation = '+';
            }
            if (oper_char[i] == '-') {
                operation = '-';
            }
            if (oper_char[i] == '*') {
                operation = '*';
            }
            if (oper_char[i] == '/') {
                operation = '/';
            }
        }
        String oper_charString = String.valueOf(oper_char);
        String[] signs = oper_charString.split("[+-/*]");
        String stb0 = signs[0];
        String stb1 = signs[1];
        String strings = stb1.trim();
        var1 = Enum.convertRomanToArab(stb0);
        var2 = Enum.convertRomanToArab(strings);
        if (signs.length > 2
        )
            throw new ArrayIndexOutOfBoundsException("Не более двух operandov!");
        else
            signs = Arrays.copyOf(signs, 2);
        try {
            stb0 = signs[0].trim();
        } catch (NullPointerException e) {
            throw new NullPointerException();
        }
        if (var1 < 0 && var2 < 0) {
            result = 0;
        } else {
            result = Enum.calc(var1, var2, operation);
            System.out.println("Результат RomanNum:");
            String resultRoman = Enum.convertNumToRoman(result);
            System.out.println(stb0 + " " + operation + " " + strings + " = " + resultRoman);
        }
        var1 = Enum.convertRomanToArab(stb0);
        if (var1 == -1) var1 = Integer.parseInt(stb0);
        var2 = Enum.convertRomanToArab(strings);
        if (var2 == -1) var2 = Integer.parseInt(strings);
        result = Enum.calc(var2, var2, operation);
        System.out.println("Результат ArabNum:");
        System.out.println(var1 + " " + operation + " " + var2 + " = " + result);
    }
}