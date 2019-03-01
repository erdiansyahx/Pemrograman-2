/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pemrograman.java.pkg2.input.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * Created by Saefulhusna
 */
public class LatihanPemrogramanJava2InputOutput {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
         // Tulis Source Codemu disini
        System.out.println("==============================================================================");
        System.out.println("                               Pemrograman Java 2                             ");
        System.out.println("                          Nama: Mochamad Erdiansyah                           ");
        System.out.println("                                 NPM : 1841805                                ");
        System.out.println("                         Jurusan : Sistem Informasi                           ");
        System.out.println("==============================================================================");
        System.out.println("");
          
        
        Scanner Mengetik = new Scanner (System.in);
        try {
            try (FileOutputStream Tuliskan = new FileOutputStream("MochamadErdiansyah.dat")) {
                System.out.println("Tolong input data yang kamu inginkan untuk di tulis di MochamadErdiansyah.dat: ");
                Tuliskan.write(Mengetik.next().getBytes());
            }
            
        } catch (IOException e) {
        }
                
    }
    
}