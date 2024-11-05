package Ejercicio24;

public class Ejercicio24 {
    public static void ejercicio24(){
        int n = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            
            
            System.out.println();
        }
    }
}
