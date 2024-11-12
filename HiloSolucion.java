import Ejercicio5_PSP.Cuenta;
import Ejercicio5_PSP.Trasferencia;

public class HiloSolucion {
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private String nombre;


    public Hilo(Cuenta cuentaOrigen, Cuenta cuentaDestino, String nombre) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.nombre = nombre;
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            boolean exito = TrasferenciaSolucion.transferencia(cuentaOrigen, cuentaDestino, 10);
            if (exito) {
                System.out.println(nombre + " ha realizado una transferencia de 10 desde " +
                        cuentaOrigen.getNumeroCuenta() + " a " + cuentaDestino.getNumeroCuenta());
            } else {
                System.out.println(nombre + " no ha podido realizar la transferencia por saldo insuficiente.");
            }
        }
    }
}
