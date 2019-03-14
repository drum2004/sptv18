package cycle;
public class Cycle {
    public static void main(String[] args) {
        int i = 512;
        while (i>=512) {            
            System.out.print(" "+i);
            i/=2;
        }
        
    }
}
