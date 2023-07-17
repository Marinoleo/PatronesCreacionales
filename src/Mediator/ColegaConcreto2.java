package Mediator;

public class ColegaConcreto2 extends Colega{

    @Override
    void envia() {
        System.out.println("Estoy enviando un mensaje, soy ColegaConcreto2");
        mediator.reenvia(this);
    }

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }
}
