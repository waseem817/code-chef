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
	        int y=sc.nextInt();
	        if(x*3<=y*2)
	        System.out.println(x*3);
	        else
	        System.out.println(y*2);
	    }

	}
}
