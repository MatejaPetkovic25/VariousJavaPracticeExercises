package MatejaDomaci2605;

public class KlasicnoPitanje extends Pitanje{
    //Klasa KlasicnoPitanje nasledjuje abstraktnu klasu Pitanje i sadrzi attribute:
    //● String odgovorNaPitanje
    //Geteri i seteri za ovaj atribut
    String odgovorNaPitanje;

    public KlasicnoPitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano, String odgovorNaPitanje) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorNaPitanje = odgovorNaPitanje;
    }

    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }

    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }

    public void stampanje () {
        System.out.println(getTekstPitanja());
        System.out.print("Odgovor: ");
        System.out.println(" ");
    }
}
