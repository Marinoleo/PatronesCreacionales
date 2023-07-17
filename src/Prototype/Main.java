package Prototype;

public class Main {
    public static void main(String[] args) {
        Coche particular = new Coche("Toyota","Etios",9000);

        Coche utilitario = particular.clonar();
        System.out.println(particular.modelo);
        System.out.println(particular.marca);
        System.out.println(particular.precio);
        System.out.println(utilitario.modelo);
        System.out.println(utilitario.marca);
        System.out.println(utilitario.precio);

    }
}
