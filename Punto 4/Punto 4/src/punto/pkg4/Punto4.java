package punto.pkg4;
import java.util.Scanner;
public class Punto4 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scan.nextInt();
        System.out.println("Los numeros multiplos de 5 no apareceran");
        System.out.println("Los siguientes numeros estan entre los numeros que ingreso: ");
        int mayor=0;
        int menor=0;
        
        if (num1 < num2){
            mayor = num2;
            menor = num1;
        }else
            mayor = num1;
            menor = num2;
            
        for(int i=menor; i<=mayor; i++){
            
            if (i%5!=0){
                System.out.println(i);
            }   
        }
    }
}