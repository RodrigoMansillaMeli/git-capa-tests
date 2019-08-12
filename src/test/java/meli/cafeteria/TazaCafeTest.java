package meli.cafeteria;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class TazaCafeTest {
    @Test
    public void calcularPrecioDeTazaDeCafe() {
        //Creo la taza
        TazaCafe tazaCafe = new TazaCafe();

        //Creo el stock de ingredientes
        Stock stockCafe = new Stock("CAFE", 300);
        Stock stockAzucar = new Stock("AZUCAR", 300);
        Stock stockLeche = new Stock("LECHE", 300);
        Stock stockCanela = new Stock("CANELA", 300);

        //Creo los ingredientes
        Ingredientes ingrediente1 = new Ingredientes("CAFE",100);
        Ingredientes ingrediente2 = new Ingredientes("LECHE",200);
        Ingredientes ingrediente3 = new Ingredientes("AZUCAR",200);
        Ingredientes ingrediente4 = new Ingredientes("CANELA",200);

        //Agrego los ingredientes a la taza
        tazaCafe.agregarIngrediente(ingrediente1);
        tazaCafe.agregarIngrediente(ingrediente2);
        tazaCafe.agregarIngrediente(ingrediente3);
        tazaCafe.agregarIngrediente(ingrediente4);

        //Agrego la taza de cafe a la lista de la cafeteria
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.agregarTaza(tazaCafe);

        //Calculo el costo de la taza
        Assertions.assertThat(tazaCafe.costo).isEqualTo(7);
    }

    @Test
    public void informarTotalFacturado() {
        //Creo una taza
        TazaCafe tazaCafe = new TazaCafe();

        //Creo el stock de ingredientes
        Stock stockCafe = new Stock("CAFE", 1000);
        Stock stockAzucar = new Stock("AZUCAR", 1000);
        Stock stockLeche = new Stock("LECHE", 1000);
        Stock stockCanela = new Stock("CANELA", 1000);

        //Agrego los ingredientes a la primer taza
        tazaCafe.agregarIngrediente(new Ingredientes("CAFE",400));
        tazaCafe.agregarIngrediente(new Ingredientes("CANELA",200));

        //Creo la cafeteria y agrego la taza
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.agregarTaza(tazaCafe);

        //Creo otra taza
        TazaCafe tazaCafe2 = new TazaCafe();

        //Agrego los ingredientes a la segunda taza
        tazaCafe.agregarIngrediente(new Ingredientes("CAFE",300));
        tazaCafe.agregarIngrediente(new Ingredientes("LECHE",200));

        //Agrego la taza de cafe a la lista de la cafeteria
        cafeteria.agregarTaza(tazaCafe2);

        Assertions.assertThat(cafeteria.informarTotalFacturado()).isEqualTo(11);
    }

    @Test
    public void testearQueSeInformaCafeMasCaro() {
        //Creo una taza
        TazaCafe tazaCafe = new TazaCafe();

        //Creo el stock de ingredientes
        Stock stockCafe = new Stock("CAFE", 1000);
        Stock stockAzucar = new Stock("AZUCAR", 1000);
        Stock stockLeche = new Stock("LECHE", 1000);
        Stock stockCanela = new Stock("CANELA", 1000);

        //Agrego los ingredientes a la primer taza
        tazaCafe.agregarIngrediente(new Ingredientes("CAFE",400));
        tazaCafe.agregarIngrediente(new Ingredientes("CANELA",200));

        //Creo la cafeteria y agrego la taza
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.agregarTaza(tazaCafe);

        //Creo otra taza
        TazaCafe tazaCafe2 = new TazaCafe();

        //Agrego los ingredientes a la segunda taza
        tazaCafe.agregarIngrediente(new Ingredientes("CAFE",300));
        tazaCafe.agregarIngrediente(new Ingredientes("LECHE",200));

        //Agrego la taza de cafe a la lista de la cafeteria
        cafeteria.agregarTaza(tazaCafe2);

        Assertions.assertThat(cafeteria.informarCafeMasCaro()).isEqualTo(11);
    }

    @Test
    public void testearQueSeInformaCorrectamenteElIngredienteMasUtilizado() {
        //Creo una taza
        TazaCafe tazaCafe = new TazaCafe();

        //Creo el stock de ingredientes
        Stock stockCafe = new Stock("CAFE", 1000);
        Stock stockAzucar = new Stock("AZUCAR", 1000);
        Stock stockLeche = new Stock("LECHE", 1000);
        Stock stockCanela = new Stock("CANELA", 1000);

        //Creo la cafeteria
        Cafeteria cafeteria = new Cafeteria();

        //Agrego los ingredientes a la primer taza y al total de la cafeteria
        Ingredientes ingrediente1 = new Ingredientes("CAFE",200);
        tazaCafe.agregarIngrediente(ingrediente1);
        cafeteria.sumarizarIngredientes(ingrediente1);
        Ingredientes ingrediente2 = new Ingredientes("LECHE",400);
        tazaCafe.agregarIngrediente(ingrediente2);
        cafeteria.sumarizarIngredientes(ingrediente2);

        //Creo la cafeteria y agrego la taza
        cafeteria.agregarTaza(tazaCafe);

        //Creo otra taza
        TazaCafe tazaCafe2 = new TazaCafe();

        //Agrego los ingredientes a la segunda taza
        Ingredientes ingrediente3 = new Ingredientes("CAFE",300);
        tazaCafe.agregarIngrediente(ingrediente3);
        cafeteria.sumarizarIngredientes(ingrediente3);
        Ingredientes ingrediente4 = new Ingredientes("LECHE",200);
        tazaCafe.agregarIngrediente(ingrediente4);
        cafeteria.sumarizarIngredientes(ingrediente4);

        //Agrego la taza de cafe a la lista de la cafeteria
        cafeteria.agregarTaza(tazaCafe2);

        Assertions.assertThat(cafeteria.informarIngredienteMasUtilizado()).isEqualTo("LECHE");
    }
}
