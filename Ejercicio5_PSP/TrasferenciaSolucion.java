package Ejercicio5_PSP;

public class TrasferenciaSolucion {
    public static boolean transferencia(Cuenta c1, Cuenta c2, double cantidad) {
        Cuenta primera = c1.getNumeroCuenta().compareTo(c2.getNumeroCuenta()) < 0 ? c1 : c2;
        Cuenta segunda = c1 == primera ? c2 : c1;

        synchronized (primera) {
            if (c1.getSaldo() < cantidad) {
                return false; // Saldo insuficiente
            }
            c1.sacarCantidad(cantidad);

            synchronized (segunda) {
                c2.ingresaCantidad(cantidad);
            }
        }
        return true; // Transferencia exitosa
    }
}
