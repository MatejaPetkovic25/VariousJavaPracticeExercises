public class MetodeVezba2 {
    public static void main(String[] args) {
        sabiranje(5, 6); // Ovako se radi kad se prizivaju podaci iz void metode

        System.out.println(sabiranje(10, 20)); // Ovako moze da se radi kad se zahteva tip podataka
    }

    public static int sabiranje (int x, int y) {
        int z = x + y;
        return z; // Kada imamo return , vrednost koju smo tu stavili postaje cela metoda, u ovom slucaju z postaje sabiranje
    }
}
