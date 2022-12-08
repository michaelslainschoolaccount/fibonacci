import java.math.BigInteger;

public class Fibonacci {
    BigInteger[] output = new BigInteger[0];

    public BigInteger getValue(int n) {
        if (n >= output.length) {
            System.out.println("You have not generated enough numbers to get a Fibonacci value this high");
            return BigInteger.valueOf(-1);
        }

        if (n < output.length) {
            System.out.println("Not a valid index in Fibonacci");
            return BigInteger.valueOf(-1);
        }

        return output[n];
    }

    public void generate(int n) {
        output = new BigInteger[n];

        for (int i = 0; i < n; i++) {
            BigInteger tempOutput;

            switch (i) {
                case 0:
                case 1:
                    tempOutput = BigInteger.valueOf(i);
                    break;
                default:
                    tempOutput = output[i - 1].add(output[i - 2]);
            }

            output[i] = tempOutput;
        }
    }
}