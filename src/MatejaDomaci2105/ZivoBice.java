package MatejaDomaci2105;

public class ZivoBice {
    //Napravit klasu ZivoBice, Zivotinja nasledjuje ZivoBice i napraviti novu klasu koja Biljka
    //nasledjuje ZivoBice.
    //Klasa ZivoBice ima attribute:
    //● String vrsta; //vrsta odnosno u kojoj porodici pripada ZivoBice
    //● boolean ugrozeno; //Da li je ZivoBice ugrozena
    //● boolean otrovno; //Da li je zivo bice bezbedno za konzumiranje od strane zivotinja
        private String vrsta;
        private boolean ugrozeno;
        private boolean otrovno;


    public ZivoBice(String vrsta, boolean ugrozeno, boolean otrovno) {
        this.vrsta = vrsta;
        this.ugrozeno = ugrozeno;
        this.otrovno = otrovno;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public boolean isUgrozeno() {
        return ugrozeno;
    }

    public void setUgrozeno(boolean ugrozeno) {
        this.ugrozeno = ugrozeno;
    }

    public boolean isOtrovno() {
        return otrovno;
    }

    public void setOtrovno(boolean otrovno) {
        this.otrovno = otrovno;
    }
}
