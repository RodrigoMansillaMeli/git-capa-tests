package meli.cafeteria;

import java.util.LinkedList;

public class TazaCafe {

    int costo;

    LinkedList<Ingredientes> ingredientes = new LinkedList<Ingredientes>();

    public boolean agregarIngrediente(Ingredientes ingrediente) {
        if(Stock.comprobarStock(ingrediente.cantidad) >= 0) {
            ingredientes.add(ingrediente);
            calcularCosto(ingrediente);
            return true;
        }
        return false;
    }

    public int calcularCosto(Ingredientes ingrediente) {
        this.costo += ingrediente.cantidad / 100;
        return costo;
    }
}
