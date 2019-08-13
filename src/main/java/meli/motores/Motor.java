package meli.motores;

public class Motor {
    int potencia2;
    int temperatura;

    public void aumentarPotencia(int potencia) {
        if(this.potencia2 + potencia > 10) {
            this.potencia2 = 10;
            this.temperatura = this.potencia2 * 10;
        } else {
            this.potencia2 += potencia;
            this.temperatura = this.potencia2 * 10;
        }
    }
}
