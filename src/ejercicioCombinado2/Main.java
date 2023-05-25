package ejercicioCombinado2;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = SensorTemperatura.getInstance();
        Dispositivo dispositivo1 = new Dispositivo("radiador cocina");
        Dispositivo dispositivo2 = new Dispositivo("radiador banho");
        sensor.suscribir(dispositivo1);
        sensor.suscribir(dispositivo2);
        sensor.setTemperatura(25.5);
        sensor.setTemperatura(32.0);
        sensor.desuscribir(dispositivo1);
        sensor.setTemperatura(9.0);
    }
}
