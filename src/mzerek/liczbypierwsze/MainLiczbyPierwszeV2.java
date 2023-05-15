package mzerek.liczbypierwsze;

public class MainLiczbyPierwszeV2 {

    public static void main(String[] str) {
        int i;
        int[] array = {3, 5, 9, 1, 2};

        for (i = 0; i < 5; ++i) {
            System.out.print(array[i] + " : " + isPrime(array[i]) + ", ");
        }
    }

    public static boolean isPrime(int n) {
        int i;
        if (n < 2) {
            return false;
        }

        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
