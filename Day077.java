import java.util.Scanner;

public class Day077 {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        boolean l,s=false;
        String username,password;
        do{
            System.out.println("\n=== BUAT AKUN & LOGIN ===");
            System.out.println("Aturan: Username tidak boleh memakai spasi dan password minimal 6 karakter.\n");
            System.out.print("Buat Username baru: ");
            username = i.nextLine().trim();
            if (username.contains(" ")) {
                l = true;
                System.out.println("Gagal: Username tidak boleh pakai spasi!");
            }else{
                break;
            }        
        }while(l);
        
        do{
            System.out.print("Buat Password baru: ");
            password = i.nextLine();
            if (password.length() < 6) {
                s= true;
                System.out.println("Gagal: Password terlalu pendek! Minimal 6 karakter (Anda memasukkan "+ password.length() + " karakter)");
            }else{
                break;
        }
        }while(s);   
        String kode= "A-" + username.toUpperCase();
        System.out.println("\n Yeyy.., akun anda berhasil dibuat!");
        System.out.println("Username tersimpan : " + username);
        System.out.println("----------------------------------------");
        System.out.println("\n=== SILAKAN LOGIN ===");
        System.out.print("Masukkan Username : ");
        String User = i.nextLine().trim();
        System.out.print("Masukkan Password : ");
        String Pass = i.nextLine();
        System.out.println("Kode Keamanan     : " + kode);
        System.out.print("Ketik ulang kode keamanan di atas : ");
        String inKode= i.nextLine().trim();

        System.out.println("\nMemverifikasi data...");

        boolean UserValid = User.equalsIgnoreCase(username);
        boolean kodeValid = inKode.equalsIgnoreCase(kode);
        boolean PassValid = Pass.equals(password);      
        if (UserValid && PassValid && kodeValid) {
            System.out.println("Selamat datang, " + username.toUpperCase() + "! Anda berhasil masuk.");
        } else {
            System.out.println("Login gagal! Periksa kembali inputan Anda:");
            if (!UserValid) System.out.println("- Username tidak ditemukan.");
            if (!PassValid) System.out.println("- Password salah (perhatikan huruf kapital/kecil).");
            if (!kodeValid) System.out.println("- Kode keamanan tidak cocok.");
        }

        i.close();
    }
}
            
