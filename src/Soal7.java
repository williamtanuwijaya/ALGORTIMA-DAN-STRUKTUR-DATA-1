public class Soal7 {
    public static void main(String[] args) {
        System.out.println(Soal7("Muhammad zaky SuZuki"));
    }

    public static String Soal7(String kata) {
        if (kata.length() == 0) {
            return kata;
        } else {
            if (kata.charAt(0) == 'z' || kata.charAt(0) == 'Z') {
                return Soal7(kata.substring(1));
            } else {
                return kata.charAt(0) + Soal7(kata.substring(1));
            }
        }
    }
}
