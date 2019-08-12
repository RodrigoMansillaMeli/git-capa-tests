package meli.motores;

public class MotorEspecial extends Motor{
    public void aplicarRefrigerante() {
        if(this.temperatura*0.8 < 0) {
            this.temperatura = 0;
        } else {
            this.temperatura *= 0.8;
        }
    }
}
