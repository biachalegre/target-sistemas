package quintaquestao;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();

        // Get the input string
        String originalString = reverseString.getInputString();

        // Invert the string
        String invertedString = reverseString.reverseString(originalString);

        // Display the inverted string
        System.out.println("String Original: " + originalString);
        System.out.println("String Invertida: " + invertedString);
    }
}
