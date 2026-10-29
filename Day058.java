import java.util.Scanner;

public class Day058 {
    public static void main(String[] args){
        Scanner i =new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        int n = i.nextInt();
        System.out.println("\nMenampilkan angka ganjil "+n+"-1");
        for(int j=n;j>0;j--){
            if(j%2!=0){
                System.out.println(j);
            }
        }
        System.out.println("\nMenampilkan angka genap "+n+"-1");
        for(int j=n;j>0;j--){
            if(j%2==0){
                System.out.println(j);
            }
        }
        i.close();
    }
}
