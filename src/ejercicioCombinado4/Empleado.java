package ejercicioCombinado4;

public class Empleado implements Oberver{
    private String nombre;
    public Empleado(String nombre){
        this.nombre=nombre;

    }

    @Override
    public void actualizar(String sensor, double valor) {
        System.out.println(nombre+ " recicio una alerta del sensor " + sensor);

    }
}
