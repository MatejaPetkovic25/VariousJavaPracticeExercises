import java.util.Scanner;

public class MatejaDomaci2804Zad2 {
    public static void main(String[] args) {
    //2. Napraviti program koji služi za prikupljanje proudžbine od korisnika, stavke porudžbine
    //smestiti u niz stringova a cenu u niz decimalnih brojeva. Potom odrediti najjefitniji i
    //najskuplji deo porudžbine. (Ispisati naziv stavke kao i cenu)

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj vasih artikala: ");
        int duzinaNiza = sc.nextInt();

        String[] stavkePorudzbine = new String[duzinaNiza];
        double[] cene = new double[duzinaNiza];
        double najjeftinije = Double.MAX_VALUE;
        double najskuplje = Double.MIN_VALUE;
        int oznakaNajskuplje = 0;
        int oznakaNajjeftinije = 0;

        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Poruci ovde(umesto razmaka koristi '_'): ");
            stavkePorudzbine[i] = sc.next();

            System.out.print("Unesi cenu proizvoda: ");
            cene[i] = sc.nextDouble();

            if (cene[i] < najjeftinije) {
                najjeftinije = cene [i];
                oznakaNajjeftinije = i;
            }
            if (cene[i] > najskuplje) {
                najskuplje = cene[i];
                oznakaNajskuplje = i;
            }

        }

        System.out.println("Vasa najskuplja porudzbina je " + stavkePorudzbine[oznakaNajskuplje] + " i kosta " + cene[oznakaNajskuplje] );
        System.out.println("Vasa najjeftinija porudzbina je " + stavkePorudzbine[oznakaNajjeftinije] + " i kosta " + cene[oznakaNajjeftinije] );
    }
}
