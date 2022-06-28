import java.util.Scanner;

public class Vezba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int[] niz = new int[10];
        for (int i = 0; i < niz.length ; i++) {
            System.out.print("Unesite " + i + ". broj u niz: ");
            niz[i] = sc.nextInt();

        }*/
        int[] nizA = {12, 13, 54, 32, 123, 65, 87, 10, 19};

        for(int i = 0; i < nizA.length; i++){
            if (nizA[i] %2 == 0) {
                System.out.println(nizA[i]);
            }
        }


    }
}
