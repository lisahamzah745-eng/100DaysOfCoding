import java.util.Scanner;

public class Day065{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan panjang garis: ");
        int n = i.nextInt();
        for (int a=1; a<=n;a++){
            System.out.println("|");
        }
        i.close();
    }
}
