package meli.obrasDeArtes;

import java.util.AbstractQueue;
import java.util.LinkedList;

public class ObraDeArte {
    String autor, titulo, dimensiones;
    LinkedList<ObraDeArte> catalogo = new LinkedList<ObraDeArte>();

    public ObraDeArte() {
    }

    public ObraDeArte(String autor, String titulo, String dimensiones) {
        this.autor = autor;
        this.titulo = titulo;
        this.dimensiones = dimensiones;
    }

    public String toString (){
        String mensaje="El autor se llama "+autor+" y creó la obra "+titulo+" con dimensiones "+dimensiones;
        return mensaje;
    }

}
