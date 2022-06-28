import java.util.Scanner;

public class MatejaDomaci2804Zad1 {
    public static void main(String[] args) {
        //1. Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj.

        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // Pronasao sam resenje na Google-u
        System.out.print("Unesite koliko brojeva zelite u vasem nizu: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Molimo vas da broj bude prirodan.");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
                System.out.print("Unesite " + i + ". broj u konzolu: ");
                int x = sc.nextInt();
                if (x < min) {
                    min = x;

                }

            }
        System.out.println("Najnizi broj u ovom nizu jeste: " + min);


    }
}
