package Adapter;

public class Main {
    public static void main(String[] args) {
        Incandecente a = new Incandecente();
        Led b = new Led();
        AdaptadorLed c = new AdaptadorLed();

        encender (a);
        //encender(b);
        encender(c);


    }

    private static void encender(Lampara A){
        A.prender();
    }
}
