package principal;

import domotica.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // a) Declaración y relleno de la tabla
        Dispositivo[] catalogo = {
            new AltavocesInteligentes("Alexa Echo", "Amazon", 59.99, "Alexa"),
            new LucesInteligentes("Hue Bulb", "Philips", 19.50, "Blanco Cálido"),
            new Termostatos("Nest Learning", "Google", 249.00, 21.5),
            new CamarasSeguridad("Arlo Pro", "Netgear", 180.00, "2K")
        };

        // b) Ordenar por precio y mostrar
        System.out.println("--- CATÁLOGO ORDENADO POR PRECIO ---");
        Arrays.sort(catalogo);
        for (Dispositivo d : catalogo) System.out.println(d);

        // c) Recorrido y acciones específicas
        System.out.println("\n--- PROCESANDO DISPOSITIVOS ---");
        for (Dispositivo d : catalogo) {
            try {
                d.encender();
                System.out.println("Encendiendo: " + d.getClass().getSimpleName());

                if (d instanceof AltavocesInteligentes) {
                    AltavocesInteligentes a = (AltavocesInteligentes) d;
                    a.subir(); a.subir();
                    System.out.println("Asistente: " + a.getAsistente());
                } 
                else if (d instanceof LucesInteligentes) {
                    LucesInteligentes l = (LucesInteligentes) d;
                    l.subir();
                    l.setColor("Azul Neón");
                } 
                else if (d instanceof Termostatos) {
                    Termostatos t = (Termostatos) d;
                    t.cambiarModo();
                    t.activarAlerta("Temperatura inusual");
                } 
                else if (d instanceof CamarasSeguridad) {
                    CamarasSeguridad c = (CamarasSeguridad) d;
                    c.iniciarGrabacion();
                    c.activarAlerta("Movimiento detectado");
                }
                
                System.out.println("Resultado: " + d);
            } catch (DispositivoApagadoException e) {
                System.err.println(e.getMessage());
            }
        }

        // d) Caso de error forzado (Altavoz apagado)
        System.out.println("\n--- PRUEBA DE ERROR FORZADO ---");
        AltavocesInteligentes testAltavoz = new AltavocesInteligentes("Prueba", "Marca", 10.0, "Siri");
        testAltavoz.apagar();
        try {
            testAltavoz.subir();
        } catch (DispositivoApagadoException e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}