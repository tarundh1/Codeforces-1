import java.util.*;
public class E {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-- > 0)
        {   
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = scn.nextInt();
            }

            long ans = 0;
            PriorityQueue<Integer> p = new PriorityQueue<>((a, b)->{
                return b - a;
            });
            PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->{
                return a - b;
            });

            for(int i = 0; i < n; i++)
            {
                if(arr[i] <= 0)
                    p.add(arr[i]);
                else
                    q.add(arr[i]);
            }

            while(p.size() > 1)
            {
                int r = p.remove();
                int x = p.remove();
                r = -r;
                x = -x;
                ans+= (r + x);
            }

            while(p.size() > 0 && q.size() > 0)
            {
                int r = p.remove();
                int x = q.remove();
                int nr = -r;
                int nx = -x;
                ans+= Math.max(r+x, nr+nx);
            }

            while(p.size() > 0)
            {
                int r = p.remove();
                ans+= r;
            }

            while(q.size() > 0)
            {
                int r = q.remove();
                ans+= r;
            }


            System.out.println(ans);
        }
    }
}