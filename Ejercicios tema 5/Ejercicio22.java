/**
* Ejercicio22 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio22{
 public static void main(String[] args) {
   System.out.println("Muestra todos los números primos comprendidos entre 2 y 100");

    boolean odd = true;

    for(int n = 2; n <= 100; n++) {
      odd = true;
      for(int i = 2; i < n; i++) {
        if(n % i == 0) {
        odd = false;
        }
      }
      if(odd)
        System.out.println(n);
    }
  }
}
