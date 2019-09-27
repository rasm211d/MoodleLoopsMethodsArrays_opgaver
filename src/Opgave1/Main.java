package Opgave1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tal = (int)(Math.random()*10);
        int gaet = -1;
        while (gaet != tal) {
            gaet = input.nextInt();
            if (gaet < tal) {
                System.out.println("for lavt");
            } else if (gaet > tal){
                System.out.println("for højt");
            }
        }
        System.out.println("Computerens tal = " + tal + " derfor gættede du rigtigt");


    }
}
