package Observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        ReceptorA a = new ReceptorA();
        ReceptorB b = new ReceptorB();
        ReceptorC c = new ReceptorC();

        emisor.meteReceptor(a);
        emisor.meteReceptor(b);
        emisor.meteReceptor(c);

        emisor.emite();
    }

}
