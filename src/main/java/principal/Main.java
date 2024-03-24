package principal;
import modelo.*;

public class Main {
    public static void main(String[] args) {

        // Crear Arbitro
        Arbitro arbitro = new Arbitro("Nombre1", "Apellido1", 35, "Chileno", "12345678-9", TipoArbitro.PRINCIPAL);

        // Crear el capitán del equipo
        Jugador capitan = new Jugador("Nombre2", "Apellido2", 25, "Chileno", "12345678-4", "Delantero", TipoJugador.CAPITAN, 10);

        // Crear jugadores locales
        Jugador jugador1 = new Jugador("Nombre3", "Apellido3", 25, "Chileno", "12345678-5", "Defensa", TipoJugador.JUGADOR, 5);
        Jugador jugador2 = new Jugador("Nombre4", "Apellido4", 25, "Chileno", "12345678-6", "Mediocampista", TipoJugador.JUGADOR, 7);
        Jugador jugador3 = new Jugador("Nombre5", "Apellido5", 25, "Chileno", "12345678-7", "Delantero", TipoJugador.JUGADOR, 9);

        // Crear Equipo local
        Equipo equipo1 = new Equipo("Equipo1", capitan);

        // Uso de metodo agregarJugador
        equipo1.agregarJugador(jugador1);
        equipo1.agregarJugador(jugador2);
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(capitan);

        // Crear jugadores visitantes
        Jugador jugador4 = new Jugador("Nombre6", "Apellido6", 25, "Chileno", "12345678-8", "Defensa", TipoJugador.JUGADOR, 5);
        Jugador jugador5 = new Jugador("Nombre7", "Apellido7", 25, "Chileno", "12345678-9", "Mediocampista", TipoJugador.JUGADOR, 7);
        Jugador jugador6 = new Jugador("Nombre8", "Apellido8", 25, "Chileno", "12345678-0", "Delantero", TipoJugador.JUGADOR, 9);
        Jugador capitan2 = new Jugador("Nombre9", "Apellido9", 25, "Chileno", "12345678-1", "Delantero", TipoJugador.CAPITAN, 10);

        // Crear Equipo visitante
        Equipo equipo2 = new Equipo("Equipo2", capitan);

        // Uso de metodo agregarJugador
        equipo2.agregarJugador(jugador4);
        equipo2.agregarJugador(jugador5);
        equipo2.agregarJugador(jugador6);
        equipo2.agregarJugador(capitan2);

        // Uso de metodo eliminarJugador
        equipo1.eliminarJugador(jugador1);

        // Uso de metodo buscarJugador
        System.out.println("== Buscando jugador con run 12345678-7 ==");
        equipo1.buscarJugador("12345678-7");

        // Uso de metodo mostrarEquipo
        System.out.println("== Mostrando equipo ==");
        equipo1.mostrarEquipo();

        // Crear Partida
        Partida partido = new Partida("01/01/2021", "Estadio Nacional", equipo1, equipo2, arbitro);

        // Uso de metodo mostrarPartida
        System.out.println("== Mostrando Partida ==");
        partido.mostrarPartida();


    }
}
