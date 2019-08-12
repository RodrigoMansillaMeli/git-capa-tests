package meli.cuentas;

public abstract class CuentaBancaria {
    Cliente cliente;
    double saldo = 0.0;

    public boolean depositar(double monto) {
        double saldoAnterior = this.saldo;
        this.saldo += monto;
        return this.saldo > saldoAnterior;
    }

    public abstract boolean extraer(double monto);
}
