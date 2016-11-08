/**
* Ejercicio7 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio8 {

  public static void main(String[] args) {
    System.out.println("Dame un número y te mostrare la tabla de multiplicar");
    int n = Integer.parseInt(System.console().readLine());
    for ( int i = 1; i<=10; i++) {
      System.out.println(n + " x " + i + " = " + n * i);
    }

  }
}


