import java.util.HashMap;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"COP");
        map.put(2, "MXN");
        map.put(3, "EUR");
        map.put(4, "GBP");
        map.put(5, "CNY");
        map.put(6, "JPY");
        map.put(7, "BRL");


        System.out.println("Bienvenido al conversor de monedas\n");
        Boolean controlador = true;
        while (controlador){
            System.out.println("\n1. " + map.get(1) + "\n2. " + map.get(2) + "\n3. " + map.get(3) + "\n4. " + map.get(4) +
                    "\n5. " + map.get(5) + "\n6. " + map.get(6) + "\n7. " + map.get(7) + "\n8. Salir");
            System.out.print("\nSeleciona a que moneda quieres pasar los dolares: ");
            int opcion = lector.nextInt();
            if (opcion==8)
                controlador = false;
            else if (opcion>8 && opcion<1) {
                System.out.println("Opcion invalida");
            } else{
                System.out.print("Ingrese los dolares: ");
                Double dolares = lector.nextDouble();
                double valorMoneda = calculadora.valorMoneda(map.get(opcion));
                System.out.println("\n"+dolares + " USD -> "+map.get(opcion)+" = "+dolares*valorMoneda);
            }

        }

    }
}
