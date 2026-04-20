package domotica;	

	/**
	 * Interfaz para dispositivos con sistema de alertas.
	 */
	public interface Alertable {
	    void activarAlerta(String mensaje) throws DispositivoApagadoException;
	    void desactivarAlerta() throws DispositivoApagadoException;
	    boolean hayAlerta();
	}

