package punto.pkg2;
import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero menor");
        int num1 = scan.nextInt();
        System.out.println("Ingrese el numero mayor");
        int num2 = scan.nextInt();
        System.out.println("Los siguientes numeros estan entre los numeros que ingreso: ");
        for(int i=(num1+1); i<num2; i++){
            System.out.println(i);
        }
    }
}
