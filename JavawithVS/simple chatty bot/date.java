import java.util.Date;

public class date {
    public static void main(String[] args) {
        Date g = new Date();
        System.out.printf("Month B:%tB & b : %tb\n",g,g);
        System.out.printf("Day of week A : %tA & a : %ta\n",g,g);
        System.out.printf("4 digits of Year Y : %tY\n",g);
        System.out.printf("2 digits of Year y : %ty\n",g);
        System.out.printf("Day of year 3 digits j : %tj\n",g);
        System.out.printf("day of month e : %te\n",g);
        System.out.printf("2 digit day of month d: %td\n",g);
        System.out.printf("2 digit month m: %tm\n",g);
        System.out.printf("month/day/year D: %tD\n",g);
        System.out.printf("year-month-day F: %tF\n",g);
        System.out.printf("human readbale date & tym c : %tc\n",g);
    }
}