public class MetodeVezba {
    public static void main(String[] args) {
        System.out.println("Ovo je prvi ispis.");
        prviIspis();
       // drugiIspis();
        treciIspis(); //Ovako nesto nam nece proslediti nista jer nismo u metodi treciispis bilo sta printovali
        System.out.println(treciIspis()); // Ovako cemo odstampati vracenu vrednost iz te prizvane metode
        System.out.println(cetvrtiIspis());
        System.out.println(cetvrtiIspis() * cetvrtiIspis()); //Primera radi mozemo ovako da racunamo sa vracenim podatkom

        prosledjivanje("Gojko");

    }
    public static void prviIspis() { // Zaglavlje funkcije
        System.out.println("Ovo je prvi ispis van main metode.");
        //telo funkcije
        //Telo funkcije je sve sto se nalazi izmedju viticastih zagrada
        //public za sada prihvati da mora
        //static znaci da metoda moze da se pozove u drugim metodama, odnosno da je vidljiva u drugim metodama
        //void znaci da ne dobijamo povratnu informaciju od metode; u ovoj se metoda izvrsava, ali umesto void moze
        //da stoji int ili String itd i tada dobijamo povratnu informaciju tog tipa kada prizovemo
    }

    public void drugiIspis() {
        System.out.println("Ovaj ispis je nevidljiv u drugim metodama, jer nema Static");
    }

    public static String treciIspis() { //Sada zato sto nije void nego naznacen tip podataka, trazi se return;
        String naziv;
        naziv = "Ovo je treci ispis.";
        return naziv;
    }

    public static int cetvrtiIspis () { //Takodje trazi za integer
        int broj;
        broj = 4;
        return broj; //Kada smo mu dali vrednost i rekli da njega vracamo, mi smo (iz ugla main metode) cetvrtom ispisu
        //dali vrednost 4. Tako da kada napisemo da nam isprinta cetvrtiIspis(); on ce nam dati broj 4 kao int podatak
        //sa kojim mozemo da radimo druge matematicke operacije

    }

    public static void prosledjivanje (String ime) { // U '()' zagradu se unosi tip podatka koji treba da prosledimo
        System.out.println("Moje ime je: ");
        System.out.println(ime);
    }




}
