import java.util.Scanner;

public class deci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = (base * height) / 2;

        System.out.println(area);
        scanner.close();
    }
}