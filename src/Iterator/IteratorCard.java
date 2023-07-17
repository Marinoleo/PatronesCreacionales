package Iterator;

import java.util.ArrayList;

public class IteratorCard implements Deck{
    ArrayList <Card> mazo = new ArrayList();
    private int posicion = 0;
    public void crear(Card carta) {
    mazo.add(carta);
    }

    @Override
    public Card siguiente() {
        Card carta = mazo.get(posicion);
        posicion = posicion + 1;
        return carta;
    }

    @Override
    public boolean haymas() {
        return posicion < mazo.size();

    }

    @Override
    public void reset() {
    posicion = 0;
    }
}
