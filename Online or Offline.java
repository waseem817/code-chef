import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner   sc=new  Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    double h=n-(n*0.10);
		    if(h<m)
		    System.out.println("online");
		    else if(h==m)
		    System.out.println("either");
		    else
		    System.out.println("dining");
		}

	}
}
