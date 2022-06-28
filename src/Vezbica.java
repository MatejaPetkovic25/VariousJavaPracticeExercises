import java.util.Scanner;

public class Vezbica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int suma = 0;
        int prestup = 0;
        int brojac = 0;
        System.out.println("Program sabira brojeve. Kada predje 100, program se prekida i kaze za koliko ste presli.");
        do {
            brojac++;
            System.out.print("Ako uneses nulu program se gasi. Unesi broj: ");
            a = sc.nextInt();
            suma = suma + a;
            if (suma > 100) {
                prestup = suma - 100;
                break;
            }
        } while (a != 0);

        System.out.println("Presli ste 100 za : " + prestup + ", a uneli ste " + brojac + " brojeva.");

    }
}
