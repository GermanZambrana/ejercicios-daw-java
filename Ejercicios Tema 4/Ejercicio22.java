/**
 * Ejercicio22 tema 4
 *
 * @author Germán ZAmbrana Ruiz
 */

public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Dime un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine();

    int diaNumerico = 0;

    switch(dia) {
      case "lunes":
        diaNumerico = 0;
        break;
      case "martes":
        diaNumerico = 1;
        break;
      case "miércoles":
      case "miercoles":
        diaNumerico = 2;
        break;
      case "jueves":
        diaNumerico = 3;
        break;
      case "viernes":
        diaNumerico = 4;
        break;
      default:
        System.out.print("El día introducido no es correcto.");
    }
    
    System.out.println("A continuación introduzca la hora (hora y minutos)");
    
    System.out.print("Hora: ");
    int h = Integer.parseInt(System.console().readLine());
    
    System.out.print("Minutos: ");
    int m = Integer.parseInt(System.console().readLine());
    
    int mt = (4 * 24 * 60) + (15 * 60);
    int ma = (diaNumerico * 24 * 60) + (h * 60) + m;
    
    System.out.print("Faltan " + (mt - ma) + " minutos para llegar al fin de semana.");
  }
}
