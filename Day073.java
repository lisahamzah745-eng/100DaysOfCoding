import java.util.Scanner;

public class Day073{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        int n;
        do{
            System.out.println("== MENU LAYANAN MAHASISWA ==\n1. Biodata Mahasiswa\n2. Jadwal Kelas \n3. Kehadiran Mahasiswa \n0. Keluar");
            System.out.print("pilih: ");
            n= i.nextInt();
            switch(n){
                case 1:
                     System.out.println("== Menampilkan Biodata Mahasiswa==\nNama :.....\nNim  :.....\nKelas:.....\nProdi:.....");
                     break;
                case 2:
                     System.out.println("== Menampilkan Jadwal Kelas ==\n1. Senin:...\n2. Selasa:...\n3. Rabu:...\n4. Kamis:...\n5. Jumat:...\n6. Sabtu:...");
                     break;
                case 3:
                     System.out.println("== Menampilkan Kehadiran Mahasiswa ==\n Kehadiran: ...%");
                     break;
                case 0:
                     break;
                default:
                     System.out.println("LAYANAN BELUM TERSEDIA");
            }
        }while(n!=0);
        System.out.println("==SEMOGA LAYANAN INI BERMANFAAT==");
        i.close();
    }
}
