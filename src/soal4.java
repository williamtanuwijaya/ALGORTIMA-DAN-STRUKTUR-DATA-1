public class soal4 {
    public static void main(String[] args) {
        System.out.println(Kalimat("aaaaaa"));
    }
    public static int Kalimat(String kata){
        if (kata.length() == 0){
            return 0;
        }  else if (kata.charAt(0) == 'x'){
            return 1 + Kalimat(kata.substring(1));
        } else {
            return Kalimat(kata.substring(1));
        }
    }
}
