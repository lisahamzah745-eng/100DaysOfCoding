import java.util.Scanner;

public class Day052 {
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = i.nextInt();
        while (a> 0) {
            System.out.println(a);
            a -=1;
        }
      i.close();
    }
}
