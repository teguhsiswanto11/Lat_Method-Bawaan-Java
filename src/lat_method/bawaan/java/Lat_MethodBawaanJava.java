package lat_method.bawaan.java;

public class Lat_MethodBawaanJava {
    
    public static void main(String[] args) {
    // Length untuk menghitung panjang karakter
        /*
        String nama = "Siswanto";
        int panjangData;
        
        panjangData = nama.length();
        
        System.out.println("panjang data : "+panjangData);
        */
        
    // Concat untuk menggabungkan panjang karakter
        String namaDepan;
        String namaTengah;
        String namaBelakang;
        String namaLengkap;
        
        namaDepan = "Teguh ";
        namaTengah = "James ";
        namaBelakang = "Siswanto ";
        
//        namaLengkap = namaDepan.concat(namaTengah).concat(namaBelakang);
        namaLengkap = namaDepan+namaTengah+namaBelakang;
        System.out.println("Nama Anda : "+ namaLengkap);
        
    }
    
    
    
}
