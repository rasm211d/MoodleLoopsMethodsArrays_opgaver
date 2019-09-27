package Opgave1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et tal som pc'en gætter: ");
        int mitTal = input.nextInt();
        System.out.println("Du gættede: " + mitTal);
        int pcTal = -1;
        while (mitTal != pcTal) {
            pcTal = (int)(Math.random()*10);
            System.out.println("pc'en gætter: " + pcTal);
        }
        System.out.println("pc'en fik dig på tallet " + mitTal);
    }
}
