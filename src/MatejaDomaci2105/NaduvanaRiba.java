package MatejaDomaci2105;

public class NaduvanaRiba extends Zivotinja{

    public NaduvanaRiba(String vrsta, boolean ugrozeno, boolean otrovno, String ime, String omiljenoJelo, int zdravlje, double prosecniZivotniVek) {
        super(vrsta, ugrozeno, otrovno, ime, omiljenoJelo, zdravlje, prosecniZivotniVek);
    }

    public void spavaj(){
        System.out.println("Naduvana riba spava 30 minuta zzzz");
    }

    public void jedi(ZivoBice zivoBiceZaJesti){
        if (zivoBiceZaJesti.isOtrovno()) {
            setZdravlje(getZdravlje()- 20);
            if (getZdravlje() <= 0) {
                System.out.println("Nazalost zivotinja je stradala od trovanja :(");
            } else {
                System.out.println("Oh ne, " + getIme() + " je pojeo/la nesto otrovno. Zdravlje joj je sada na " + getZdravlje());
            }
        } else {
            System.out.println("Zivotinja se fino najela.");
        }
    }

    public void svrljaj(){
        System.out.println("Naduvana riba pliva okolo.");
    }

    public void proizvediZvuk(){
        System.out.println("blob blob");
    }
}


