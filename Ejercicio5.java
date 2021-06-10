import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i = 0; 
        int numero;
        int edad;
        int genero; 
        int mujer = 0;
        int hombre = 0;

        System.out.println("");
        System.out.println("*********Ejercicio5************");
        System.out.println("");
        System.out.print("Ingrese la cantidad de REGISTROS a ingresar: ");
        numero = entrada.nextInt();
        while(i < numero){
            System.out.println("1 = Mujer");
            System.out.println("2 = Hombre");
            System.out.println("REGISTRO No." + (i+1));
            System.out.print("Género: ");
            genero = entrada.nextInt();
            System.out.print("Edad: ");
            edad = entrada.nextInt();
            if(genero == 1 && edad > 18){
                mujer = mujer+1;
            }
            if(genero == 2 && edad < 18){
                hombre = hombre+1;
            }
            i = i+1;

        }
        System.out.println("La cantidad de mujeres mayores de edad es = " + mujer);
        System.out.println("La cantidad de hombres menores de edad es = " + hombre);
    }
}