import java.util.*;
public class B {

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
            helper(arr);
        }
    }

    public static void helper (int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr)
            set.add(ele);
        if(set.size() == arr.length)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}