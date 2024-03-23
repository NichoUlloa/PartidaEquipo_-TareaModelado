package modelo;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    // Atributos
    private String nombreEquipo;
    //capitan con tipo jugador
    private Jugador NombreCapitan;
    private List<Jugador> jugadores;

    // Constructor
    public Equipo(String nombreEquipo, Jugador NombreCapitan) {
        this.nombreEquipo = nombreEquipo;
        this.NombreCapitan = NombreCapitan;
    }

    // Getters y Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Jugador getNombreCapitan() {
        return NombreCapitan;
    }
    public void setNombreCapitan(Jugador NombreCapitan) {
        this.NombreCapitan = NombreCapitan;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    // metodo agregar jugador
    public void agregarJugador(Jugador jugador){
        if (jugadores == null) {
            jugadores = new ArrayList<>();
        }
        jugadores.add(jugador);
    }

    // metodo eliminar jugador
    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }
    // metodo buscar jugador por run
    public void buscarJugador(String run){
        for (Jugador jugador : jugadores) {
            if (jugador.getRun().equals(run)) {
                System.out.println(jugador);
            }
        }
    }

    // metodo mostrar equipo
    public void mostrarEquipo(){
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Capitan: " + NombreCapitan);
        System.out.println("Jugadores: ");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
