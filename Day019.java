public class Day019 {
    public static void main (String[] args){
        long nilaiLong = 127;
        int nilaiInt = (int) nilaiLong;
        short nilaiShort = (short) nilaiInt;
        byte nilaiByte = (byte) nilaiShort;
        System.out.println("Mengubah Tipe Data Besar ke Kecil")
        System.out.println("Nilai long\t\t: " +nilaiLong);
        System.out.println("Tipe data Long ke Int\t: " +nilaiInt);
        System.out.println("Tipe data Int ke Short\t: " +nilaiShort);
        System.out.println("Tipe data Short ke Byte\t: " +nilaiByte);
        
    }
}
