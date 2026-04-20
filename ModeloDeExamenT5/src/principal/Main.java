package principal;

import domotica.*;

import java.util.Arrays;

/**
 * Programa principal del sistema domótico.
 */
public class Main {

    public static void main(String[] args) {

        Dispositivo[] dispositivos = new Dispositivo[4];

        dispositivos[0] = new AltavocesInteligentes("Echo", "Amazon", 99.99, "Alexa");
        dispositivos[1] = new LucesInteligentes("Luz LED", "Philips", 49.99, "Blanco");
        dispositivos[2] = new Termostatos("Nest", "Google", 129.99, 22);
        dispositivos[3] = new CamarasSeguridad("Cam Pro", "Xiaomi", 79.99, "4K");

        // Ordenar por precio
        Arrays.sort(dispositivos);

        System.out.println("=== ORDENADOS POR PRECIO ===");
        for (Dispositivo d : dispositivos) {
            System.out.println(d);
        }

        System.out.println("\n=== OPERACIONES ===");

        for (Dispositivo d : dispositivos) {
            try {
                d.encender();

                if (d instanceof AltavocesInteligentes) {
                	AltavocesInteligentes a = (AltavocesInteligentes) d;
                    a.subir();
                    a.subir();
                    System.out.println("Asistente: " + a.getAsistente());
                }

                if (d instanceof LucesInteligentes) {
                	LucesInteligentes l = (LucesInteligentes) d;
                    l.subir();
                    l.setColor("Azul");
                }

                if (d instanceof Termostatos) {
                    Termostatos t = (Termostatos) d;
                    t.cambiarModo();
                    t.activarAlerta("Temperatura crítica");
                }

                if (d instanceof CamarasSeguridad) {
                    CamarasSeguridad c = (CamarasSeguridad) d;
                    c.iniciarGrabacion();
                    c.activarAlerta("Movimiento detectado");
                }

                System.out.println(d);

            } catch (DispositivoApagadoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n=== PRUEBA DE ERROR ===");

        try {
            AltavocesInteligentes alt = new AltavocesInteligentes("Mini", "Amazon", 50, "Alexa");
            alt.apagar();
            alt.subir();
        } catch (DispositivoApagadoException e) {
            System.out.println(e.getMessage());
        }
    }
}
