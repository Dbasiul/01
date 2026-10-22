package lt.vcd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite skaiciu: ");
        int sk = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(sk + " * " + i + " = " + (sk * i));
        }
    }
}
