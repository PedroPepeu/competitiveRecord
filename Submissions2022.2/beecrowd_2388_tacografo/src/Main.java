import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int S = 0;
        
        while(N > 0) {
            int T, V;
            T = sc.nextInt(); V = sc.nextInt();
            S += T * V;
            N--;
        }
        
        System.out.printf("%d\n", S);
 
    }
 
}