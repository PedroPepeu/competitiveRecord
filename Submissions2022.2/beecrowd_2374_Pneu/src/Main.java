import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int dif = N - M;
        
        System.out.printf("%d\n", dif);
        
        sc.close();
 
    }
 
}