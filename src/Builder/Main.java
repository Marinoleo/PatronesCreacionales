package Builder;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Audi");
        vehiculo.setMotor("Diesel");
        vehiculo.setTipo("Sedán");
        vehiculo.setPuertas(5);

        Vehiculo carro = new CocheBuilder("Renault").setPuertas(3).setTipo("Hachback").build();
        System.out.println(carro.getMarca());
        System.out.println(carro.getPuertas());
        System.out.println(carro.getTipo());
    }
}
