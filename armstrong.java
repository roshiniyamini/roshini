import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,sum=0,rem,temp;
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		
		 temp=n;
		 
		
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+(rem*rem*rem);
			
		}
		if(sum==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
