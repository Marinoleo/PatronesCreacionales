package Mediator;

public class ColegaConcreto1 extends Colega{

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto1,envío un mensaje");
        mediator.reenvia(this);
    }

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto1");
    }


}
