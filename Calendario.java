package practica4;
    //Creamos la clase calendario, junto con los tres atributos
public class Calendario {
    private int anyo;
    private int mes;
    private int dia;
    // Constructor de la clase calendario, verifica si la fecha es válida antes de asignar los valores.
    public Calendario(int anyo, int mes, int dia) {
        if (esFechaValida(anyo, mes, dia)) {
            this.anyo = anyo;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha incorrecta.");
        }
    }
    // Verificamos que la fecha sea válida.
    private boolean esFechaValida(int anyo, int mes, int dia) {
        if (anyo >= 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnElMes(anyo, mes)) {
            return true;
        }
        return false;
    }
    // Método privado que devuelve la cantidad de días en un mes específico.
    private int diasEnElMes(int anyo, int mes) {
        int diasEnMes;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            default:
                diasEnMes = 31;
                break;
        }
        return diasEnMes;
    }
    // Método público que incrementa un día.
    public void incrementarDia() {
        if (dia < diasEnElMes(anyo, mes)) {
            dia++;
        } else {
            dia = 1;
            incrementarMes();
        }
    }
    // Método público que incrementa un mes.
    public void incrementarMes() {
        if (mes < 12) {
            mes++;
        } else {
            mes = 1;
            incrementarAnyo(1);
        }
    }
    // Método público que incrementa un anyo.
    public void incrementarAnyo(int cantidad) {
        if (anyo + cantidad > 0) {
            anyo += cantidad;
        } else {
            System.out.println("El año 0 no existe.");
        }
    }
    // Método público que muestra la información por pantalla.
    public void mostrar() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anyo);
    }
    // Verificamos si dos fechas son iguales.
    public boolean iguales(Calendario otraFecha) {
        return this.anyo == otraFecha.anyo && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
}
