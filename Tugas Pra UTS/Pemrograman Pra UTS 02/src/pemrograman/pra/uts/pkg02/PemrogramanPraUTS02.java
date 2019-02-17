/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.pra.uts.pkg02;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class PemrogramanPraUTS02 {

public static void main(String[] args) {

        int Rz = 8;
        Scanner input = new Scanner(System.in);

        int[] Ra = new int[Rz];

        System.out.println("");
        for (int i = 0; i < Rz; i++) {
            System.out.printf("Masukkan data ke-%d: ", (i + 1));
            Ra[i] = input.nextInt();
        }

        for (int Gg = 0; Gg < Rz - 1; Gg++) {
            for (int i = 0; i < Rz - 1; i++) {
                if (Ra[i] < Ra[i + 1]) {
                    int j = Ra[i];
                    Ra[i] = Ra[i + 1];
                    Ra[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil pengurutan bilangan: ");
        for (int Zz = 0; Zz < Rz; Zz++) {
            System.out.print(Ra[Zz] + "  ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("*************************************************");
  
    }
}
