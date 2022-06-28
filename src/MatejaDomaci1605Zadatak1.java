import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MatejaDomaci1605Zadatak1 {
    public static void main(String[] args) {
//Zadatak 1:
//Napisati metodu koja vraca ArrayList-u vasih omiljenih zivotinja, unos vrsiti preko Scanner-a.
//Napraviti drugu metodu koja stampa sadrzaj liste. Napraviti metodu
//public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinije)
//koja dodaje datu zivotinju u listu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Lista omiljenih zivotinja.");

        ArrayList<String> listaZivotinja = new ArrayList<>();

        int i = 0;
        while (i >= 0) {
            System.out.print("Unesi zivotinju. Ako ne zelis vise da unosis zivotinje, napisi 'stop': ");
            String zivotinja = sc.next();
            if (zivotinja.equals("stop")) {
                break;
            } else{
                zivotinje(listaZivotinja, zivotinja);
            }
            i++;
        }

        stampanje(zivotinje(listaZivotinja, null));

    }
    public static ArrayList<String> zivotinje (ArrayList<String> listaZaDodavanje, String nazivZivotinje) {
        listaZaDodavanje.add(nazivZivotinje);

        return listaZaDodavanje;
    }

    public static void stampanje (ArrayList<String> lista) {
        lista.remove(lista.size() - 1);
        System.out.println("Ovo je tvoja lista omiljenih zivotinja: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + 1 + ". " + lista.get(i));
        }
    }
}

