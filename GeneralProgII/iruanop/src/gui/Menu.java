

    package gui;

import exceptions.DatoIncorrectoException;
import static java.lang.System.exit;
import model.escenarios.Escenario;
import model.escenarios.SanctumSanctorum;
import model.escenarios.StarkTower;
import model.escenarios.XaviersSchoolForGiftedYoungsters;
import model.jugador.Jugador;
import model.jugador.Organizaciones;
import model.partida.Partida;
import utils.Utils;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Menu {

    public static void main(String args[]) {



        System.out.println("\n DOCTOR STRANGE MARVEL \n");
        System.out.println("\n COMIENZA EL JUEGO \n");

        System.out.println("\n ESCOJA UNA OPCIÓN: \n");

        System.out.println("\n 1. SELECCIÓN DE ESCENARIO Y CONFIGURACIÓN DEL JUGADOR \n");
        System.out.println("\n 2. COMPRA DE SUPERHÉROES \n");

        int opcion = Utils.leerEntero();

        switch (opcion) {

            case 1:
        }

    }
    public static Partida configuracionJugadores() {

        boolean r = true;
        boolean s = true;
        Jugador j1 = null;
        Jugador j2 = null;

        System.out.println("CONFIGURACION JUGADOR 1");

        System.out.println("\n");
        String nombrej1 = Utils.leerCadena("¿Como te quieres llamar?");

        while (r) {

            try {

                System.out.println(" A que organización quieres pertenecer ");
                System.out.println("  A FORCE, AVENGERS, MERCS FOR MONEY, LEAGUE OF REALMS, STRANGE ACADEMY, X MEN");
                int opcion = Utils.leerEntero();
                switch (opcion) {

                    case 1:

                        j1 = new Jugador(nombrej1, Organizaciones.A_FORCE);

                        break;

                    case 2:

                        j1 = new Jugador(nombrej1, Organizaciones.AVENGERS);

                        break;

                    case 3:

                        j1 = new Jugador(nombrej1, Organizaciones.MERCS_FOR_MONEY);

                        break;
                    case 4:

                        j1 = new Jugador(nombrej1, Organizaciones.LEAGUE_OF_REALMS);

                        break;
                    case 5:

                        j1 = new Jugador(nombrej1,Organizaciones.STRANGE_ACADEMY);

                        break;
                    case 6:

                        j1 = new Jugador(nombrej1, Organizaciones.AVENGERS);

                        break;


                }

                r = false;

            } catch (Exception ex) {

                System.out.println(ex);

            }

        }

        System.out.println("\nCONFIGURACION JUGADOR 2\n");
        String nombrej2 = Utils.leerCadena("¿Como te quieres llamar?");

        while (s) {

            try {

                System.out.println(" A que organización quieres pertenecer ");
                System.out.println("  A FORCE, AVENGERS, MERCS FOR MONEY, LEAGUE OF REALMS, STRANGE ACADEMY, X MEN");
                int opcion = Utils.leerEntero();
                switch (opcion) {

                    case 1:

                        j1 = new Jugador(nombrej2, Organizaciones.A_FORCE);

                        break;

                    case 2:

                        j1 = new Jugador(nombrej2, Organizaciones.AVENGERS);

                        break;

                    case 3:

                        j1 = new Jugador(nombrej2, Organizaciones.MERCS_FOR_MONEY);

                        break;
                    case 4:

                        j1 = new Jugador(nombrej2, Organizaciones.LEAGUE_OF_REALMS);

                        break;
                    case 5:

                        j1 = new Jugador(nombrej2,Organizaciones.STRANGE_ACADEMY);

                        break;
                    case 6:

                        j1 = new Jugador(nombrej2, Organizaciones.AVENGERS);

                        break;


                }

                s = false;

            } catch (Exception ex) {

                System.out.println(ex);

            }

        }

        if (j1.getOrganizacion() == j2.getOrganizacion()) {

            System.out.println(" Ambos jugadores pertenecen al mismo equipo ");

            exit(0);

        }

        Partida p = new Partida(j1, j2, null);

        return p;

    }

        private static String informacionEscenario() {

        Escenario e1 = new SanctumSanctorum();

        Escenario e2 = new StarkTower();

        Escenario e3 = new XaviersSchoolForGiftedYoungsters();


        return "\n 1 - " + e1.toString() + "\n 2 - " + e2.toString() + "\n 3 - "
                + e3.toString() + "\n ";

    }

         private static void elegirEscenario(Partida p) {

        boolean s = true;

        while (s) {

            try {

                System.out.println("Selecciona un escenario");

                System.out.println(informacionEscenario());

                int o = Utils.leerEntero();

                switch (o) {

                    case 1:

                        p.setEscenario(new SanctumSanctorum());
                        System.out.println("La batalla se disputara en : " + p.getEscenario());
                        p.getJugador1().anadirMonedas(p.getEscenario().getMonedasIniciales());
                        p.getJugador2().anadirMonedas(p.getEscenario().getMonedas());
                        System.out.println("\nSe les añadieron " + p.getEscenario().getMonedas() + " monedas a ambos jugadores\n");
                        break;

                    case 2:

                        p.setEscenario(new StarkTower());
                        System.out.println("La batalla se disputara en : " + p.getEscenario());
                        p.getJugador1().anadirMonedas(p.getEscenario().getMonedas());
                        p.getJugador2().anadirMonedas(p.getEscenario().getMonedas());
                        System.out.println("\nSe les añadieron " + p.getEscenario().getMonedas() + " monedas a ambos jugadores\n");
                        break;

                    case 3:

                        p.setEscenario(new XaviersSchoolForGiftedYoungsters());
                        System.out.println("La batalla se disputara en : " + p.getEscenario());
                        p.getJugador1().anadirMonedas(p.getEscenario().getMonedas());
                        p.getJugador2().anadirMonedas(p.getEscenario().getMonedas());
                        System.out.println("\nSe les añadieron " + p.getEscenario().getMonedas() + " monedas a ambos jugadores\n");
                        break;

                    default:

                        throw new DatoIncorrectoException("Dato introducido erroneo");

                }
                s = false;
            } catch (DatoIncorrectoException dex) {

                System.out.println("Dato introducido erroneo");

            }
        }
    }
         public static void conf_equipo (Jugador j){

        boolean out = true;

        while (out){

        if (null != j.getOrganizacion())switch (j.getOrganizacion()) {

            case AVENGERS:

                menuEscogerSph(j);

                break;

            case A_FORCE:

                menuEscogerSph(j);

                break;

            case LEAGUE_OF_REALMS:

                menuEscogerSph(j);

                break;

            case MERCS_FOR_MONEY:

                menuEscogerSph(j);

                break;

            case STRANGE_ACADEMY:

                menuEscogerSph(j);

                break;

            case X_MEN:

                menuEscogerSph(j);

                break;

            default:
                break;
        }

       }

    }

        public static String menuEscogerSph(Jugador j) {

        if (j.getOrganizacion() == Organizaciones.AVENGERS) {

            return "¿Que superheroe quieres añadir a tu equipo? \n 1-IRON MAN "
                    + "\n 2-CAPITAN AMERICA \n 3-BLACK WIDOW \n 4-HULK \n\n"
                    + "\n 5- Acabe de configurar mi equipo";

        } else if (j.getOrganizacion() == Organizaciones.A_FORCE) {

             return "¿Que superheroe quieres añadir a tu equipo? \n 1-CAPITAIN MARVEL "
                    + "\n 2- SHE HULK\n\n"
                    + "\n 3- Acabe de configurar mi equipo";

        }else if (j.getOrganizacion() == Organizaciones.LEAGUE_OF_REALMS) {

              return "¿Que superheroe quieres añadir a tu equipo? \n 1-SPIDERMAN "
                    + "\n 2-THOR  \n 3-HUNTER ANGEL \n\n"
                    + "\n 4- Acabe de configurar mi equipo";

        }else if (j.getOrganizacion() == Organizaciones.MERCS_FOR_MONEY) {

                 return "¿Que superheroe quieres añadir a tu equipo? \n 1- DOMINO "
                    + "\n 2- DEADPOOL\n\n"
                    + "\n 3- Acabe de configurar mi equipo";

        }else if (j.getOrganizacion() == Organizaciones.STRANGE_ACADEMY) {

                 return "¿Que superheroe quieres añadir a tu equipo? \n 1- DR STRANGE "
                    + "\n 2- SCARLET WITCH\n\n"
                    + "\n 3- Acabe de configurar mi equipo";

        }else if (j.getOrganizacion() == Organizaciones.X_MEN) {

            return "¿Que superheroe quieres añadir a tu equipo? \n 1-MAGNETO "
                    + "\n 2-WOLVERINE \n 3-MARVEL GIRL \n 4-STORM \n\n"
                    + "\n 5- Acabe de configurar mi equipo";

        }

        return null;
        }

}






