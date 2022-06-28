import java.util.Arrays;
import java.util.Scanner;

public class MatejaDomaci1305 {
    public static void main(String[] args) {
      //Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
        //pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj koliko najdrazih pesama imate: ");
        int brojPesama = sc.nextInt();
        String [] pesme = new String[brojPesama];
        for(int i = 0; i < brojPesama; i++) {
            System.out.println("Unesite naziv pesme: ");
            if (i == 0) {
                sc.nextLine(); // Ako ovo ne ubacim program preskace prvi sc.nextLine
            }
            pesme[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(pesme));
    }
}
