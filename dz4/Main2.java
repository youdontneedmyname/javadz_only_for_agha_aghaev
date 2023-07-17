package dz4;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();

        int max = sc.nextInt();

        int randomNumber = getRandomNumber(min, max);

        System.out.println("sluchaynoye shislo: " + randomNumber);
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}