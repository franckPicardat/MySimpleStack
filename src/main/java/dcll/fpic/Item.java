package dcll.fpic;

/**
 * Created by 21502887 on 10/02/2016.
 **/
public class Item {
    private Object valeur;

    Item(Object value){
        setValeur(value);
    }

    public Object getValeur() {
        return this.valeur;
    }

    public void setValeur(Object valeur) {
        this.valeur = valeur;
    }
}
