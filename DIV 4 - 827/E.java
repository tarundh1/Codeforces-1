import java.util.*;
public class E {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        long t = scn.nextLong();
        while(t-- > 0)
        {
            int n = scn.nextInt();
            int q = scn.nextInt();
            long[] arr = new long[n];
            long[] queries = new long[q];
            for(int i = 0; i < n; i++)
                arr[i] = scn.nextLong();
            for(int i = 0; i < q; i++)
                queries[i] = scn.nextLong();
            helper(arr,queries);
        }
    }

    public static void helper(long[] arr,long[] queries){

        int n = arr.length;
        int m = queries.length;
        long[] preSum = new long[n];
        long[] preMax = new long[n];
        long sum = arr[0], max = arr[0];
        preSum[0] = sum;
        preMax[0] = max;
        for(int i = 1; i < n; i++)
        {
            preSum[i] = (preSum[i-1] + arr[i]);
            preMax[i] = Math.max(preMax[i-1],arr[i]);
        }


        for(int i = 0; i < m ;i++)
        {
            int x = searchInsert(preMax,queries[i]);
            if(x == 0)
            {
                System.out.print(0 + " ");
            }
            else
            {
                System.out.print(preSum[(x-1)] + " ");
            }
        }
        System.out.println();
    }

    public static int searchInsert(long[] arr, long target) {
        int n = arr.length;
        int si = 0;
        int ei = n;
        while(si < ei)
        {
            int mid = si + (ei-si)/2;
            if(arr[mid] <= target)
            {
                si = mid + 1;
            }
            else
            {
                ei = mid;
            }
        }
        return si;
    }
}