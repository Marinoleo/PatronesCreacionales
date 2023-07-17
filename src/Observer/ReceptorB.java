package Observer;

public class ReceptorB implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en B");
    }
}
