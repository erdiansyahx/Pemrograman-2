/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.pra.uts.pkg03;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee boss = new Manager("Erdi", "Gegerkalong", 2400000, 1000000);
        Employee Staff_01 = new Staff("Sutiana", "Dipatiukur", 8000000);
        Employee Staff_02 = new Staff("Sutisna", "Cileunyi", 5000000);
        
        
        System.out.println("**************************************************** ");
        System.out.println("Nama Manager: " + boss.getName());
        System.out.println("Alamat Manager: " + boss.getAddres());
        System.out.println("Salary Manager adalah : Rp. " + boss.getSalary());
        System.out.println("**************************************************** \n");
        
        
        System.out.print("**************************************************** ");
        System.out.println("\nNama Staff: " + Staff_01.getName());
        System.out.println("Alamat Staff: " + Staff_01.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + Staff_01.getSalary());
        System.out.println("**************************************************** \n");
        
        
        System.out.print("**************************************************** ");
        System.out.println("\nNama Staff: " + Staff_02.getName());
        System.out.println("Alamat Staffr: " + Staff_02.getAddres());
        System.out.println("Salary Staff adalah : Rp. " + Staff_02.getSalary());
        System.out.println("**************************************************** ");
        
 
    }
    
}
