//
//	 PAQUETE 1: domotica --> modelo de la aplicación
//	 ---------------------------------------------------------------------
//	 		<<abstract>> DispositivosInteligentes
//	 ---------------------------------------------------------------------
//	 # nombreComercial: String
//	 # percio         : double
//	 # encendido      : boolean // apagado o encendido
//
//	 ---------------------------------------------------------------------
//	 + DispositivosInteligentes(nombreComercial, percio, encendido)
//	 + encender ()     :  void
//	 + apagar ()       : void
//	 + isEncendido ()  : boolean
//	 + equals (Object) : boolean
//	 + toString ()     : String
//	 ---------------------------------------------------------------------
//	 		 
//	 		
//	 ---------------------------------------------------------------------
//	 			AltavocesInteligentes
//	 ---------------------------------------------------------------------
//	 - nombreAsistente: String
//	 - volumen        : int=30
//	 ---------------------------------------------------------------------
//	 + AltavocesInteligentes (nombreAsistente, volumen)
//	 + subir()              : void
//	 + bajar()              : void
//	 + getAsistente()       : String
//	 + setAsistente(String) : void
//	 + toString()           : String 
//	 ---------------------------------------------------------------------
//	 Hereda: Dispositivo
//	 Implementa: Ajustable
//	 ---------------------------------------------------------------------
//
//	 ---------------------------------------------------------------------
//	 			LucesInteligentes
//	 ---------------------------------------------------------------------
//	 - color   : String
//	 - brillo  : int = 50
//	 ---------------------------------------------------------------------
//	 + LucesInteligentes (color, brillo)
//	 + subir()          : void
//	 + bajar()          : void
//	 + setColor(String) : void
//	 + getColor()       : String
//	 + toString()       : String
//	 ---------------------------------------------------------------------
//	 Hereda: Dispositivo
//	 Implementa: Ajustable
//	 ---------------------------------------------------------------------
//
//	 ---------------------------------------------------------------------
//	 			Termostatos
//	 ---------------------------------------------------------------------
//	 - temperaturaObjetivo: double
//	 - modo               : String
//	 - alertaActiva       : boolean
//	 - mensajeAlerta      : String
//	 ---------------------------------------------------------------------
//	 + cambiarModo() : void
//	 + activarAlerta(String) : void
//	 + desactivarAlerta() : void
//	 + hayAlerta() : boolean
//	 + toString() : String
//	 ---------------------------------------------------------------------
//	 Hereda: Dispositivo
//	 Implementa: Alertable
//	 ---------------------------------------------------------------------
//
//	 ---------------------------------------------------------------------
//	 			CamarasDeSeguridad
//	 ---------------------------------------------------------------------
//	 - resolucion     : String
//	 - grabando       : boolean
//	 - alertaActiva   : boolean
//	 - mensajeAlerta  : String
//	 ---------------------------------------------------------------------
//	 + iniciarGrabacion() : void
//	 + detenerGrabacion() : void
//	 + activarAlerta(String) : void
//	 + desactivarAlerta() : void
//	 + hayAlerta() : boolean
//	 + toString() : String
//	 ---------------------------------------------------------------------
//	 Hereda: Dispositivo
//	 Implementa: Alertable
//	 ---------------------------------------------------------------------
//
//	 			INTERFACES
//	 ---------------------------------------------------------------------
//	 			Ajustable
//	 ---------------------------------------------------------------------
//	 + subir(): void
//	 + bajar(): void
//	 ---------------------------------------------------------------------
//
//	 ---------------------------------------------------------------------
//	 			Alertable
//	 ---------------------------------------------------------------------
//	 + activarAlerta(String mensaje): void
//	 + desactivarAlerta()           : void
//	 + hayAlerta()                  : boolean
//	 ---------------------------------------------------------------------
//
//	 			EXCEPCIÓN
//	 ---------------------------------------------------------------------
//	 DispositivoApagadoExcepcion
//	 ---------------------------------------------------------------------
//	 + DispositivoApagadoExcepcion(String mensaje)
//	 ---------------------------------------------------------------------
//
//
//
//
//	 		PAQUETE 2: principal --> programa principal
//	 ---------------------------------------------------------------------
//	 Main
//	 ---------------------------------------------------------------------
//
