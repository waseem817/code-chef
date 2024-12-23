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
		    if(x<=3)
		    System.out.println("BRONZE");
		    else if((x>3) &&(x<=6))
		    System.out.println("SILVER");
		    else if(x>6)
		    System.out.println("GOLD");
		}

	}
}
