import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercise 26 - Sum up numbers that user writes
        /* Scanner reader = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Insert a number");
            int number = Integer.parseInt(reader.nextLine());
            if (number == 0) {
                break;
            } else {
                sum = sum + number;
            }
            System.out.println("Sum now: " + sum);
        }

        System.out.println("Final sum: " + sum); */

        // Exercise 29 - Find even numbers between 2 and 100
        /* int number = 100;

        for(int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        } */

        // Exercise 32 - Sum up numbers until the number that user inputs
        /* Scanner reader = new Scanner(System.in);

        System.out.println("Until? ");
        int input = Integer.parseInt(reader.nextLine());

        int sum = 0;

        for(int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + input + " = " + sum); */

    }
}