package Ejercicio34;

public class Ejercicio34 {
    public static void ejercicio34(){
        System.out.printf("Por favor, introduzca un número: ");
        int num1=Integer.parseInt(System.console().readLine());
        System.out.printf("Introduzca otro número: ");
        int num2=Integer.parseInt(System.console().readLine());
        int long1=longitud(num1);
        int long2=longitud(num2);
        int l1=long1;
        int l2=long2;
        int v1=0;
        int v2=0;
        System.out.printf("El número formado por los dígitos pares es ");
        while(long1!=0 & long2!=0) {
            if(long1!=0){
                v1=num1/(10^(long1-1));
                if (v1%2==0){
                    System.out.print(v1);
                }
            }
            if(long2!=0){
                v2=num2/(10^(long2-1));
                if (v1%2==0){
                    System.out.print(v1);
                }
            }
            long1--;
            long2--;
        }
        System.out.println();
        System.out.printf("El número formado por los dígitos impares es ");
        while(l1!=0 & l2!=0){
            if(l1!=0){
                v1=num1/(10^(l1-1));
                if (v1%2==0){
                    System.out.print(v1);
                }
            }
            if(l2!=0){
                v2=num2/(10^(l2-1));
                if (v1%2==0){
                    System.out.print(v1);
                }
            }
            l1--;
            l2--;
        }
    }
    public static int longitud(int valor){
        int longitud=0;
        while(valor!=0){
            valor=valor/10;
            longitud++;
        }
        return longitud;
    }
}
