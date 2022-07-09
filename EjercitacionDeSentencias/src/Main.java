import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear un programa que pida dos numeros por consola y me indique cual es el mayor.

        exercise1();


    }

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