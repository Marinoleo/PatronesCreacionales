package Mediator;

abstract public class Colega {
    public Mediator mediator;

    public void setMediator (Mediator M){
        mediator = M;
    }

    abstract void recibe();
    abstract void envia();
}
