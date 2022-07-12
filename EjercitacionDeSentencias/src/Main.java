import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise2();

    }

    private static void exercise2() {
    /* Crear un programa que sirva para calcular el importe de una compra, se debe
       solicitar al ususario que ingrese por consola:

       a)el nombre del producto.
       b)el precio del producto.
       c)el metodo de pago, las opciones son:

       1- Contado tiene 15% de descuento.
       2- Debito mismo precio al ingresado.
       3- Tarjeta 10% de recargo.
     */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Nombre del producto");
        String producto = myScanner.nextLine();
        System.out.println("Precio: $");
        double precio = myScanner.nextDouble();
        System.out.println("Seleccionar metodo de pago:");

        System.out.println("1) Contado");
        System.out.println("2) Debito");
        System.out.println("3) Tarjeta");
        int PaymentMethod = myScanner.nextInt();
        double totalapagar = 0.0;
        if (PaymentMethod == 1) {
            totalapagar = 0.85 * precio;
            System.out.println("15% de descuento por pago contado");
        } else if (PaymentMethod == 2) {
            totalapagar = precio;
            System.out.println("pago con debito no obtiene beneficios");
        } else if (PaymentMethod == 3) {
            totalapagar = 1.1 * precio;
            System.out.println("10% de recargo en su compra: tarjetas aderidas a compras visa mastercar, naranja visa");
        }
        System.out.println("El precio final a pagar por el producto " + producto + " es: $ " + totalapagar);
    }
}