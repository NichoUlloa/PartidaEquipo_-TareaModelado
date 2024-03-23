package modelo;
public class Jugador extends Persona{
    private String posicion;
    private TipoJugador tipoJugador;
    private int numeroCamiseta;

    // Constructor
    public Jugador(String nombre, String apellido, int edad, String nacionalidad, String run, String posicion, TipoJugador tipoJugador, int numeroCamiseta) {
        super(nombre, apellido, edad, nacionalidad, run);
        this.posicion = posicion;
        this.tipoJugador = tipoJugador;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Getters y Setters
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public TipoJugador getTipoJugador() {
        return tipoJugador;
    }
    public void setTipoJugador(TipoJugador tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Posicion: " + posicion + "\n" +
                "Tipo de Jugador: " + tipoJugador + "\n" +
                "Numero de Camiseta: " + numeroCamiseta + "\n";
    }
}
