import java.util.*;
public class D {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-- > 0)
        {   
            int n = Integer.parseInt(scn.nextLine());
            String s = scn.nextLine();
            HashSet<Character> set = new HashSet<>();
            int[] pre = new int[n];
            int[] suf = new int[n];
            for(int i = 0; i < n; i++)
            {
                set.add(s.charAt(i));
                pre[i] = set.size();
            }
            set = new HashSet<>();
            for(int i = (n - 1); i >= 0; i--)
            {
                set.add(s.charAt(i));
                suf[i] = set.size();
            }

            int ans = 0;
            for(int i = 1; i < n; i++)
            {
                int x = pre[(i-1)] + suf[i];
                ans = Math.max(ans, x);
            }

            System.out.println(ans);
        }
    }
}