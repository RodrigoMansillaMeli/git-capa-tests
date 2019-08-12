package meli.obrasDeArtes;

public class Pintura extends ObraDeArte{

    public Pintura(String autor, String titulo, String dimensiones) {
        super(autor, titulo, dimensiones);
    }

    public String toString (){
        String mensaje="El autor se llama "+this.autor+" y creó la pintura "+this.titulo+" con dimensiones "+this.dimensiones;
        return mensaje;
    }
}
