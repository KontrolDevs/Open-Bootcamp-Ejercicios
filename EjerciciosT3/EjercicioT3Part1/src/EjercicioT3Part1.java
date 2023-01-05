
//Primera parte
public class Main {
  public static void main(String[] args) {
    // Llamamos a la función y le pasamos tres números como argumentos
    int resultado = sumar(5, 10, 15);
    // Imprimimos el resultado en pantalla
    System.out.println(resultado);
  }

  // Definimos la función
  public static int sumar(int num1, int num2, int num3) {
    // Retornamos la suma de los tres números
    return num1 + num2 + num3;
  }
}