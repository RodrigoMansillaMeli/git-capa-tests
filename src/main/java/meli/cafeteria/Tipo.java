package meli.cafeteria;

public enum Tipo {
    CAFE("CF"), LECHE("LE"), AZUCAR("AZ"), CANELA("CN");

    private String abreviatura;

    private Tipo(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String dameTipoIngrediente() {
        return abreviatura;
    }
}
