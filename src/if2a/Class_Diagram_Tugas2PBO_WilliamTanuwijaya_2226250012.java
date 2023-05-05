package if2a;
/*William Tanuwijaya
IF2A
2226250012*/
class PendaftaranSekolahSMA {
    private String nama;
    private String nik;
    private String tanggalLahir;
    private double rataRataNilaiIjazahSMP;
    private String asal_SMP;
    private String nomor_Telepon;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNIK(String nik) {
        this.nik = nik;
    }

    public String getNIK() {
        return nik;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setRataRataNilaiIjazahSMP(double rataRataNilaiIjazahSMP) {
        this.rataRataNilaiIjazahSMP = rataRataNilaiIjazahSMP;
    }

    public double getRataRataNilaiIjazahSMP() {
        return rataRataNilaiIjazahSMP;
    }

    public void setAsalSMP(String asal_SMP) {
        this.asal_SMP = asal_SMP;
    }

    public String getAsalSMP() {
        return asal_SMP;
    }

    public void setNomorTelepon(String nomor_Telepon) {
        this.nomor_Telepon = nomor_Telepon;
    }

    public String getNomorTelepon() {
        return nomor_Telepon;
    }
    void Output(){
        System.out.println("Nama \t\t\t\t\t\t\t: " + getNama());
        System.out.println("NIK \t\t\t\t\t\t\t: " + getNIK());
        System.out.println("Tanggal Lahir \t\t\t\t\t: " + getTanggalLahir());
        System.out.println("Asal SMP \t\t\t\t\t\t: " + getAsalSMP());
        System.out.println("Rata-rata Nilai Ijazah SMP \t\t: " + getRataRataNilaiIjazahSMP());
        System.out.println("Nomor Telepon \t\t\t\t\t: " + getNomorTelepon());
    }
}
public class Class_Diagram_Tugas2PBO_WilliamTanuwijaya_2226250012 {
    public static void main(String[] args) {
        PendaftaranSekolahSMA daftar = new PendaftaranSekolahSMA();
        daftar.setNama("William Tanuwijaya");
        daftar.setNIK("167180999999");
        daftar.setTanggalLahir("8 Juli 2004");
        daftar.setAsalSMP("SMP Xaverius 1 Palembang");
        daftar.setRataRataNilaiIjazahSMP(89.9);
        daftar.setNomorTelepon("0813555574748");
        daftar.Output();
    }
}
