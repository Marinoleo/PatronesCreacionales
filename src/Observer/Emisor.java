package Observer;

import java.util.ArrayList;

public class Emisor {

    private ArrayList<Receptor> receptor = new ArrayList<>();

    public void meteReceptor (Receptor rec){
        receptor.add(rec);
    }
    public void emite(){
        for (Receptor i : receptor){
            i.recibe();
        }
    }

}
