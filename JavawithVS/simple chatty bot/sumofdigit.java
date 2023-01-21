import java.util.Scanner;

public class sumofdigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] digits = scanner.nextLine().split("");

        int sum = 0;

        for (String digit : digits) {
            sum += Integer.parseInt(digit);
        }
        scanner.close();
        System.out.println(sum);
    }
}