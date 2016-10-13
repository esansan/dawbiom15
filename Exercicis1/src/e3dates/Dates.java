/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3dates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Dates {
    private int dia;
    private int mes;
    private int any;
    private int mesos[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Dates() {
        this.dia = 0;
        this.mes = 0;
        this.any = 0;
    }
    
    public Dates(int dia, int mes, int any) {
        this.dia = dia;
        this.mes = mes;
        this.any = any;
        //Comprove si l'any és de traspas per poder indicar-ho a mesos[]
        if((getAny()%4 ==0) && ((getAny()%100!=0) ||(getAny()%400==0))){
            getMesos()[2] = 29;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int[] getMesos() {
        return mesos;
    }

    public void setMesos(int[] mesos) {
        this.mesos = mesos;
    }

    @Override
    public String toString() {
        return "La data és "+ dia + "/" + mes + "/" + any;
    }
    
    
    
    public void restaDies(){
                 
        int numdies = 1; // Quants dies volem restar
        setDia(getDia()-numdies);
        
        if(getDia()<1){
           if (getMes()==1){
               setAny(getAny()-1);
               setMes(12);
              // setDia(mesos[getMes()]+getDia());
           }else{
               setMes(mesos[getMes()-1]);
              // setDia(mesos[getMes()]+getDia());
           }
           setDia(mesos[getMes()]+getDia());
        }
    }
     private boolean dataCorrecta() {
       if((getAny()<1) ||(getMes()<1)||(getMes()>12)||(getDia()<1)||(getDia()>getMesos()[getMes()])){
           return false;
       }else{
           return true;
       }
    }
    public static void main(String[] args) {
        Dates data = new Dates();
        boolean esCorrecta = false;
        while(!esCorrecta){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introdueix el dia:");
            int dia = sc.nextInt();
            System.out.println("Introdueix el mes:");
            int mes = sc.nextInt();
            System.out.println("Introdueix l'any:");
            int any = sc.nextInt();

            data = new Dates(dia, mes, any);
            if (!data.dataCorrecta()){
                 System.out.println("La data és incorrecta. Torna a introduir");
            }else{
                esCorrecta = true;
            }
        }
        
        data.restaDies();
        
        System.out.println(data.toString());
       
    }

}

   
