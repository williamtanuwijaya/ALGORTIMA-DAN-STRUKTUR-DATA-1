package algoritma;

import java.io.*;

/*
William Tanuwijaya
IF2A
2226250012
 */
public class Algoritma_Pengurutan {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void Bubble_Sort_Ascending(int[] data, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void Bubble_Sort_Descending(int[] data, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j > n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Algoritma_Pengurutan ex = new Algoritma_Pengurutan();
        int n = Integer.parseInt(ex.br.readLine());
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Indeks[%d] = ", i);
            data[i] = Integer.parseInt(ex.br.readLine());
        }
        ex.Bubble_Sort_Ascending(data, n);
        System.out.println();
        System.out.println("Bubble Sort Ascending");
        ex.Printarray(data);
        ex.Selection_Maks_Asc(data, n);
        System.out.println();
        System.out.println("Selection Maks Ascending");
        ex.Printarray(data);
        ex.Selection_Maks_Desc(data, n);
        System.out.println();
        System.out.println("Selection Maks Descending");
        ex.Printarray(data);
        ex.Bubble_Sort_Descending(data, n);
        System.out.println();
        System.out.println("Bubble Sort Descending");
        ex.Printarray(data);
        ex.Selection_Min_Asc(data, n);
        System.out.println();
        System.out.println("Selection Min Ascending");
        ex.Printarray(data);
        ex.Selection_Min_Desc(data, n);
        System.out.println();
        System.out.println("Selection Min Descending");
        ex.Printarray(data);
        ex.insertionSort_Asc(data, n);
        System.out.println("Insertion Sort Ascending");
        ex.Printarray(data);
    }

    public void Printarray(int[] data) {
        int i = 0;
        System.out.println("Data yang sudah diurutkan ");
        for (int temp : data) {
            System.out.printf("Indeks[%d] = %d\n", i, temp);
            i++;
        }
    }

    public void Selection_Maks_Asc(int[] data, int n) {
        for (int i = n - 1; i > 0; i--) {
            int indeks_maks = 0;
            for (int j = 1; j < i; j++) {
                if (data[j] > data[indeks_maks]) {
                    indeks_maks = j;
                }
            }
            int temp = data[indeks_maks];
            data[indeks_maks] = data[i];
            data[i] = temp;
        }
    }

    public void Selection_Maks_Desc(int[] data, int n) {
        for (int i = 0; i < n - 1; i++) {
            int indeks_maks = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] > data[indeks_maks]) {
                    indeks_maks = j;
                }
            }
            int temp = data[indeks_maks];
            data[indeks_maks] = data[i];
            data[i] = temp;
        }
    }

    public void Selection_Min_Asc(int[] data, int n) {
        for (int i = 0; i < n - 1; i++) {
            int indeks_maks = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[indeks_maks]) {
                    indeks_maks = j;
                }
            }
            int temp = data[indeks_maks];
            data[indeks_maks] = data[i];
            data[i] = temp;
        }
    }

    public void Selection_Min_Desc(int[] data, int n) {
        for (int i = n - 1; i > 0; i--) {
            int indeks_maks = 0;
            for (int j = 1; j < i; j++) {
                if (data[j] < data[indeks_maks]) {
                    indeks_maks = j;
                }
            }
            int temp = data[indeks_maks];
            data[indeks_maks] = data[i];
            data[i] = temp;
        }
    }

    public void insertionSort_Asc(int[] data, int n) {
        int temp;
        int j;
        for (int i = 1; i < n; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public void ShellSort_Asc(int[] data, int n) {
        for (int jarak = n / 2; jarak > 0; jarak++) {
            for (int i = jarak; i < n; i++) {
                int temp = data[i];
                int j;
                for (j = i; j >= jarak && data[j - jarak] > temp; j -= jarak) {
                    data[j] = data[j - jarak];
                }
                data[j] = temp;
            }
        }
    }

    public boolean linierSearch(int []data, int cari){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari){
                return true;
            }
        }
        return false;
    }
}
