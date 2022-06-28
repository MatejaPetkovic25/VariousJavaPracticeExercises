package MatejaDomaci1605Zadatak2;

public class GlavnaKlasa {
    //Zadatak 2:
    //Napraviti klasu Proizvod koja sadrzi:
    //- naziv
    //- cenu
    //- rokTrajanja
    //Napisati metodu koja stampa proizvod, i konstruktor kojem se prosledjuju ova 3 atributa
    //U main metodi napraviti 3 proizvoda i ispisati ih
    public static void main(String[] args) {

        Proizvod p1 = new Proizvod("Jogurt", 115, "30.6.2022.");
        Proizvod p2 = new Proizvod("Tuna pasteta", 150.99, "12.8.2025.");
        Proizvod p3 = new Proizvod("Papirne maramice", 20, "Neogranicen");
        p1.stampanje();
        p2.stampanje();
        p3.stampanje();
    }
}
