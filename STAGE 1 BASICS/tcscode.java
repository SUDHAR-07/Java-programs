import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner susan = new Scanner(System.in);
		int G = susan.nextInt();
		int B = susan.nextInt();
		int H = susan.nextInt();
		int total = 0 , count = 0;
		int[] s = new int[G];
		for(int i = 0; i < G;i++){
		    s[i] = susan.nextInt();
		    total += s[i];
		}
		int max = 0;
        total = total * B * H;
        for(int i = 0; i < G; i++){
            if(s[i] >= 3) {
                max +=s[i];
                count++;
                if(i < G-1){
                    if(s[i + 1] < 3)
                    break;
                }
            }
        }
        count = (count * 3) * B * H;
        System.out.println(total - count);
	}
}

