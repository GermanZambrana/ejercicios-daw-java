/**
* Ejercicio9 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio9 {

  public static void main(String[] args) {
    System.out.println("Dime un número para decirte cuantas cifras tiene:");
    int numerointroducido = Integer.parseInt(System.console().readLine());
    int numerodigitos = 1;
    while ( numerointroducido > 10) {
    numerointroducido /= 10;
    numerodigitos++;
  } 
  System.out.println("El número introducido tiene " + numerodigitos + " digitos");
}
}
