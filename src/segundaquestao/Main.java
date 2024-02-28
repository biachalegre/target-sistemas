package segundaquestao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Insira um número para verificar se ele está presente na Sequência de Fibonacci: ");
        int number = userInput.nextInt();

        VerifyFibonacciSequence verifier = new VerifyFibonacciSequence();
        verifier.result(number);

        userInput.close();
    }
}