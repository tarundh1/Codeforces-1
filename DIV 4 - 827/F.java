import java.util.*;
public class F {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = Integer.parseInt(scn.nextLine());
        while(t-- > 0)
        {
            long[] xarr = new long[26];
            long[] yarr = new long[26]; 
            long[] xsize = new long[1];
            long[] ysize = new long[1];
            xsize[0] = ysize[0] = xarr[0] = yarr[0] = 1;

            int m = Integer.parseInt(scn.nextLine());
            while(m -- > 0)
            {
                String str = scn.nextLine();
                String[] array = str.split(" ");
                int num = Integer.parseInt(array[0]);
                int k = Integer.parseInt(array[1]);
                helper(xarr,xsize,yarr,ysize,num,k,array[2]);
                System.out.println(xsize[0] + " " + ysize[0]);
            }
        }
    }

    public static void helper(long[] xarr,long[] xsize,long[] yarr,long[] ysize,long num,long k,String add){
        
        if(num == 1)
        {
            for(char c : add.toCharArray())
            {
                xarr[(c - 'a')] += (k);
                xsize[0] = (xsize[0] + k);
            }

            if(xsize[0] < ysize[0])
            {
                System.out.println("YES");
                return;
            }
            else if(ysize[0] < xsize[0])
            {
                System.out.println("NO");
                return;
            }
            else{
                
                for(int i = 0; i < 26; i++)
                {
                    if(xarr[i] < yarr[i])
                    {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");
        }   
        else if(num == 2)
        {
            for(char c : add.toCharArray())
            {
                yarr[(c - 'a')] += (k);
                ysize[0] = (ysize[0] + k);
            }

            if(xsize[0] < ysize[0])
            {
                System.out.println("YES");
                return;
            }
            else if(ysize[0] < xsize[0])
            {
                System.out.println("NO");
                return;
            }
            else{
                for(int i = 0; i < 26; i++)
                {
                    if(xarr[i] < yarr[i])
                    {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");
            System.out.println(xsize + " " + ysize);
        }
    }
}