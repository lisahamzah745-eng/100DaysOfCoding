import java.util.Scanner;

public class Day059 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan kelipatan: ");
        int m = i.nextInt();
        System.out.print("Masukkan batas angka: ");
        int n = i.nextInt();
        System.out.println("\nAngka kelipatan "+m+" dari 1-"+n);
        for(int j=1;j<=n;j++){
            if(j%m==0){
                System.out.println(j);
            }
        }
        i.close();
    }
}
