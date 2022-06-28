import java.util.Scanner;

public class MatejaDomaci2704Ispravka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program koji ucitava prirodne brojeve sve dok ne bude unesen broj 0, i odredjuje koliko je
        //ucitanih brojeva parno, a koliko neparno.

        int sumaPar = 0;
        int sumaNepar = 0;
        int i = 1;
        while (i != 0) {

            System.out.print("Unesite prirodan broj: ");
            i = sc.nextInt();

            if(i % 2 == 0) {
                sumaPar = sumaPar + 1;
            } else if (i % 2 != 0) {
                sumaNepar = sumaNepar + 1;
            }

            }

        System.out.println("Program je zavrsen!");
        System.out.println("Broj ucitanih parnih brojeva je: " + (sumaPar - 1) );
        System.out.println("Broj ucitanih neparnih brojeva je: " + sumaNepar);
        }


    }
