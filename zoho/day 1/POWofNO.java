import java.util.*;
// IP  5  2
// OP  25

// 5 ^ 2 = 25

public class POWofNO {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int no = susan.nextInt();
        int pow = susan.nextInt();
        System.out.println(Power(no,pow));
    }
    public static int Power(int no, int pow){
        if(pow != 0){
            return no * (Power(no,pow-1)); 
        }
        return 1;
    }
}
