import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc=new   Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
	    {
	        int x=sc.nextInt();
	        if(x<4)
	        System.out.println("MILD");
	        else if(x>=4 && x<7)
	        System.out.println("MEDIUM");
	        else
	        System.out.println("HOT");
	    }

	}
}
