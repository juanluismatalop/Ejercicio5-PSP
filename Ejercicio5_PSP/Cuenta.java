package Ejercicio5_PSP;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;


    public Cuenta(String string, int i) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public synchronized double getSaldo(){
        return saldo;
    }

    public synchronized String getNumeroCuenta() {
        return numeroCuenta;
    }

    public synchronized void ingresaCantidad(double cantidad) {
        this.saldo += cantidad;
    }

    public synchronized void sacarCantidad(double cantidad) {
        this.saldo -= cantidad;
    }

    @Override
    public synchronized String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}