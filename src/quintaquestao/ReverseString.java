package quintaquestao;

import java.util.Scanner;

public class ReverseString {
    public String getInputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        return scanner.nextLine();
    }

    public String reverseString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }
}
