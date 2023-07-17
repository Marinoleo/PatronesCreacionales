package Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear(){
    System.out.println("Soy un teléfono básico con las siguientes características: ");
    tengoGSM();
    tengoSMS();
}

    private void tengoGSM() {
        System.out.println("tengoGSM");
    }
    private void tengoSMS() {
        System.out.println("tengoSMS");
    }
}
