import java.util.Scanner;

public class Day061 {
    public static void main(String[] args){
        Scanner i =new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = i.nextInt();
        int hasil =1;
        for(int j=1;j<=n;j++){
            hasil *=j;
        }
        System.out.println("\nHasil perkalian angka 1-"+n+" : "+hasil);
     i.close();
    }
}
