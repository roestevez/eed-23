package ejercicioCombinado1;//clase singlelton

import java.util.ArrayList;

public class GestorNotificaciones {
    private static GestorNotificaciones instacia;
    private ArrayList<IObservador> observadores;
    private GestorNotificaciones(){
        observadores =new ArrayList<>();
    }

    public static GestorNotificaciones getInstacia() {
        if(instacia==null){
            instacia= new GestorNotificaciones();
        }
        return instacia;
    }
    public void suscribir (IObservador observador){
        observadores.add(observador);
    }
    public void desuscribir(IObservador observador){
        observadores.remove(observador);
    }
    public void enviarNotificacion(String mensaje){
        for(IObservador observador:observadores){
            observador.recibirNotificacion(mensaje);
        }
    }
}
