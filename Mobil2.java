package tugas2;

public class Mobil2 {

    public static void main(String[] args) {
        
        System.out.println("=============================\n");
        System.out.println("  Mochamad Erdiansyah - 1841805 - SI Z");
        System.out.println("  Tugas Latihan Pemrograman 2  ");
        System.out.println("=============================\n");
        Mobil sedan = new Mobil();

        sedan.start(true);
        sedan.gantiGigi(4);
        sedan.gas();
        sedan.rem(true);
        sedan.stop(true);
        sedan.gas();
       
         

    }
}
