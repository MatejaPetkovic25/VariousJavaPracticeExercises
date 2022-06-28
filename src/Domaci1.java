import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite Vase ime: ");
        String ime = sc.next();
        System.out.print("Unesite Vase prezime: ");
        String prezime = sc.next();
        System.out.print("Unesite broj Vasih godina: ");
        int brojGodina = sc.nextInt();

        System.out.println("Vi ste " + ime + " " + prezime + " i imate " + brojGodina + " godina!");


    }
}
