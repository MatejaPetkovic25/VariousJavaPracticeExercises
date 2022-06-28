package MatejaDomaci2605;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKlasa {
    //Main klasa sadrzi ArrrayList<Pitanje> pitanja popuniti listu sa 5 pitanja.
    //Koristeci petlju proci kroz ovih 5 pitanja i odgovoriti na jedno po jedno pitanje.
    //Drugom petljom proci kroz ovih 5 pitanja i dodeliti bodove za odgovore, istovremeno beleziti
    //sumu osvojenih poena.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pitanje> pitanja = new ArrayList<>();
        PitanjeSaPonudjenimOdgovorom p1 = new PitanjeSaPonudjenimOdgovorom("Koliko metara je dugacak olimpijski bazen?", 10, 0, false, "20", "50", "100", "40", "50");
        PitanjeSaPonudjenimOdgovorom p2 = new PitanjeSaPonudjenimOdgovorom("Kinofobija je strah od: ", 20, 0, false, "Komaraca", "Bioskopa", "Mraka", "Pasa", "Pasa");
        PitanjeSaPonudjenimOdgovorom p3 = new PitanjeSaPonudjenimOdgovorom("Ko je dao naziv Tihom okeanu?", 20, 0, false, "Magelan", "daGama", "Vespuci", "KarloV", "Magelan");
        KlasicnoPitanje p4 = new KlasicnoPitanje("Koja je zvanicna nacionalna zivotinja Skotske?", 25, 0, false, "Jednorog");
        KlasicnoPitanje p5 = new KlasicnoPitanje("Kako se zove glavni grad Kube?", 25, 0, false, "Havana");

        pitanja.add(p1);
        pitanja.add(p2);
        pitanja.add(p3);
        pitanja.add(p4);
        pitanja.add(p5);

        String odgovor;
        //Mozda je malo "prevarantsko" resenje sto sam dodelu bodova vrsio u prvoj petlji, ali nadam se da je zadatak zadovoljen
        //Da nisam to uradio, ideja bi mi bila da napravim pet Stringova, za svaki odgovor jedan String, pa bih u for petlju
        //ubacio if da proveri cemu je i jednak pa u zavisnosti od toga kom od tih stringova da dodeli vrednosti preko sc.next()
        //Dodelu bodova bih onda uradio na isti fazon kao sad u prvoj samo u drugoj petlji
        //Nisam jos uvek proverio da li bi tako funkcionisalo, ali isprobacu i pokusacu da se setim da li ima bolji nacin da se resi

        for (int i = 0; i < pitanja.size(); i++) {
            System.out.print(i + 1 + ". ");
            pitanja.get(i).stampanje();
            odgovor = sc.next();
            if (odgovor.equals(p1.tacanOdgovor) || odgovor.equals(p2.tacanOdgovor) || odgovor.equals(p3.tacanOdgovor) ||
                    odgovor.equals(p4.odgovorNaPitanje) || odgovor.equals(p5.odgovorNaPitanje)) {
                pitanja.get(i).setOsvojenBrojPoena(pitanja.get(i).getBrojMaxPoena());
            }
            System.out.println("------------------");
        }
        System.out.println("Test je zavrsen.");
        int ukupnoPoena = 0;
        for (Pitanje p : pitanja) {
            ukupnoPoena = ukupnoPoena + p.getOsvojenBrojPoena();
            p.setPitanjePregledano(true);
        }
        if (ukupnoPoena == 100) {
            System.out.println("Cestitamo! Osvojili ste maksimalan broj poena");
        } else if (ukupnoPoena == 0) {
            System.out.println("Bruka i sramota... niste osvojili nijedan poen");
        } else {
            System.out.println("Osvojili ste " + ukupnoPoena + " poena od 100.");
        }
    }


}
