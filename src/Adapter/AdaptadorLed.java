package Adapter;

public class AdaptadorLed implements Lampara{

    Led led = new Led();

    @Override
    public void prender(){
        led.turn_on();
    }

}
