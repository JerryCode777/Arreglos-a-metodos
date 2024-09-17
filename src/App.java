import java.util.*;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = scan.nextInt();
        int[] arreglo = new int[n];
        ingresar(arreglo, scan);
        modificar(arreglo);
        imprimir(arreglo);
    }

    public static void ingresar(int[] nArreglo, Scanner scan){
        for(int i = 0; i < nArreglo.length; i++){
            System.out.println("Ingresar el elemento "+(i+1)+": ");
            nArreglo[i]= scan.nextInt();
            scan.nextLine();
        }
    }

    public static void modificar(int[] nArreglo){
        for(int i = 0; i < nArreglo.length; i++){
            nArreglo[i] *= 2;
        }
    }

    public static void imprimir(int[] nArreglo){
        for(int val : nArreglo ){
            System.out.print(val+" ");
        }
    }
        
}
