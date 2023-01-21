// import java.util.*;

public class format {
    public static void main(String[] args) {
        int a = 15;
        double b = 1.234;
        String c = "suSan";
        char d = 'g';
        System.out.printf("Charcter \n c : %c & C : %C",d,d);
        System.out.printf("\nintegers format \n d %d is %d",a,a*a);
        System.out.printf("\nfloating no \n f %f",b);
        System.out.printf("\nString upr \n S %S & String lwr s %s",c,c);
        System.out.printf("\nThe octal no \n o : %o",a);
        System.out.printf("\nHexa decimal \n x : %x & X :%X",a,a);
        System.out.printf("\nThe hexadecimal no of integer is \n H: %H & h: %h",a,a);
        System.out.printf("\nThe scientific notation floating point is\n e: %e & E: %E",b,b);
        System.out.printf("\nThe HEXADECIMAL Floating no is \n a: %a & A : %A",b,b);
        System.out.printf("\nThe Floating no scientific notaion is \n g: %g & G : %G",b,b);
        System.out.printf("\nto print percentage %%");
        System.out.printf("\n\nUsing orders %4$d,%3$d,%2$d,%1$d", 8,9,4,6);

    }
}
