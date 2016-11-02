/**
 * Ejercicio11 tema 4

 * @author Germán ZAmbrana RUiz
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.println("Dime la hora del día: ");
    
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int shmn = (24 * 3600) - segundosTranscurridos;
            
    System.out.println("Desde las " + hora + ":" + minuto + " faltan " + shmn + " segundos hasta media noche" );
  }
}
