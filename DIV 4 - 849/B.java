import java.util.*;
public class B {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-- > 0)
        {   
            int n = Integer.parseInt(scn.nextLine());
            String s = scn.nextLine();
            int a = 0, b = 0;
            boolean f = false;
            for(char x : s.toCharArray())
            {
                if(x == 'U')
                {
                    a = (a + 1);
                }else if( x== 'D')
                {
                    a = (a - 1);
                }
                else if(x == 'R')
                {
                    b = (b + 1);
                }
                else 
                {
                    b = (b - 1);
                }
                if(a == 1 && b == 1)
                {
                    f = true;
                    break;
                }
            }
            if(f)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}