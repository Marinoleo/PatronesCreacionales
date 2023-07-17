package Builder;

public class CocheBuilder {

    Vehiculo coche;

    CocheBuilder (String marca){
        coche = new Vehiculo();
        coche.setMarca(marca);
    }
                                                    //FLUIDEZ: un método devuelve su propia instancia
    public CocheBuilder setPuertas (int puertas){ //Metodo que retorna una instancia de esta clase
        coche.setPuertas(puertas);
        return this;                              //Devuelve la instancia desde donde fue invocado
    }
    public CocheBuilder setTipo (String tipo) {
        coche.setTipo(tipo);
        return this;
    }
    public Vehiculo build(){
        return this.coche;
    }


}
