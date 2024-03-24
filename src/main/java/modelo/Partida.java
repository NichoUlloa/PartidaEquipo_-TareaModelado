package modelo;
public class Partida {
    // Atributos
    private String fecha;
    private String lugar;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitro;

    // Constructor
    public Partida(String fecha, String lugar, Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitro) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
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
        return equipoLocal;
    }
    public void setEquipo(Equipo equipo) {
        this.equipoLocal = equipo;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }
    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    //metodo mostrar datos de la partida
    public void mostrarPartida(){
        System.out.println("Fecha: " + fecha + "\n" +
                "Lugar: " + lugar + "\n" +
                "Equipo Local: " + equipoLocal.getNombreEquipo() + "\n" +
                "Equipo Visitante: " + equipoVisitante.getNombreEquipo() + "\n" +
                "Arbitro: " + arbitro.getNombre() + " " + arbitro.getApellido() + "\n");
    }
}
