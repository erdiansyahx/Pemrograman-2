/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.input.output.java.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * create by MochamadErdiansyah 
 */
public class TugasInputOutputJava2 {

  
 public static void MembuatBuku() {
        try (FileOutputStream file = new FileOutputStream("addressbook.dat", true)) {
            Scanner Dataku = new Scanner(System.in);

            System.out.print("Masukan Nama Kamu Disini: ");
            String DataNama = Dataku.nextLine() + "\t";

            System.out.print("Masukan Alamat Kamu Disini: ");
            String DataAlamat = Dataku.nextLine() + "\t";

            System.out.print("Masukan Telepon Kamu Disini: ");
            String DataHp = Dataku.nextLine() + "\t";

            System.out.print("Masukan Email Kamu Disni: ");
            String DataEmail = Dataku.nextLine() + "\n";

            file.write(DataNama.getBytes());
            file.write(DataAlamat.getBytes());
            file.write(DataHp.getBytes());
            file.write(DataEmail.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("==============================================================================");
            System.out.println("                               Pemrograman Java 2                             ");
            System.out.println("                          Nama: Mochamad Erdiansyah                           ");
            System.out.println("                                 NPM : 1841805                                ");
            System.out.println("                         Jurusan : Sistem Informasi                           ");
            System.out.println("                             Membuat Buku Telepon                             ");
            System.out.println("==============================================================================");
            System.out.println("");
            
            System.out.println("1. Bikin Data Baru Kamu");
            System.out.println("2. Menampilkan Data Kamu");
            System.out.println("3. Keluar Dari Program Kamu");
            System.out.println("");
            
            System.out.print("Masukan Pilihan Kamu : ");
            int opsi = Input.nextInt();
            switch (opsi) {
                case 1:
                    MembuatBuku();
                    break;
                    
                case 2:
                    MembukaData();
                    break;
                    
                case 3:
                    break;
                default:
                    System.out.println(" Kamu salah memilih program !!! ");
                    break;
            }
            System.out.println();
            System.out.println();
            
        } while (true);
    }

    public static void MembukaData() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("sama sekali belum di input");
        }
       
       
    }

}