import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        
        int f = 1;
        
        while(N != 0) {
            f *= N;
            N--;
        }
        
        System.out.printf("%d\n", f);
 
    }
 
}