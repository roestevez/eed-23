package ejercicioCombinado3;

public class Usuario implements IObserver2{
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void NotificarMensaje(String mensaje) {
        System.out.println(nombre+ "ha recibido una notificacion"+ mensaje);


    }
}
