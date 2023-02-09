import java.util.*;
public class C {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {   
            char[][] arr = new char[8][8];
            for(int i = 0; i < 8; i ++)
            {
                String x = scn.next();
                arr[i] = x.toCharArray();
            }
            helper(arr);
        }
    }

    public static void helper(char[][] arr){

        for(int i = 0;i<8;i++)
        {
            int count = 0;
            for(int j = 0;j<8;j++)
            {
                if(arr[i][j] == 'R')
                    count++;
            }
            if(count == 8)
            {
                System.out.println('R');
                return;
            }
        }

        for(int i = 0;i<8;i++)
        {
            int count = 0;
            for(int j = 0;j<8;j++)
            {
                if(arr[j][i] == 'B')
                    count++;
            }
            if(count == 8)
            {
                System.out.println('B');
                return;
            }
        }

    }
}