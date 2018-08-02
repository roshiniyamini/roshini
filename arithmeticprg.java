import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A=s.nextInt();
		int D=s.nextInt();
		System.out.println(ap(N,A,D));}
		
			private static int ap(int a,int n,int d)
			{
				int sum=0;
				for(int i=0;i<a;i++)
				{
					sum=sum+n;
					n=n+d;
		
				}
				return sum;
			}
		
	}
