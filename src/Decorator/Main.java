package Decorator;

public class Main {
    public static void main(String[] args) {

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoInteligente( new TelefonoBasico()));
        System.out.println(ti.getClass());
        ti.crear();

    }

}
