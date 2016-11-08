/**
* Ejercicio2 del capitulo 5
*
* @author German Zambrana Ruiz
*/
public class Ejercicio2{
 public static void main(String[] args) {
        System.out.println("Múltiplos de 5 con el bucle while:");
        int m = 1;
        int r = 0;
        int n = 5;
        while(r < 100) {
            m++;
            r = n*m;
            System.out.println(n + " * " + m + " = " + r);
        }
    }
}
