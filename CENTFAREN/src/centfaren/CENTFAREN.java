/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centfaren;

/**
 *
 * @author hl_al
 */
import java.util.Scanner;
public class CENTFAREN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       Scanner dato=new Scanner(System.in);
       double gc,gf;
       System.out.println("Escribe los grados C que quieres convertir:");
       gc=dato.nextDouble();
       gf=((gc*9)/5)+32;
       System.out.println("La conversión es: "+gf);
      
       }
    }

