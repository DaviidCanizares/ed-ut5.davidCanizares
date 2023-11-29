package practica4;

public class CalendarioApp {

    public static void main(String[] args) {

        // Crear una instancia de Calendario con una fecha inicial
        Calendario fecha = new Calendario(2023, 11, 5);

        // Mostrar la fecha inicial
        System.out.println("Fecha inicial:");
        fecha.mostrar();

        // Incrementar el día
        System.out.println("\nIncrementando un día:");
        fecha.incrementarDia();
        fecha.mostrar();

        // Incrementar el mes
        System.out.println("\nIncrementando un mes:");
        fecha.incrementarMes();
        fecha.mostrar();

        // Incrementar el año
        System.out.println("\nIncrementando un año:");
        fecha.incrementarAnyo(1);
        fecha.mostrar();

        // Comprobar si dos fechas son iguales
        System.out.println("\nComprobando si dos fechas son iguales:");
        Calendario otraFecha = new Calendario(2023, 11, 5);
        if (fecha.iguales(otraFecha)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas son distintas");
        }
    }
}