package user.enzo;
import java.util.Scanner;
public class UserEnzo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Usuario;
        String Contrasena;
        Usuario = "Enzo";
        Contrasena = "4321";
        System.out.println("Bienvenido");
        System.out.println("Ingrese su Usuario");
        String user = scan.nextLine();
        System.out.println("Ingrese su Contraseña");
        String pass = scan.nextLine();
        if (user.equals(Usuario) && (pass.equals(Contrasena))) {
            System.out.println("Bienvenido Enzo!");
            System.out.println("Desea cambiar la contraseña?");
            System.out.println("1 = Si / 2 = No");
            int op = scan.nextInt();
            scan.nextLine();
            /*Ya que el metodo next.Int() no lee el salto de linea al precionar enter, 
            queda en el buffer este "enter", y no permitia el ingreso de la nueva contraseña
            
            Por esto Nesesitamos el scan.nextLine() y consumir el "Enter" que queda en el buffer.
            */
            if (op == 1) {
                System.out.println("Escriba su nueva contraseña");
                Contrasena = scan.nextLine();
                System.out.println("Su nueva contraseña es:" + Contrasena);
            } else if (op == 2) {
                System.out.println("Adios!");
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Oiga usted no es Enzo...");
        }
    }
}