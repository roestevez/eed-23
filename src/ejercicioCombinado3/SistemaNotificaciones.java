package ejercicioCombinado3;

import ejercicioCombinado1.GestorNotificaciones;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SistemaNotificaciones {
    private static SistemaNotificaciones instancia;
    private ArrayList<IObserver2> observadores;
     private SistemaNotificaciones(){
         observadores= new ArrayList<>();
     }
     public static SistemaNotificaciones getInstance(){
         if(instancia==null){
             instancia= new SistemaNotificaciones();
         }
         return instancia;
     }
     public void Suscribir(IObserver2 observer2){
         observadores.add(observer2);
     }
     public void desuscribir(IObserver2 observer2){
         observadores.remove(observer2);
     }
     public void NotificarMensaje(String mensaje){
         for(IObserver2 observer2 : observadores){
             observer2.NotificarMensaje(mensaje);
         }
     }
}
