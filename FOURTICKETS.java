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
		    int y=4*x;
		    if(y<=1000)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		    
		}
	}
}
