import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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


    }
}