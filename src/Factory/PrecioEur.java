package Factory;

public class PrecioEur implements Precio{
    public double getPrecio() {
        System.out.println("Precio en Euros =");
        return 1.3;
    }
}
