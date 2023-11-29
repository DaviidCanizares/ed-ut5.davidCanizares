package practica4;

public class CuentaCorriente {
    private String dni;
    private String nombreTitular;
    private double saldo;

    // Constructor parametrizado para crear una cuenta
    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0.0; // El saldo inicial será 0
    }
        //Creamos el método ingresarDinero para las operaciones de ingreso
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("La cantidad ingresada es " + cantidad + " euros");
        } else {
            System.out.println("La cantidad ingresada debe ser mayor de 0 ");
        }
    }
    //Creamos el método sacarDinero para las operaciones de retirada
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad; // Reducir el saldo
            System.out.println("La cantidad retirada es: " + cantidad + " euros");
            return true; // Retirada realizada con éxito
        } else {
            System.out.println("La retirada no puede efectuarse");
            return false; // Retirada fallida
        }
    }
    //Aquí mostramos la información del titular de la cuenta
    public void MuestraTitular(){
        System.out.println("El titular de la cuenta es: " + this.nombreTitular);
        System.out.println("El DNI del titular de la cuenta es: " + this.dni);
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }
}