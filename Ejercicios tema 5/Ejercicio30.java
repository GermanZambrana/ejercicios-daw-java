/**
* Ejercicio30 del capitulo 5
*
* @author German Zambrana Ruiz
*/
    public class Ejercicio30 {
	public static void main(String[] args) {
    System.out.println("Diferencia entre 2 horas de 2 dias" + "Horas de (0-23) y dias de (1-7)");
    
    int dia1;
    int dia2;
    int hora1;
    int hora2;
    int i;
    
    System.out.println("Dime el dia de la semana");
    dia1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime el 2º dia de la semana");
    dia2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime la hora del 1º dia");
    hora1 = Integer.parseInt(System.console().readLine());
    
    System.out.println("Dime la hora del 2º dia");
    hora2 = Integer.parseInt(System.console().readLine());
    
    if(hora1>0 && hora2>0 && hora1<23 && hora2<23) {
      int diff=0;
      if(dia2 != dia1+1) 
      diff=(dia2-dia1+1)*24;
      
      diff += (24-hora1) + hora2;
      System.out.println("La diferencia de horas es de" + diff);
    } else {
      System.out.println("Las horas no son validas");
    }
    
}
}

      
      
      
      
      
      
      
      
