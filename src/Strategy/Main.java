package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UsuariosMemoria usuarios = new UsuariosMemoria();
        crear(usuarios, "Marino");
        crear(usuarios, "Leonidas");
        crear(usuarios, "Coufis");

        for (String i : listar(usuarios)) System.out.println(i);
    }

    public static void crear(Usuarios user, String name) {
        user.crear(name);
    }

    public static ArrayList<String> listar(Usuarios user) {
        return user.listar();
    }

}

