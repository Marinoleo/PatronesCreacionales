package SOLID;

abstract class Card {
    int fuerza = 0;
    int defensa = 0;

    void atacar() {

    }

    abstract void defender();
    Card(int f,int d) {
        fuerza = f;
        defensa = d;
    }
}
