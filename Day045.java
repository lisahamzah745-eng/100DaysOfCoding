import java.util.Scanner;

public class Day045 {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("=== Keinginan Kamu ===");
        System.out.println("1. Mau  belajar ");
        System.out.println("2. Mau  Jajan");
        System.out.println("3. Mau  jalan-jalan");
        System.out.print("Pilih keinginan mu (1-3): " );
        int keinginan = i.nextInt();
        switch (keinginan){
          case 1:
               System.out.println("Buka buku......");
               break;
          case 2:
               System.out.println("Lihat isi dompet.......");
               break;
          case 3:
               System.out.println("Bersiap-siap......");
               break;
          default:
               System.out.println("Yahh, keinginan mu belum tersedia ");
        }
        i.close();
    }
}
