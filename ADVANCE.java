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
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    if(n<=m && m<=n+200)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
	}
}
