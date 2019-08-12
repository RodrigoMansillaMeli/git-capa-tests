package meli.cafeteria;

import java.util.LinkedList;

public class Ingredientes {
    Tipo tipo;
    int cantidad;

    public Ingredientes(String tipo, int cantidad) {
        this.tipo = Enum.valueOf(Tipo.class, tipo);
        this.cantidad = cantidad;
    }
}
