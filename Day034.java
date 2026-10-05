import java.util.Scanner;

public class Day034{
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        int umur = i.nextInt();
        if (12>umur){
            System.out.println("Anak-anak");
        }else if (18>umur){
            System.out.println("Remaja");
        }else {
            System.out.println("Dewasa");
        }
    }
}
