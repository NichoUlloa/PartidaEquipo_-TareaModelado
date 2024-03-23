package modelo;
public enum TipoArbitro {
    PRINCIPAL("Principal"), ASISTENTE("Asistente");

    private String tipoArbitro;

    private TipoArbitro(String tipoArbitro) {
        this.tipoArbitro = tipoArbitro;
    }

    public String getTipoArbitro() {
        return tipoArbitro;
    }

    public void setTipoArbitro(String tipoArbitro) {
        this.tipoArbitro = tipoArbitro;
    }
}
