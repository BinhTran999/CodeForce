import java.util.Scanner;

public class Problem1A_TheatreSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(theatreSquare(m,n,a));
    }

    public static long theatreSquare(int m, int n, int a){
        int p = 0;
        int q = 0;
        if (m%a > 0){
            p = 1;
        }
        if (n%a > 0){
            q = 1;
        }
        return (long) ((m / a) + p) * ((n/a) + q);
    }


}
