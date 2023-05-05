public class soal3 {
    public static void main(String[] args) {
        System.out.println(Digit(111));
    }
    public static int Digit(int angka){
        if (angka == 0){
            return 0;
        } else {
            return (angka % 10) + Digit(angka/10);
        }
    }
}
