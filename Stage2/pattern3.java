import java.io.*;
import java.util.*;

public class pattern3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner susan = new Scanner(System.in);
      int n = susan.nextInt();
      if (n % 2 == 0)
      {
        for(int i = 0; i< n/2;i++)
        {
          for(int j = 0;j <n/2;j++) {
            if(i >=j){
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
         for(int k=0;k<n/2;k++)
        {
            if(i+k>=(n/2)-1)
                System.out.print("*");
            else
                System.out.printf(" ");
        }
          System.out.println();
        }
        for(int i=0;i<n/2;i++)
        {
          for(int j=0;j<n/2;j++)
           {
              if(i+j<=(n/2)-1)
                 System.out.print("*");
              else
                 System.out.print(" ");
        }    
        for(int k=0;k<n/2;k++)
        {
            if(i<=k)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    }
    else
    {
        n=n+1;
        for(int i=0;i<n/2;i++)
    {
        for(int j=0;j<n/2;j++)
        {
            if(i>=j)
                System.out.print("*");
            else
                System.out.print(" ");
        }    
        for(int k=1;k<n/2;k++)
        {
            if(i+k>=(n/2)-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
     for(int i=1;i<n/2;i++)
    {
        for(int j=0;j<n/2;j++)
        {
            if(i+j<=(n/2)-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }    
        for(int k=1;k<n/2;k++)
        {
            if(i<=k)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    } 

}
}