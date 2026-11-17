import java.util.Scanner;

public class Day077 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("=== CEK DATA MAHASISWA ===");
        String nama;
        do {
            System.out.print("Masukkan Nama Lengkap: ");
            nama = i.nextLine().trim();
            if (nama.isEmpty()) {
                System.out.println("Gagal: Nama tidak boleh kosong!");
            }
        } while (nama.isEmpty());

        String nim;
        do {
            System.out.print("Masukkan NIM: ");
            nim = i.nextLine().trim();
            if (nim.length() < 4) {
                System.out.println("Gagal: NIM minimal 4 karakter!");
            }
        } while (nim.length() < 4);

        System.out.print("Masukkan Prodi: ");
        String prodi = i.nextLine().trim();

        System.out.println("\nJumlah huruf nama: " + nama.length());
        System.out.println("Nama huruf kapital: " + nama.toUpperCase());
        System.out.println("Nama huruf kecil: " + nama.toLowerCase());

        if (prodi.equals("Informatika")) {
            System.out.println("Prodi sama persis");
        } else if (prodi.equalsIgnoreCase("informatika")) {
            System.out.println("Prodi sama, beda huruf besar/kecil");
        } else {
            System.out.println("Prodi bukan Informatika");
        }

        if (nama.toLowerCase().contains("a")) {
            System.out.println("Nama memiliki huruf 'a'");
        } else {
            System.out.println("Nama tidak memiliki huruf 'a'");
        }

        System.out.println("\nPotongan NIM: " + nim.substring(4));
        System.out.println("Nama tanpa spasi: " + nama.replace(" ", "_"));

        System.out.println("\nData berhasil disimpan, " + nama.toUpperCase() + "!");

        i.close();
    }
}
