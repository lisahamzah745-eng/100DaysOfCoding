import java.util.Scanner;

public class Day055 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        int n = i.nextInt();
        System.out.println("Contoh continue");
        for(int j=1;j<=n;j++){
            if(n==7){
                continue;
            }
            System.out.println(j+" ");
        }
        System.out.println("\nContoh break");
        for(int j=1;j<=n;j++){
            if(n==5){
                break;
            }
            System.out.println(j+" ");
        }
        System.out.println("\nContoh return");
       if (n< 0) {
            System.out.println("Input negatif! PROGRAM DIHENTIKAN SEBELUM SELESAI");
            i.close();
            return; 
        }
     i.close();
    }
}
