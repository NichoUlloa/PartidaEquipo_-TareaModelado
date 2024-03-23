package modelo;
public class Partida {
    // Atributos
    private String fecha;
    private String lugar;
    private Equipo equipo;
    private Arbitro arbitro;

    // Constructor
    public Partida(String fecha, String lugar, Equipo equipo, Arbitro arbitro) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.equipo = equipo;
        this.arbitro = arbitro;
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + "\n" +
                "Lugar: " + lugar + "\n" +
                "Equipo: " + equipo + "\n" +
                "Arbitro: " + arbitro + "\n";
    }
}
