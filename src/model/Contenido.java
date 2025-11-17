package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import Util.Comparador;
import Util.Reproducible;
import Util.Excepciones.ControlParentalException;

public abstract class Contenido implements Comparable<Contenido>, Reproducible {

    // FASE 1
    // Tipo de contenido
    public enum tipoContenido {
        BASICO, PREMIUM
    }

    // Atributos
    private static int id = 1;
    private final int idCont;
    protected final String titulo;
    protected final String genero;
    protected final int duracion;
    protected Float puntuacion;
    protected int numValoraciones;
    protected final String descripcion;
    protected final LocalDate fechaCreacion;
    protected final LocalDate fechaAltaSistema;
    protected final tipoContenido tipoSuscripcion;
    protected final int controlParental;

    // Constructor
    public Contenido(String titulo, String genero, int duracion, String descripcion, LocalDate fechaCreacion,
            LocalDate fechaAltaSistema, tipoContenido tipoSuscripcion, int controlParental) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaAltaSistema = fechaAltaSistema;
        this.tipoSuscripcion = tipoSuscripcion;
        this.controlParental = controlParental;
        this.puntuacion = 0F;
        idCont=id;
        id++;
    }

    public int getIdCont() {
        return idCont;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Float getPuntuacion() {
        return puntuacion / numValoraciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static int getId() {
        return id;
    }

    public int getDuracion() {
        return duracion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaAltaSistema() {
        return fechaAltaSistema;
    }

    public tipoContenido getTipoSuscripcion() {
        return tipoSuscripcion;
    }
    public int getNumValoraciones() {
        return numValoraciones;
    }
    public void setPuntuacion(Float puntuacion) {
        this.puntuacion += puntuacion;
        numValoraciones++;

    }
    

    // Metodos abstractos

    public abstract void mostrarFicha(Usuario user);

    public abstract void datosRecomendados();

    // FASE 2

    // Métodos para ordenar usando Comparable
    public static void ordenarPorDuracion(ArrayList<Contenido> miContenido) {
        Collections.sort(miContenido, new Comparador());
    }

    // Métodos para ordenar usando lambda
    public static void ordenarPorFecha(ArrayList<Contenido> miContenido){
        Collections.sort(miContenido, (c1,c2) -> c1.getFechaCreacion().compareTo(c2.getFechaCreacion()));
    }
    public static void ordenarPorPuntuacion(ArrayList<Contenido> miContenido){
        Collections.sort(miContenido, (c1,c2) -> c2.getPuntuacion().compareTo(c1.getPuntuacion()));
    }
    
    // Forma de ordenación natural, por titulo.
    @Override
    public int compareTo(Contenido o) {
        return titulo.compareTo(o.getTitulo());
    }

    // FASE 3

    // Método para nueva funcionalidad, control parental.
    public void controlParental(Usuario user) throws ControlParentalException{
        if(controlParental == 18 &&  user.isControlParental() ){
                throw new ControlParentalException("\t\t\t\t\t\t     🔞 Este contenido es para mayores de 18 años 🙈");
            }
    }

    public int getControlParental() {
        return controlParental;
    }

    

}