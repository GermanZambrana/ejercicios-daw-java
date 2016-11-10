/**
* Ejercicio12 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio12{
 public static void main(String[] args) {

    System.out.println("Dame un número para hacer fibonacci con el:");
    int n = Integer.parseInt(System.console().readLine() );
    int f = 0;
    int a = 1;
    int fin = 0;
    while (fin < n) {
      if (fin != n){
          System.out.println(f + " ");
    }
    fin ++;
      if (fin != n){
          System.out.println(a + " ");
    }
    fin ++;
      f += a;
      a += f;
  }
}
} 
    
