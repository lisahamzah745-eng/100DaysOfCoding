import java.util.Scanner;

public class Day079{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        String [] l = new String[5];
        int a=1;
        System.out.println("5 Makanan Favorit");
        for(int j=0;j<l.length;j++){
            System.out.print(a+++". ");
            l[j]= i.nextLine();
        }
        System.out.print("\nMenampilkan: ");
        for(int j=0;j<l.length;j++){
            System.out.print("["+j+"] "+l[j]+", ");
        }
    i.close();
    }
}
