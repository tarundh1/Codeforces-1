import java.util.*;
public class A {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        String s = "codeforces";
        while(t-- > 0)
        {   
            String l = scn.nextLine();
            char c = l.charAt(0);
            boolean f = false;
            for(char x : s.toCharArray())
            {
                if(x == c) {
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