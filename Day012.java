import java.util.Scanner;

public class Day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Umur: ");
        int umur = input.nextInt();
        System.out.print("Tinggi: ");
        double tinggi = input.nextDouble();
        System.out.print("NIM: ");
        int nim = input.nextInt();
        System.out.print("Kelas: ");
        char kelas = input.next().charAt(0);

        System.out.println("----BIODATA MAHASISWA----");
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Umur\t: " + umur + " tahun");
        System.out.println("Tinggi\t: " + tinggi + " cm");
        System.out.println("NIM\t: " + nim);
        System.out.println("Kelas\t: " + kelas);
    
     }
}
