package Factory;

public class PrecioUsd implements Precio{

    public double getPrecio() {
        System.out.println("Precio en USD =");
        return 1.00;
    }

}
