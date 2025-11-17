package model;

import java.util.ArrayList;
import java.util.Objects;

import Main.App;
import Util.Graficos.ArteAscii;

public class Usuario {
    //Atributos
    private static int id = 1;
    private final int idUser;
    private final String nombre;
    private final String email;
    private String pass;
    private Suscripcion miSuscripcion;
    private ArrayList<Integer> favoritos;
    private ArrayList<Integer> seguirViendo;
    private ArrayList<Integer> puntuaciones;
    private boolean controlParental;

    // Constructor
    public Usuario(String nombre, String email, Suscripcion miSuscripcion, String pass, boolean controlParental) {
        this.nombre = nombre;
        this.email = email;
        this.miSuscripcion = miSuscripcion;
        this.pass = pass;
        favoritos = new ArrayList<>();
        seguirViendo = new ArrayList<>();
        puntuaciones = new ArrayList<>();
        this.controlParental = controlParental;
        idUser = id;
        id++;
        
    }

    public static int getId() {
        return id;
    }

    public boolean isControlParental() {
        return controlParental;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Suscripcion getMiSuscripcion() {
        return miSuscripcion;
    }

    public ArrayList<Integer> getFavoritos() {
        return favoritos;
    }

    public ArrayList<Integer> getSeguirViendo() {
        return seguirViendo;
    }
    public ArrayList<Integer> getPuntuaciones() {
        return puntuaciones;
    }
    public String getPass() {
        return pass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email,pass);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (pass == null) {
            if (other.pass != null)
                return false;
        } else if (!pass.equals(other.pass))
            return false;
        return true;
    }
    

    @Override
    public String toString() {
        return "Usuario [idUser=" + idUser + ", nombre=" + nombre + ", email=" + email + ", pass=" + pass
                + ", miSuscripcion=" + miSuscripcion + ", favoritos=" + favoritos.size() + ", seguirViendo=" + seguirViendo
                + "]";
    }

    public void añadirAFavoritos (int miFav){
        favoritos.add(miFav);
        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t❤️Contenido añadido favoritos❤️");
    }

    public void quitarDeFavoritos (int miFav){
        for (int i = 0; i < favoritos.size(); i++) {
            if(favoritos.get(i) == miFav){
                favoritos.remove(i);
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t💔Contenido eliminado de favoritos💔");
                break;
            }
        }
    }

    public void mostrarFichaUsuario(){
        ArteAscii.imprimirCabecera(this);
        System.out.println("\n\t\t\t\t\t\t\t\t"+ArteAscii.FONDO_AZUL+ArteAscii.BLANCO+" ---     "+getNombre().toUpperCase()+"     --- \n"+ArteAscii.RESET+
                            ArteAscii.AMARILLO+"                              &&&&&                              \n" +
                            ArteAscii.AMARILLO+"                          &&&&&&&&&&&&&                          \n" +
                            ArteAscii.AMARILLO+"                        &&&&&&     &&&&&&                        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                       &&&&           &&&&                       "+ArteAscii.AZUL_CLARO+"\t\tIDENTIFICADOR DE USUARIO - "+ArteAscii.RESET +getIdUser()+"\n"+
                            ArteAscii.AMARILLO+"                      &&&&             &&&&                      "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                     &&&&               &&&&                     "+ArteAscii.AZUL_CLARO + "\t\tE-MAIL - "+ArteAscii.RESET +getEmail()+"\n"+
                            ArteAscii.AMARILLO+"                     &&&&               &&&&                     "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                      &&&               &&&                      "+ArteAscii.AZUL_CLARO+"\t\tFECHA DE ALTA - "+ArteAscii.RESET +getMiSuscripcion().getFechaAlta()+"\n"+
                            ArteAscii.AMARILLO+"                      &&&&             &&&&                      "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                       &&&&           &&&&                       "+ArteAscii.AZUL_CLARO+"\t\tVALIDED DE SUSCRIPCIÓN - "+ArteAscii.RESET +getMiSuscripcion().getValidez()+"\n"+
                            ArteAscii.AMARILLO+"                        &&&&&&&   &&&&&&&                        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                        &&&&&&&&&&&&&&&&&                        "+ArteAscii.AZUL_CLARO+"\t\tTIPO DE SUSCRIPCIÓN - "+ArteAscii.RESET +getMiSuscripcion().getMiSuscripcion()+"\n"+
                            ArteAscii.AMARILLO+"                    &&&&&&&&&&     &&&&&&&&&&                    "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"                  &&&&&&                 &&&&&&                  "+ArteAscii.AZUL_CLARO+"\t\tAUTO-RENOVACIÓN - "+ArteAscii.RESET +getMiSuscripcion().isRenovacionAuto()+"\n"+
                            ArteAscii.AMARILLO+"                &&&&&                       &&&&&                "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"               &&&&                           &&&&               "+ArteAscii.AZUL_CLARO+"\t\tCONTENIDO EN FAVORITOS ❤️ - "+ArteAscii.RESET+getFavoritos().size()+"\n" +
                            ArteAscii.AMARILLO+"              &&&&                             &&&&              "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"             &&&&                               &&&&             "+ArteAscii.AZUL_CLARO+"\t\tCONTENIDO EN SEGUIR VIENDO 👓 - "+ArteAscii.RESET+getSeguirViendo().size()+"\n"+
                            ArteAscii.AMARILLO+"             &&&                                 &&&             "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AMARILLO+"             &&&                                 &&&             "+ArteAscii.AZUL_CLARO+"\t\tCONTROL PARENTAL - "+ArteAscii.RESET+isControlParental()+"\n"+
                            ArteAscii.AMARILLO+"            &&&&                                 &&&&            "+ArteAscii.RESET+"\t---------------------------------------------------------------\n" +
                            ArteAscii.AMARILLO+"             &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&             \n"+
                            ArteAscii.AMARILLO+"               &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&               \n"+
                            ArteAscii.RESET+"\t--------------------------------------------------------------------\n" +
                            ArteAscii.AZUL_CLARO+"\t\tDESCRIPCIÓN - "+ArteAscii.RESET +"\n");
        ArteAscii.imprimirPieUsuario();

    }
    public void verFavoritos(){
        ArteAscii.imprimirCabecera(this);
        ArrayList<Contenido> provisional = (ArrayList<Contenido>) App.getListaContenidos();
        for (Integer integer : favoritos) {
            for (Contenido contenido : provisional) {
                if(integer == contenido.getIdCont()){
                    System.out.println(contenido.toString());
                }
            }
        }
        System.out.println("\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET);
        ArteAscii.imprimirPieBusqueda();
    }
    public void añadirASeguirViendo (int id){
        seguirViendo.add(id);
        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tContenido añadido a seguir viendo");
    }

    public void quitarDeSeguirViendo (int id){
        for (int i = 0; i < seguirViendo.size(); i++) {
            if(seguirViendo.get(i) == id){
                seguirViendo.remove(i);
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\tContenido eliminado de seguir viendo");
                break;
            }
        }
    }

    public void verSeguirViendo(){
        ArteAscii.imprimirCabecera(this);
        ArrayList<Contenido> provisional = (ArrayList<Contenido>) App.getListaContenidos();
        for (Integer integer : seguirViendo) {
            for (Contenido contenido : provisional) {
                if(integer == contenido.getIdCont()){
                    System.out.println(contenido.toString());
                }
            }
        }
        System.out.println("\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET);
        ArteAscii.imprimirPieBusqueda();
    }
    public void añadirPuntuacion(int id){
        puntuaciones.add(id);
        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tPuntuación registrada correctamente 👌");
    }


}
