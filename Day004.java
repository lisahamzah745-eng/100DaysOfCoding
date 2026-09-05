public class Day004 {
    public static void main(String[] args) {
        /*
         * BYTE 
         * Ukuran: 1 byte = 8 bit
         * Range: -128 sampai 127 
         * Fungsi: Untuk menyimpan bilangan bulat kecil
         */
        byte umurLisa = 19;
        byte suhu = 36;
        System.out.println("=======BYTE=======");
        System.out.println("Umur Lisa: " + umurLisa + " tahun");
        System.out.println("Suhu: " + suhu + "°C");
        /*
         * SHORT 
         * Ukuran: 2 byte = 16 bit
         * Range: -32768 sampai 32767
         * Fungsi: untuk menyimpan bilangan bulat sedang >127 dan <32767
         */
        short tahun = 2026;
        System.out.println("=======SHORT=======");
        System.out.println("Mahasiswa Angkatan " + tahun);
        /*
         * INT 
         * Ukuran: 4 byte = 32 bit
         * Range: -2.147.483.648 sampai 2.147.483.647
         * Fungsi: Untuk tipe data bilangan bulat default. Paling sering dipakai
         *         untuk umur, jumlah, skor, looping
         */
        int jumlahMahasiswa = 2686;
        System.out.println("=======INT=======");
        System.out.println("Jumlah Mahasiswa Baru:" +jumlahMahasiswa);
        /*
         * LONG
         * Ukuran: 8 byte = 64 bit 
         * Range: -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807
         * Fungsi: Untuk menyimpan angka yang sangat besar
         * Penulisannya Wajib ada huruf L di belakang
         * biasanya dipakai untuk jumlah penduduk, timestamp, uang dalam rupiah
         */
        long pendudukSulawesiBarat = 1466741L;
        System.out.println("=======LONG=======");
        System.out.println("Data Jumlah Penduduk Sulawesi Barat");
        System.out.println("Jumlah penduduk 2024 :" + pendudukSulawesiBarat);
    }
}
