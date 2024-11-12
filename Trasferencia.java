package Ejercicio5_PSP;

public class Trasferencia {
    public static boolean transferencia(Cuenta c1, Cuenta c2, double cantidad) {
        synchronized (c1) {
            if (c1.getSaldo() < cantidad) {
                return false;
            }
            c1.sacarCantidad(cantidad);
            synchronized (c2) {
                c2.ingresaCantidad(cantidad);
            }
        }
        return true;
    }
}
