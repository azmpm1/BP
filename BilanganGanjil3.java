package bilanganganjil3;
/**
 *
 * @author AHMAD HARIS
 */
import java.util.Scanner;
public class BilanganGanjil3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Program Bilangan Ganjil");
        System.out.print("Masukkan N = ");
        int N = s.nextInt();
        int i= 0;
        do{
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
            i++;
        }
        while(i<=N);
        System.out.println("");
    }
}
