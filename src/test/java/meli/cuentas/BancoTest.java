package meli.cuentas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BancoTest {
    @Test
    public void crearBancoConCuatroCuentasBancariasYCuentoLaCantidadNegativas() {
        //Creo los clientes
        Cliente cliente1 = new Cliente("Pedro", 0);
        Cliente cliente2 = new Cliente("Jose", 0);
        Cliente cliente3 = new Cliente("Rodrigo", 0);
        Cliente cliente4 = new Cliente("Florencia", 0);
        //Creo el banco
        Banco banco = new Banco();
        //Creo 4 cuentas y las voy agregando al banco
        CuentaSueldo cuentaSueldo = new CuentaSueldo(cliente1);
        banco.cuentasBancarias.add(cuentaSueldo);
        CajaAhorroEspecial cajaAhorroEspecial = new CajaAhorroEspecial(cliente2);
        banco.cuentasBancarias.add(cajaAhorroEspecial);
        CajaAhorroEspecial cajaAhorroEspecial2 = new CajaAhorroEspecial(cliente3);
        banco.cuentasBancarias.add(cajaAhorroEspecial2);
        CuentaSueldo cuentaSueldo1 = new CuentaSueldo(cliente4);
        banco.cuentasBancarias.add(cuentaSueldo1);
        //Pongo 3 cuentas con saldo negativo y 1 con saldo positivo
        cuentaSueldo.depositar(10000.00);
        cajaAhorroEspecial.depositar(-2000.00);
        cajaAhorroEspecial2.depositar(-1500.00);
        cuentaSueldo1.depositar(-500.00);
        //Cuento la cantidad de cuentas con saldo negativo
        int cantidadSaldoNegativo = banco.cuentasConSaldoNegativo();
        Assertions.assertThat(cantidadSaldoNegativo).isEqualTo(3);
    }
}
