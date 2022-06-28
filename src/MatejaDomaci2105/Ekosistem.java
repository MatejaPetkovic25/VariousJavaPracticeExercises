package MatejaDomaci2105;

public class Ekosistem {
    //Napraviti klasu Ekosistem (main klasu) i napraviti instance svake klase i pozvati sve metode
    public static void main(String[] args) {

        Macka m = new Macka("Macka", false, false, "Feliks", "Mis", 100, 12);
        Macka m1 = new Macka("Macka", false, false, "Garfild", "Lazanja", 90, 100);
        Vrabac v = new Vrabac("Vrabac", true, false, "Dzivdzanko", "Hleb", 30, 4);
        Lav l = new Lav("Lav", true, false, "Mufasa", "Antilope", 300, 10);
        NaduvanaRiba bloufish = new NaduvanaRiba("Naduvana riba", true, true, "Redzinald", "Plankton", 40, 2);
        Biljka b1 = new Biljka("Biljka", false, true, "Mrazovac", "Colchicum automnale", true);
        Biljka b2 = new Biljka("Biljka", false, false, "Majcina dusica", "Thymus", true);
        Biljka b3 = new Biljka("Biljka", true, true, "Neka biljka", "Biljkum nekae", false);

        System.out.println("Zdravlje macke " + m.getIme() + " je " + m.getZdravlje());
        m.spavaj();
        m.svrljaj();
        m.proizvediZvuk();
        m.jedi(b2);
        m.jedi(bloufish);
        System.out.println("-------------");
        v.proizvediZvuk();
        v.jedi(b3);
        v.jedi(b3);
        System.out.println("-----------------");
        l.svrljaj();
        l.proizvediZvuk();
        l.spavaj();



    }
}
