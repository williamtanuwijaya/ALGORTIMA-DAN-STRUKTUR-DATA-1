public class soal5 {
    public static void main(String[] args) {
        System.out.println(Huruf("Kristian"));
    }
    public static String Huruf(String str) {
        if (str.length() == 0) {
            return "";
        }
        char c = str.charAt(0);
        String rest = str.substring(1);

        if (c == 'a') {
            return Huruf(rest) + c;
        } else {
            return c + Huruf(rest);
        }
    }
}
