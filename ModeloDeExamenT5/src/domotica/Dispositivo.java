package domotica;

	/**
	 * Clase base de todos los dispositivos inteligentes.
	 */
	public abstract class Dispositivo implements Comparable<Dispositivo> {

	    private String nombreComercial;
	    private String marca;
	    private double precio;
	    private boolean encendido;

	    public Dispositivo(String nombreComercial, String marca, double precio) {
	        this.nombreComercial = nombreComercial;
	        this.marca = marca;
	        this.precio = precio;
	        this.encendido = false;
	    }

	    public void encender() {
	        this.encendido = true;
	    }

	    public void apagar() {
	        this.encendido = false;
	    }

	    public boolean isEncendido() {
	        return encendido;
	    }

	    public String getNombreComercial() {
	        return nombreComercial;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    /**
	     * Compara dos dispositivos por su precio, es decir, compara dos números.
	     * 
	     * @param o dispositivo con el que se compara
	     * @return valor negativo si este dispositivo es más barato,
	     *         0 si tienen el mismo precio,
	     *         valor positivo si este dispositivo es más caro
	     */
	    @Override
	    public int compareTo(Dispositivo o) {
	        return Double.compare(this.precio, o.precio);
	    }

	    /**
	     * Compara dos dispositivos. Se consideran iguales si tienen
	     * el mismo nombre comercial y la misma marca.
	     * 
	     * @param obj objeto a comparar
	     * @return true si son iguales, false en caso contrario
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Dispositivo)) return false;

	        Dispositivo d = (Dispositivo) obj;
	        return nombreComercial.equals(d.nombreComercial) &&
	               marca.equals(d.marca);
	    }

	    /**
	     * Devuelve una representación en forma de cadena del dispositivo
	     * con la información básica.
	     * 
	     * @return cadena con el nombre comercial, marca, precio y estado (encendido/apagado)
	     */
	    @Override
	    public String toString() {
	        return "Nombre: " + nombreComercial +
	                ", Marca: " + marca +
	                ", Precio: " + precio +
	                ", Estado: " + (encendido ? "Encendido" : "Apagado");
	    }
	}
