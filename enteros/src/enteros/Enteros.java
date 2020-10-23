/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enteros;

/**
 *
 * @author hl_al
 */
import java.util.Scanner;
public class Enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        int a,b;
        System.out.println("Introduce el primer número entero:");
        a=dato.nextInt();
        System.out.println("Introduce el segundo número entero:");
        b=dato.nextInt();
        System.out.println("LOS NUMEROS SON:");
       System.out.println(a);
        System.out.println(b);
        // TODO code application logic here
    
    } 
}
