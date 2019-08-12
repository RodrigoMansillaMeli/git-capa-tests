package meli.cuentas;

public class CajaAhorroEspecial extends CajaAhorro{

    public CajaAhorroEspecial(Cliente cliente) {
        super(cliente);
    }

    public boolean extraerEnDescubierto(double monto) {
        double saldoAnterior = this.saldo;
        if ((saldo - monto) > 0) {
            this.saldo -= monto;
            avisarGiroEnDescubierto();
            return this.saldo < saldoAnterior;
        }
        return false;
    }

    public void avisarGiroEnDescubierto() {
        System.out.println("Sr. "+cliente+", se realizó un giro en descubierto en su Caja de Ahorro Especial");
    }
}
