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
		    int y=sc.nextInt();
		    int z=x-y;
		    if(z>0)
		    System.out.println("LOSS");
		    else if(z==0)
		    System.out.println("NEUTRAL");
		    else
		    System.out.println("PROFIT");
		}

	}
}
