import java.util.Scanner;

public class Day046 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("=====Daftar Menu=====");
        System.out.println("1. Nasi Goreng\n2. Mie Ayam\n3. Bakso\n4. Sate\n5. Ayam Geprek");
        System.out.print("Masukkan pilihan: ");
        int pilihan = i.nextInt();
        switch(pilihan) {
            case 1:
                 System.out.println("\nNama menu: Nasi Goreng\nHarga: Rp15.000");
                 break;
            case 2:
                 System.out.println("\nNama menu: Mie Ayam\nHarga: Rp18.000");
                 break;
            case 3:
                 System.out.println("\nNama menu: Bakso\nHarga: Rp12.000");
                 break;
            case 4:
                 System.out.println("\nNama menu: Sate\nHarga: Rp16.000");
                 break;
            case 5:
                 System.out.println("\nNama menu: Ayam Geprek\nHarga: Rp10.000");
                 break;
            default:
                 System.out.println("\nMenu Tidak Tersedia");
        }
        i.close();
    }
}
