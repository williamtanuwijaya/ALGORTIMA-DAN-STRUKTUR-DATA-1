import java.util.LinkedList;
import java.util.Queue;

public class LatihanQueue_WilliamTanuwijaya {
    private Queue<String> antrianPasienUmum;
    private Queue<String> antrianPasienBPJS;
    private Queue<String> antrianPasienAsuransi;

    public LatihanQueue_WilliamTanuwijaya() {
        antrianPasienUmum = new LinkedList<>();
        antrianPasienBPJS = new LinkedList<>();
        antrianPasienAsuransi = new LinkedList<>();
    }

    public void tambahAntrianPasienUmum(String nomorAntrian) {
        antrianPasienUmum.offer(nomorAntrian);
    }

    public void tambahAntrianPasienBPJS(String nomorAntrian) {
        antrianPasienBPJS.offer(nomorAntrian);
    }

    public void tambahAntrianPasienAsuransi(String nomorAntrian) {
        antrianPasienAsuransi.offer(nomorAntrian);
    }

    public String panggilAntrianPasienUmum() {
        if (!antrianPasienUmum.isEmpty()) {
            return antrianPasienUmum.poll();
        }
        return "Antrian pasien umum kosong";
    }

    public String panggilAntrianPasienBPJS() {
        if (!antrianPasienBPJS.isEmpty()) {
            return antrianPasienBPJS.poll();
        }
        return "Antrian pasien BPJS kosong";
    }

    public String panggilAntrianPasienAsuransi() {
        if (!antrianPasienAsuransi.isEmpty()) {
            return antrianPasienAsuransi.poll();
        }
        return "Antrian pasien asuransi lainnya kosong";
    }

    public static void main(String[] args) {
        LatihanQueue_WilliamTanuwijaya antrianRumahSakit = new LatihanQueue_WilliamTanuwijaya();

        antrianRumahSakit.tambahAntrianPasienUmum("A001");
        antrianRumahSakit.tambahAntrianPasienUmum("A002");
        antrianRumahSakit.tambahAntrianPasienBPJS("B001");
        antrianRumahSakit.tambahAntrianPasienAsuransi("C001");

        System.out.println("Nomor antrian pasien umum yang dipanggil: " + antrianRumahSakit.panggilAntrianPasienUmum());
        System.out.println("Nomor antrian pasien BPJS yang dipanggil: " + antrianRumahSakit.panggilAntrianPasienBPJS());
        System.out.println("Nomor antrian pasien asuransi lainnya yang dipanggil: " + antrianRumahSakit.panggilAntrianPasienAsuransi());
    }
}
