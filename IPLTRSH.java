import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new  Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int z=n-m;
		    if(z<0)
		    z=0;
		    System.out.println(z);
		}

	}
}
