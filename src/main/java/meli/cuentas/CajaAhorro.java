package meli.cuentas;

public class CajaAhorro extends CuentaBancaria{

    public CajaAhorro(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean extraer(double monto) {
        double saldoAnterior = this.saldo;
        if ((saldo - monto) > 0) {
            this.saldo -= monto;
            return this.saldo < saldoAnterior;
        }
        return false;
    }
}
