import java.util.Scanner;

public class Day080{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        String [] l = new String[3];
        l[0]= "Strobery";
        l[1]= "Mangga";
        l[2]= "Apel";
        System.out.print("Pilih(0-2): ");
        int a= i.nextInt();
        System.out.println("pilihan anda: "+l[a]);
    i.close();
    }
}
