import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int count=1;
		for(int i=0;i<a.length()-1;i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
			System.out.println(count);
	}
}
