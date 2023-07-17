package State;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado (Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "Teléfono desbloqueado con éxito";
    }

    @Override
    public String abrirCamara() {
        return ("Abrir camara: Teléfono Bloqueado");
    }

    @Override
    public String hacerFoto() {
        return ("Hacer foto: Teléfono Bloqueado");
    }
}
