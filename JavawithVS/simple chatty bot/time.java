import java.util.Date;

public class time {
    public static void main(String[] args) {
        Date g = new Date();
        System.out.printf("Hour H gives :%tH",g);
        System.out.printf("\nHour k gives :%tk",g);
        System.out.printf("\n12 hours I gives :%tI",g);
        System.out.printf("\n12 hours l gives :%tl",g);
        System.out.printf("\nMinutes M gives :%tM",g);
        System.out.printf("\nSeconds S gives :%tS",g);
        System.out.printf("\n3 digit milli-sec L gives :%tL",g);
        System.out.printf("\nnine-digit miili-sec N gives :%tN",g);
        System.out.printf("\nTime p gives :%tp",g);
        System.out.printf("\nstring T gives :%tT",g);
        System.out.printf("\numeric z gives :%tz",g);
        System.out.printf("\ntime zone Z gives :%tZ",g);
        System.out.printf("\nuniz sec s gives :%ts",g);
        System.out.printf("\nunix mill sec Q gives :%tQ",g);
    }    
}
