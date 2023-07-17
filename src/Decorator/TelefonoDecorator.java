package Decorator;

public class TelefonoDecorator implements Telefono{
    private Telefono telefono;   //Variable Telefono

    public TelefonoDecorator (Telefono fono){    //Constructor con Argunmento Telefono
        telefono = fono;
    }
    @Override
    public void crear() {
        telefono.crear();   //invoca el método de la instancia que se utilizó como argunmento para instanciar esta clase
    }
}
