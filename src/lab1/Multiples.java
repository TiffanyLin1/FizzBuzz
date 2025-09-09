package lab1;

public class Multiples {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean DivisibleBy3 = i % 3 == 0;
            boolean DivisibleBy5 = i % 5 == 0;

            if (DivisibleBy3) {
                count++;}

            else if (DivisibleBy5) {
                count++;
                }
            }
        System.out.println(count);
        }
    }