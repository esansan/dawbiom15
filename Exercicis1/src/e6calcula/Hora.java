/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e6calcula;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Hora {
    private int totalSegons;
    private int hores;
    private int minuts;
    private int segons;

    public Hora(int totalSegons) {
        this.totalSegons = totalSegons;
        this.hores = 0;
        this.minuts=0;
        this.segons=0;
    }

    public int getTotalSegons() {
        return totalSegons;
    }

    public void setTotalSegons(int totalSegons) {
        this.totalSegons = totalSegons;
    }

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public int getSegons() {
        return segons;
    }

    public void setSegons(int segons) {
        this.segons = segons;
    }
    
    
    public void calculaTemps(){
        setHores(getTotalSegons()/3600);
        setMinuts((getTotalSegons()-(getHores()*3600))/60);
        setSegons(getTotalSegons()-((getHores()*3600)+(getMinuts()*60)));
    }

    @Override
    public String toString() {
        return "Aquestos" + totalSegons+ "segons equival a:" + hores + ":" + minuts + ":" + segons;
    }
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int totalSeg;
        do{
            System.out.println("Introdueix el nombre de segons:");
            totalSeg= sc.nextInt();
        }while(totalSeg<0);
        
        Hora temps = new Hora(totalSeg);
        temps.calculaTemps();
        temps.toString();
    }
}
