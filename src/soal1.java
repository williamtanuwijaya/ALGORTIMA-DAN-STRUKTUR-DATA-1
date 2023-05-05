public class soal1 {
    public static void main(String[] args) {
        int n;
        System.out.println(Rekursif(98988999));
    }
    public static int Rekursif(int n) {
        if (n == 0){
            return 0;
        } else if (n % 10 == 9) {
            return 1 + Rekursif(n / 10);
        } else {
            return Rekursif(n / 10);
        }
    }
}