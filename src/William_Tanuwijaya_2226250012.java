import java.io.*;
public class William_Tanuwijaya_2226250012 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int  Perpangkatan (int angka, int pangkat){
        if (pangkat == 0){
            return 1;
        } else {
            return angka * Perpangkatan(angka,pangkat-1);
        }
    }
    public static void main(String[] args) throws IOException{

        System.out.println( Perpangkatan(2,3));
        System.out.println(Faktorial(3));
        int[] arr = {9, 3, 5, 9, 8, 2, 9};
        int count = Search(arr, arr.length);
        System.out.println(count);
        System.out.println(Angsa(4));
        String deret = "111";
        System.out.println(sum(deret,0));
    }

    public static int Faktorial(int angka){
        if (angka == 0){
            return 1;
        }
        else {
            return angka * Faktorial(angka-1);
        }
    }

    public static int Search(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        int count = Search(arr, n-1);
        if (arr[n-1] == 9) {
            count++;
        }
        return count;
    }

    public static int Angsa(int n){
        return n*2;
    }
    public static int sum(String deretAngka, int i) {
        if (i == deretAngka.length()) {
            return 0;
        }
        int digit = Character.getNumericValue(deretAngka.charAt(i));
        return digit + sum(deretAngka, i+1);
    }
}
