package MatejaDomaci2605;

public class PitanjeSaPonudjenimOdgovorom extends Pitanje{
    //Klasa PitanjeSaPonudjenimOdgovorima nasledjuje abstraktnu klasu Pitanje i sadrzi atribute
    //● String odgovorA
    //● String odgovorB
    //● String odgovorC
    //● String odgovorD
    //● String tacanOdgovor // identican sa jednim od prijasnih odgovora

    String odgovorA;
    String odgovorB;
    String odgovorC;
    String odgovorD;
    String tacanOdgovor;

    public PitanjeSaPonudjenimOdgovorom(String tekstPitanja, int brojMaxPoena, int osvojenBrojPoena, boolean pitanjePregledano, String odgovorA, String odgovorB, String odgovorC, String odgovorD, String tacanOdgovor) {
        super(tekstPitanja, brojMaxPoena, osvojenBrojPoena, pitanjePregledano);
        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
        this.tacanOdgovor = tacanOdgovor;
    }
    public void stampanje() {
        System.out.println(getTekstPitanja());
        System.out.println("a: " + odgovorA);
        System.out.println("b: " + odgovorB);
        System.out.println("c: " + odgovorC);
        System.out.println("d: " + odgovorD);
        System.out.print("Odgovor: ");
        System.out.println(" ");
    }
}
