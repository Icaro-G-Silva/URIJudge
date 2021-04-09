import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        float hourValue = scanner.nextFloat();
        
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", number, (hourValue*hours));
    }

}
