package ejercicioCombinado4;

public class Main {
    public static void main(String[] args) {
        //CREA INSTANCIA
        SistemaMonitoreo sistema = SistemaMonitoreo.getInstacia();

        //CREAR EMPLEADOS Y SUSCRIBIRLOS AL SISTEMA DE MONITOREO
        Empleado empleado1 = new Empleado("empleado1");
        Empleado empleado2 =new Empleado("empleado2");
        sistema.suscribir(empleado2);
        sistema.suscribir(empleado1);
        // SIMULAR ALERTAS DE SENSORES

        sistema.actualizar("sensor de temperatura", 30.5);
        sistema.actualizar("sensor de humedad",80.0);
        sistema.actualizar("sensor de presion",100.2);




    }
}
