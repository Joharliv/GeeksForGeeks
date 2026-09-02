import java.util.Scanner;

class GFG {
    static int sum = 0;
    public static void sum(int n){
        if(n == 0){
            System.out.print(sum);
            return ;
        }
        sum+=n;
        sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        sum(n);
        
    }
}