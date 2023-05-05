package p7;

public class pangkat {
    public int Exp3(int a, int n){
        int x = 0;
        if (n  == 0){
            return 1;
        } else {
            x = Exp3(a,n /2);
            if (n % 2 ==1){
                return x*x*a;
            } else {
                return x*x*a;
            }
        }
    }
    public static void main(String[] args) {
        pangkat dc = new pangkat();
        System.out.println(dc.Exp3(2,3));
    }
}