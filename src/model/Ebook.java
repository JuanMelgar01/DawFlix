package model;

import java.time.LocalDate;

import Util.Graficos.ArteAscii;

public class Ebook extends Contenido {

    // FASE 1
    
    //Atributos
    private final String autor;
    private final int numPaginas;

    //Constructor
    public Ebook(String titulo, String genero, int duracion, String descripcion, LocalDate fechaCreacion,
            LocalDate fechaAltaSistema, tipoContenido tipoSuscripcion,int controlParental, String autor, int numPaginas) {
        super(titulo, genero, duracion, descripcion, fechaCreacion, fechaAltaSistema, tipoSuscripcion, controlParental);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    //Sobreescritura de métodos

    public String toString() {
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }
        return "\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET+
                "\t\t\t Código " + super.getIdCont() + " - 📒 - " + titulo + "  -  " + getAutor() + "  -  " + estrellas + " " + getPuntuacion();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        return result;
    }
    // Sobreescrito equals para comparar titulo y director.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ebook other = (Ebook) obj;
        if (autor == null || super.titulo == null) {
            if (other.autor != null || other.titulo !=null)
                return false;
        } else if (!autor.equals(other.autor) || !super.titulo.equals(other.titulo))
            return false;
        return true;
    }

    @Override
    public void reproducir() {
        ArteAscii.mensajeAviso("\t\t\t\t\t\tReproduciendo " + getTitulo() + ", de la clase Ebook");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void mostrarFicha(Usuario user) {
        ArteAscii.imprimirCabecera(user);
        String esFav ="❌";
        String punt = ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "P" +ArteAscii.RESET + "untúa este contenido";
        
        for (int idContUsu : user.getFavoritos()) {
            if(idContUsu == this.getIdCont()){
                esFav= "❤️";
                break;
            }
        }
        for (int idContUsu : user.getPuntuaciones()) {
            if(idContUsu == this.getIdCont()){
                punt = "Ya has puntuado este contenido, gracias! 👌";
                break;
            }
        }
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }

        System.out.println("\n\t\t\t\t\t\t\t"+ArteAscii.FONDO_AZUL+ArteAscii.BLANCO+" ---     "+getTitulo().toUpperCase()+"     --- \n"+ArteAscii.RESET+
                            ArteAscii.AZUL_CLARO+"\n          xx$x$x$x$x$x$x$x$x$x$x$x$x$x$x$x$x;                          \n" +
                            ArteAscii.AZUL_CLARO+"        .&.                                 x&                         "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$  .&&&&&&&&&&&&&&&&&&&&&&&&&&&&&.  &;                        "+ArteAscii.AZUL_CLARO+"\t\tDIRECTOR - "+ArteAscii.RESET +getAutor()+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&.                           ;& .&;                        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"               $&&&&&&&&x."+ArteAscii.AZUL_CLARO+"  .$  &."+ArteAscii.RESET+"  .x$&&&&&&&&           "+ArteAscii.AZUL_CLARO + "\t\tGÉNERO - "+ArteAscii.RESET +getGenero()+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"            ..&.        ;&&;    .&&x         &;.         "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"            .&.&.           .&&x&x            &.$$        "+ArteAscii.AZUL_CLARO+"\t\tFECHA ESTRENO - "+ArteAscii.RESET +getFechaCreacion()+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"           .& &. .&&&&&$;    $$    .$&&&&&$  &.x$        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"            .& &.        ;$&. x& .&&;         &.x$        "+ArteAscii.AZUL_CLARO+"\t\tEN DAWFLIX DESDE - "+ArteAscii.RESET +getFechaAltaSistema()+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"           .& &.  $$x.    ;&xx$ &;    .;$$;  &.x$        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"            .& &.     .;;&&;  x&  .$&$;.      &.x$        "+ArteAscii.AZUL_CLARO+"\t\tDURACIÓN -  "+ArteAscii.RESET +getDuracion()+" MIN\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"           .& &.          x&.x& $$.          &.x$        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"            .& &;.;;...       x&       ...;;.;&.x$        "+ArteAscii.AZUL_CLARO+"\t\tFAVORITO "+ArteAscii.RESET +esFav+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"           .& ...  ...$&&;   x&   .&&&;..  ... x$        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"            .&&&$xxx$&&&$.;$&xx&;&&; x$&&$xxxx&&&$        "+ArteAscii.AZUL_CLARO+"\t\tPUNTUACIÓN "+ArteAscii.RESET +getPuntuacion()+" "+ estrellas + " - (" + getNumValoraciones() + ") valoraciones\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"            $&&&$$$&&&x.x&$.;&&x.x&$;;$&&&$$&&&&         "+ArteAscii.RESET+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&"+ArteAscii.RESET+"                        x&&.&.   $;$&$.                   "+ArteAscii.AZUL_CLARO+"\t\t"+ punt +"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ .&."+ArteAscii.RESET+"                          x&&&&&&$.                      "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        $$  x&&&&&&&&&&&&&&&&&&&&&&&&&&&$    ;                         "+ArteAscii.AZUL_CLARO+"\t\tTIPO DE CONTENIDO - "+ArteAscii.RESET +getTipoSuscripcion()+"\n"+
                            ArteAscii.AZUL_CLARO+"        $$ "+ArteAscii.AMARILLO+"             ;xxxxx;"+ArteAscii.AZUL_CLARO+"              &;                        "+ArteAscii.RESET+"\t---------------------------------------------------------------\n"+
                            ArteAscii.AZUL_CLARO+"        .&."+ArteAscii.AMARILLO+"             ;xxxxx;"+ArteAscii.AZUL_CLARO+"             x&                         "+ArteAscii.AZUL_CLARO+"\t\tCALIFICACIÓN - +"+ArteAscii.RESET +getControlParental()+"\n"+
                            ArteAscii.AZUL_CLARO+"         .x$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;                          " + ArteAscii.RESET+"\t---------------------------------------------------------------\n" +
                            "\t--------------------------------------------------------------------\n" +
                            ArteAscii.AZUL_CLARO+"\t\tDESCRIPCIÓN - "+ArteAscii.RESET +getDescripcion()+"\n");
        ArteAscii.imprimirPieContenido();
    }
    public void datosRecomendados() {
        String estrellas =" ";
        for (int i = 0; i < getPuntuacion().intValue(); i++) {
            estrellas = estrellas + "⭐";
        }
        System.out.println("\t\t\t\t"+ ArteAscii.AZUL_CLARO +"-------------------------------------------------------------------------------------------------" + ArteAscii.RESET);
        System.out.println("\t\t\t\t\t\t\t📒 " + getTitulo() + estrellas + " " + getPuntuacion());
    }
}
