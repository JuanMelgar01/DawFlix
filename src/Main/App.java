package Main;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Util.DatosIniciales.DatosIniciales;
import Util.Excepciones.ControlParentalException;
import Util.Excepciones.NoEncontradoException;
import Util.Graficos.ArteAscii;
import model.Contenido;
import model.Suscripcion;
import model.Usuario;
import model.Suscripcion.tipoSuscripcion;

public class App {
    static Scanner teclado = new Scanner(System.in);
    private static List<Usuario> listaUsuarios = DatosIniciales.cargarUsuarios();
    private static List<Contenido> listaContenidos = DatosIniciales.cargarContenidos();
    private static Usuario userLogin = null;

    public static void main(String[] args)  {
        boolean encendido = true;
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String seleccion = "";
        do {
            ArteAscii.impInicio();
            seleccion = teclado.nextLine();
            switch (seleccion) {
                case "I":
                    iniciarSesion();
                    break;
                case "R":
                    registrar();
                    break;
                case "A":
                    encendido = false;
                    break;
                default:
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  Introduce una opción válida");
                    break;
            }

        } while (encendido);
    }

    public static void registrar() {
        boolean verificado = true;
        ArteAscii.marcoSupMensaje();
        System.out.println("\t\t\t\t\t\t🟥\t\t➡️ INTRODUCE TU NOMBRE ✉️\t\t🟥");
        ArteAscii.marcoInfMensaje();
        String nombre = teclado.nextLine();
        String email;
        do{
            verificado = true;
            ArteAscii.marcoSupMensaje();
            System.out.println("\t\t\t\t\t\t🟥\t\t➡️ INTRODUCE TU EMAIL ✉️\t\t🟥");
            ArteAscii.marcoInfMensaje();
            email = teclado.nextLine();
            for (Usuario usuario : listaUsuarios) {
                if(usuario.getEmail().equalsIgnoreCase(email)){
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tEl correo introducido ya existe");
                    verificado = false;
                    break;
                }
            }
        }while(!verificado);
        ArteAscii.marcoSupMensaje();
        System.out.println("\t\t\t\t\t\t🟥\t\t➡️ INTRODUCE TU CONTRASEÑA ✉️\t\t🟥");
        ArteAscii.marcoInfMensaje();
        String pass = teclado.nextLine();
        String tipoSus;
        do{
            verificado = true;
            ArteAscii.marcoSupMensaje();
            System.out.println("\t\t\t\t\t\t🟥\t   ➡️ SUSCRIPCION (BASICO | PREMIUM) ✉️\t\t🟥");
            ArteAscii.marcoInfMensaje();
            tipoSus = teclado.nextLine();
            if (!tipoSus.equalsIgnoreCase("BASICO") && !tipoSus.equalsIgnoreCase("PREMIUM")){
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tIntroduce correctamente BASICO ó PREMIUM");
                verificado = false;
            }
        }while (!verificado);
        String renovar;
        do{
            verificado = true;
            ArteAscii.marcoSupMensaje();
            System.out.println("\t\t\t\t\t\t🟥\t     ➡️ RENOVACION AUTO (SI | NO) ✉️\t\t🟥");
            ArteAscii.marcoInfMensaje();
            renovar = teclado.nextLine();
            if (!renovar.equalsIgnoreCase("NO") && !renovar.equalsIgnoreCase("SI")){
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tIntroduce correctamente (SI | NO)");
                verificado = false;
            }
        }while (!verificado);
        boolean renovaAuto = false;
        if (renovar.equalsIgnoreCase("si")) renovaAuto = true;
        String control;
        do{
            verificado = true;
            ArteAscii.marcoSupMensaje();
            System.out.println("\t\t\t\t\t\t🟥\t     ➡️ CONTROL PARENTAL (SI | NO) ✉️\t\t🟥");
            ArteAscii.marcoInfMensaje();
            control = teclado.nextLine();
            if (!control.equalsIgnoreCase("NO") && !control.equalsIgnoreCase("SI")){
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tIntroduce correctamente (SI | NO)");
                verificado = false;
            }
        }while (!verificado);
        boolean controlParental = false;
        if (control.equalsIgnoreCase("si"))
            controlParental = true;
        listaUsuarios.add(new Usuario(nombre, email,
                (new Suscripcion(tipoSuscripcion.valueOf(tipoSus.toUpperCase()), renovaAuto)), pass, controlParental));
        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tUsuario registrado correctamente");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }

    public static void iniciarSesion() {
        boolean encontrado = false;
        ArteAscii.marcoSupMensaje();
        System.out.println("\t\t\t\t\t\t🟥\t\t➡️ INTRODUCE TU EMAIL ✉️\t\t🟥");
        ArteAscii.marcoInfMensaje();
        String email = teclado.nextLine();
        ArteAscii.marcoSupMensaje();
        System.out.println("\t\t\t\t\t\t🟥\t\t➡️ INTRODUCE CONTRASEÑA 🔐\t\t🟥");
        ArteAscii.marcoInfMensaje();
        String pass = teclado.nextLine();
        for (Usuario user : listaUsuarios) {
            if (user.getEmail().equalsIgnoreCase(email) && user.getPass().equals(pass)) {
                encontrado = true;
                userLogin = user;
                imprimirMenuUser(userLogin);

                return;
            }
        }
        if (!encontrado) {
            ArteAscii.marcoSupMensaje();
            System.out.println("\t\t\t\t\t\t🟥\t\t❌❌ DATOS INCORRECTOS ❌❌\t\t🟥");
            ArteAscii.marcoInfMensaje();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void imprimirMenuUser(Usuario user) {
        boolean conectado = true;
        do {
            ArteAscii.imprimirCabecera(user);
            mostrarSugeridos();
            ArteAscii.imprimirSeleccionContenido();
            String opcion = teclado.nextLine();
            switch (opcion) {
                case "P":
                    conectado = gestionMenu("Pelicula");
                    break;
                case "M":
                    conectado = gestionMenu("Musica");
                    break;
                case "E":
                    conectado = gestionMenu("Ebook");
                    break;
                case "Fi":
                    conectado = gestionPerfil();
                    break;
                default:
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  Introduce una opción válida");
                    break;
            }
        } while (conectado);

    }

    public static void mostrarSugeridos() {
        System.out.println("\t\t\t\t\t\t\t\t⭐"+ ArteAscii.AZUL_CLARO+" RECOMENDADOS PARA TI"+ArteAscii.RESET+" ⭐ ");
        Contenido.ordenarPorPuntuacion((ArrayList) listaContenidos);
        for (int i = 0; i < 3; i++) {
            listaContenidos.get(i).datosRecomendados();
        }

    }

    public static boolean gestionMenu(String tipoCont){
        boolean terminado = false;
        String tipoOrden ="titulo";
        do {
            mostrarContenido(tipoCont,tipoOrden);
            switch (teclado.nextLine()) {
                case "S":
                    seleccionarContenido(tipoCont);
                    break;
                case "T":
                    tipoOrden ="Titulo";
                    break;
                case "P":
                    tipoOrden = "Puntuacion";
                    break;
                case "D":
                    tipoOrden = "Duracion";
                    break;
                case "F":
                    tipoOrden = "Fecha";
                    break;
                case "A":
                    terminado = true;
                    break;
                case "B":
                    buscarContenido();
                    break;
                case "Fi":
                    return gestionPerfil();
                default:
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  Introduce una opción válida");
                    break;

            }
        } while (!terminado);
        return true;
    }

    public static boolean gestionPerfil(){
        boolean salirFicha = false;
        do{
            userLogin.mostrarFichaUsuario();
            switch (teclado.nextLine()) {
                case "F":
                    if(userLogin.getFavoritos().isEmpty()){
                        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t   💔 No existen favoritos 💔");
                        break;
                    }
                    userLogin.verFavoritos();
                        switch (teclado.nextLine()) {
                            case "S":
                                seleccionarContenido(userLogin.getFavoritos());
                                break;
                            case "A":
                                salirFicha=true;
                                break;
                            default:
                                break;
                        }
                    break;
                case "S":
                    if(userLogin.getSeguirViendo().isEmpty()){
                        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\tNo existe contenido para seguir viendo");
                        break;
                    }
                    userLogin.verSeguirViendo();
                        switch (teclado.nextLine()) {
                            case "S":
                                seleccionarContenido(userLogin.getSeguirViendo());
                                break;
                            case "A":
                                salirFicha = true;
                                break;
                            default:
                                break;
                        }
                    break;
                case "A":
                    salirFicha = true;
                    break;
                case "C":
                        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  ¿Estás seguro de cerrar sesión?\n"+
                                                    "\t\t\t\t\t\t\t\t\t     "+ArteAscii.VERDE+ArteAscii.UNDERLINE+
                                                    "S"+ArteAscii.RESET+"í - "+ArteAscii.VERDE+ArteAscii.UNDERLINE+"N"+ArteAscii.RESET+"o");
                        if((teclado.nextLine().equalsIgnoreCase("S"))){
                            userLogin = null;
                            salirFicha = true;
                            ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t\t\t Adiós 👋");
                            return false;
                            
                        }
                        break;
                default:
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  Introduce una opción válida");
                    break;
            }
        } while (!salirFicha);
        return true;
    }

    public static void mostrarContenido(String tipoCont, String orden) {

        if (orden.equalsIgnoreCase("Titulo")){
            Collections.sort(listaContenidos);
        }
        else if (orden.equalsIgnoreCase("Duracion")){
            Contenido.ordenarPorDuracion((ArrayList)listaContenidos);
        }
        else if (orden.equalsIgnoreCase("Fecha")){
            Contenido.ordenarPorFecha((ArrayList)listaContenidos);
        }else if (orden.equalsIgnoreCase("Puntuacion")){
            Contenido.ordenarPorPuntuacion((ArrayList)listaContenidos);
        }
        ArteAscii.imprimirCabecera(userLogin);
        String letraDecorada ="";
        if( tipoCont.equals("Pelicula")) letraDecorada = " -- 🅲🅸🅽🅴 -- ";
        else if(tipoCont.equals("Musica")) letraDecorada = " -- 🅼🆄🆂🅸🅲🅰 -- ";
        else if(tipoCont.equals("Ebook")) letraDecorada = " -- 🅴🅱🅾🅾🅺 -- ";

        System.out.println("\n\t\t\t\t\t\t\t\t\t"+ArteAscii.BLANCO+letraDecorada+ArteAscii.RESET + "\n");
        for (Contenido contenido : listaContenidos) {
            if (contenido.getClass().getSimpleName().equalsIgnoreCase(tipoCont)) {
                System.out.println(contenido.toString());
            }
        }
        System.out.println("\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET);
        ArteAscii.imprimirPieListado();
    }

    public static void buscarContenido(){
        ArteAscii.imprimirCabecera(userLogin);
        System.out.println(ArteAscii.AZUL_CLARO+"\n\t\t\t\t\t\t\t\tINTRODUCE TITULO O DESCRIPCIÓN" + ArteAscii.RESET);
        String texto = teclado.nextLine();
        Pattern patron = Pattern.compile(texto, Pattern.CASE_INSENSITIVE);
        Matcher cadena;
        Matcher cadenaDesc;
        ArrayList<Integer> contBuscado = new ArrayList<>();
        for (Contenido contenido : listaContenidos) {
            cadena = patron.matcher(contenido.getTitulo());
            cadenaDesc = patron.matcher(contenido.getDescripcion());
            if (cadena.find() || cadenaDesc.find()) {
                System.out.println(contenido.toString());
                contBuscado.add(contenido.getIdCont());

            }
        }
        if (contBuscado.isEmpty()){
            ArteAscii.mensajeAviso("\t\t\t\t\t\t\tNingún contenido con ese título o descripción");
            return;
        }
        ArteAscii.imprimirPieBusqueda();
        seleccionarContenido(contBuscado);
    }

    public static void seleccionarContenido(ArrayList<Integer> listaValida){
        System.out.println(ArteAscii.AZUL_CLARO+"\n\t\t\t\t\t\t\t\tINTRODUCE CÓDIGO DEL CONTENIDO" + ArteAscii.RESET);
        int idCont_V=0;
        boolean validado = false;
        try{
                idCont_V = teclado.nextInt();
                teclado.nextLine();
                for (Integer id_valida : listaValida) {
                    if(idCont_V == id_valida){
                        validado = true;
                    }
                }
                if (!validado) throw new NoEncontradoException("\t\t\t\t\t\t\t   El código introducido no está en la lista");
            }catch (InputMismatchException e){
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t  El dato introducido no es un código válido");
                teclado.nextLine();
                return;
            }catch (NoEncontradoException e){
                ArteAscii.mensajeAviso(e.getMessage());
                return;
            }
            for (Contenido contenido : listaContenidos) {
                if (contenido.getIdCont() == idCont_V) {
                    try {
                        gestionFicha(contenido);
                    } catch (NoEncontradoException e) {
                        ArteAscii.mensajeAviso(e.getMessage());
                    }
                    break;
                }
            }
            System.out.println("\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET);
        
        
    }
    public static void seleccionarContenido(String tipoCont){
        System.out.println(ArteAscii.AZUL_CLARO+"\n\t\t\t\t\t\t\t\tINTRODUCE CÓDIGO DEL CONTENIDO" + ArteAscii.RESET);
        int idCont_V=0;
        boolean validado = false;
        try{
                idCont_V = teclado.nextInt();
                teclado.nextLine();
                for (Contenido contenido : listaContenidos) {
                    if(contenido.getClass().getSimpleName().equalsIgnoreCase(tipoCont)){
                        if(idCont_V == contenido.getIdCont()){
                            validado = true;
                            break;
                        }
                    }
                }
                if (!validado) throw new NoEncontradoException("\t\t\t\t\t\t\t   El código introducido no está en la lista");
            }catch (InputMismatchException e){
                ArteAscii.mensajeAviso("\t\t\t\t\t\t\t   El dato introducido no es un código válido");
                teclado.nextLine();
                return;
            }catch (NoEncontradoException e){
                ArteAscii.mensajeAviso(e.getMessage());
                return;
            }
            for (Contenido contenido : listaContenidos) {
                if (contenido.getIdCont() == idCont_V) {
                    contenido.mostrarFicha(userLogin);
                    try {
                        gestionFicha(contenido);
                    } catch (NoEncontradoException e) {
                        ArteAscii.mensajeAviso(e.getMessage());
                    }
                    break;
                }
            }
            System.out.println("\t\t"+ArteAscii.AZUL+"----------------------------------------------------------------------------------------------------------------------------\n" +ArteAscii.RESET);
        
        
    }

    public static void gestionFicha(Contenido contSelec) throws NoEncontradoException{
        boolean salir = false;
        do{
            contSelec.mostrarFicha(userLogin);
            boolean encontrado = false;
            switch (teclado.nextLine()) {
                case "R":
                    if(userLogin.getMiSuscripcion().getMiSuscripcion().name().equals("PREMIUM") || contSelec.getTipoSuscripcion().name().equals("BASICO")){
                        try{
                            contSelec.controlParental(userLogin);
                        }catch (ControlParentalException e){
                            ArteAscii.mensajeAviso(e.getMessage());
                            break;
                        }
                    
                    contSelec.reproducir();
                    encontrado = false;
                    for (int idCont_v : userLogin.getSeguirViendo()) {
                        if(idCont_v == contSelec.getIdCont()) encontrado = true;
                    }
                    if(!encontrado) userLogin.añadirASeguirViendo(contSelec.getIdCont());
                    salir = true;
                    }else if (contSelec.getTipoSuscripcion().name().equals("PREMIUM")){
                        try{
                            contSelec.controlParental(userLogin);
                        }catch (ControlParentalException e){
                            ArteAscii.mensajeAviso(e.getMessage());
                            break;
                        }
                        ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t Este contenido es Premium, \n\t\t\t\t\t\t\t amplía tu suscripción para acceder a el");
                    }
                    break;
                case "F":
                    encontrado = false;
                    for ( int idContUsu : userLogin.getFavoritos()) {
                        if(idContUsu == contSelec.getIdCont()){
                            userLogin.quitarDeFavoritos(idContUsu);
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado) userLogin.añadirAFavoritos(contSelec.getIdCont());
                    break;
                case "S":
                    encontrado = false;
                    for ( int idContUsu : userLogin.getSeguirViendo()) {
                        if(idContUsu == contSelec.getIdCont()){
                            userLogin.quitarDeSeguirViendo(idContUsu);
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado) userLogin.añadirASeguirViendo(contSelec.getIdCont());
                    break;
                case "P":
                    encontrado = false;
                    for ( int idContUsu : userLogin.getPuntuaciones()) {
                        if(idContUsu == contSelec.getIdCont()){
                            ArteAscii.mensajeAviso("\t\t\t\t\t\t\t❌ Este contenido ya ha sido puntuado ❌");
                            encontrado = true;
                        }
                    }
                    if(!encontrado) {
                        System.out.println(ArteAscii.AZUL_CLARO+"\n\t\t\t\t\t\t\t\tINDICA TU PUNTUACIÓN" + ArteAscii.RESET);
                        Float puntuacion = teclado.nextFloat();
                        if(puntuacion.intValue()>5 || puntuacion.intValue()<0){
                            ArteAscii.mensajeAviso("\t\t\t\t\t\tEl valor de puntuación debe estar entre 0 y 5 ⭐");
                            break;
                        }else{
                        contSelec.setPuntuacion(puntuacion);
                        teclado.nextLine();
                        userLogin.añadirPuntuacion(contSelec.getIdCont());
                        }
                    }
                    break;
                case "Fi":
                    gestionPerfil();
                    break;
                case "A":
                    salir = true;
                    break;
                default:
                    ArteAscii.mensajeAviso("\t\t\t\t\t\t\t\t  Introduce una opción válida");
                    break;
            }
        }while (!salir);
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static List<Contenido> getListaContenidos() {
        return listaContenidos;
    }

}
