public class Day007 {
    public static void main(String[] args) {
        // string adalah tipe data untuk menyimpan teks yang bisa berisi huruf,angka,simbol,spasi,dan emoji
        // ditulis menggunakan tanda kutip " "
        String namadepan = "Lisa";
        String namabelakang = "Hamzah";

        // menampilkan string
        System.out.println("Nama depan\t: " + namadepan);
        System.out.println("Nama belakang\t: " + namabelakang);

        // menggabungkan string
        String namalengkap = namadepan +" "+ namabelakang;
        //menampilkan hasil gabungan string
        System.out.println("Nama lengkap\t: " + namalengkap);

        //menampilkan panjang string
        System.out.println("Panjang Nama\t: " + namalengkap.length() + " huruf");

        //mengubah teks ke huruf besar dan huruf kecil
        System.out.println("Huruf Besar\t: " + namalengkap.toUpperCase());
        System.out.println("Huruf Kecil\t: " + namalengkap.toLowerCase());
    }
}
