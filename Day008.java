public class Day008 {
    public static void main(String[] args) {
       // Deklarasi, yaitu membuat nama variabel tanpa mengisinya terlebih dahulu 
       String nama;
       int umur;
       boolean mahasiswa;
       // Inisialisasi, yaitu memberikan nilai awal untuk pertama kalinya pada variabel yang sudah dideklarasikan
       nama = "Lisa";
       umur = 18;
       mahasiswa = false;

       System.out.println("Data awal:");
       System.out.println("Nama\t : " + nama);
       System.out.println("Umur\t : " + umur + " tahun");
       System.out.println("Mahasiswa: " + mahasiswa);

       // Update Variabel, yaitu mengubah atau memperbarui nilai dari variabel sebelumnya
       nama = "Lisa Hamzah";
       umur = umur +1;
       mahasiswa = true;

       System.out.println("\nData setelah Update Variabel:");
       System.out.println("Nama\t : " + nama);
       System.out.println("Umur\t : " + umur + " tahun");
       System.out.println("Mahasiswa: " + mahasiswa);
    }
}
