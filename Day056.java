import java.util.Scanner;

public class Day056 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int n = i.nextInt();
        System.out.println("\nMenampilkan angka 1-"+n);
        for(int j=1;j<=n;j++){
            System.out.println(j);
        }
        System.out.println("\nMenampilkan angka "+n+"-1");
        for(int j=n;j>0;j--){
            System.out.println(j);
        }
        i.close();
        
    }
}
