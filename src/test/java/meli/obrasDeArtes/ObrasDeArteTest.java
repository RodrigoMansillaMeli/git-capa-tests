package meli.obrasDeArtes;

import org.junit.Test;

public class ObrasDeArteTest {
    @Test
    public void listarLasObrasDeArteYVerificarQueCadaUnaIndiqueDeQueTipoEs() {
        //Creo 3 obras de arte
        Pintura pintura = new Pintura("Pintulski", "Pinturita", "2x2");
        Escultura escultura = new Escultura("Esculturuski", "Esculturita", "4x4");
        Grabado grabado = new Grabado("Grabaduski", "Grabadito", "5x5");
        //Agrego las obras de arte a la coleccion de obras de arte
        ObraDeArte obras = new ObraDeArte();
        obras.catalogo.add(pintura);
        obras.catalogo.add(escultura);
        obras.catalogo.add(grabado);
        //Listo las obras de arte
        for (ObraDeArte item : obras.catalogo) {
            System.out.println(item.toString());
        }
    }
}
