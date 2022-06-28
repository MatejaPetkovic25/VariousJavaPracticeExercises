import java.util.Scanner;

public class DodatniZadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ispisuje zbir cifara ucitanog celog broja.
        //Nedovrsen zadatak
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();
        int poslednjaCifra = broj % 10;
        int zbir = 0;
        System.out.print("Koliko cifara ima vas broj?");
        int cifre = sc.nextInt();


        zbir = zbir + poslednjaCifra;
        System.out.println("Zbir cifara je " + zbir);
    }
}
