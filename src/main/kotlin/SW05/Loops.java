package SW05;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Number " + i);
        }

        Random dice = new Random();
        int diceNumber = dice.nextInt(6) + 1;

        while (diceNumber != 6) {
            System.out.println("Your dice number is " + diceNumber);
            diceNumber = dice.nextInt(6) + 1;
        }
        System.out.println("Congrats, you've rolled a six!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table do you want to see?");

        int option = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(option * i);
        }
    }
}
