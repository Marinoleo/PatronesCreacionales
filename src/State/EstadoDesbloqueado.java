package State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado (Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "Ya esta desbloqueado";
    }

    @Override
    public String abrirCamara() {
        telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
        return "Estado cambiado a Camara Abierta";
    }

    @Override
    public String hacerFoto() {
        return "la camara esta cerrada";
    }
}