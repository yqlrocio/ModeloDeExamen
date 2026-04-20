package domotica;

/**
 * Altavoz inteligente con control de volumen.
 */
public class AltavocesInteligentes extends Dispositivo implements Ajustable {

    private String asistente;
    private int volumen = 30;

    public AltavocesInteligentes(String nombre, String marca, double precio, String asistente) {
        super(nombre, marca, precio);
        this.asistente = asistente;
    }

    public String getAsistente() {
        return asistente;
    }

    @Override
    public void subir() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        volumen = Math.min(100, volumen + 5);
    }

    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        volumen = Math.max(0, volumen - 5);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Asistente: " + asistente +
                ", Volumen: " + volumen;
    }
}