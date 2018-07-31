import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
            	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rem=0;
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
		System.out.println("yes");
		}
		else
		{
		System.out.println("no");
		}
	}
}
