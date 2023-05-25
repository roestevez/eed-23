package ejercicioCombinado3;

public class Main {
    public static void main(String[] args) {
        SistemaNotificaciones notificador= SistemaNotificaciones.getInstance();
        Usuario usuario1 = new Usuario(" jose placido martinez ");
        Usuario usuario2 = new Usuario(" Rosana Estevez Gayoso ");
        notificador.Suscribir(usuario2);
        notificador.Suscribir(usuario1);
        notificador.NotificarMensaje(" Tienes un mensaje ");
        notificador.NotificarMensaje(" mas mensajes ");
        notificador.desuscribir(usuario2);
        notificador.NotificarMensaje(" BOMBARDEO ");

    }

    }
