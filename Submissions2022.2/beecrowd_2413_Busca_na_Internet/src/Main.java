import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int firstLink = t * 4;
        
        System.out.printf("%d\n", firstLink);
        
        sc.close();
 
    }
 
}