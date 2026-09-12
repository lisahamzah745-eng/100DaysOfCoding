import java.util.Scanner;

public class Day011 {
    public static void main(String[] args) {
        // Scanner digunakan untuk membaca input atau data dari pengguna melalui keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama kamu:");
        // nextLine() berfungsi untuk membaca satu baris penuh teks.
        String nama = input.nextLine();
        System.out.println("Halo " + nama + ", selamat datang!!");

        System.out.println("Hari ini sudah tugas day berapa?");
        // nextInt() berfungsi untuk membaca angka bulat
        int day = input.nextInt();

        System.out.println("Nggak terasa yah udah " + day + "day ajah");
        System.out.println("Jangan lupa untuk \"Tetap menyerah dan jangan pernah semangat\"");
    }
}
