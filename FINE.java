import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc=new  Scanner(System.in);
		int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            if(x<=70)
            System.out.println(0);
            else if(x>70 && x<=100)
            System.out.println(500);
            else
            System.out.println(2000);
        }
	}
}
