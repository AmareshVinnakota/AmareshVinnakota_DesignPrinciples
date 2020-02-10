
package Calcualtion;
import java.util.*;
public class Accesing {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculating h=new calculating();
		int y=h.add(a, b);
		int y1=h.sub(a, b);
		int y2=h.div(a, b);
		int y3=h.mul(a, b);
		System.out.println(y);
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
