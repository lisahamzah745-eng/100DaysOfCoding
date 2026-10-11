import java.util.Scanner;

public class Day040 {
    public static void main(String[] args){
        Scanner i = new Scanner (System.in);
        int h = i.nextInt();
        int m = i.nextInt();
        int k = i.nextInt();
        
        int Tmenit = (h*60)+m+k;
        int Smenit = Tmenit%60;
        int Tjam = (Tmenit-Smenit)/60;
        int Sjam = Tjam%24;
        int hari = (Tjam-Sjam)/24;
        
        System.out.printf("%02d:%02d %d",Sjam,Smenit,hari);
    }
}
