import java.util.*;
public class C {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-- > 0)
        {   
            int n = Integer.parseInt(scn.nextLine());
            String s = scn.nextLine();
            int x = 0, y = (n - 1), ans = 0;
            while(x < y)
            {
                if(s.charAt(x) != s.charAt(y))
                {
                    ans+= 2;
                    x++;
                    y--;
                }
                else
                {
                    break;
                }
            }
            ans = (n - ans);
            System.out.println(ans);
        }
    }
}