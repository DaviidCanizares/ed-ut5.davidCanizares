package practica4;

public class CuentaCorrienteApp {

    public static void main(String[] args){
        //Creamos los dos objetos
    CuentaCorriente cuenta1 = new CuentaCorriente("45678956Y","Nelson Mandela");
    CuentaCorriente cuenta2 = new CuentaCorriente("76523421S","María Pérez");
        //Hacemos los ingresos
        cuenta1.ingresarDinero(4000);
        cuenta2.ingresarDinero(2500);
        //Mostramos información de la cuenta
        cuenta1.MuestraTitular();
        cuenta2.MuestraTitular();
        //Extraemos dinero de cada una de las cuenta y mostramos un mensaje de éxito o fracaso.
        cuenta1.sacarDinero(3000);
        cuenta2.sacarDinero(3000);
    }
}
