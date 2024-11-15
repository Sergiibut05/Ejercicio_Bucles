package Ejercicio38;

public class Ejercicio38 {
    public static void ejercicio38(){
        System.out.printf("Por favor, introduzca la altura del reloj de arena: ");
        int altura = Integer.parseInt(System.console().readLine());
        if (altura%2!=0 && altura>2){
            for(int i=0; i<altura/2+1; i++){
                for(int j=0; j<i; j++){
                    System.out.print(" ");
                }
                for(int f=0; f<altura-2*(i); f++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int a=1; a<altura/2+1;a++){
                for(int v=1; v<(altura/2+1)-a;v++){
                    System.out.print(" ");
                }
                for(int g=0; (g<altura-(2*((altura/2+1)-(a+1))));g++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3.");
        }
    }
}
