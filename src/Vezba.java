import java.util.Scanner;

public class Vezba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojPoz = 0;
        int brojNeg = 0;
        System.out.print("Unesite koliko ukupno brojeva zelite u nizu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Unesite nulu da prekinete program.");
            System.out.print("Unesite bilo koji celi broj da nastavite: ");
            int a = sc.nextInt();

            if (a > 0) {
                System.out.println("Vas broj je pozitivan!");
                brojPoz = brojPoz + 1;
            } else if (a == 0) {
                System.out.println("Vas broj je nula!");
                break;
            } else {
                System.out.println("Vas broj je negativan!");
                brojNeg = brojNeg +1;
            }

        }
        System.out.println("Kraj programa!");
        System.out.println("Ukupno ste uneli " + brojPoz + " pozitivnih brojeva.");
        System.out.println("Ukupno ste uneli " + brojNeg + " negativnih brojeva.");
    }
}
