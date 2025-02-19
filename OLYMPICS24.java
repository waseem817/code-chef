import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc=new  Scanner(System.in);
		int g=sc.nextInt();
		int s=sc.nextInt();
		int b=sc.nextInt();
		if(g>=5)
		g=0;
		else
		g=5-g;
		if(s>=5)
		s=0;
		else 
		s=5-s;
		if(b>=5)
		b=0;
		else 
		b=5-b;
		System.out.println(g+s+b);

	}
}
