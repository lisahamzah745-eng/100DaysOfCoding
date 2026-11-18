import java.util.Scanner;

public class Day078 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String nama = "Lisa Hamzah";
        String nim = "3";
        
        while(true){
            System.out.print("Masukkan username: ");
            String user = i.nextLine();
            System.out.print("Masukkan pasword: ");
            String pas = i.nextLine();
            if(user.equals(nama)&&pas.equals(nim)){
                System.out.println("Anda login sebagai mahasiswa");
                break;
            }else if(user.equals("admin")&&pas.equals("admin")){
                System.out.println("Anda login sebagai admin");
                break;
            }else{
                System.out.println("Akun anda tidak ditemukan");
            }
        }
    }
}
