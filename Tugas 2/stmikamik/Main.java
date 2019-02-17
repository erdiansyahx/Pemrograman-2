/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamik;

/**
 *
 * @author fujitsu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

        Circle s = new Circle(10, "Kelereng");
        System.out.println("Nama benda: " + s.getName());
        System.out.println("Radius benda: " + s.getRadius());
        System.out.println("Luasnya: " + s.getArea());
        
        Rectangle b =  new Rectangle("balok meja", 30, 40);
        System.out.println("Nama benda: " + b.getName());
        System.out.println("Panjang benda: " +b.getLength());
        System.out.println("Lebar benda: " + b.getWidth());
        System.out.println("Luasnya: " + b.getArea());
    }
    
}

