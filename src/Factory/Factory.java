package Factory;

public class Factory {

    Precio precio;
    private Factory (){}; //Evitamos que se instancie esta clase vacía
    public Factory (String pais){
    if (pais.equalsIgnoreCase("españa")){
        precio = new PrecioEur();
        System.out.println("España");
    } else if (pais.equalsIgnoreCase("argentina")){
        precio = new PrecioArg();
        System.out.println("Argentina");
    }else {
        precio = new PrecioUsd();
        System.out.println("Chile");

    }
}


}
