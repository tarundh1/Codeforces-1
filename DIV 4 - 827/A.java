import java.util.*;
public class A {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {   
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            helper(a,b,c);
        }
    }

    public static void helper(int a,int b,int c){
        if(a == (b+c))
            System.out.println("YES");
        else if(b == (a+c))
            System.out.println("YES");
        else if(c == (b+a))
            System.out.println("YES");
        else
        System.out.println("NO");
    }
}