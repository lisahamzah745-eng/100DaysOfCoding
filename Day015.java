public class Day015 {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        System.out.println("Diketahui");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Hasil perkalian dan pembagiannya");
        System.out.println("a × b = " + (a*b));
        System.out.println("a ÷ b = " + (a/b));
        
        // Catatan!!
        // pembagi ≠ 0 ,karena jika pembagi = 0 maka pembagian tidak dapat dilakukan
        // contohnya, misalkan saya buat variabel tambahan = 0
        // int c = 0;
        // System.out.println(b/c);   yaitu menampilkan hasil (5/0) 
        // hasilnya itu akan error dan program akan langsung berhenti
    }  
}
