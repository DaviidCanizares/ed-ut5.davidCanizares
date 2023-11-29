package practica4;

public class SintonizadorFMApp {

    public static void main(String []args){
        //Creamos los 3 objetos para sintonizar.
        SintonizadorFM sintoniza1 = new SintonizadorFM();
        SintonizadorFM sintoniza2 = new SintonizadorFM(107);
        SintonizadorFM sintoniza3 = new SintonizadorFM(200);

        //Bajamos 1 Mhz y subimos 2Mhz

        sintoniza1.down();
        sintoniza1.down();
        sintoniza2.up();
        sintoniza2.up();
        sintoniza2.up();
        sintoniza2.up();
        sintoniza2.up();

        //Comprobamos el rango de cada uno de ellos
        System.out.println("1r sintonizador: " + sintoniza1.getFrecuencia() + " MHz");
        System.out.println("2º sintonizador: " + sintoniza2.getFrecuencia() + " MHz");
        System.out.println("3r sintonizador: " + sintoniza3.getFrecuencia() + " MHz");























    }
}
