package Ejercicio5_PSP;

import Ejercicio5_PSP.TrasferenciaSolucion;

public class HiloSolucion implements Runnable{
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private String nombre;


    public HiloSolucion(Cuenta cuentaOrigen, Cuenta cuentaDestino, String nombre) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.nombre = nombre;
    }
    

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            boolean exito = TrasferenciaSolucion.transferencia(cuentaOrigen, cuentaDestino, 100);
            if (exito) {
                System.out.println(nombre + " ha realizado una transferencia de 10 desde " +
                        cuentaOrigen.getNumeroCuenta() + " a " + cuentaDestino.getNumeroCuenta());
            } else {
                System.out.println(nombre + " no ha podido realizar la transferencia por saldo insuficiente.");
            }
        }
    }
}
