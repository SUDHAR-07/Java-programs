package DAY1.Problem2;

public class pivotbasic {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n  =susan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = susan.nextInt();
        }
        System.out.printn(pivotIndex(p));    
    }
    public int pivotIndex(int[] nums) {
            for(int i = 0; i < nums.length;i++){
                if(ispivot(nums,i)){
                    return i;
                }
            }
            return -1;
        }
    public boolean ispivot(int[] a,int i){
        int s = 0,n = 0;
        for(int j = 0; j < i;j++){
            s += a[j];
        }
        for(int j = i+1;j<a.length;j++){
            n += a[j];
        }
        if(n == s){
            return true;
        }
        return false;
    }
}
