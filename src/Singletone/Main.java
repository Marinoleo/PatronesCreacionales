package Singletone;

public class Main {
    public static void main(String[] args) {

    Singletone primero = Singletone.getMe();
    primero.setParametro(15);
    System.out.println(primero.getParametro());
    System.out.println(primero);

    Singletone segundo = Singletone.getMe();
    segundo.setParametro(10);
    System.out.println(segundo.getParametro());
    System.out.println(segundo);

    primero.run();
    segundo.run();
    Singletone.run();




    }

}
