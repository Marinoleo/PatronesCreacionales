package Iterator;

public class Main {
    public static void main(String[] args) {

        IteratorCard nuevoMazo = new IteratorCard();

        nuevoMazo.crear(new Card("A"));
        nuevoMazo.crear(new Card("B"));
        nuevoMazo.crear(new Card("C"));
        nuevoMazo.crear(new Card("D"));
        nuevoMazo.crear(new Card("E"));

        while (nuevoMazo.haymas()){
            Card actual = nuevoMazo.siguiente();
            System.out.println(actual.getNombre());
        }






    }
}
