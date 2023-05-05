public class soal6 {
    public static void main(String[] args) {
        System.out.println(Soal6("22umur22umur22"));
    }
    public static int Soal6(String kata){
        if (kata.length() < 2){
            return 0;
        } else if (kata.substring(0,2).equalsIgnoreCase("22")){
                return 1 + Soal6(kata.substring(2));
            }
         else {
            return Soal6(kata.substring(2));
        }
    }
}
