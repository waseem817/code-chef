import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int t=0; t<n; t++)
		{
		    int x1=sc.nextInt();
		    int x2=sc.nextInt();
		    int x3=sc.nextInt();
		    int x4=sc.nextInt();
		    int x5=sc.nextInt();
		    int sum=x1+x2+x3+x4+x5;
		    if(sum>=4)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
