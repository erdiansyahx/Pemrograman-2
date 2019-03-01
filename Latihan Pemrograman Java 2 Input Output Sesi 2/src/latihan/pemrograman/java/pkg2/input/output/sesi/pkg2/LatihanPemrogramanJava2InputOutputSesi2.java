/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pemrograman.java.pkg2.input.output.sesi.pkg2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * Created by MochamadErdiansyah 
 */
public class LatihanPemrogramanJava2InputOutputSesi2 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args){
        // Tulis Source Codemu disini
        
        System.out.println("==============================================================================");
        System.out.println("                               Pemrograman Java 2                             ");
        System.out.println("                          Nama: Mochamad Erdiansyah                           ");
        System.out.println("                                 NPM : 1841805                                ");
        System.out.println("                         Jurusan : Sistem Informasi                           ");
        System.out.println("                                 Membaca Lirik Lagu                           ");
        System.out.println("==============================================================================");
        System.out.println("");
        
        try {
            try (FileInputStream Erdi = new FileInputStream("Lirik.txt")) {
                int e;
                while ((e = Erdi.read()) != -1){
                    if (e == 32){
                        System.out.print("_");
                    }else{
                        System.out.print((char) e);
                    }
                }
            }
        
        } catch (IOException e) {
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("                        Hasil Dari Membaca Lirik Lagu                         ");
        System.out.println("==============================================================================");


           
        
            
            
        }
            
    }