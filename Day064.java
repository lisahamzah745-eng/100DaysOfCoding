import java.util.Scanner;

public class Day064{
    public static void main(String[] args){
        Scanner i= new Scanner (System.in);
        System.out.print("Masukkan angka faktorialnya: ");
        int n= i.nextInt();
        int hasil=1;
        System.out.println();
        System.out.print(n +"!: ");
        for(int a=n;a>0;a--){
            hasil *= a;
            System.out.print(a);
            if(a>1){
                System.out.print(" × ");
            }
        }
        System.out.print(" = "+hasil);
        i.close();
    }
}
