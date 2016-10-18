/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e5conversor;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Conversor{
   
    public static double polsadesCm(double pol){
        return pol*2.54;
    } 
    public static double peusCm(double peu){
        return peu*30.48;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=0;
        double quantitat;
        do{
            System.out.println("Vols convertir a \n"
                    + "1.- Peus \n"
                    + "2.- Polsades \n"
                    + "0.- Sortir"); 
            op=sc.nextInt();
            
        }while(op<0 || op>2);
        
        if(op!=0){
        System.out.println("Introdueix la quantitat");
        quantitat = sc.nextDouble();
        
            switch(op){
                case 1:
                    System.out.println(peusCm(quantitat));
                    break;
                case 2:
                    System.out.println(polsadesCm(quantitat));
            }
        }
    }
}
