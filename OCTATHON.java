import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner  sc=new  Scanner(System.in);
		int x=sc.nextInt();
		if(x<3)
		System.out.println("gold");
		else if(x>=3 && x<6)
		System.out.println("Silver");
		else
		System.out.println("bronze");

	}
}
