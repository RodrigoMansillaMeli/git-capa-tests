package meli.obrasDeArtes;

public class Grabado extends ObraDeArte{

    public Grabado(String autor, String titulo, String dimensiones) {
        super(autor, titulo, dimensiones);
    }

    public String toString (){
        String mensaje="El autor se llama "+this.autor+" y creó el grabado "+this.titulo+" con dimensiones "+this.dimensiones;
        return mensaje;
    }
}
