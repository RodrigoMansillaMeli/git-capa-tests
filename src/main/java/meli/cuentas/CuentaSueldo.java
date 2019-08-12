package meli.cuentas;

public class CuentaSueldo extends CuentaBancaria{
    public CuentaSueldo(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean extraer(double monto) {
        double saldoAnterior = this.saldo;
        if(cliente.cantidadExtracciones > 5) {
            monto += 15;
        }
        if ((saldo - monto) > 0) {
            this.saldo -= monto;
            return this.saldo < saldoAnterior;
        }
        return false;
    }
}
