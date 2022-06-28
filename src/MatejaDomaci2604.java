import java.util.Scanner;

public class MatejaDomaci2604 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika unosi godinu, zatim proveriti da li je godina prestupna.
        Scanner sc = new Scanner(System.in);

        System.out.print("Molimo vas unesite godinu: ");
        int godina = sc.nextInt();

        if (godina % 4 == 0 && godina % 100 != 0 || (godina % 400 == 0)) {

            System.out.println("Godina koju ste uneli je prestupna godina!");
        } else {
            System.out.println("Godina koju ste uneli nije prestupna godina!");
        }

    }
}
