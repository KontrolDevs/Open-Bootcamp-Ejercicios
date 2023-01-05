// Segunda parte

class Coche {
    // Variable para almacenar el número de puertas
    private int numeroDePuertas;

    // Constructor para inicializar el número de puertas
    public Coche(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    // Función para aumentar el número de puertas
    public void aumentarNumeroDePuertas() {
        numeroDePuertas++;
    }

    // Método para obtener el número de puertas
    public int obtenerNumeroDePuertas() {
        return numeroDePuertas;
    }

  }

  public static void main(String[] args) {
    // Crea un objeto miCoche con 2 puertas
    Coche miCoche = new Coche(2);
    
    // Añade una puerta al coche
    miCoche.aumentarNumeroDePuertas();
    
    // Muestra el número de puertas del coche
    System.out.println("El coche tiene " + miCoche.obtenerNumeroDePuertas() + " puertas.");
  }
