package Excepciones;

public class Division {
    int numerador;
    int denominador;
    public Division(int num, int den){
        numerador = num;
        denominador = den;
    }

    public float dividir() throws ExcepciónManual{
        if (denominador==1) {
            throw new ExcepciónManual("Error manual fue activado");






















        }
        if (denominador==0) {
            return (new Divisor(numerador,denominador).dividir());
        }
        return (numerador / denominador);
    }

}
