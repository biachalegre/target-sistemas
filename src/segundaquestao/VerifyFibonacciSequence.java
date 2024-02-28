package segundaquestao;

public class VerifyFibonacciSequence {

    public boolean isFibonacciNum(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; a <= n; i++) {
            if (a == n) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }

    public void result(int number) {
        if(isFibonacciNum(number)){
            System.out.println(number + " está presente na Sequência de Fibonacci!");
        } else {
            System.out.println(number + " não está presente na Sequência de Fibonacci.");
        }
    }
}
