package MatejaDomaci2105;

public abstract class Zivotinja extends ZivoBice{
    //Napraviti abstraktu klasu Zivotinja, klasa treba da ima metode:
    //● spavaj();
    //● jedi(ZivoBice zivoBiceZaJesti);
    //● švraljaj();
    //● proizvediZvuk();
    //Naslediti abstratktnu klasu sa prozvoljnim klasama (primer tipa):
    //● Lav
    //● Detlic
    //● Macka
    //● Patka
    //● Som

    private String ime;
    private String omiljenoJelo;
    private int zdravlje;
    private double prosecniZivotniVek;

    public Zivotinja(String vrsta, boolean ugrozeno, boolean otrovno, String ime, String omiljenoJelo, int zdravlje, double prosecniZivotniVek) {
        super(vrsta, ugrozeno, otrovno);
        this.ime = ime;
        this.omiljenoJelo = omiljenoJelo;
        this.zdravlje = zdravlje;
        this.prosecniZivotniVek = prosecniZivotniVek;
    }

    public abstract void spavaj();

    public abstract void jedi(ZivoBice zivoBiceZaJesti);

    public abstract void svrljaj();

    public abstract void proizvediZvuk();

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOmiljenoJelo() {
        return omiljenoJelo;
    }

    public void setOmiljenoJelo(String omiljenoJelo) {
        this.omiljenoJelo = omiljenoJelo;
    }

    public int getZdravlje() {
        return zdravlje;
    }

    public void setZdravlje(int zdravlje) {
        this.zdravlje = zdravlje;
    }

    public double getProsecniZivotniVek() {
        return prosecniZivotniVek;
    }

    public void setProsecniZivotniVek(double prosecniZivotniVek) {
        this.prosecniZivotniVek = prosecniZivotniVek;
    }
}
