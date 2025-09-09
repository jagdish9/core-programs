package programs.dp;

import java.util.Scanner;

public class SamAndSubstring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input:");
        String s = scan.next();
        scan.close();
        SamAndSubstring samAndSubstring = new SamAndSubstring();
        long sum = samAndSubstring.getTotalSum(s);
        System.out.println(sum);
    }

    private long getTotalSum(String s) {
        long mod = (long) Math.pow(10, 9) + 7;
        long ans=0;
        int l = s.length();
        long [] a = new long[l+1];
        long [] b = new long[l+1];
        a[0] = 1;
        b[0] = 1;
        for(int i=1;i<l;i++){
            a[i] = (a[i-1]*10)%mod;
            b[i] = (b[i-1] +a[i])%mod ;
        }
        for(int i=0;i<l;i++){
            long temp = Integer.parseInt(s.substring(i,i+1));
            ans = (ans+(b[l-i-1]*temp*(i+1))%mod )%mod;
        }

        return ans;
    }
}
