package domotica;

/**
 * Cámara de seguridad con grabación y alertas.
 */
public class CamarasSeguridad extends Dispositivo implements Alertable {

    private String resolucion;
    private boolean grabando;
    private boolean alertaActiva;
    private String mensajeAlerta;

    public CamarasSeguridad(String nombre, String marca, double precio, String resolucion) {
        super(nombre, marca, precio);
        this.resolucion = resolucion;
    }

    public void iniciarGrabacion() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        grabando = true;
    }

    public void detenerGrabacion() {
        grabando = false;
    }

    @Override
    public void activarAlerta(String mensaje) throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        alertaActiva = true;
        mensajeAlerta = mensaje;
    }

    @Override
    public void desactivarAlerta() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        alertaActiva = false;
        mensajeAlerta = null;
    }

    @Override
    public boolean hayAlerta() {
        return alertaActiva;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Resolución: " + resolucion +
                ", Grabando: " + grabando +
                ", Alerta: " + alertaActiva +
                ", Mensaje: " + mensajeAlerta;
    }
}