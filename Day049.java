import java.util.Scanner;

public class Day049 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai= i.nextInt();
        String hasil = (nilai>=70)?"Lulus":"Tidak Lulus";
        System.out.println("Kamu "+hasil);
    }
}
