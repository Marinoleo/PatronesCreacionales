package State;

public class Telefono {
    public Estado estado;
    public Telefono(){
        estado = new EstadoBloqueado(this);
    }

    public void cambiaEstado( Estado actual ){
        System.out.println("Estado actual = " + estado.getClass().getName());
        estado=actual;
        System.out.println("Estado actual = " + estado.getClass().getName());

    }

    public String getEstado(){
        return estado.getClass().getName();
    }


}
