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
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if(x<y)
		    System.out.println("FIRST");
		    else if(x==y)
		    System.out.println("ANY");
		    else if(x>y)
		    System.out.println("SECOND");
		}

	}
}
