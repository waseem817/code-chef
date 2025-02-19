import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner     sc=new  Scanner(System.in);
		int a=sc.nextInt();
		int a1=sc.nextInt();
		int b=sc.nextInt();
		int b1=sc.nextInt();
		int c=sc.nextInt();
		int c1=sc.nextInt();
		int m,n,p;
		if(a>a1)
		m=a;
		else 
		m=a1;
		if(b>b1)
		n=b;
		else 
		n=b1;
        if(c>c1)
		p=c;
		else
	    p=c1;
		System.out.println(m+n+p);
	}
}
