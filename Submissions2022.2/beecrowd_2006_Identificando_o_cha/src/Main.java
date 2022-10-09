import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int A, B , C, D, E;
        A = sc.nextInt(); B = sc.nextInt(); C = sc.nextInt(); D = sc.nextInt(); E = sc.nextInt();
        
        int win = 0;
        
        boolean ta = T == A;
        if(ta){
            win++;
        }
        boolean tb = T == B;
        if(tb){
            win++;
        }
        boolean tc = T == C;
        if(tc){
            win++;
        }
        boolean td = T == D;
        if(td){
            win++;
        }
        boolean te = T == E;
        if(te){
            win++;
        }
        
        System.out.printf("%d\n", win);
        
        sc.close();
 
    }
 
}