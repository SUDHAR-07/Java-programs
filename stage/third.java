import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        String k = susan.next();
        susan.close();
        int len = getLen(k);
        int result = 0,two = 0;
        int z = 0,j = len/2+1;
        result = getNo(k.charAt(0));
        for(int i = 0; i < len/2;i++){
            z = (int)(k.charAt(i+1));
            two = getNo(z);
            if(k.charAt(j) == '+'){
                result += two;
            } else if (k.charAt(j) == '*'){
                result *= two;
            } else if(k.charAt(j) == '-'){
                result -= two;
            } else if(k.charAt(j) == '/'){
                result /= two;
            }
            j++;
        }
        System.out.println(result);
    }

    public static int getLen(String a){
        int i = 0;
        try{
            for(i = 0;;i++){
                a.charAt(i);
            }
        } catch(Exception e){
            return i;
        }
    }

    public static int getNo(int g){
        return((int)(g - '0'));
    }
}
