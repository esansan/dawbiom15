/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2dni;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Dni{
    private int numero;
    private char lletra;

    public Dni(int numero, char lletra) {
        this.numero = numero;
        this.lletra = lletra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLletra() {
        return lletra;
    }

    public void setLletra(char lletra) {
        this.lletra = lletra;
    }
    
    public char calculaLletra(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[this.numero % 23];
        
    }
    public boolean esDniCorrecte(){
        if (this.lletra == calculaLletra()){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el número del dni:");
        int dni = sc.nextInt();
        System.out.println("Introdueix la lleta del dni:");
        String lletra = sc.next().toUpperCase();
        
        Dni dniNou = new Dni(dni, lletra.charAt(0));
        
        System.out.println(dniNou.esDniCorrecte());
    }
}
