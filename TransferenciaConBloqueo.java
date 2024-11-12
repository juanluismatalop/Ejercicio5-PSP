package Ejercicio5_PSP;

public class TransferenciaConBloqueo {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("ES388388433883838388484", 20500);
        Cuenta c2 = new Cuenta("ES99090499388484889399", 50000);

        System.out.println("Saldo inicial de las cuentas:");
        System.out.println(c1);
        System.out.println(c2);

        Hilo h1 = new Hilo(c1, c2, "Hilo 1");
        Hilo h2 = new Hilo(c2, c1, "Hilo 2");

        Thread hilo1 = new Thread(h1);
        Thread hilo2 = new Thread(h2);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saldo final de las cuentas:");
        System.out.println(c1);
        System.out.println(c2);
    }
}
