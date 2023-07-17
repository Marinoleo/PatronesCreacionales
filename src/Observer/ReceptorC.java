package Observer;

public class ReceptorC implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en C");
    }
}
