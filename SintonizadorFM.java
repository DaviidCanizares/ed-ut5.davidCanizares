package practica4;

// Clase que representa un sintonizador de frecuencia modulada

    public class SintonizadorFM{
        // Atributo que guarda la frecuencia del sintonizador

        private double frecuencia;

        // Constructor que inicializa la frecuencia en 80.0 MHz por defecto

        public SintonizadorFM(){
            this.frecuencia =80.0;
        }
        // Constructor que permite inicializar la frecuencia con un valor dado, dentro del rango de 80.0 a 108.0 MHz

        public SintonizadorFM(double frecuenciaInicial){
            if( frecuenciaInicial <80.0){
                this.frecuencia=80.0;
            } else if (frecuenciaInicial > 108.0) {
               this.frecuencia= 108.0;
            } else { this.frecuencia = frecuenciaInicial;
                }
        }
        // Método para mostrar la frecuencia actual del sintonizador

        public void display(){
            System.out.println("La frecuencia actual es: " + frecuencia + "Mhz");
        }
        // Método para decrementar la frecuencia en 0.5 MHz

        public void down(){
            frecuencia -= 0.5;
            comprobarRango();
        }
        // Método para incrementar la frecuencia en 0.5 MHz

        public void up(){
            frecuencia += 0.5;
            comprobarRango();
        }
        // Método para obtener la frecuencia actual del sintonizador

        public double getFrecuencia(){
            return this.frecuencia;
        }
        // Método privado para asegurarse de que la frecuencia está dentro del rango válido (80.0 - 108.8 MHz)

        private void comprobarRango(){
            if(frecuencia < 80.0){
                frecuencia = 108.0;
            } else if (frecuencia > 108.8) {
                frecuencia= 80.0;
            }
        }
    }