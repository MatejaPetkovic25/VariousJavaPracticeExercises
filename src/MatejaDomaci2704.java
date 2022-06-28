import java.util.Scanner;

public class MatejaDomaci2704 {
    public static void main(String[] args) {

        //Program koji ucitava prirodne brojeve sve dok ne bude unesen broj 0, i odredjuje koliko je
        //ucitanih brojeva parno, a koliko neparno.
        Scanner sc = new Scanner(System.in);

        int sumaPar = 0;
        int sumaNepar = 0;
        for(int i = 0; i >= 0; i++) {
            System.out.print("Unesi prirodan broj: ");
            int broj = sc.nextInt();

            if (broj % 2 == 0 && broj > 0) {
                sumaPar = sumaPar + 1;
            } else if (broj % 2 != 0 && broj > 0) {
                sumaNepar = sumaNepar + 1;
            } else if (broj == 0) {
                break;
            }

        }
        System.out.println("Ukupan broj parnih brojeva je " + sumaPar);
        System.out.println("Ukupan broj neparnih brojeva je " + sumaNepar);

    }
}
