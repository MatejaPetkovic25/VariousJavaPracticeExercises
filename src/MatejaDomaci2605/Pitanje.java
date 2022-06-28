package MatejaDomaci2605;

public abstract class Pitanje {
    //Napisati apstraktnu klasu Pitanje koja ima atribute:
    //● String tekstPitanja
    //● int brojMaxPoena (>0)
    //● Int osvojenBrojPoena (>=0)
    //● boolean pitanjePregledano
    //Geteri i seteri za ove attribute
    private String tekstPitanja;
    private int brojMaxPoena;
    int osvojenBrojPoena;
    boolean pitanjePregledano;

    public Pitanje(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano) {
        this.tekstPitanja = tekstPitanja;
        this.brojMaxPoena = brojMaxPoena;
        this.osvojenBrojPoena = osvojenBrojPoena;
        this.pitanjePregledano = pitanjePregledano;
    }

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getBrojMaxPoena() {
        return brojMaxPoena;
    }

    public void setBrojMaxPoena(int brojMaxPoena) {
        this.brojMaxPoena = brojMaxPoena;
    }

    public int getOsvojenBrojPoena() {
        return osvojenBrojPoena;
    }

    public void setOsvojenBrojPoena(int osvojenBrojPoena) {
        this.osvojenBrojPoena = osvojenBrojPoena;
    }

    public boolean isPitanjePregledano() {
        return pitanjePregledano;
    }

    public void setPitanjePregledano(boolean pitanjePregledano) {
        this.pitanjePregledano = pitanjePregledano;
    }
    public abstract void stampanje(); //Napomena
    //Iako u zadatku nije naznaceno napravio sam abstract metodu za stampanje da bih lakse odstampao pitanja u konzoli

}
