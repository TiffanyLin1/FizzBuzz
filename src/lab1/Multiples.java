package lab1;

public class Multiples {

    public static void main(String[] args) {

    int c = 0;
    for (int i = 1; i <= 1000; i++) {
        boolean DivisibleBy3 = i % 3 == 0;
        boolean DivisibleBy5 = i % 5 == 0;

        if (DivisibleBy3) {
            c += 1;}
        else if (DivisibleBy5) {
            c += 1;}
        }
    System.out.println(c);
    }
    }