package modelo;
public class Arbitro extends Persona {
    private TipoArbitro tipoArbitro;

    // Constructor
    public Arbitro(String nombre, String apellido, int edad, String nacionalidad, String run, TipoArbitro tipoArbitro) {
        super(nombre, apellido, edad, nacionalidad, run);
        this.tipoArbitro = tipoArbitro;
    }

    // Getters y Setters
    public TipoArbitro getTipoArbitro() {
        return tipoArbitro;
    }
    public void setTipoArbitro(TipoArbitro tipoArbitro) {
        this.tipoArbitro = tipoArbitro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de modelo.Arbitro: " + tipoArbitro + "\n";
    }
}
