import java.util.Scanner;
class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(j % 2 != 0){
                    System.out.printf("%3d",((j * row) - i + 1));
                }
                else{
                    System.out.printf("%3d",(j - 1) * row + i);
                }
            }
            System.out.println();
        }
    }
}
