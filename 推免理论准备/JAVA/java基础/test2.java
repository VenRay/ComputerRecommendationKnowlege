import java.util.Scanner;
 
public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int x = 2;
        int cnt = 0;
        int cnt2 = 0;
        while (true) {
            if (isPrime(x)) {
                cnt++;
                if (cnt >= m && cnt <= n) {
                    if (cnt2 == 9) {
                        System.out.println(x);
                        cnt2 = 0;
                    } else if(cnt!=n) {
                        System.out.print(x + " ");
                        cnt2++;
                    }else {
                        System.out.println(x);
                    }
                }
            }
 
            if (cnt > n) {
                break;
            }
            x++;
        }
    }
 
    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}