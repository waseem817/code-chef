import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int m=a*c;
		int n=b*c;
		if(m<n)
		System.out.println(n);
		else
		System.out.println(m);

	}
}
