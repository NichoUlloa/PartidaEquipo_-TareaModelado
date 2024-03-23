package modelo;
public enum TipoJugador {
    CAPITAN("Capitan"), JUGADOR("Jugador");

    private String tipoJugador;

    private TipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public String getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(String tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    @Override
    public String toString() {
        return tipoJugador;
    }
}
