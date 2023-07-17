package Strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuarios{

    private ArrayList <String> listaUsuarios = new ArrayList<>();
    @Override
    public void crear(String name){
        listaUsuarios.add(name);
    }
    @Override
    public ArrayList<String> listar(){
        return listaUsuarios;
    }
}
