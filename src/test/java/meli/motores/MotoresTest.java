package meli.motores;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotoresTest {
    @Test
    public void agregarRefrigeranteAMotoresEspecialesYVerSiDisminuyeLaTemperatura() {
        //Creo el motor
        MotorEspecial motorEspecial = new MotorEspecial();
        //Aumento la potencia del motor
        motorEspecial.aumentarPotencia(3);
        //Aplico refrigerante y valido que haya bajado la temperatura
        int temperaturaAnterior = motorEspecial.temperatura;
        motorEspecial.aplicarRefrigerante();
        Assertions.assertThat(motorEspecial.temperatura).isLessThan(temperaturaAnterior);
    }

    @Test
    public void aumentoPotenciayAumentaTemperatura() {
        //Creo el motor
        MotorEspecial motorEspecial = new MotorEspecial();
        //Aumento la potencia del motor por primera vez
        motorEspecial.aumentarPotencia(3);
        //Aumento la potencia del motor por segunda vez y valido que haya subido la temperatura
        int temperaturaAnterior = motorEspecial.temperatura;
        motorEspecial.aumentarPotencia(3);
        Assertions.assertThat(motorEspecial.temperatura).isGreaterThan(temperaturaAnterior);
    }
}
