package MatejaDomaci1605Zadatak2;

public class Proizvod {

    public String naziv;
    public double cena;
    public String rokTrajanja;

    public Proizvod (String naziv, double cena, String rokTrajanja) {
        this.naziv = naziv;
        this.cena = cena;
        this.rokTrajanja = rokTrajanja;
    }

    public void stampanje () {
        System.out.println("Proizvod: " + naziv + " kosta " + cena + "RSD, a rok trajanja mu je do " + rokTrajanja);
    }

}

