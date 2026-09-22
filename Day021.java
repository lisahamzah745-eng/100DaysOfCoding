public class Day021 {
    public static void main (String[] args){
        String Angka = "21";
        String nilai = "A";
        String Status = "true";
        
        byte angka1 = Byte.parseByte(Angka);
        short angka2 = Short.parseShort(Angka);
        int angka3 = Integer.parseInt(Angka);
        long angka4 = Long.parseLong(Angka);
        float angka5 = Float.parseFloat(Angka);
        double angka6 = Double.parseDouble(Angka);
        char angka7 = nilai.charAt(0);
        boolean status = Boolean.parseBoolean(Status);
        
        System.out.println("Mengubah Tipe Data String menjadi Primitif");
        System.out.println("Tipe data byte\t : "+angka1);
        System.out.println("Tipe data short\t : "+angka2);
        System.out.println("Tipe data int\t : "+angka3);
        System.out.println("Tipe data long\t : "+angka4);
        System.out.println("Tipe data float\t : "+angka5);
        System.out.println("Tipe data double : "+angka6);
        System.out.println("Tipe data char\t : "+angka7);
        System.out.println("Tipe data boolean: "+status);         
    }
}
