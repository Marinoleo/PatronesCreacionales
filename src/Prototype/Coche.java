package Prototype;

public class Coche {
    public String marca;
    public String modelo;
    public int precio;

    public Coche (){}
    public Coche (String marc,String model,int price){
        marca = marc;
        modelo = model;
        precio = price;
    }
    public Coche clonar(){
        Coche coche = new Coche();
        coche.marca = marca;
        coche.modelo = modelo;
        coche.precio = precio;

        return coche;


    }
}
