import java.util.Scanner;

public class Day071{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int n = i.nextInt();
        System.out.println(); 
        for(int a= n; a>=1;a--){
            for(int b= a; b>=1;b--){
                System.out.print("*");
             }
            System.out.println(); 
        }
        i.close();
    }
}
