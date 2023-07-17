package State;

abstract public class Estado {
    public Telefono telefono;

    public Estado (Telefono tel){       //Constructor
        telefono=tel;
    }

    abstract public String desbloquear();
    abstract public String abrirCamara();
    abstract public String hacerFoto();



}
