public class soal3 {
     public static void main(String[] args) {
        String nama = "andi";
        char kelas ='A';
        String status = "Aktif";

        System.out.println("BIODATA MAHASISWA\n----------------------");
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("Status\t: \"" + status + "\"");

     }
}

import java.util.Scanner;

public class soal5 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("nama lengkap: ");
    String nama = input.nextLine();
    System.out.print("Nim: ");
    String nim = input.nextLine();
    System.out.print("umur:");
    int umur = input.nextInt();
    System.out.print("Tinggi: ");
    double tinggi = input.nextDouble();
    System.out.print("jenis kelamin: ");
    char jeniskelamin = input.next().charAt(0);

    System.out.println("-----BIODATA MAHASISWA------");
    System.out.println("Nama Lengkap\t: " + nama);
    System.out.println("NIM\t\t: " + nim);
    System.out.println("Umur\t\t: " + umur + "tahun");
    System.out.println("Tinggi Badan\t: " + tinggi + "cm");
    System.out.println("Jenis Kelamin\t: " + jeniskelamin);
   }
}
