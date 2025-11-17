package Util;

import java.util.Comparator;

import model.Contenido;

public class Comparador implements Comparator<Contenido> {
    // FASE 2
    // Comparador para ordenar la colección por duración.
    @Override
    public int compare(Contenido c1, Contenido c2) {
        return Integer.compare(c1.getDuracion(), c2.getDuracion());
    }
    
}
