package Excepciones;

public class Main {

    public static void main(String[] args) {
        Float resultado;
        Division ok = new Division(1, 1);
        Division nok = new Division(1, 0);

        try{
            resultado = ok.dividir();
            System.out.println(resultado);

            resultado = nok.dividir();
            System.out.println(resultado);
        } catch (ExcepciónManual e) {
            System.out.println("error manual " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error aritmético " + e.getMessage());
        } finally {
            System.out.println("se termina la función");
        }
    }


}

