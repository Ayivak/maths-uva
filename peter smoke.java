import java.io.*;
import java.lang.
import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
        int n=in.nextInt();
        int k=in.nextInt();
        int r=n;
        while(n>=k)
        {
            r+=(n/k);
            n=(n/k)+(n%k);
        }
        System.out.println(r);
        }
    }
}
