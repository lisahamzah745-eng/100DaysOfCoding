import java.util.Scanner;

public class Day063{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int m= i.nextInt();
        System.out.print("Masukkan pangkatnya: ");
        int n= i.nextInt();
        int hasil=1;
        for(int a=1;a<=n;a++){
            hasil *= m;
        }
        System.out.printf("%nHasil %d pangkat %d = %d ",m,n,hasil);
        i.close();
    }
}
