import java.util.Scanner;

public class Day046 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("=====Daftar Menu=====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Sate");
        System.out.println("5. Ayam Geprek");
        System.out.print("Masukkan pilihan: ");
        int pilihan = i.nextInt();
        switch(pilihan) {
            case 1:
                 System.out.println("\nNama menu: Nasi Goreng");
                 System.out.println("Harga: Rp15.000");
                 break;
            case 2:
                 System.out.println("\nNama menu: Mie Ayam");
                 System.out.println("Harga: Rp18.000");
                 break;
            case 3:
                 System.out.println("\nNama menu: Bakso");
                 System.out.println("Harga: Rp12.000");
                 break;
            case 4:
                 System.out.println("\nNama menu: Sate");
                 System.out.println("Harga: Rp16.000");
                 break;
            case 5:
                 System.out.println("\nNama menu: Ayam Geprek");
                 System.out.println("Harga: Rp10.000");
                 break;
            default:
                 System.out.println("\nMenu Tidak Tersedia");
        }
        i.close();
    }
}
