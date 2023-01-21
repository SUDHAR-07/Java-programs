public class flagwidthprecision {
    public static void main(String[] args) {
        System.out.println("To print");
        System.out.printf("5 space  :(%-5d)\n", 10);
        System.out.printf("to add +:(%+d)\n", 20);
        System.out.printf("space :(% d)\n", 30);
        System.out.printf("Octal Number:(%#o)\n", 10);
        System.out.printf("HexaDecimal :(%#X)\n", 10);
        System.out.printf("print without minus sign:%(d\n", -40);
        System.out.printf("Number format:%,d\n", 1234567);
        System.out.printf("5 space:(%5d)\n", 123);
        System.out.printf("Decimal points %.2f\n", 123.45678);
        System.out.printf("String accessing:%.2s\n", "hello");
    } 
}
