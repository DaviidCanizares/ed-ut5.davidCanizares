package practica4;

public class PuntosApp {

    public static void main(String[] args){
        //Creamos los objetos para trabajar con ellos
        Punto punto1 = new Punto(3.0,4.0);
        Punto punto2 = new Punto(6.0,8.0);

        //Probamos a desplazar X
        punto1.desplazaX(2.0);
        punto1.desplazaY(3.0);
        punto2.desplaza(-1.0,-2.0);


        //Con .muestra vemos donde se encuentran nuestro objetos.
        punto1.muestra();
        punto2.muestra();

        // Vemos la distancia entre los dos puntos.
        double distancia = punto1.distanciaEuclidea(punto2);
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}
