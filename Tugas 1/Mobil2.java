package tugaspemrograman2;

public class Mobil2 {



    public static void main(String[] args) {
        
        System.out.println("=============================\n");
        System.out.println("  Satria Nasution - 1841811 - SI Z");
        System.out.println("  Tugas Latihan Pemrograman 2  ");
        System.out.println("=============================\n");
        Mobil toyota = new Mobil();

        toyota.start(true);
        toyota.gantiGigi(1);
        toyota.gas();
        toyota.rem(true);
        toyota.stop(false);
        toyota.gas();
       
         

    }
}
