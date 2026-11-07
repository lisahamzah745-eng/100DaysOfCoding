import java.util.Scanner;

public class Day067{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        System.out.print("Masukkan panjang sisi: ");
        int n = i.nextInt();
        System.out.println(); 
        for(int a= 1; a<=n;a++){
            for(int b= 1; b<=n;b++){
                System.out.print("* ");
             }
            System.out.println(); 
        }
        i.close();
    }
}
