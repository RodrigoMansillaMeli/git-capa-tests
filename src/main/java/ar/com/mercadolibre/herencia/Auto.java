package ar.com.mercadolibre.herencia;

public class Auto {
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuertas;
    boolean encendido=false;
    String modelo;

    public Auto () {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
    }

    public double obtenerPeso() {
        return this.peso;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("El auto esta encendido");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("El auto esta apagado");
    }

    public void estado() {
        if(this.encendido == true)
            System.out.println("El auto está encendido");
        else
            System.out.println("El auto esta apagado");
    }
}
