package if2a;
/* William Tanuwijaya
IF2A
2226250012
 */
class Mahasiswa{
    private String npm;
    private String namaLengkap;
    private String agama;
    private String jenisKelamin;
    private String alamat;
    private String prodi;
    private String fakultas;

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getNpm() {
        return npm;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAgama() {
        return agama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getProdi() {
        return prodi;
    }

    public String getFakultas() {
        return fakultas;
    }
    public Mahasiswa(){
        this.npm = "-";
        this.namaLengkap = "-";
        this.agama = "-";
        this.jenisKelamin = "-";
        this.alamat = "-";
        this.prodi = "-";
        this.fakultas = "-";
    }
    public Mahasiswa(String npm, String namaLengkap, String agama, String jenisKelamin, String alamat, String prodi, String fakultas){
        this.npm = npm;
        this.namaLengkap = namaLengkap;
        this.agama = agama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
}
public class Pratikum8_WilliamTanuwijaya_2226250012 {
        public static void main(String[] args) {
            System.out.println("Mahasiswa ke 1");
            Mahasiswa M1 = new Mahasiswa("2226250012", "William Tanuwijaya", "Kristen Protestan", "Laki-Laki", "Jl. Segaran", "Informatika", "Ilmu Komputer Dan Rekayasa");
            System.out.println("NPM \t\t\t\t: " + M1.getNpm());
            System.out.println("Nama Lengkap \t\t: " + M1.getNamaLengkap());
            System.out.println("Agama \t\t\t\t: " + M1.getAgama());
            System.out.println("Jenis Kelamin \t\t: " + M1.getJenisKelamin());
            System.out.println("Alamat \t\t\t\t: " + M1.getAlamat());
            System.out.println("Prodi \t\t\t\t: " + M1.getProdi());
            System.out.println("Fakultas \t\t\t: " + M1.getFakultas());

            System.out.println("=============================================================");

            System.out.println("Mahasiswa ke 2");
            Mahasiswa M2 = new Mahasiswa();
            System.out.println("NPM \t\t\t\t: " + M2.getNpm());
            System.out.println("Nama Lengkap \t\t: " + M2.getNamaLengkap());
            System.out.println("Agama \t\t\t\t: " + M2.getAgama());
            System.out.println("Jenis Kelamin \t\t: " + M2.getJenisKelamin());
            System.out.println("Alamat \t\t\t\t: " + M2.getAlamat());
            System.out.println("Prodi \t\t\t\t: " + M2.getProdi());
            System.out.println("Fakultas \t\t\t: " + M2.getFakultas());
        }
    }


