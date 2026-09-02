import java.util.Scanner;

class GFG {
    public static void name(int i , int n){
        if(i > n){
            return;
        }
        System.out.print("GFG ");
        name(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        name(i, n);
        // code here
    }
}