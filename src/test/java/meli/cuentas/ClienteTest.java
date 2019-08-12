package meli.cuentas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ClienteTest {
    @Test
    public void crearClienteConCantidadDeExtraccionesEnCero(){
        Cliente cliente = new Cliente("Rodolfo",0);
        Assertions.assertThat(cliente.obtenerCantidadExtracciones()).isEqualTo(0);
    }

    @Test
    public void avisarAClienteGiroEnDescubierto() {
        //Creo el cliente
        Cliente cliente = new Cliente("Rodolfo",0);
        //Creo la cuenta Caja de ahorro especial
        CajaAhorroEspecial cajaAhorroEspecial = new CajaAhorroEspecial(cliente);
        //Deposito dinero en cuenta para probar
        cajaAhorroEspecial.depositar(10000.00);
        //Extraigo dinero de la cuenta en descubierto
        Assertions.assertThat(cajaAhorroEspecial.extraerEnDescubierto(5000.00)).isTrue();
    }

    @Test
    public void cobrarGastoExtraAClienteConMasDeCincoExtraccionesEnCuentaSueldo() {
        //Creo el cliente con seis extracciones
        Cliente cliente = new Cliente("Rodolfo",6);
        //Creo la cuenta sueldo
        CuentaSueldo cuentaSueldo = new CuentaSueldo(cliente);
        //Deposito dinero en cuenta para probar
        cuentaSueldo.depositar(10000.00);
        //Extraigo dinero de la cuenta en descubierto
        cuentaSueldo.extraer(5000.00);
        //Valido que se hayan cobrado $15 por gastos extras
        Assertions.assertThat(cuentaSueldo.saldo).isEqualTo(4985.00);
    }

    @Test
    public void crearCajaDeAhorroMulticlienteConCuatroTitulares() {
        //Creo 4 clientes con sus extracciones
        Cliente cliente1 = new Cliente("Rodolfo",0);
        Cliente cliente2 = new Cliente("Carlos",0);
        Cliente cliente3 = new Cliente("Miguel",0);
        Cliente cliente4 = new Cliente("Oscar",0);
        //Creo la caja de ahorro multicliente
        CajaAhorroMulticliente cajaAhorroMulticliente = new CajaAhorroMulticliente(cliente1);
        //Agrego los demás clientes a la colección de titulares.
        cajaAhorroMulticliente.clientes.add(cliente2);
        cajaAhorroMulticliente.clientes.add(cliente3);
        cajaAhorroMulticliente.clientes.add(cliente4);
        //Verifico que la cuenta tenga 4 titulares
        Assertions.assertThat(cajaAhorroMulticliente.clientes.size()).isEqualTo(4);
    }
}
