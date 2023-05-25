package ejercicioCombinado1;

import ejercicioCombinado1.IObservador;

public class Usuario implements IObservador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.println(nombre + " ha recibido una notificacion" + mensaje);

    }
}
