/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = scan.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scan.nextInt();
        System.out.println(+num1+ " + " +num2+ " = " + (num1 + num2));
    }   
}