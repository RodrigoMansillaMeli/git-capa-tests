package meli.motores;

public class Motor {
    int potencia;
    int temperatura;

    public void aumentarPotencia(int potencia) {
        if(this.potencia + potencia > 10) {
            this.potencia = 10;
            this.temperatura = this.potencia * 10;
        } else {
            this.potencia += potencia;
            this.temperatura = this.potencia * 10;
        }
    }
}
