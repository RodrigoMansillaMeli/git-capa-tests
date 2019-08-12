package meli.cuentas;

import java.util.LinkedList;

public class Banco{
    LinkedList<CuentaBancaria> cuentasBancarias = new LinkedList<CuentaBancaria>();

    public int cuentasConSaldoNegativo() {
        int contador = 0;
        for (CuentaBancaria item : cuentasBancarias) {
            if (item.saldo < 0.0)
                contador++;
        }
        return contador;
    }

}
