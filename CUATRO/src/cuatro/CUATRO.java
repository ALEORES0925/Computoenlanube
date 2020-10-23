/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

/**
 *
 * @author hl_al
 */
import java.util.*;
import java.io.*;
public class CUATRO {
public static void CUATRO(String[]args)throws IOException{
    Scanner sc = new Scanner(System.in);
    int n, cifras;
    char car;
    do{
        System.out.print("Intrpduce un numero entero:");
        n=sc.nextInt();
        cifras=0;
        while(n!=0){
            n=n/10;
            cifras++;
        }
System.out.println("El numero tiene "+cifras+"cifras");
System.out.print("Continuar?");
car=(char)System.in.read();
    }while(car!='&&car!='N');
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
