package ejercicioCombinado2;

import java.util.ArrayList;

public class SensorTemperatura {
    private static SensorTemperatura instancia;
    private ArrayList<IObservador1>observadores;
    private double temperatura;
    private SensorTemperatura(){
        observadores= new ArrayList<>();
    }
    public static SensorTemperatura getInstance(){
        if(instancia == null){
            instancia= new SensorTemperatura();
        }
        return instancia;
    }
    private void notificarObservadores(){
        for(IObservador1 observador1 : observadores){
            observador1.actualizarTemperatura(temperatura);
        }
    }
    public void suscribir(IObservador1 observador1){
        observadores.add(observador1);
    }
    public void desuscribir(IObservador1 observador1){
        observadores.remove(observador1);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
}
