public class soal2 {
    public static void main(String[] args) {
        System.out.println(Angsa(2));
    }
    public static int Angsa(int angsa){
        if (angsa == 0){
            return 0;
        } else {
            return 2 + Angsa(angsa - 1);
        }
    }
}
