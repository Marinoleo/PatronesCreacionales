package Singletone;

public class Singletone {
    private static Singletone sing;
    private Singletone () {};
    int parametro;
    public static Singletone getMe() {
        if (sing == null) {
            sing = new Singletone();
        }
        return sing;
    }

    public int getParametro() {
        return parametro;
    }

    public void setParametro(int parametro) {
        this.parametro = parametro;
    }

    public static void run(){
        System.out.println("start Your engines");
    }
}