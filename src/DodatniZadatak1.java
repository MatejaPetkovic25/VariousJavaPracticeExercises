import java.util.Scanner;

public class DodatniZadatak1 {
    public static void main(String[] args) {
//1. Program koji implementira igru pogadjanja broja. Program "zamisli" broj izmedju 1 i 100
//pomocu generatora slucajnih brojeva, a korisnik pogadja broj u vise pokusaja. Nakon
//svakog pokusaja korisnik dobija informaciju da li je pogodio broj, ili da u sledecem
//pokusaju treba da navede veci ili manji broj.
//Hint: Treba koristiti Math.random()
        Scanner sc = new Scanner(System.in);
        System.out.println("Program pogadjanja brojeva!");

        int range = 100;
        int rand = (int)(Math.random() * range) + 1;      // Nejasno
        int a;
        System.out.print("Unesi neki broj od 1 do 100:");
        do{
            a = sc.nextInt();
            if(a < rand) {
                System.out.print("Unesi veci broj: ");
            } else if (a > rand) {
                System.out.print("Unesi manji broj: ");
            }
        } while (a != rand);

        System.out.println("Pogodili ste broj!");
        System.out.println("Kraj programa.");


    }
}
