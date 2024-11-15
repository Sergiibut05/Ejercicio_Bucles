package Ejercicio69;

public class Ejercicio69 {
    public static void ejercicio69() {
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i=1;i<=altura;i++){
            if(i%2==0){
                for(int j=1;j<=(altura-i);j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
                System.out.print("    ");
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            }else{
                for(int h=1;h<=(altura-i);h++){
                    System.out.print(" ");
                }
                for(int p=1; p<=6+(4*(int)(i/2));p++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
