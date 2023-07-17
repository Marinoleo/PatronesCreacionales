package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{

    private String ficheroUsuarios = "ususarios.txt";
    private PrintStream fichero;
    public UsuariosFichero(){
        try{
        fichero = new PrintStream(ficheroUsuarios);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void crear(String name) {
        fichero.println(name);
    }
    @Override
    public ArrayList<String> listar() {
        ArrayList <String> listaUsuarios =new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(ficheroUsuarios));

            while (scanner.hasNext()){
                listaUsuarios.add(scanner.next());
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaUsuarios;
    }




}
