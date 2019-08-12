package meli.cuentas;

import java.util.LinkedList;

public class CajaAhorroMulticliente extends CajaAhorro{
    LinkedList<Cliente> clientes = new LinkedList<Cliente>();

    public CajaAhorroMulticliente(Cliente cliente) {
        super(cliente);
        this.clientes.add(cliente);
    }
}
