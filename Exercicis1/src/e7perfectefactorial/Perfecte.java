/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7perfectefactorial;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Perfecte {
    private int nombre;
    private int factorial;

    public Perfecte(int nombre) {
        this.nombre = nombre;
    }

    public double getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public double getFactorial() {
        return factorial;
    }

    public void setFactorial(int factorial) {
        this.factorial = factorial;
    }
   
    public boolean esPerfecte(){
        int sumaDivisors = 0;
        
        for (int i = 1; i < nombre; i++) {
            if(nombre%i==0){
                sumaDivisors +=i;
            }
        }
        return sumaDivisors == getNombre();
    }
    
    public int factorial(){
        int factorial = 1;
        for (int i = 1; i <= nombre; i++) {
                factorial *=i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introdueix el nombre:");
        
        int nombre = sc.nextInt();
        
        Perfecte per = new Perfecte(nombre);
        
        if(per.esPerfecte()){
            System.out.println("El nombre és perfecte i el seu factorial és: "+per.factorial());
        }
        
    }
}
