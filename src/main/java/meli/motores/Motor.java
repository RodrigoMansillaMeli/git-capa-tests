package meli.motores;

public class Motor {
    int potencia3;
    int temperatura;

    public void aumentarPotencia(int potencia) {
        if(this.potencia3 + potencia > 10) {
            this.potencia3 = 10;
            this.temperatura = this.potencia3 * 10;
        } else {
            this.potencia3 += potencia;
            this.temperatura = this.potencia3 * 10;
        }
    }
}
