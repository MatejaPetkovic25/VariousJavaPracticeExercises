import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] imePrezime = new String[5];
        for (int i = 0; i < imePrezime.length; i++){
            System.out.print("Unesi ime: ");
            imePrezime[i] = sc.nextLine();
        }



    }
}
