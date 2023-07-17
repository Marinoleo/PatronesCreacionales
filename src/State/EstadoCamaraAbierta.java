package State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta (Telefono telefono){
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "estado incorrecto";
    }

    @Override
    public String abrirCamara() {
        return "Estado incorrecto";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "Estado cambiado a Hacer Foto";
    }
}