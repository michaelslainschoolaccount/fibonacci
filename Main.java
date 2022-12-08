import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.generate(100);

        for (int i = 0; i < 100; i++) {
            BigInteger value = f.getValue(i);
            System.out.println(value);
        }
    }
}
