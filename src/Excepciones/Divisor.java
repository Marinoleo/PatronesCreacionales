package Excepciones;

import org.w3c.dom.ls.LSOutput;

public class Divisor{
    int numerador;
    int denominador;
    public Divisor(int num, int den) {
        numerador = num;
        denominador = den;
    }

    public float dividir() {
        return (numerador/denominador);
    }

}
