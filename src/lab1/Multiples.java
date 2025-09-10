package lab1;

public class Multiples {

    public static void main(String[] args) {

        int c = multiples(1000, 3, 5);
        System.out.println(c);
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleByA = i  % a == 0;
            boolean divisibleByB = i % b == 0;

            if (divisibleByA || divisibleByB) {
                counter++;
            }
        }
        return counter;
    }
}