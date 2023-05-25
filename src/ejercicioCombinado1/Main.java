package ejercicioCombinado1;

import ejercicioCombinado1.GestorNotificaciones;

public class Main {
    public static void main(String[] args) {
       GestorNotificaciones gestor = GestorNotificaciones.getInstacia();
       Usuario usuario1 = new Usuario(" Juan Rodrigo ");
       Usuario usuario2 = new Usuario(" Pepa gonzalez ");
       gestor.suscribir(usuario2);
       gestor.suscribir(usuario1);
       gestor.enviarNotificacion(" nuevas ofertas en tienda, solo por dias limitados ");
       gestor.desuscribir(usuario1);
       gestor.enviarNotificacion(" Iphone por solo 10 centimos ");
    }
}