package Opgave1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instatierer et scannerobjekt, som han senere vil bruge til at læse værdier ind med
        Scanner input = new Scanner(System.in);

        // Genererer et tilfældigt tal mellem 0..9-10 stykker
        int tal = (int)(Math.random()*10);

        // Gæt er -1 så den hopper ind i lykken
        int gaet = -1;

        // Løkke, der kører så længe, indtil nummeret er gættet
        while (gaet != tal) {
            gaet = input.nextInt(); // Tal indlæses med scanner
            if (gaet < tal) {
                System.out.println("for lavt");
            } else if (gaet > tal){
                System.out.println("for højt");
            }
        }

        // Hvis tal er fundet, udskrives følgende
        System.out.println("Computerens tal = " + tal + " derfor gættede du rigtigt");
        
    }
}
