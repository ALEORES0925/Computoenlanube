/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroparimpar;

/**
 *
 * @author hl_al
 */
import java.util.Scanner;
public class NumeroParImpar 
{
public static void main(String[]args)
{
    int numero;
    Scanner teclado = new Scanner(System.in);
    System.out.printf("Introduxca un numero entero: ");
    numero = teclado.nextInt();
    if(numero % 2 == 0)
    {
        System.out.printf("Es par");
    }
    else
    {
        System.out.printf("Es impar");
    }
    }
    
}
