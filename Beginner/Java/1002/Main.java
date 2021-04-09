import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        final double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        System.out.printf("A=%.4f%n", (PI * (raio*raio)));
    }
 
}
