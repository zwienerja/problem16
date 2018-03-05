import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(2);
        result = result.pow(1000);
        double sum = 0;
        String resultString = result.toString();

        for (int i = 0; i < resultString.length(); i++){
            Character currentDigit = resultString.charAt(i);
            String currentFactor = currentDigit.toString();
            int factor = Integer.parseInt(currentFactor);
            sum += factor;
        }

        System.out.println(sum);
    }
}
