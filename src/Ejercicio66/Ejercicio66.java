package Ejercicio66;

public class Ejercicio66 {
    public static void ejercicio66(){
        System.out.print("Por favor, introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        for(int i=1; i<=altura/2+1;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("* *");
            System.out.println();
        }
        for(int k=altura/2;k>=1;k--){
            for(int p=1;p<k;p++){
                System.out.print(" ");
            }
            System.out.print("* *");
            System.out.println();
        }
    } 
        
    
}
