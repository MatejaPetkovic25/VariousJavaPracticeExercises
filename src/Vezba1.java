import java.util.Scanner;

public class Vezba1 {
    public static void main(String[] args) {
        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj od 1 do 4 da odredis funkciju druga dva broja: ");
        int a = sc.nextInt();
        System.out.println("Unesi dva broja sa kojima zelis da vrsis matematicke operacije.");
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        switch (a) {
            case 1: double zbir = b + c;
                System.out.println("Zbir brojeva je: " + zbir);
                break;
            case 2: double oduzimanje = b -c;
                System.out.println("Oduzimanje brojeva daje broj: " + oduzimanje);
                break;
            case 3: double proizvod = b * c;
                System.out.println("Proizvod brojeva je: " + proizvod);
                break;
            case 4: double kolicnik = b / c;
                System.out.println("Kolicnik brojeva je: " + kolicnik);
                break;
            default:
                System.out.println("Niste upisali ispravan broj, dovidjenja!");
                break;
        }


    }
}
