package Ejercicio67;

public class Ejercicio67 {
    public static void ejercicio67(){
        System.out.print("Introduzca el número de escalones: ");
        int num=Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de cada escalón: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i=1;i<=num;i++){
            for(int k=0;k<altura;k++){
                for(int j=0;j<i;j++){
                    System.out.print("****");
                }
                System.out.println();
            }
            
        }
    }
}
