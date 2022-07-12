import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise7();}

    private static void exercise7() {
        //imprimir triangulo de mayor a menor//
        for (int i = 0; i < 7; i++) {
            String msg = "";
            for (int j = 0; j < 7 - i; j++) {
            }
        }

            exercise6();}
    private static void exercise6() {
        // imprimir un triangulo de menor a mayor//
        for (int i = 0; i < 7; i++) {
            String msg = "";
            for (int j = 0; j < i + 1; j++) {
                msg = msg + "*";
            }
            System.out.println(msg);
        }


        exercise5();}

    private static void exercise5() {
        // imprimir por consola los numeros del 1 al 10, uno por linea//
        for (int i = 1; i < 11; i++) {
            System.out.println(i); }


        exercise4();}

    private static void exercise4() {
        // imprimir por consola 10 veces el string foo//

        for (int i = 0; i < 10; i++) {
            System.out.println("foo");
        }


        exercise3();}
    private static void exercise3() {
        Scanner myScanner = new Scanner(System.in);
        //ingresar por consola nombre del alumno//
        System.out.println("Nombre del alumno:");
        String nombre = myScanner.nextLine();
        //ingresar por consola las notas//
        System.out.println("Nota primer trimestre: 1");
        float nota1 = myScanner.nextFloat();

        if (nota1 > 10) {
            System.out.println("No valido ingresar numero menor o igual a 10 ");
        }
        System.out.println("Nota segundo trimestre: 2");
        float nota2 = myScanner.nextFloat();
        if (nota2 > 10) {
            System.out.println("No valido debe ingresar numero menor o igual a 10 ");
        }
        System.out.println("Nota tercer trimestre: 3");
        float nota3 = myScanner.nextFloat();
        if (nota3 > 10) {
            System.out.println("No valido, debe ingresar numero menor o igual a 10");
        }

        float prome = 0f;
        prome = (nota1 + nota2 + nota3) / 3;
        System.out.println("Promedio de nota:" + prome);
        if (prome >= 6 && prome <= 8) {
            System.out.println("El alumno: " + nombre + " fue aprobado. ");
        } else if (prome >= 1 && prome <= 5) {
            System.out.println("El alumno: " + nombre + " fue Desaprobado. ");
        } else if (prome >= 9 && prome <= 10) {
            System.out.println("El alumno: " + nombre + " A promocionado. ");
        }


            exercise2();}

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



        exercise1();}

    private static void exercise1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresar el primer numero:");
        int n1 , n2 ;
        n1 = myScanner.nextInt();
        System.out.println("Ingresar el segundo numero:");
        n2 = myScanner.nextInt();

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else if (n1 < n2 ) {
            System.out.println("El numero mayor es:" + n2);
        }
        else {
            System.out.println("El numero mayor es:" + n1);
        }
    }
}