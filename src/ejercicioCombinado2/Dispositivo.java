package ejercicioCombinado2;

public class Dispositivo implements IObservador1{
    private String nombre;
    private static final double LIMITE_SUPERIOR = 30.0;
    private static final double LIMITE_INFERIOR = 10.0;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizarTemperatura(double temperatura) {
        System.out.println(nombre + " recibió una actualización de temperatura: " + temperatura);

        if (temperatura > LIMITE_SUPERIOR) {
            System.out.println("¡Alerta! La temperatura excede el límite superior.");
            // Realizar acciones adicionales, como enviar una notificación o activar una alarma.
            // ...
        } else if (temperatura < LIMITE_INFERIOR) {
            System.out.println("¡Alerta! La temperatura está por debajo del límite inferior.");
            // Realizar acciones adicionales, como ajustar la calefacción o enviar una advertencia.
            // ...
        } else {
            System.out.println("La temperatura está dentro de los límites aceptables.");
        }
    }

}
