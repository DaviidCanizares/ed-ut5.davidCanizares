package practica4;
// Clase que representa un punto en el plano
public class Punto {
    //Creamos los atributos de la clase punto.
    private double x;
    private double y;

    // Creamos el constructor para darle valores a x e y.

    public Punto(double x, double Y){
        this.x =x;
        this.y=y;
    }
    // Método para desplazar la coordenada x en una cantidad dx
    public void desplazaX(double dx){
        this.x += dx;
    }
    // Método para desplazar la coordenada y en una cantidad dy
    public void desplazaY(double dy){
        this.y += dy;
    }
    // Método para desplazar ambas coordenadas en cantidades dx y dy respectivamente

    public void desplaza(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    // Método para calcular la distancia euclidiana entre este punto y otro punto dado

    public double distanciaEuclidea(Punto otro){

        double distanciaX = this.x - otro.x;
        double distanciaY = this.y - otro.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaX);
    }
    // Método para mostrar las coordenadas del punto

    public void muestra(){

        System.out.println(" Las coordenadas son ( " + this.x + this.y + " )" );
    }


}
