import java.io.*;
public class tugas_rumus_fisika {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menghitung getaran");

        System.out.println("Masukkan waktu tempuh = ");
        double waktuTempuh = Double.parseDouble(br.readLine());

        System.out.println("Masukkan jumlah getaran = ");
        double jumlahGetaran = Double.parseDouble(br.readLine());

        double frekuensi = hitungFrekuensi(waktuTempuh, jumlahGetaran);
        System.out.println("Frekuensinya adalah = " + frekuensi + " Hz");

        double periode = hitungPeriode(waktuTempuh, jumlahGetaran);
        System.out.println("Periodenya adalah = " + periode + " s");
    }

    public static double hitungFrekuensi(double waktuTempuh, double jumlahGetaran) {
        double frekuensi = jumlahGetaran / waktuTempuh;
        return frekuensi;
    }

    public static double hitungPeriode(double waktuTempuh, double jumlahGetaran) {
        double periode = waktuTempuh / jumlahGetaran;
        return periode;
    }
}