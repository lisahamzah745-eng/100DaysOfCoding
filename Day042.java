import java.util.Scanner;

public class Day042{
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.println("=== MENGHITUNG GAJI BERSIH ===" );
        System.out.print("Masukkan Nama\t : " );
        String nama = i.nextLine();
        System.out.print("Masukkan Gaji Pokok: Rp ");
        double gajipokok = i.nextDouble();
        System.out.print("Masukkan Tunjangan : Rp ");
        double tunjangan = i.nextDouble();
        System.out.print("Masukkan Potongan  : Rp");
        double potongan = i.nextDouble();

        double pajak = 0;
        if (gajipokok > 5000000) {
            pajak = gajipokok * 0.05;  
        }else{
            pajak = gajipokok * 0.02;
        }
        
        double gajikotor = gajipokok + tunjangan;
        double gajibersih = gajikotor - (potongan + pajak);

        System.out.println("=============================");
        System.out.println("Nama\t\t : " +nama );
        System.out.printf("Total Gaji Bersih : Rp %.2f", gajibersih);
        i.close();
    }
}
