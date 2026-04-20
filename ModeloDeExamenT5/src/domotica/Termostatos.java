package domotica;

/**
 * Termostato con control de temperatura y alertas.
 */
public class Termostatos extends Dispositivo implements Alertable {

    private double temperaturaObjetivo;
    private String modo = "ECO";
    private boolean alertaActiva;
    private String mensajeAlerta;

    public Termostatos(String nombre, String marca, double precio, double temp) {
        super(nombre, marca, precio);
        this.temperaturaObjetivo = temp;
    }

    public void cambiarModo() {
        modo = modo.equals("ECO") ? "CONFORT" : "ECO";
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
                ", Temp objetivo: " + temperaturaObjetivo +
                ", Modo: " + modo +
                ", Alerta: " + alertaActiva +
                ", Mensaje: " + mensajeAlerta;
    }
}