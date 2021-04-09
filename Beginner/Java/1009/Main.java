import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        float fixSalary = scanner.nextFloat();
        float sales = scanner.nextFloat();
        
        double extra = sales * 0.15;
        
        
        System.out.printf("TOTAL = R$ %.2f%n", (fixSalary + extra));
    }

}
