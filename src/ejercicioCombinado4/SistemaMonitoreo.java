package ejercicioCombinado4;

import java.util.ArrayList;

public class SistemaMonitoreo {
    private static SistemaMonitoreo instancia;
    private ArrayList<Oberver>observadores;
    private SistemaMonitoreo(){
        observadores= new ArrayList<>();
    }
    public static SistemaMonitoreo getInstacia(){
        if (instancia== null) {
            instancia= new SistemaMonitoreo();
        }
        return instancia;


    }

    public void suscribir(Oberver oberver){
        observadores.add(oberver);
    }
    public void actualizar(String sensor,double valor){
        for(Oberver oberver: observadores){
            oberver.actualizar(sensor,valor);
        }
    }
}
