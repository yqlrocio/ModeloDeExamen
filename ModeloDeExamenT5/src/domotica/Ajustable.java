package domotica;

	/**
	 * Interfaz para dispositivos que pueden subir y bajar niveles, es decir, para altavoces inteligentes y luces inteligentes.
	 */
	public interface Ajustable {
	    void subir() throws DispositivoApagadoException;
	    void bajar() throws DispositivoApagadoException;
	}

