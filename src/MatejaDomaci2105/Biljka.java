package MatejaDomaci2105;

public class Biljka extends ZivoBice{
    //Napraviti klasu Biljka koja nasledjuje klasu ZivoBice
    //Ona ima attribute:
    //● String narodniNaziv;
    //● String latinskiNaziv; // opciono - ne morate se muciti traziti latinske nazive
    //● boolean lekovita;
    String narodniNaziv;
    String latinskiNaziv;
    boolean lekovita;

    public Biljka(String vrsta, boolean ugrozeno, boolean otrovno, String narodniNaziv, String latinskiNaziv, boolean lekovita) {
        super(vrsta, ugrozeno, otrovno);
        this.narodniNaziv = narodniNaziv;
        this.latinskiNaziv = latinskiNaziv;
        this.lekovita = lekovita;
    }

    public String getNarodniNaziv() {
        return narodniNaziv;
    }

    public void setNarodniNaziv(String narodniNaziv) {
        this.narodniNaziv = narodniNaziv;
    }

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    public void setLatinskiNaziv(String latinskiNaziv) {
        this.latinskiNaziv = latinskiNaziv;
    }

    public boolean isLekovita() {
        return lekovita;
    }

    public void setLekovita(boolean lekovita) {
        this.lekovita = lekovita;
    }
}
