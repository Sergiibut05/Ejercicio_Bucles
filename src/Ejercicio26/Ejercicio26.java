package Ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
    public static void ejercicio26(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Introduzca un número entero: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca un dígito: ");
        int d = Integer.parseInt(scanner.nextLine());
        int n1=n;
        int i=0;
        while (n1>0){
            i++;
            n1=n1/10;
        }
        int i1=1;
        int n2=0;
        System.out.printf("Contando de izquierda a derecha, el %d aparece dentro de %d %n en las siguientes posiciones: ",d,n);
        while (n > 0) {
            n2 = n % (int)(Math.pow(10,i-1)); 
            if (n2==d){
                System.out.printf(" %d",i1);
            }      
            n=n-(n2*(10*(i-1)));
            i1=i1+1;
            i=i-1;
        }
    }
}
