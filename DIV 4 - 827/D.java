import java.util.*;
public class D {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {   
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i ++)
                arr[i] = scn.nextInt();
            System.out.println(helper(arr));
        }
    }

    public static long helper(int[] arr){

        int n = arr.length;
        int[] x = new int[1001];
        for(int i = 0; i < n; i++)
        {
            x[arr[i]] = Math.max(x[arr[i]],(i+1));
        }

        long max = -1;
        for(int i = 1; i<= 1000; i++)
        {
            int y = (i == 1) ? 1 : (i+1);
            for(int j = y; j<= 1000 ; j++)
            {
                if((x[i]!= 0) && (x[j] != 0))
                {
                    if(gcd(i,j) == 1)
                    {
                        max = Math.max(max,(x[i] + x[j]));
                    }
                }
            }
        }
        return max;
    }

    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}