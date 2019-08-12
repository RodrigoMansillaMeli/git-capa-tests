package meli.cafeteria;

import java.util.LinkedList;
import java.util.function.Predicate;

public class Cafeteria {
    LinkedList<TazaCafe> tazas = new LinkedList<TazaCafe>();
    LinkedList<Ingredientes> ingredientesUtilizados = new LinkedList<Ingredientes>();

    public Cafeteria() {
        ingredientesUtilizados.add(new Ingredientes("CAFE",0));
        ingredientesUtilizados.add(new Ingredientes("LECHE",0));
        ingredientesUtilizados.add(new Ingredientes("AZUCAR",0));
        ingredientesUtilizados.add(new Ingredientes("CANELA",0));
    }

    int totalFacturado = 0;


    public void agregarTaza(TazaCafe taza) {
        tazas.add(taza);
    }


    public int informarTotalFacturado() {
        for (TazaCafe item : tazas) {
            totalFacturado += item.costo;
        }
        return totalFacturado;
    }

    public int informarCafeMasCaro() {
        int maximo = 0;
        for (TazaCafe item : tazas) {
            if(item.costo > maximo) {
                maximo = item.costo;
            }
        }
        return maximo;
    }

    public void sumarizarIngredientes(Ingredientes ingrediente) {
        for(Ingredientes item : ingredientesUtilizados) {
            if(item.tipo == ingrediente.tipo) {
                item.cantidad+=ingrediente.cantidad;
            }
        }
    }

    public String informarIngredienteMasUtilizado() {
        int maximo = 0;
        String ingrediente = "SIN INFORMAR";
        for (Ingredientes item : ingredientesUtilizados) {
            if(item.cantidad > maximo) {
                maximo = item.cantidad;
                ingrediente = item.tipo.dameTipoIngrediente();
            }
        }
        if(ingrediente == "CF") {
            ingrediente = "CAFE";
        } else if (ingrediente == "CN") {
            ingrediente = "CANELA";
        } else if (ingrediente == "LE") {
            ingrediente = "LECHE";
        } else if (ingrediente == "AZ") {
            ingrediente = "AZUCAR";
        }

        return ingrediente;
    }
}
