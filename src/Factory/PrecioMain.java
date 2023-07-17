package Factory;

public class PrecioMain {
    public static void main(String[] args) {


        Factory valorEsp = new Factory("España");
        Factory valorArg = new Factory("Argentina");
        Factory valorChil = new Factory("Chile");

        System.out.println(valorEsp.precio.getPrecio());
        valorChil.precio.getPrecio();
        valorArg.precio.getPrecio();
        }
}


