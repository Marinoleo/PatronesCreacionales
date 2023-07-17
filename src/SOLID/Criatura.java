package SOLID;

public class Criatura extends Card implements CardVoladora{
    @Override
    public void vuela() {
        System.out.println("Vuela pero no puede atacar");
    }
    public Criatura(int f, int d) {
        super(d, f);
    }
    @Override
    void atacar() {
        System.out.println("Ataque con fuerza: " + fuerza);
    }
    @Override
    void defender() {
        System.out.println("Defenza con valor: " + defensa);
    }
}
