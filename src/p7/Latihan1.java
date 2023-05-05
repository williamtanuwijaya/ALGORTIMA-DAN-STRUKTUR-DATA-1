package p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan1 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    int [] A;
    int ukuran;
    public void MaxMin(int i, int j){
        int min1, max1, mid;
        if (i == j){
            max = min = A[i];
        } else if (i == j-1){
            if (A[i] < A[j]){
                max = A[j];
                min = A[i];
            } else {
                max = A[i];
                min = A[j];
            }
        } else {
            mid = (i + j)/2;
            MaxMin(i,mid);

            max1 = max;
            min1 = min;
            MaxMin(mid + 1, j);
            if (max < max1){
                max = max1;
            }
            if (min > min1){

                min = min1;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Latihan1 dc = new Latihan1();
        dc.br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Jumlah Index : ");
        int jumlah = Integer.parseInt(dc.br.readLine());
//        dc.A[0] = 4;
//        dc.A[1] = 12;
//        dc.A[2] = 23;
//        dc.A[3] = 9;
//        dc.A[4] = 21;
//        dc.A[5] = 1;
//        dc.A[6] = 35;
//        dc.A[7] = 2;
//        dc.A[8] = 24;
        dc.A = new int[jumlah];
        for (int i = 0; i < dc.A.length; i++) {
            System.out.println("Input Array " + i + " = ");
            dc.A[i] = Integer.parseInt(dc.br.readLine());
        }
        int i = 0;
        int j = dc.A.length;
        dc.MaxMin(i, (j-1));
        System.out.println("Maksimum = " + dc.max);
        System.out.println("Minimum = " + dc.min);

    }
}
