package meli.cuentas;

public class Cliente {
    String nombreTitular;
    int cantidadExtracciones;

    public Cliente(String nombreTitular, int cantidadExtracciones) {
        this.nombreTitular = nombreTitular;
        this.cantidadExtracciones = cantidadExtracciones;
    }

    public int obtenerCantidadExtracciones() {
        return cantidadExtracciones;
    }

}
