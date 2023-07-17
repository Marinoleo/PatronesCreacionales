package Observer;

public class ReceptorA implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en A");
    }
}
