package meli.obrasDeArtes;

public class Escultura extends ObraDeArte{

    public Escultura(String autor, String titulo, String dimensiones) {
        super(autor, titulo, dimensiones);
    }

    public String toString (){
        String mensaje="El autor se llama "+this.autor+" y creó la escultura "+this.titulo+" con dimensiones "+this.dimensiones;
        return mensaje;
    }
}

