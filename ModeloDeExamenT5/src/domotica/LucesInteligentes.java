package domotica;

/**
 * Luz inteligente con control de brillo y color.
 */
public class LucesInteligentes extends Dispositivo implements Ajustable {

    private String color;
    private int brillo = 50;

    public LucesInteligentes(String nombre, String marca, double precio, String color) {
        super(nombre, marca, precio);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void subir() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        brillo = Math.min(100, brillo + 10);
    }

    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!isEncendido()) {
            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
        }
        brillo = Math.max(0, brillo - 10);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Color: " + color +
                ", Brillo: " + brillo;
    }
}