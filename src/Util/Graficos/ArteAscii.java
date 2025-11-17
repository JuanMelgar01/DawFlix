package Util.Graficos;

import model.Usuario;

public class ArteAscii {
        // Colores
        public static final String RESET = "\u001B[0m";
        public static final String NEGRO = "\u001B[30m";
        public static final String ROJO = "\u001B[31m";
        public static final String VERDE = "\u001B[32m";
        public static final String AMARILLO = "\u001B[33m";
        public static final String AZUL = "\u001B[34m";
        public static final String MORADO = "\u001B[35m";
        public static final String CIAN = "\u001B[36m";
        public static final String BLANCO = "\u001B[37m";
        public static final String BOLD = "\u001B[1m";
        public static final String OSCURECIDO = "\u001B[2m";
        public static final String UNDERLINE = "\u001B[4m";
        // Colores de texto (intensos / brillantes)
        public static final String GRIS_OSCURO = "\u001B[90m";
        public static final String ROJO_CLARO = "\u001B[91m";
        public static final String VERDE_CLARO = "\u001B[92m";
        public static final String AMARILLO_CLARO = "\u001B[93m";
        public static final String AZUL_CLARO = "\u001B[94m";
        public static final String MAGENTA_CLARO = "\u001B[95m";
        public static final String CYAN_CLARO = "\u001B[96m";
        public static final String BLANCO_CLARO = "\u001B[97m";

        // Fondos
        public static final String FONDO_NEGRO = "\u001B[40m";
        public static final String FONDO_ROJO = "\u001B[41m";
        public static final String FONDO_VERDE = "\u001B[42m";
        public static final String FONDO_AMARILLO = "\u001B[43m";
        public static final String FONDO_AZUL = "\u001B[44m";
        public static final String FONDO_MAGENTA = "\u001B[45m";
        public static final String FONDO_CYAN = "\u001B[46m";
        public static final String FONDO_BLANCO = "\u001B[47m";

        // Logo

        public static final String logo = ROJO
                        + "                                                                                                                        \n"
                        + //
                        "                                                                                                                        \n"
                        + //
                        "                                                                                                                        \n"
                        + //
                        "                          ########################################################################################################        \n"
                        + //
                        "                         ##########################################################################################################       \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        #######" + RESET + "lXNNNXXK0xc'" + ROJO + "#####" + RESET + "'ckkkx:"
                        + ROJO
                        + "###" + RESET + ":dxd:" + ROJO + "###" + RESET + ";odo;" + ROJO + "###" + RESET + ";lool;"
                        + ROJO + "#"
                        + RESET + ";odddddddd:" + ROJO + "#" + RESET + "'lxxl," + ROJO + "######" + RESET + ";xOOo'"
                        + ROJO + "#"
                        + RESET + ";xKKx," + ROJO + "##" + RESET + "oXWNd'" + ROJO + "######      \n" + //
                        "                        #######" + RESET + "oNMWX0KNWMNx," + ROJO + "####," + RESET + "OWMMWk'"
                        + ROJO
                        + "##" + RESET + ":KWWd'" + ROJO + "##" + RESET + "oNWWx'" + ROJO + "##" + RESET + "oNWKx:"
                        + ROJO + "#"
                        + RESET + "lXWMWWWWWNo" + ROJO + "#" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KWWk'"
                        + ROJO + "#"
                        + RESET + "'dNMNo" + ROJO + "#" + RESET + ":0WWO;" + ROJO + "#######      \n" + //
                        "                        #######" + RESET + "oNMWd'':kWMNo" + ROJO + "####" + RESET + "lXMMMMK:"
                        + ROJO
                        + "##" + RESET + ",kWWO," + ROJO + "#" + RESET + ",kWMM0;" + ROJO + "#" + RESET + ",kWWk:,"
                        + ROJO + "#"
                        + RESET + "lXMM0lcccc;" + ROJO + "#" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KWWk,"
                        + ROJO + "##"
                        + RESET + ";OWW0cxWMXl" + ROJO + "########      \n" + //
                        "                        #######" + RESET + "oNMWd" + ROJO + "###" + RESET + "cXMWk'" + ROJO
                        + "##" + RESET
                        + "'xWMWWMNo" + ROJO + "###" + RESET + "dWMKc" + ROJO + "#" + RESET + ":KMMMXl" + ROJO + "#"
                        + RESET
                        + ":KMWd'" + ROJO + "##" + RESET + "lXMWx'" + ROJO + "######" + RESET + ",OWW0;" + ROJO
                        + "######" + RESET
                        + ":KWWk'" + ROJO + "###" + RESET + "cXWWKXMWx," + ROJO + "########      \n" + //
                        "                        #######" + RESET + "oNMWd" + ROJO + "###" + RESET + "cKMMk'" + ROJO
                        + "##" + RESET
                        + ";0MW0KMMk," + ROJO + "##" + RESET + "cKMWo" + ROJO + "#" + RESET + "oNMMMWx'oNMKc" + ROJO
                        + "###" + RESET
                        + "lXMWx'" + ROJO + "######" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KMWk'" + ROJO
                        + "###" + RESET
                        + "'dWMMMMK:" + ROJO + "#########      \n" + //
                        "                        #######" + RESET + "lNMWd" + ROJO + "###" + RESET + "cXMMk'" + ROJO
                        + "##" + RESET
                        + "oNMXldWMK:" + ROJO + "##" + RESET + ",kWWx;kMWKNMO:xWMO," + ROJO + "###" + RESET
                        + "lXMMXkkkx;" + ROJO
                        + "##" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KMMk," + ROJO + "####" + RESET
                        + ";OWMMNo'" + ROJO
                        + "#########      \n" + //
                        "                        #######" + RESET + "lNMWd" + ROJO + "###" + RESET + "cKMMk'" + ROJO
                        + "#" + RESET
                        + ",kWWO,cKWWd'" + ROJO + "##" + RESET + "dNW0dKMKoOMKdOMWd'" + ROJO + "###" + RESET
                        + "lXMMMWWWXc" + ROJO
                        + "##" + RESET + ",OWM0;" + ROJO + "######" + RESET + ":KMWk'" + ROJO + "####" + RESET
                        + "'dWMMK:" + ROJO
                        + "##########      \n" + //
                        "                        #######" + RESET + "lNMWd" + ROJO + "###" + RESET + "cKMMk," + ROJO
                        + "#" + RESET
                        + "cKMWk;:0WWO;" + ROJO + "##" + RESET + "cXMNXNWk,dWWXNMXc" + ROJO + "####" + RESET
                        + "lXMW0lllc," + ROJO
                        + "##" + RESET + ",OWM0;" + ROJO + "######" + RESET + ":KWWk'" + ROJO + "####" + RESET
                        + ";0MMMWd'" + ROJO
                        + "#########      \n" + //
                        "                        #######" + RESET + "lNMWd" + ROJO + "###" + RESET + "cXMMk'" + ROJO
                        + "#" + RESET
                        + "dWMMNXXWMMNl" + ROJO + "##" + RESET + ",OMMMMNo" + ROJO + "#" + RESET + ":KMMMMO;" + ROJO
                        + "####"
                        + RESET + "lXMWx'" + ROJO + "######" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KWWk'"
                        + ROJO + "###"
                        + RESET + ",kWMWWMXc" + ROJO + "#########      \n" + //
                        "                        #######" + RESET + "oNMWd" + ROJO + "###" + RESET + "cXMWx" + ROJO
                        + "#" + RESET
                        + ",OMMNXKKXWMWk," + ROJO + "#" + RESET + "'dWMMW0:" + ROJO + "#" + RESET + ",kWMMWx'" + ROJO
                        + "####"
                        + RESET + "cXMWx'" + ROJO + "######" + RESET + ",OWW0;" + ROJO + "######" + RESET + ":KMWk,"
                        + ROJO + "##"
                        + RESET + "'dNMXk0WWO," + ROJO + "########      \n" + //
                        "                        #######" + RESET + "oNMWd'';kWMNl" + ROJO + "#" + RESET
                        + "lXMWx;,,;OWMKc" + ROJO
                        + "##" + RESET + "cXMMWk'" + ROJO + "##" + RESET + "oNWMXl" + ROJO + "#####" + RESET + "cXMWx'"
                        + ROJO
                        + "######" + RESET + ",OMMXkddddc':KWWk'" + ROJO + "##" + RESET + "lXMWx'lNMNo'" + ROJO
                        + "#######      \n"
                        + //
                        "                        #######" + RESET + "oNMWX0KXWWNx''xWWKc" + ROJO + "####" + RESET
                        + "oNWNd'" + ROJO
                        + "#" + RESET + ";OWWXo" + ROJO + "###" + RESET + ":0NXk;" + ROJO + "#####" + RESET + "cKNXd'"
                        + ROJO
                        + "######" + RESET + ",kWWWWWWWWO,:KWWk," + ROJO + "#" + RESET + ":0MW0;" + ROJO + "#" + RESET
                        + ",OWMK:"
                        + ROJO + "#######      \n" + //
                        "                        #######" + RESET + "lNWNNNXKOxc'" + ROJO + "#" + RESET + ",okxl'"
                        + ROJO + "####"
                        + RESET + ",lll:'" + ROJO + "#" + RESET + "';cc:" + ROJO + "####" + RESET + "';::,'" + ROJO
                        + "#####"
                        + RESET + "';:;," + ROJO + "#######" + RESET + "';ccllllll:',lddc'" + ROJO + "#" + RESET
                        + "lkOkc" + ROJO
                        + "###" + RESET + "cKWNk," + ROJO + "######      \n" + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                        ############################################################################################################      \n"
                        + //
                        "                         ##########################################################################################################       \n"
                        + //
                        "                          ########################################################################################################        \n"
                        + //
                        "                                                                                                                        \n"
                        + //
                        "                                                                                                                        \n"
                        + //
                        "" + RESET;

        public String getLogo() {
                return logo;
        }

        public static void impInicio() {

                ArteAscii.limpiarConsola();
                System.out.println(logo);
                System.out.println("\t\t\t\t\t\t\t\t   " + VERDE + BOLD + UNDERLINE + "I"
                                + RESET + "NICIAR SESIÓN 🔒\n\t\t\t\t\t\t\t\t   " + VERDE + BOLD
                                + UNDERLINE + "R" + RESET + "EGISTRARSE 🔰\n\t\t\t\t\t\t\t\t   " + VERDE + BOLD + UNDERLINE
                                + "A" + RESET + "PAGAR 📴");

        }

        public static void marcoSupMensaje() {
                limpiarConsola();
                System.out.println(
                                "\n\n\n\n\n\n\n\t\t\t\t\t\t🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥\n\t\t\t\t\t\t🟥\t\t\t🅓🅐🅦🅕🅛🅘🅧\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥");
        }

        public static void marcoInfMensaje() {
                System.out.println(
                                "\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥\t\t\t\t\t\t\t🟥\n\t\t\t\t\t\t🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥🟥");

        }

        public static void imprimirCabecera(Usuario user) {
                limpiarConsola();
                System.out.println(
                                ROJO + "     -------------------------------------------------------------------------------------------------------------------------------------------------"
                                                + RESET);
                System.out.println(
                                "       🅓🅐🅦🅕🅛🅘🅧\t\t\t\t\t\t\t\t\t\t\t\t👋 Bienvenid@ " + user.getNombre()
                                                + " | "
                                                + VERDE + UNDERLINE + BOLD + "Fi" + RESET + "cha Usuario ⚙️");
                System.out.println(
                                ROJO + "     -------------------------------------------------------------------------------------------------------------------------------------------------"
                                                + RESET);
        }

        public static void limpiarConsola() {
                try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                        System.out.println("\n(No se pudo limpiar la consola)");
                }
        }

        public static void imprimirSeleccionContenido() {
                System.out.println(
                                "\n\t 🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻");
                System.out.println(
                                "                                                                                                                                                           \n"
                                                + //
                                                "                      %%%%%%%                                                                              %%%%%%%%%%                   %%%%%%%%%%         \n"
                                                +
                                                "                   %%%%%%%%%%%%                                  %%%%%%                                   %%%%%%%%%%%%%%%           %%%%%%%%%%%%%%%        \n"
                                                +
                                                "                 %%%%%%%%%%%%%%%%                                %%%%%%%%%%%                              %%%%     %%%%%%%%%     %%%%%%%%%     %%%%        \n"
                                                + //
                                                "      %%%%     %%%%%%%%%%%%%%%%%%%%                              %%%%%%%%%%%%%%%%%%                       %%%%          %%%%%%  %%%%%          %%%%        \n"
                                                + //
                                                "    %%%%%%%%   %%%%%%%%%%%%%%%%%%%%               "+ROJO+"|"+RESET+"              %%%%%%%%%%%%%%%%%%%%%%%%%         "+ROJO+"|"+RESET+"  %%%%%%%%%            %%%%%%%%%            %%%%%%%%%%  \n"
                                                + //
                                                "   %%%%%%%%%%   %%%%%%%%%%%%%%%%%%                "+ROJO+"|"+RESET+"              %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%%%%%%%              %%%%%              %%%%%%%%%%  \n"
                                                + //
                                                "   %%%%%%%%%%    %%%%%%%%%%%%%%%                  "+ROJO+"|"+RESET+"              %%%%%%     %%%%%%%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "    %%%%%%%%       %%%%%%%%%%%%                   "+ROJO+"|"+RESET+"              %%%%%%             %%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "      %%%%            %%%%%%                      "+ROJO+"|"+RESET+"              %%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "                                           %%%%%  "+ROJO+"|"+RESET+"              %%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%       %%%%%%%%%  "+ROJO+"|"+RESET+"              %%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%   %%%%%%%%%%%%  "+ROJO+"|"+RESET+"              %%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"         %%%%%%%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"   %%%%%%%%%%%%%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%%%%%%%%%%%%%%%%                    %%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+" %%%%%%%%%%%%%%%%%%%            %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+" %%%%%%%%%%%%%%%%%%%          %%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%%%%%%%%%%%%%%%         %%%%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"    %%%%%%%%%%%%           %%%%%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%               %%%               %%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"        %%%%               %%%%%%%%%%%%%%%%%%%  "+ROJO+"|"+RESET+"  %%%  %%%%%%%%%%%%       %%%       %%%%%%%%%%%%  %%%%  \n"
                                                + //
                                                "  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%    %%%%%%%%%%%                              %%%%%%%%%%%%%%%%%       %%%   %%%%%%%%%%%%%%%   %%%   %%%%%%%%%%%%%%%%  %%%%  \n"
                                                + // 
                                                "   %%%%%%%%%%%%%%%%%%%%%%%%%%%%%         %%%%%%%                                 %%%%%%%%%%%%         %%%             %%%%%%%%%%%%%%%%%%%             %%%%  \n"
                                                +
                                                "                                            %%%%                                     %%%%%            %%%          %%%  %%%%%%%%%%%%%%%  %%%          %%%%  \n"
                                                + //
                                                "                                                                                                                                                          \n"
                                                +
                                                "           " + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD
                                                + "P" + ArteAscii.RESET
                                                + "ELICULAS                                                   "
                                                + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "M"
                                                + ArteAscii.RESET
                                                + "USICA                                                  "
                                                + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "E"
                                                + ArteAscii.RESET + "BOOK                        \n" +
                                                "\n\t 🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺");
        }

        public static void imprimirPieContenido() {
                System.out.println(
                                ROJO + "     -------------------------------------------------------------------------------------------------------------------------------------------------"
                                                + RESET);
                System.out.println("     | " + VERDE + UNDERLINE + BOLD + "R" + RESET
                                + "eproducir | Guardar o quitar de " + VERDE + UNDERLINE + BOLD + "F" + RESET
                                + "avoritos | Guardar o quitar de " + VERDE + UNDERLINE + BOLD + "S" + RESET
                                + "eguir viendo\t\t\t\t\t\t\t" + VERDE + UNDERLINE + BOLD + "A"
                                + RESET + "trás");
                System.out.println(
                                ROJO
                                                + "     -------------------------------------------------------------------------------------------------------------------------------------------------"
                                                + RESET);
        }

        public static void imprimirPieListado() {
                System.out.println(
                                "\n"+ROJO+"     -------------------------------------------------------------------------------------------------------------------------------------------------" + RESET);
                System.out.println("       " + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "S"
                                + ArteAscii.RESET
                                + "eleccionar contenido ✏️ | Ordenar (" + ArteAscii.VERDE + ArteAscii.UNDERLINE
                                + ArteAscii.BOLD + "T"
                                + RESET + "itulo - " + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "P"
                                + RESET
                                + "untuación - " + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "F" + RESET
                                + "echa - "
                                + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "D" + RESET + "uración) 🔺🔻 | "
                                + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "B" + ArteAscii.RESET + "uscar 🔍 | \t\t\t\t\t"
                                + ArteAscii.VERDE
                                + ArteAscii.UNDERLINE
                                + ArteAscii.BOLD + "A" + ArteAscii.RESET + "trás 🔙");
                System.out.println(
                                ROJO + "     -------------------------------------------------------------------------------------------------------------------------------------------------" + RESET);

        }

        public static void imprimirPieUsuario() {
                System.out.println(ROJO+
                                "     -------------------------------------------------------------------------------------------------------------------------------------------------"+ RESET);
                System.out.println("       " + VERDE + UNDERLINE + BOLD + "F" + RESET
                                + "avoritos ❤️ | " + VERDE + UNDERLINE + BOLD + "S" + RESET + "eguir viendo 👓 |      \t\t\t\t\t\t\t\t\t" + VERDE
                                + UNDERLINE
                                + BOLD + "A" + RESET + "trás 🔙 | " + ArteAscii.VERDE+ArteAscii.UNDERLINE+"C"+ArteAscii.RESET+"errar sesión 📴");
                System.out.println(ROJO+
                                "     -------------------------------------------------------------------------------------------------------------------------------------------------"+RESET);

        }

        public static void imprimirPieReproduciendo() {
                System.out.println(
                                "     -------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("     | " + VERDE + UNDERLINE + BOLD + "R" + RESET
                                + "eanudar | " + VERDE + UNDERLINE + BOLD + "P" + RESET + "ausar | " + VERDE
                                + UNDERLINE
                                + BOLD + "S" + RESET + "alir");
                System.out.println(
                                "     -------------------------------------------------------------------------------------------------------------------------------------------------");

        }

        public static void imprimirPieBusqueda() {
                System.out.println(
                                "\n"+ROJO+"     -------------------------------------------------------------------------------------------------------------------------------------------------" + RESET);
                System.out.println("       " + ArteAscii.VERDE + ArteAscii.UNDERLINE + ArteAscii.BOLD + "S"
                                + ArteAscii.RESET
                                + "eleccionar contenido ✏️ | \t\t\t\t\t\t\t\t\t\t\t\t\t"
                                + ArteAscii.VERDE
                                + ArteAscii.UNDERLINE
                                + ArteAscii.BOLD + "A" + ArteAscii.RESET + "trás 🔙");
                System.out.println(
                                ROJO + "     -------------------------------------------------------------------------------------------------------------------------------------------------" + RESET);

        }

        public static void mensajeAviso(String texto){
                limpiarConsola();
                System.out.println("\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻🔻\n");
                System.out.println(texto);
                System.out.println("\n\t\t\t\t\t\t🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺🔺");
                try {
                        Thread.sleep(3000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}
