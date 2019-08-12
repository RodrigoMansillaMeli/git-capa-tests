package ar.com.mercadolibre.herencia;

import org.junit.Test;

public class testAuto {
    @Test
    public void probarAutoBMW() {
        AutoBMW auto = new AutoBMW();
        auto.encender();
        auto.turbo();
        auto.apagar();
    }

    @Test
    public void probarAutoToyota() {
        AutoToyota auto = new AutoToyota();
        auto.encender();
        System.out.println(auto.modelo());
        auto.apagar();
    }
}
