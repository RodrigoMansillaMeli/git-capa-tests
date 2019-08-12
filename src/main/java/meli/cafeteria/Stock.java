package meli.cafeteria;

public class Stock {
    Tipo tipo;
    static int stock;

    public static void setStock(int stock) {
        Stock.stock = stock;
    }

    public static int getStock() {
        return stock;
    }

    public Stock(String tipo, int stock) {
        this.tipo = Enum.valueOf(Tipo.class, tipo);
        this.stock = stock;
    }

    public static int comprobarStock(int cantidad) {
        int resultadoStock = getStock() - cantidad;
        if(resultadoStock >= 0) {
            setStock(getStock()-cantidad);
        }
        return getStock();
    }
}
