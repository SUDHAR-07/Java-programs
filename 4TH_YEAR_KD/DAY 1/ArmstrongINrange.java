import java.util.*;


public class ArmstrongINrange {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int a = susan.nextInt();
        int b = susan.nextInt();
        for(int i = a; i < b; i++){
            int n = getLen(i);
            if(isArm(i,n) == i){
                System.out.println("The Number is " + i);
            }
        }
    }

    public static int getLen(int a){
        int i = 0;
        while(a != 0){
            a /= 10;
            i++;
        }
        return i;
    }
    public static int isArm(int a,int n){
        int g = 0;
        while(a != 0){
            g += Math.pow((a % 10),n);
            a /= 10;
        }
        return g; 
    }    
}
