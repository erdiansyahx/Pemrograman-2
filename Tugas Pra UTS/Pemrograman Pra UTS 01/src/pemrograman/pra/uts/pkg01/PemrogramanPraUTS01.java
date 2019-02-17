/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.pra.uts.pkg01;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PemrogramanPraUTS01 {

    public static void main (String [] args){
   
        Scanner Masukan = new Scanner(System.in);
        
        System.out.println("Dibawah ini adalah Lingkaran C1: ");
       
        System.out.print("Input Nilai X1 : ");
        int x1 = Masukan.nextInt();
        System.out.print("Input Nilai y1 : ");
        int y1 = Masukan.nextInt();
        System.out.print("");
        
        String c1, c2;
        
        if(x1 > 0 && y1 > 0){
            c1 = "Titik I";
        } 
        
        else if(x1 < 0 && y1 > 0){
            c1 = "Titik II";
        } 
        
        else if(x1 < 0 && y1 < 0){
            c1 = "Titik III";
        } 
        
        else {
            c1 = "Titik IV";
        }
               
        int r1 = (x1 + y1) / 2;        
        
        System.out.println("\nDibawah ini adalah Lingkaran C2: ");
        
        System.out.print("Input Nilai X2 : ");
        int x2 = Masukan.nextInt();
        System.out.print("Input Nilai y2 : ");
        int y2 = Masukan.nextInt();
        
        System.out.print("\n");
       
        if(x2 > 0 && y2 > 0){
            c2 = "Titik I";
        }
        
        else if( x2 < 0 && y2 > 0){
            c2 = "Titik II";
        }
        
        else if(x2 < 0 && y2 < 0){
            c2 = "Titik III";
        }
        
        else {
            c2 = "Titik IV";
        }
        
        int r2 = (x2 + y2) / 2;
        
        
        if ("Titik I".equals(c1) && x1 <= x2 && y1 <= y2 && "Titik I".equals(c2)) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Titik II".equals(c1) && x1 <= x2 && y1 <= y2 && "Titik II".equals(c2)) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Titik III".equals(c1) && x1 <= x2 && y1 <= y2 && "Titik III".equals(c2)) {
            System.out.println("C1 ada di dalam C2");
        }
        
        else if ("Titik IV".equals(c1) && x1 <= x2 && y1 <= y2 && "Titik IV".equals(c2)) {
            System.out.println("C1 ada di dalam C2");
        }        
        
        else if ("Titik I".equals(c1) && x2 <= x1 && y2 <= y1 && "Titik I".equals(c2)){
            System.out.println("C2 ada di dalam C1");
        }
        
        else if ("Titik II".equals(c1) && x2 <= x1 && y2 <= y1 && "Titik II".equals(c2)){
            System.out.println("C2 ada di dalam C1");
        }
        
        else if ("Titik III".equals(c1) && x2 <= x1 && y2 <= y1 && "Titik III".equals(c2)){
            System.out.println("C2 ada di dalam C1");
        }
         
        else if ("Titik IV".equals(c1) && x2 <= x1 && y2 <= y1 && "Titik IV".equals(c2)){
            System.out.println("C2 ada di dalam C1");
        }        
        
        else if ("Titik I".equals(c1) && x1 > x2 && y1 < y2 && "Titik II".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Titik I".equals(c1) && x1 > x2 && y1 < y2 && "Titik IV".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else if ("Titik II".equals(c1) && x1 > x2 && y1 < y2 && "Titik III".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan");
        }
                
        else if ("Titik III".equals(c1) && x1 > x2 && y1 < y2 && "Titik IV".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan");
        }
   
        else if ("Titik IV".equals(c1) && x1 > x2 && y1 < y2 && "Titik I".equals(c2)) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Titik I".equals(c2) && x2 > x1 && y2 < y1 && "Titik II".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Titik II".equals(c2) && x2 > x1 && y2 < y1 && "Titik IV".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Titik II".equals(c2) && x2 > x1 && y2 < y1 && "Titik III".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else if ("Titik III".equals(c2) && x2 > x1 && y2 < y1 && "Titik IV".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan");
        }
        
        else if ("Titik IV".equals(c2) && x2 > x1 && y2 < y1 && "Titik I".equals(c1)) {
            System.out.println("C1 dan C2 Beririsan");
        }
         
        else {
            System.out.println("C2 dan C1 Saling Lepas");
        
        }
           
    }

}
           
 