/**
 *Ejercicio 23 tema 4
 * @author German Zambrana Ruiz
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.print("Introduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigoPromocional = System.console().readLine();
    
    int tipoIVA2 = 0;
    
    switch(tipoIVA) {
      case "general":
        tipoIVA2 = 21;
        break;
      case "reducido":
        tipoIVA2 = 10;
        break;
      case "superreducido":
        tipoIVA2 = 4;
        break;
      default:
        System.out.print("El tipo de IVA no es correcto.");
    }
    
    double iva = base * tipoIVA2 / 100;
    double precioSinDescuento = base + iva;
    double descuento = 0;
    
    switch(codigoPromocional) {
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento / 2;
        break;
      case "meno5": 
        descuento = 5;
        break;
      case "5porc": 
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.print("El código promocional introducido no es correcto.");
    }
    double total = precioSinDescuento - descuento;
    
    System.out.println("Base imponible"       + base);
    System.out.println("IVA" + tipoIVA2 + iva);
    System.out.println("Precio con IVA" + precioSinDescuento);
    System.out.println("Cód. promo." + codigoPromocional + descuento);
    System.out.println("TOTAL" + total);
  }
}
