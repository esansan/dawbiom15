/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e8decimalbinari;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class ConversorDeciBinari {
    private int numero;

    public ConversorDeciBinari(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int convertir(){
        int binari =0;
        int numero=getNumero();
        System.out.println(numero);
        for (int i =numero,j=1; i != 0; i/=2,j*=10){
            binari+=((i%2)*j);
        } 
        return binari;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdueix el nombre:");
        
        int nombre = sc.nextInt();
        
        ConversorDeciBinari conv = new ConversorDeciBinari(nombre);
        System.out.println(conv.convertir());
    }
}
