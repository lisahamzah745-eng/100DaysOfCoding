public class Day010 {
    public static void main(String[] args) {
        // Batas nilai maksimal dan minimal tipe data penting agar program tidak mengalami overflow atau underflow
        // MAX_VALUE berfungsi untuk menampilkan nilai maksimal dari suatu tipe data
        // MIN_VALUE berfungsi untuk menampilkan nilai minimal dari suatu tipe data
        System.out.println("Batas Maksimal dan Minimal Tipe Data");
        // Byte
        System.out.println("\nBatas Nilai Byte");
        System.out.println("Nilai Maksimal: " + Byte.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Byte.MIN_VALUE);
        // Short
        System.err.println("\nBatas Nilai Short");
        System.out.println("Nilai Maksimal: " + Short.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Short.MIN_VALUE);
        // Int
        System.out.println("\nBatas Nilai Int");
        System.out.println("Nilai Maksimal: " + Integer.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Integer.MIN_VALUE);
        // Long
        System.out.println("\nBatas Nilai Long");
        System.out.println("Nilai Maksimal: " + Long.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Long.MIN_VALUE);
        // Float
        System.out.println("\nBatas Nilai Float");
        System.out.println("Nilai Maksimal: " + Float.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Float.MIN_VALUE);
        // Double
        System.out.println("\nBatas Nilai Double ");
        System.out.println("Nilai Maksimal: " + Double.MAX_VALUE);
        System.out.println("Nilai Minimal: " + Double.MIN_VALUE);
    }
}
