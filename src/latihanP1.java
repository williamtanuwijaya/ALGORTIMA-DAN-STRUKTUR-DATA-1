import java.io.*;
public class latihanP1 {
    static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        System.out.println("===========================================");
        InputData();
        Identitas();
    }
    static int InputData() throws IOException{
        int input;
        System.out.println("1. Pajak Tahun Pertama");
        System.out.println("2. Pajak Tahun Kedua dst");
        System.out.println("3. Pajak Lima Tahun");
        System.out.print("Masukkan Pilihan Anda : ");
        input = Integer.parseInt(br.readLine());
        return input;
    }

    static void Identitas() throws IOException{
        String nama = "";
        System.out.println("Masukkan Nama Pemilik : ");
        nama = br.readLine();
        String Plat_Kendaraan = "";
        System.out.println("Masukkan Plat Kendaraan : ");
        Plat_Kendaraan = br.readLine();
        int Harga;
        System.out.println("Masukkan Nilai Jual Motor(NJKB)");
        Harga = Integer.parseInt(br.readLine());
        System.out.println("===========================================");
    }
    static void KelolaData(){
        
    }
}
